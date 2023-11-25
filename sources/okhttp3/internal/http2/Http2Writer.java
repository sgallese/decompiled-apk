package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.c;
import okio.d;
import qc.h;
import qc.q;

/* compiled from: Http2Writer.kt */
/* loaded from: classes4.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final c hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final d sink;

    /* compiled from: Http2Writer.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public Http2Writer(d dVar, boolean z10) {
        q.i(dVar, "sink");
        this.sink = dVar;
        this.client = z10;
        c cVar = new c();
        this.hpackBuffer = cVar;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, cVar, 3, null);
    }

    private final void writeContinuationFrames(int i10, long j10) throws IOException {
        int i11;
        while (j10 > 0) {
            long min = Math.min(this.maxFrameSize, j10);
            j10 -= min;
            int i12 = (int) min;
            if (j10 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            frameHeader(i10, i12, 9, i11);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
        q.i(settings, "peerSettings");
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (!this.closed) {
            if (!this.client) {
                return;
            }
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(q.q(">> CONNECTION ", Http2.CONNECTION_PREFACE.n()), new Object[0]));
            }
            this.sink.B0(Http2.CONNECTION_PREFACE);
            this.sink.flush();
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void data(boolean z10, int i10, c cVar, int i11) throws IOException {
        if (!this.closed) {
            dataFrame(i10, z10 ? 1 : 0, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i10, int i11, c cVar, int i12) throws IOException {
        frameHeader(i10, i12, 0, i11);
        if (i12 > 0) {
            d dVar = this.sink;
            q.f(cVar);
            dVar.write(cVar, i12);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i10, int i11, int i12, int i13) throws IOException {
        boolean z10;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i10, i11, i12, i13));
        }
        boolean z11 = true;
        if (i11 <= this.maxFrameSize) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((Integer.MIN_VALUE & i10) != 0) {
                z11 = false;
            }
            if (z11) {
                Util.writeMedium(this.sink, i11);
                this.sink.D(i12 & 255);
                this.sink.D(i13 & 255);
                this.sink.w(i10 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(q.q("reserved bit set: ", Integer.valueOf(i10)).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i11).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i10, ErrorCode errorCode, byte[] bArr) throws IOException {
        boolean z10;
        q.i(errorCode, "errorCode");
        q.i(bArr, "debugData");
        if (!this.closed) {
            boolean z11 = false;
            if (errorCode.getHttpCode() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                frameHeader(0, bArr.length + 8, 7, 0);
                this.sink.w(i10);
                this.sink.w(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z11 = true;
                }
                if ((!z11) != false) {
                    this.sink.y0(bArr);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean z10, int i10, List<Header> list) throws IOException {
        int i11;
        q.i(list, "headerBlock");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long s02 = this.hpackBuffer.s0();
            long min = Math.min(this.maxFrameSize, s02);
            if (s02 == min) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            if (z10) {
                i11 |= 1;
            }
            frameHeader(i10, (int) min, 1, i11);
            this.sink.write(this.hpackBuffer, min);
            if (s02 > min) {
                writeContinuationFrames(i10, s02 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z10, int i10, int i11) throws IOException {
        int i12;
        if (!this.closed) {
            if (z10) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            frameHeader(0, 8, 6, i12);
            this.sink.w(i10);
            this.sink.w(i11);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i10, int i11, List<Header> list) throws IOException {
        int i12;
        q.i(list, "requestHeaders");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long s02 = this.hpackBuffer.s0();
            int min = (int) Math.min(this.maxFrameSize - 4, s02);
            int i13 = min + 4;
            long j10 = min;
            if (s02 == j10) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            frameHeader(i10, i13, 5, i12);
            this.sink.w(i11 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j10);
            if (s02 > j10) {
                writeContinuationFrames(i10, s02 - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i10, ErrorCode errorCode) throws IOException {
        boolean z10;
        q.i(errorCode, "errorCode");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                frameHeader(i10, 4, 3, 0);
                this.sink.w(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) throws IOException {
        int i10;
        q.i(settings, "settings");
        if (!this.closed) {
            int i11 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i11 < 10) {
                int i12 = i11 + 1;
                if (settings.isSet(i11)) {
                    if (i11 != 4) {
                        if (i11 != 7) {
                            i10 = i11;
                        } else {
                            i10 = 4;
                        }
                    } else {
                        i10 = 3;
                    }
                    this.sink.t(i10);
                    this.sink.w(settings.get(i11));
                }
                i11 = i12;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void windowUpdate(int i10, long j10) throws IOException {
        boolean z10;
        if (!this.closed) {
            if (j10 != 0 && j10 <= 2147483647L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                frameHeader(i10, 4, 8, 0);
                this.sink.w((int) j10);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(q.q("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j10)).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
