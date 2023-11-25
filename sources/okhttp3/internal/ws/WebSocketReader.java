package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;
import okio.c;
import okio.e;
import okio.f;
import qc.q;

/* compiled from: WebSocketReader.kt */
/* loaded from: classes4.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final c controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final c.a maskCursor;
    private final byte[] maskKey;
    private final c messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final e source;

    /* compiled from: WebSocketReader.kt */
    /* loaded from: classes4.dex */
    public interface FrameCallback {
        void onReadClose(int i10, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(f fVar) throws IOException;

        void onReadPing(f fVar);

        void onReadPong(f fVar);
    }

    public WebSocketReader(boolean z10, e eVar, FrameCallback frameCallback, boolean z11, boolean z12) {
        byte[] bArr;
        q.i(eVar, "source");
        q.i(frameCallback, "frameCallback");
        this.isClient = z10;
        this.source = eVar;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.controlFrameBuffer = new c();
        this.messageFrameBuffer = new c();
        if (z10) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = z10 ? null : new c.a();
    }

    private final void readControlFrame() throws IOException {
        short s10;
        String str;
        long j10 = this.frameLength;
        if (j10 > 0) {
            this.source.H(this.controlFrameBuffer, j10);
            if (!this.isClient) {
                c cVar = this.controlFrameBuffer;
                c.a aVar = this.maskCursor;
                q.f(aVar);
                cVar.f0(aVar);
                this.maskCursor.e(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                c.a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                q.f(bArr);
                webSocketProtocol.toggleMask(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long s02 = this.controlFrameBuffer.s0();
                if (s02 != 1) {
                    if (s02 != 0) {
                        s10 = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.l0();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s10);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s10 = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s10, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.j0());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.j0());
                return;
            default:
                throw new ProtocolException(q.q("Unknown control opcode: ", Util.toHexString(this.opcode)));
        }
    }

    private final void readHeader() throws IOException, ProtocolException {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i10 = and & 15;
                this.opcode = i10;
                boolean z16 = false;
                if ((and & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.isFinalFrame = z10;
                if ((and & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.isControlFrame = z11;
                if (z11 && !z10) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((and & 64) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 != 1 && i10 != 2) {
                    if (z12) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z12) {
                        if (this.perMessageDeflate) {
                            z13 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z13 = false;
                    }
                    this.readingCompressedMessage = z13;
                }
                if ((and & 32) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    if ((and & 16) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        int and2 = Util.and(this.source.readByte(), 255);
                        if ((and2 & 128) != 0) {
                            z16 = true;
                        }
                        if (z16 == this.isClient) {
                            if (this.isClient) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j10 = and2 & 127;
                        this.frameLength = j10;
                        if (j10 == 126) {
                            this.frameLength = Util.and(this.source.readShort(), (int) Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        } else if (j10 == 127) {
                            long readLong = this.source.readLong();
                            this.frameLength = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.isControlFrame && this.frameLength > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z16) {
                            e eVar = this.source;
                            byte[] bArr = this.maskKey;
                            q.f(bArr);
                            eVar.readFully(bArr);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j10 = this.frameLength;
            if (j10 > 0) {
                this.source.H(this.messageFrameBuffer, j10);
                if (!this.isClient) {
                    c cVar = this.messageFrameBuffer;
                    c.a aVar = this.maskCursor;
                    q.f(aVar);
                    cVar.f0(aVar);
                    this.maskCursor.e(this.messageFrameBuffer.s0() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    c.a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    q.f(bArr);
                    webSocketProtocol.toggleMask(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException(q.q("Expected continuation opcode. Got: ", Util.toHexString(this.opcode)));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i10 = this.opcode;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException(q.q("Unknown opcode: ", Util.toHexString(i10)));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i10 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.l0());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.j0());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final e getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
