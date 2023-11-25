package okio;

import java.nio.ByteBuffer;

/* compiled from: RealBufferedSink.kt */
/* loaded from: classes4.dex */
public final class t0 implements d {

    /* renamed from: f  reason: collision with root package name */
    public final y0 f20679f;

    /* renamed from: m  reason: collision with root package name */
    public final c f20680m;

    /* renamed from: p  reason: collision with root package name */
    public boolean f20681p;

    public t0(y0 y0Var) {
        qc.q.i(y0Var, "sink");
        this.f20679f = y0Var;
        this.f20680m = new c();
    }

    @Override // okio.d
    public d B0(f fVar) {
        qc.q.i(fVar, "byteString");
        if ((!this.f20681p) != false) {
            this.f20680m.B0(fVar);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d D(int i10) {
        if ((!this.f20681p) != false) {
            this.f20680m.D(i10);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d J() {
        if ((!this.f20681p) != false) {
            long d10 = this.f20680m.d();
            if (d10 > 0) {
                this.f20679f.write(this.f20680m, d10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d P0(long j10) {
        if ((!this.f20681p) != false) {
            this.f20680m.P0(j10);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d W(String str) {
        qc.q.i(str, "string");
        if ((!this.f20681p) != false) {
            this.f20680m.W(str);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public c a() {
        return this.f20680m;
    }

    @Override // okio.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f20681p) {
            try {
                if (this.f20680m.s0() > 0) {
                    y0 y0Var = this.f20679f;
                    c cVar = this.f20680m;
                    y0Var.write(cVar, cVar.s0());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f20679f.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f20681p = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // okio.d
    public d d0(byte[] bArr, int i10, int i11) {
        qc.q.i(bArr, "source");
        if ((!this.f20681p) != false) {
            this.f20680m.d0(bArr, i10, i11);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d, okio.y0, java.io.Flushable
    public void flush() {
        if ((!this.f20681p) != false) {
            if (this.f20680m.s0() > 0) {
                y0 y0Var = this.f20679f;
                c cVar = this.f20680m;
                y0Var.write(cVar, cVar.s0());
            }
            this.f20679f.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public long g0(Source source) {
        qc.q.i(source, "source");
        long j10 = 0;
        while (true) {
            long read = source.read(this.f20680m, 8192L);
            if (read != -1) {
                j10 += read;
                J();
            } else {
                return j10;
            }
        }
    }

    @Override // okio.d
    public d h0(long j10) {
        if ((!this.f20681p) != false) {
            this.f20680m.h0(j10);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f20681p;
    }

    @Override // okio.d
    public d r() {
        if ((!this.f20681p) != false) {
            long s02 = this.f20680m.s0();
            if (s02 > 0) {
                this.f20679f.write(this.f20680m, s02);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d t(int i10) {
        if ((!this.f20681p) != false) {
            this.f20680m.t(i10);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.y0
    public a1 timeout() {
        return this.f20679f.timeout();
    }

    public String toString() {
        return "buffer(" + this.f20679f + ')';
    }

    @Override // okio.d
    public d w(int i10) {
        if ((!this.f20681p) != false) {
            this.f20680m.w(i10);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        qc.q.i(byteBuffer, "source");
        if ((!this.f20681p) != false) {
            int write = this.f20680m.write(byteBuffer);
            J();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d y0(byte[] bArr) {
        qc.q.i(bArr, "source");
        if ((!this.f20681p) != false) {
            this.f20680m.y0(bArr);
            return J();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.y0
    public void write(c cVar, long j10) {
        qc.q.i(cVar, "source");
        if ((!this.f20681p) != false) {
            this.f20680m.write(cVar, j10);
            J();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
