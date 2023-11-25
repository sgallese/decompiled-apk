package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import okio.c;
import okio.d;
import okio.f;
import qc.q;

/* compiled from: WebSocketWriter.kt */
/* loaded from: classes4.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final c.a maskCursor;
    private final byte[] maskKey;
    private final c messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final d sink;
    private final c sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z10, d dVar, Random random, boolean z11, boolean z12, long j10) {
        byte[] bArr;
        q.i(dVar, "sink");
        q.i(random, "random");
        this.isClient = z10;
        this.sink = dVar;
        this.random = random;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.minimumDeflateSize = j10;
        this.messageBuffer = new c();
        this.sinkBuffer = dVar.a();
        if (z10) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z10 ? new c.a() : null;
    }

    private final void writeControlFrame(int i10, f fVar) throws IOException {
        boolean z10;
        if (!this.writerClosed) {
            int D = fVar.D();
            if (D <= 125) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.sinkBuffer.D(i10 | 128);
                if (this.isClient) {
                    this.sinkBuffer.D(D | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    q.f(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.y0(this.maskKey);
                    if (D > 0) {
                        long s02 = this.sinkBuffer.s0();
                        this.sinkBuffer.B0(fVar);
                        c cVar = this.sinkBuffer;
                        c.a aVar = this.maskCursor;
                        q.f(aVar);
                        cVar.f0(aVar);
                        this.maskCursor.e(s02);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.D(D);
                    this.sinkBuffer.B0(fVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final d getSink() {
        return this.sink;
    }

    public final void writeClose(int i10, f fVar) throws IOException {
        f fVar2 = f.f20622r;
        if (i10 != 0 || fVar != null) {
            if (i10 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i10);
            }
            c cVar = new c();
            cVar.t(i10);
            if (fVar != null) {
                cVar.B0(fVar);
            }
            fVar2 = cVar.j0();
        }
        try {
            writeControlFrame(8, fVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i10, f fVar) throws IOException {
        q.i(fVar, "data");
        if (!this.writerClosed) {
            this.messageBuffer.B0(fVar);
            int i11 = 128;
            int i12 = i10 | 128;
            if (this.perMessageDeflate && fVar.D() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i12 |= 64;
            }
            long s02 = this.messageBuffer.s0();
            this.sinkBuffer.D(i12);
            if (!this.isClient) {
                i11 = 0;
            }
            if (s02 <= 125) {
                this.sinkBuffer.D(((int) s02) | i11);
            } else if (s02 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.D(i11 | 126);
                this.sinkBuffer.t((int) s02);
            } else {
                this.sinkBuffer.D(i11 | 127);
                this.sinkBuffer.V0(s02);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                q.f(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.y0(this.maskKey);
                if (s02 > 0) {
                    c cVar = this.messageBuffer;
                    c.a aVar = this.maskCursor;
                    q.f(aVar);
                    cVar.f0(aVar);
                    this.maskCursor.e(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, s02);
            this.sink.r();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(f fVar) throws IOException {
        q.i(fVar, "payload");
        writeControlFrame(9, fVar);
    }

    public final void writePong(f fVar) throws IOException {
        q.i(fVar, "payload");
        writeControlFrame(10, fVar);
    }
}
