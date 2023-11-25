package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes4.dex */
public final class u0 implements e {

    /* renamed from: f  reason: collision with root package name */
    public final Source f20682f;

    /* renamed from: m  reason: collision with root package name */
    public final c f20683m;

    /* renamed from: p  reason: collision with root package name */
    public boolean f20684p;

    public u0(Source source) {
        qc.q.i(source, "source");
        this.f20682f = source;
        this.f20683m = new c();
    }

    @Override // okio.e
    public byte[] A() {
        this.f20683m.g0(this.f20682f);
        return this.f20683m.A();
    }

    @Override // okio.e
    public boolean C() {
        if ((!this.f20684p) != false) {
            if (this.f20683m.C() && this.f20682f.read(this.f20683m, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.e
    public short E0() {
        O0(2L);
        return this.f20683m.E0();
    }

    @Override // okio.e
    public long G0() {
        O0(8L);
        return this.f20683m.G0();
    }

    @Override // okio.e
    public void H(c cVar, long j10) {
        qc.q.i(cVar, "sink");
        try {
            O0(j10);
            this.f20683m.H(cVar, j10);
        } catch (EOFException e10) {
            cVar.g0(this.f20683m);
            throw e10;
        }
    }

    @Override // okio.e
    public long H0(y0 y0Var) {
        qc.q.i(y0Var, "sink");
        long j10 = 0;
        while (this.f20682f.read(this.f20683m, 8192L) != -1) {
            long d10 = this.f20683m.d();
            if (d10 > 0) {
                j10 += d10;
                y0Var.write(this.f20683m, d10);
            }
        }
        if (this.f20683m.s0() > 0) {
            long s02 = j10 + this.f20683m.s0();
            c cVar = this.f20683m;
            y0Var.write(cVar, cVar.s0());
            return s02;
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = yc.b.a(16);
        r2 = yc.b.a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        qc.q.h(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long K() {
        /*
            r10 = this;
            r0 = 1
            r10.O0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.m0(r6)
            if (r8 == 0) goto L56
            okio.c r8 = r10.f20683m
            byte r8 = r8.B(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L29
            r4 = 45
            if (r8 == r4) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r9 == 0) goto L2c
            goto L56
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = yc.a.a(r2)
            int r2 = yc.a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            qc.q.h(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56:
            okio.c r0 = r10.f20683m
            long r0 = r0.K()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.u0.K():long");
    }

    @Override // okio.e
    public e L0() {
        return l0.d(new s0(this));
    }

    @Override // okio.e
    public String M(long j10) {
        boolean z10;
        long j11;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            long c10 = c((byte) 10, 0L, j11);
            if (c10 != -1) {
                return ld.f.d(this.f20683m, c10);
            }
            if (j11 < Long.MAX_VALUE && m0(j11) && this.f20683m.B(j11 - 1) == 13 && m0(1 + j11) && this.f20683m.B(j11) == 10) {
                return ld.f.d(this.f20683m, j11);
            }
            c cVar = new c();
            c cVar2 = this.f20683m;
            cVar2.j(cVar, 0L, Math.min(32, cVar2.s0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f20683m.s0(), j10) + " content=" + cVar.j0().n() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    @Override // okio.e
    public void O0(long j10) {
        if (m0(j10)) {
            return;
        }
        throw new EOFException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r3 = yc.b.a(16);
        r3 = yc.b.a(r3);
        r2 = java.lang.Integer.toString(r2, r3);
        qc.q.h(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long S0() {
        /*
            r5 = this;
            r0 = 1
            r5.O0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.m0(r2)
            if (r2 == 0) goto L5e
            okio.c r2 = r5.f20683m
            long r3 = (long) r0
            byte r2 = r2.B(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = yc.a.a(r3)
            int r3 = yc.a.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            qc.q.h(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            okio.c r0 = r5.f20683m
            long r0 = r0.S0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.u0.S0():long");
    }

    @Override // okio.e
    public InputStream U0() {
        return new a();
    }

    @Override // okio.e
    public int W0(o0 o0Var) {
        qc.q.i(o0Var, "options");
        if ((!this.f20684p) == false) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int e10 = ld.f.e(this.f20683m, o0Var, true);
            if (e10 != -2) {
                if (e10 != -1) {
                    this.f20683m.skip(o0Var.h()[e10].D());
                    return e10;
                }
            } else if (this.f20682f.read(this.f20683m, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.e, okio.d
    public c a() {
        return this.f20683m;
    }

    @Override // okio.e
    public boolean a0(long j10, f fVar) {
        qc.q.i(fVar, "bytes");
        return d(j10, fVar, 0, fVar.D());
    }

    public long b(byte b10) {
        return c(b10, 0L, Long.MAX_VALUE);
    }

    @Override // okio.e
    public String b0(Charset charset) {
        qc.q.i(charset, "charset");
        this.f20683m.g0(this.f20682f);
        return this.f20683m.b0(charset);
    }

    public long c(byte b10, long j10, long j11) {
        boolean z10 = true;
        if ((!this.f20684p) != false) {
            if (0 > j10 || j10 > j11) {
                z10 = false;
            }
            if (z10) {
                while (j10 < j11) {
                    long I = this.f20683m.I(b10, j10, j11);
                    if (I != -1) {
                        return I;
                    }
                    long s02 = this.f20683m.s0();
                    if (s02 >= j11 || this.f20682f.read(this.f20683m, 8192L) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, s02);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f20684p) {
            this.f20684p = true;
            this.f20682f.close();
            this.f20683m.b();
        }
    }

    public boolean d(long j10, f fVar, int i10, int i11) {
        qc.q.i(fVar, "bytes");
        if ((!this.f20684p) != false) {
            if (j10 >= 0 && i10 >= 0 && i11 >= 0 && fVar.D() - i10 >= i11) {
                for (int i12 = 0; i12 < i11; i12++) {
                    long j11 = i12 + j10;
                    if (m0(1 + j11) && this.f20683m.B(j11) == fVar.i(i10 + i12)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.e
    public String h(long j10) {
        O0(j10);
        return this.f20683m.h(j10);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f20684p;
    }

    @Override // okio.e
    public f j0() {
        this.f20683m.g0(this.f20682f);
        return this.f20683m.j0();
    }

    @Override // okio.e
    public f l(long j10) {
        O0(j10);
        return this.f20683m.l(j10);
    }

    @Override // okio.e
    public boolean m0(long j10) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((!this.f20684p) == false) {
                throw new IllegalStateException("closed".toString());
            }
            while (this.f20683m.s0() < j10) {
                if (this.f20682f.read(this.f20683m, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // okio.Source
    public long read(c cVar, long j10) {
        qc.q.i(cVar, "sink");
        if (j10 >= 0) {
            if (true ^ this.f20684p) {
                if (this.f20683m.s0() == 0 && this.f20682f.read(this.f20683m, 8192L) == -1) {
                    return -1L;
                }
                return this.f20683m.read(cVar, Math.min(j10, this.f20683m.s0()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // okio.e
    public byte readByte() {
        O0(1L);
        return this.f20683m.readByte();
    }

    @Override // okio.e
    public void readFully(byte[] bArr) {
        qc.q.i(bArr, "sink");
        try {
            O0(bArr.length);
            this.f20683m.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f20683m.s0() > 0) {
                c cVar = this.f20683m;
                int c02 = cVar.c0(bArr, i10, (int) cVar.s0());
                if (c02 != -1) {
                    i10 += c02;
                } else {
                    throw new AssertionError();
                }
            }
            throw e10;
        }
    }

    @Override // okio.e
    public int readInt() {
        O0(4L);
        return this.f20683m.readInt();
    }

    @Override // okio.e
    public long readLong() {
        O0(8L);
        return this.f20683m.readLong();
    }

    @Override // okio.e
    public short readShort() {
        O0(2L);
        return this.f20683m.readShort();
    }

    @Override // okio.e
    public void skip(long j10) {
        if ((!this.f20684p) != false) {
            while (j10 > 0) {
                if (this.f20683m.s0() == 0 && this.f20682f.read(this.f20683m, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f20683m.s0());
                this.f20683m.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.e
    public String t0() {
        return M(Long.MAX_VALUE);
    }

    @Override // okio.Source
    public a1 timeout() {
        return this.f20682f.timeout();
    }

    public String toString() {
        return "buffer(" + this.f20682f + ')';
    }

    @Override // okio.e
    public int u0() {
        O0(4L);
        return this.f20683m.u0();
    }

    @Override // okio.e
    public byte[] v0(long j10) {
        O0(j10);
        return this.f20683m.v0(j10);
    }

    /* compiled from: RealBufferedSource.kt */
    /* loaded from: classes4.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            u0 u0Var = u0.this;
            if (!u0Var.f20684p) {
                return (int) Math.min(u0Var.f20683m.s0(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            u0.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            u0 u0Var = u0.this;
            if (!u0Var.f20684p) {
                if (u0Var.f20683m.s0() == 0) {
                    u0 u0Var2 = u0.this;
                    if (u0Var2.f20682f.read(u0Var2.f20683m, 8192L) == -1) {
                        return -1;
                    }
                }
                return u0.this.f20683m.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return u0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            qc.q.i(bArr, "data");
            if (!u0.this.f20684p) {
                f1.b(bArr.length, i10, i11);
                if (u0.this.f20683m.s0() == 0) {
                    u0 u0Var = u0.this;
                    if (u0Var.f20682f.read(u0Var.f20683m, 8192L) == -1) {
                        return -1;
                    }
                }
                return u0.this.f20683m.c0(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        qc.q.i(byteBuffer, "sink");
        if (this.f20683m.s0() == 0 && this.f20682f.read(this.f20683m, 8192L) == -1) {
            return -1;
        }
        return this.f20683m.read(byteBuffer);
    }
}
