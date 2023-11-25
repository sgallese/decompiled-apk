package okio;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.internal.connection.RealConnection;

/* compiled from: Buffer.kt */
/* loaded from: classes4.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: f  reason: collision with root package name */
    public v0 f20602f;

    /* renamed from: m  reason: collision with root package name */
    private long f20603m;

    /* compiled from: Buffer.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Closeable {

        /* renamed from: f  reason: collision with root package name */
        public c f20604f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f20605m;

        /* renamed from: p  reason: collision with root package name */
        private v0 f20606p;

        /* renamed from: r  reason: collision with root package name */
        public byte[] f20608r;

        /* renamed from: q  reason: collision with root package name */
        public long f20607q = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f20609s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f20610t = -1;

        public final v0 b() {
            return this.f20606p;
        }

        public final int c() {
            boolean z10;
            long j10;
            long j11 = this.f20607q;
            c cVar = this.f20604f;
            qc.q.f(cVar);
            if (j11 != cVar.s0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long j12 = this.f20607q;
                if (j12 == -1) {
                    j10 = 0;
                } else {
                    j10 = j12 + (this.f20610t - this.f20609s);
                }
                return e(j10);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z10;
            if (this.f20604f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f20604f = null;
                j(null);
                this.f20607q = -1L;
                this.f20608r = null;
                this.f20609s = -1;
                this.f20610t = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final long d(long j10) {
            boolean z10;
            c cVar = this.f20604f;
            if (cVar != null) {
                if (this.f20605m) {
                    long s02 = cVar.s0();
                    int i10 = 1;
                    if (j10 <= s02) {
                        if (j10 >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            long j11 = s02 - j10;
                            while (true) {
                                if (j11 <= 0) {
                                    break;
                                }
                                v0 v0Var = cVar.f20602f;
                                qc.q.f(v0Var);
                                v0 v0Var2 = v0Var.f20693g;
                                qc.q.f(v0Var2);
                                int i11 = v0Var2.f20689c;
                                long j12 = i11 - v0Var2.f20688b;
                                if (j12 <= j11) {
                                    cVar.f20602f = v0Var2.b();
                                    w0.b(v0Var2);
                                    j11 -= j12;
                                } else {
                                    v0Var2.f20689c = i11 - ((int) j11);
                                    break;
                                }
                            }
                            j(null);
                            this.f20607q = j10;
                            this.f20608r = null;
                            this.f20609s = -1;
                            this.f20610t = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                        }
                    } else if (j10 > s02) {
                        long j13 = j10 - s02;
                        boolean z11 = true;
                        while (j13 > 0) {
                            v0 A0 = cVar.A0(i10);
                            int min = (int) Math.min(j13, 8192 - A0.f20689c);
                            A0.f20689c += min;
                            j13 -= min;
                            if (z11) {
                                j(A0);
                                this.f20607q = s02;
                                this.f20608r = A0.f20687a;
                                int i12 = A0.f20689c;
                                this.f20609s = i12 - min;
                                this.f20610t = i12;
                                i10 = 1;
                                z11 = false;
                            } else {
                                i10 = 1;
                            }
                        }
                    }
                    cVar.q0(j10);
                    return s02;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int e(long j10) {
            v0 v0Var;
            c cVar = this.f20604f;
            if (cVar != null) {
                if (j10 >= -1 && j10 <= cVar.s0()) {
                    if (j10 != -1 && j10 != cVar.s0()) {
                        long s02 = cVar.s0();
                        v0 v0Var2 = cVar.f20602f;
                        long j11 = 0;
                        if (b() != null) {
                            long j12 = this.f20607q;
                            int i10 = this.f20609s;
                            qc.q.f(b());
                            long j13 = j12 - (i10 - r9.f20688b);
                            if (j13 > j10) {
                                v0Var = v0Var2;
                                v0Var2 = b();
                                s02 = j13;
                            } else {
                                v0Var = b();
                                j11 = j13;
                            }
                        } else {
                            v0Var = v0Var2;
                        }
                        if (s02 - j10 > j10 - j11) {
                            while (true) {
                                qc.q.f(v0Var);
                                int i11 = v0Var.f20689c;
                                int i12 = v0Var.f20688b;
                                if (j10 < (i11 - i12) + j11) {
                                    break;
                                }
                                j11 += i11 - i12;
                                v0Var = v0Var.f20692f;
                            }
                        } else {
                            while (s02 > j10) {
                                qc.q.f(v0Var2);
                                v0Var2 = v0Var2.f20693g;
                                qc.q.f(v0Var2);
                                s02 -= v0Var2.f20689c - v0Var2.f20688b;
                            }
                            j11 = s02;
                            v0Var = v0Var2;
                        }
                        if (this.f20605m) {
                            qc.q.f(v0Var);
                            if (v0Var.f20690d) {
                                v0 f10 = v0Var.f();
                                if (cVar.f20602f == v0Var) {
                                    cVar.f20602f = f10;
                                }
                                v0Var = v0Var.c(f10);
                                v0 v0Var3 = v0Var.f20693g;
                                qc.q.f(v0Var3);
                                v0Var3.b();
                            }
                        }
                        j(v0Var);
                        this.f20607q = j10;
                        qc.q.f(v0Var);
                        this.f20608r = v0Var.f20687a;
                        int i13 = v0Var.f20688b + ((int) (j10 - j11));
                        this.f20609s = i13;
                        int i14 = v0Var.f20689c;
                        this.f20610t = i14;
                        return i14 - i13;
                    }
                    j(null);
                    this.f20607q = j10;
                    this.f20608r = null;
                    this.f20609s = -1;
                    this.f20610t = -1;
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + cVar.s0());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final void j(v0 v0Var) {
            this.f20606p = v0Var;
        }
    }

    /* compiled from: Buffer.kt */
    /* renamed from: okio.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0463c extends OutputStream {
        C0463c() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            c.this.D(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            qc.q.i(bArr, "data");
            c.this.d0(bArr, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a i0(c cVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = f1.d();
        }
        return cVar.f0(aVar);
    }

    @Override // okio.e
    public byte[] A() {
        return v0(s0());
    }

    public final v0 A0(int i10) {
        boolean z10 = true;
        if (i10 < 1 || i10 > 8192) {
            z10 = false;
        }
        if (z10) {
            v0 v0Var = this.f20602f;
            if (v0Var == null) {
                v0 c10 = w0.c();
                this.f20602f = c10;
                c10.f20693g = c10;
                c10.f20692f = c10;
                return c10;
            }
            qc.q.f(v0Var);
            v0 v0Var2 = v0Var.f20693g;
            qc.q.f(v0Var2);
            if (v0Var2.f20689c + i10 <= 8192 && v0Var2.f20691e) {
                return v0Var2;
            }
            return v0Var2.c(w0.c());
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final byte B(long j10) {
        f1.b(s0(), j10, 1L);
        v0 v0Var = this.f20602f;
        if (v0Var != null) {
            if (s0() - j10 < j10) {
                long s02 = s0();
                while (s02 > j10) {
                    v0Var = v0Var.f20693g;
                    qc.q.f(v0Var);
                    s02 -= v0Var.f20689c - v0Var.f20688b;
                }
                qc.q.f(v0Var);
                return v0Var.f20687a[(int) ((v0Var.f20688b + j10) - s02)];
            }
            long j11 = 0;
            while (true) {
                long j12 = (v0Var.f20689c - v0Var.f20688b) + j11;
                if (j12 <= j10) {
                    v0Var = v0Var.f20692f;
                    qc.q.f(v0Var);
                    j11 = j12;
                } else {
                    qc.q.f(v0Var);
                    return v0Var.f20687a[(int) ((v0Var.f20688b + j10) - j11)];
                }
            }
        } else {
            qc.q.f(null);
            throw null;
        }
    }

    @Override // okio.e
    public boolean C() {
        if (this.f20603m == 0) {
            return true;
        }
        return false;
    }

    @Override // okio.d
    /* renamed from: C0  reason: merged with bridge method [inline-methods] */
    public c B0(f fVar) {
        qc.q.i(fVar, "byteString");
        fVar.J(this, 0, fVar.D());
        return this;
    }

    public c D0(Source source, long j10) throws IOException {
        qc.q.i(source, "source");
        while (j10 > 0) {
            long read = source.read(this, j10);
            if (read != -1) {
                j10 -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public long E(byte b10, long j10) {
        return I(b10, j10, Long.MAX_VALUE);
    }

    @Override // okio.e
    public short E0() throws EOFException {
        return f1.j(readShort());
    }

    @Override // okio.d
    /* renamed from: F0  reason: merged with bridge method [inline-methods] */
    public c y0(byte[] bArr) {
        qc.q.i(bArr, "source");
        return d0(bArr, 0, bArr.length);
    }

    @Override // okio.e
    public long G0() throws EOFException {
        return f1.i(readLong());
    }

    @Override // okio.e
    public void H(c cVar, long j10) throws EOFException {
        qc.q.i(cVar, "sink");
        if (s0() >= j10) {
            cVar.write(this, j10);
        } else {
            cVar.write(this, s0());
            throw new EOFException();
        }
    }

    @Override // okio.e
    public long H0(y0 y0Var) throws IOException {
        qc.q.i(y0Var, "sink");
        long s02 = s0();
        if (s02 > 0) {
            y0Var.write(this, s02);
        }
        return s02;
    }

    public long I(byte b10, long j10, long j11) {
        v0 v0Var;
        int i10;
        boolean z10 = false;
        long j12 = 0;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (z10) {
            if (j11 > s0()) {
                j11 = s0();
            }
            if (j10 == j11 || (v0Var = this.f20602f) == null) {
                return -1L;
            }
            if (s0() - j10 < j10) {
                j12 = s0();
                while (j12 > j10) {
                    v0Var = v0Var.f20693g;
                    qc.q.f(v0Var);
                    j12 -= v0Var.f20689c - v0Var.f20688b;
                }
                while (j12 < j11) {
                    byte[] bArr = v0Var.f20687a;
                    int min = (int) Math.min(v0Var.f20689c, (v0Var.f20688b + j11) - j12);
                    i10 = (int) ((v0Var.f20688b + j10) - j12);
                    while (i10 < min) {
                        if (bArr[i10] != b10) {
                            i10++;
                        }
                    }
                    j12 += v0Var.f20689c - v0Var.f20688b;
                    v0Var = v0Var.f20692f;
                    qc.q.f(v0Var);
                    j10 = j12;
                }
                return -1L;
            }
            while (true) {
                long j13 = (v0Var.f20689c - v0Var.f20688b) + j12;
                if (j13 > j10) {
                    break;
                }
                v0Var = v0Var.f20692f;
                qc.q.f(v0Var);
                j12 = j13;
            }
            while (j12 < j11) {
                byte[] bArr2 = v0Var.f20687a;
                int min2 = (int) Math.min(v0Var.f20689c, (v0Var.f20688b + j11) - j12);
                i10 = (int) ((v0Var.f20688b + j10) - j12);
                while (i10 < min2) {
                    if (bArr2[i10] != b10) {
                        i10++;
                    }
                }
                j12 += v0Var.f20689c - v0Var.f20688b;
                v0Var = v0Var.f20692f;
                qc.q.f(v0Var);
                j10 = j12;
            }
            return -1L;
            return (i10 - v0Var.f20688b) + j12;
        }
        throw new IllegalArgumentException(("size=" + s0() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    @Override // okio.d
    /* renamed from: I0  reason: merged with bridge method [inline-methods] */
    public c d0(byte[] bArr, int i10, int i11) {
        qc.q.i(bArr, "source");
        long j10 = i11;
        f1.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            v0 A0 = A0(1);
            int min = Math.min(i12 - i10, 8192 - A0.f20689c);
            int i13 = i10 + min;
            ec.l.d(bArr, A0.f20687a, A0.f20689c, i10, i13);
            A0.f20689c += min;
            i10 = i13;
        }
        q0(s0() + j10);
        return this;
    }

    @Override // okio.d
    /* renamed from: J0  reason: merged with bridge method [inline-methods] */
    public c D(int i10) {
        v0 A0 = A0(1);
        byte[] bArr = A0.f20687a;
        int i11 = A0.f20689c;
        A0.f20689c = i11 + 1;
        bArr[i11] = (byte) i10;
        q0(s0() + 1);
        return this;
    }

    @Override // okio.e
    public long K() throws EOFException {
        int i10;
        String str;
        if (s0() != 0) {
            int i11 = 0;
            long j10 = 0;
            long j11 = -7;
            boolean z10 = false;
            boolean z11 = false;
            do {
                v0 v0Var = this.f20602f;
                qc.q.f(v0Var);
                byte[] bArr = v0Var.f20687a;
                int i12 = v0Var.f20688b;
                int i13 = v0Var.f20689c;
                while (i12 < i13) {
                    byte b10 = bArr[i12];
                    if (b10 >= 48 && b10 <= 57) {
                        int i14 = 48 - b10;
                        if (j10 >= -922337203685477580L && (j10 != -922337203685477580L || i14 >= j11)) {
                            j10 = (j10 * 10) + i14;
                        } else {
                            c D = new c().P0(j10).D(b10);
                            if (!z10) {
                                D.readByte();
                            }
                            throw new NumberFormatException("Number too large: " + D.l0());
                        }
                    } else if (b10 == 45 && i11 == 0) {
                        j11--;
                        z10 = true;
                    } else {
                        z11 = true;
                        break;
                    }
                    i12++;
                    i11++;
                }
                if (i12 == i13) {
                    this.f20602f = v0Var.b();
                    w0.b(v0Var);
                } else {
                    v0Var.f20688b = i12;
                }
                if (z11) {
                    break;
                }
            } while (this.f20602f != null);
            q0(s0() - i11);
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (i11 < i10) {
                if (s0() != 0) {
                    if (z10) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    throw new NumberFormatException(str + " but was 0x" + f1.k(B(0L)));
                }
                throw new EOFException();
            } else if (!z10) {
                return -j10;
            } else {
                return j10;
            }
        }
        throw new EOFException();
    }

    public long L(f fVar) throws IOException {
        qc.q.i(fVar, "bytes");
        return Q(fVar, 0L);
    }

    @Override // okio.e
    public e L0() {
        return l0.d(new s0(this));
    }

    @Override // okio.e
    public String M(long j10) throws EOFException {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long I = I((byte) 10, 0L, j11);
            if (I != -1) {
                return ld.f.d(this, I);
            }
            if (j11 < s0() && B(j11 - 1) == 13 && B(j11) == 10) {
                return ld.f.d(this, j11);
            }
            c cVar = new c();
            j(cVar, 0L, Math.min(32, s0()));
            throw new EOFException("\\n not found: limit=" + Math.min(s0(), j10) + " content=" + cVar.j0().n() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    @Override // okio.d
    /* renamed from: N0  reason: merged with bridge method [inline-methods] */
    public c P0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return D(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return W("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 < 100) {
                    if (j10 >= 10) {
                        i10 = 2;
                    }
                } else if (j10 < 1000) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
            } else if (j10 < 1000000) {
                if (j10 < 100000) {
                    i10 = 5;
                } else {
                    i10 = 6;
                }
            } else if (j10 < 10000000) {
                i10 = 7;
            } else {
                i10 = 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j10 < 1000000000) {
                    i10 = 9;
                } else {
                    i10 = 10;
                }
            } else if (j10 < 100000000000L) {
                i10 = 11;
            } else {
                i10 = 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else if (j10 < 100000000000000L) {
                i10 = 14;
            } else {
                i10 = 15;
            }
        } else if (j10 < 100000000000000000L) {
            if (j10 < 10000000000000000L) {
                i10 = 16;
            } else {
                i10 = 17;
            }
        } else if (j10 < 1000000000000000000L) {
            i10 = 18;
        } else {
            i10 = 19;
        }
        if (z10) {
            i10++;
        }
        v0 A0 = A0(i10);
        byte[] bArr = A0.f20687a;
        int i11 = A0.f20689c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = ld.f.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        A0.f20689c += i10;
        q0(s0() + i10);
        return this;
    }

    @Override // okio.e
    public void O0(long j10) throws EOFException {
        if (this.f20603m >= j10) {
            return;
        }
        throw new EOFException();
    }

    public long Q(f fVar, long j10) throws IOException {
        boolean z10;
        boolean z11;
        long j11 = j10;
        qc.q.i(fVar, "bytes");
        if (fVar.D() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j12 = 0;
            if (j11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                v0 v0Var = this.f20602f;
                if (v0Var != null) {
                    if (s0() - j11 < j11) {
                        long s02 = s0();
                        while (s02 > j11) {
                            v0Var = v0Var.f20693g;
                            qc.q.f(v0Var);
                            s02 -= v0Var.f20689c - v0Var.f20688b;
                        }
                        byte[] r10 = fVar.r();
                        byte b10 = r10[0];
                        int D = fVar.D();
                        long s03 = (s0() - D) + 1;
                        while (s02 < s03) {
                            byte[] bArr = v0Var.f20687a;
                            long j13 = s02;
                            int min = (int) Math.min(v0Var.f20689c, (v0Var.f20688b + s03) - s02);
                            for (int i10 = (int) ((v0Var.f20688b + j11) - j13); i10 < min; i10++) {
                                if (bArr[i10] == b10 && ld.f.c(v0Var, i10 + 1, r10, 1, D)) {
                                    return (i10 - v0Var.f20688b) + j13;
                                }
                            }
                            s02 = j13 + (v0Var.f20689c - v0Var.f20688b);
                            v0Var = v0Var.f20692f;
                            qc.q.f(v0Var);
                            j11 = s02;
                        }
                    } else {
                        while (true) {
                            long j14 = (v0Var.f20689c - v0Var.f20688b) + j12;
                            if (j14 > j11) {
                                break;
                            }
                            v0Var = v0Var.f20692f;
                            qc.q.f(v0Var);
                            j12 = j14;
                        }
                        byte[] r11 = fVar.r();
                        byte b11 = r11[0];
                        int D2 = fVar.D();
                        long s04 = (s0() - D2) + 1;
                        while (j12 < s04) {
                            byte[] bArr2 = v0Var.f20687a;
                            long j15 = s04;
                            int min2 = (int) Math.min(v0Var.f20689c, (v0Var.f20688b + s04) - j12);
                            for (int i11 = (int) ((v0Var.f20688b + j11) - j12); i11 < min2; i11++) {
                                if (bArr2[i11] == b11 && ld.f.c(v0Var, i11 + 1, r11, 1, D2)) {
                                    return (i11 - v0Var.f20688b) + j12;
                                }
                            }
                            j12 += v0Var.f20689c - v0Var.f20688b;
                            v0Var = v0Var.f20692f;
                            qc.q.f(v0Var);
                            j11 = j12;
                            s04 = j15;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public long R(f fVar) {
        qc.q.i(fVar, "targetBytes");
        return T(fVar, 0L);
    }

    @Override // okio.d
    /* renamed from: R0  reason: merged with bridge method [inline-methods] */
    public c h0(long j10) {
        if (j10 == 0) {
            return D(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        v0 A0 = A0(i10);
        byte[] bArr = A0.f20687a;
        int i11 = A0.f20689c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = ld.f.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        A0.f20689c += i10;
        q0(s0() + i10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[EDGE_INSN: B:43:0x00aa->B:38:0x00aa BREAK  A[LOOP:0: B:5:0x000d->B:46:?], SYNTHETIC] */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long S0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.s0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb4
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            okio.v0 r6 = r15.f20602f
            qc.q.f(r6)
            byte[] r7 = r6.f20687a
            int r8 = r6.f20688b
            int r9 = r6.f20689c
        L18:
            if (r8 >= r9) goto L96
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3f
        L27:
            r11 = 97
            if (r10 < r11) goto L34
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L34
            int r11 = r10 + (-97)
        L31:
            int r11 = r11 + 10
            goto L3f
        L34:
            r11 = 65
            if (r10 < r11) goto L77
            r11 = 70
            if (r10 > r11) goto L77
            int r11 = r10 + (-65)
            goto L31
        L3f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4f:
            okio.c r0 = new okio.c
            r0.<init>()
            okio.c r0 = r0.h0(r4)
            okio.c r0 = r0.D(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.l0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L77:
            if (r0 == 0) goto L7b
            r1 = 1
            goto L96
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.f1.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            if (r8 != r9) goto La2
            okio.v0 r7 = r6.b()
            r15.f20602f = r7
            okio.w0.b(r6)
            goto La4
        La2:
            r6.f20688b = r8
        La4:
            if (r1 != 0) goto Laa
            okio.v0 r6 = r15.f20602f
            if (r6 != 0) goto Ld
        Laa:
            long r1 = r15.s0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.q0(r1)
            return r4
        Lb4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.c.S0():long");
    }

    public long T(f fVar, long j10) {
        boolean z10;
        int i10;
        int i11;
        qc.q.i(fVar, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            v0 v0Var = this.f20602f;
            if (v0Var == null) {
                return -1L;
            }
            if (s0() - j10 < j10) {
                j11 = s0();
                while (j11 > j10) {
                    v0Var = v0Var.f20693g;
                    qc.q.f(v0Var);
                    j11 -= v0Var.f20689c - v0Var.f20688b;
                }
                if (fVar.D() == 2) {
                    byte i12 = fVar.i(0);
                    byte i13 = fVar.i(1);
                    while (j11 < s0()) {
                        byte[] bArr = v0Var.f20687a;
                        i10 = (int) ((v0Var.f20688b + j10) - j11);
                        int i14 = v0Var.f20689c;
                        while (i10 < i14) {
                            byte b10 = bArr[i10];
                            if (b10 != i12 && b10 != i13) {
                                i10++;
                            }
                            i11 = v0Var.f20688b;
                        }
                        j11 += v0Var.f20689c - v0Var.f20688b;
                        v0Var = v0Var.f20692f;
                        qc.q.f(v0Var);
                        j10 = j11;
                    }
                    return -1L;
                }
                byte[] r10 = fVar.r();
                while (j11 < s0()) {
                    byte[] bArr2 = v0Var.f20687a;
                    i10 = (int) ((v0Var.f20688b + j10) - j11);
                    int i15 = v0Var.f20689c;
                    while (i10 < i15) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : r10) {
                            if (b11 == b12) {
                                i11 = v0Var.f20688b;
                            }
                        }
                        i10++;
                    }
                    j11 += v0Var.f20689c - v0Var.f20688b;
                    v0Var = v0Var.f20692f;
                    qc.q.f(v0Var);
                    j10 = j11;
                }
                return -1L;
            }
            while (true) {
                long j12 = (v0Var.f20689c - v0Var.f20688b) + j11;
                if (j12 > j10) {
                    break;
                }
                v0Var = v0Var.f20692f;
                qc.q.f(v0Var);
                j11 = j12;
            }
            if (fVar.D() == 2) {
                byte i16 = fVar.i(0);
                byte i17 = fVar.i(1);
                while (j11 < s0()) {
                    byte[] bArr3 = v0Var.f20687a;
                    i10 = (int) ((v0Var.f20688b + j10) - j11);
                    int i18 = v0Var.f20689c;
                    while (i10 < i18) {
                        byte b13 = bArr3[i10];
                        if (b13 != i16 && b13 != i17) {
                            i10++;
                        }
                        i11 = v0Var.f20688b;
                    }
                    j11 += v0Var.f20689c - v0Var.f20688b;
                    v0Var = v0Var.f20692f;
                    qc.q.f(v0Var);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] r11 = fVar.r();
            while (j11 < s0()) {
                byte[] bArr4 = v0Var.f20687a;
                i10 = (int) ((v0Var.f20688b + j10) - j11);
                int i19 = v0Var.f20689c;
                while (i10 < i19) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : r11) {
                        if (b14 == b15) {
                            i11 = v0Var.f20688b;
                        }
                    }
                    i10++;
                }
                j11 += v0Var.f20689c - v0Var.f20688b;
                v0Var = v0Var.f20692f;
                qc.q.f(v0Var);
                j10 = j11;
            }
            return -1L;
            return (i10 - i11) + j11;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
    }

    @Override // okio.d
    /* renamed from: T0  reason: merged with bridge method [inline-methods] */
    public c w(int i10) {
        v0 A0 = A0(4);
        byte[] bArr = A0.f20687a;
        int i11 = A0.f20689c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        A0.f20689c = i14 + 1;
        q0(s0() + 4);
        return this;
    }

    @Override // okio.e
    public InputStream U0() {
        return new b();
    }

    public OutputStream V() {
        return new C0463c();
    }

    public c V0(long j10) {
        v0 A0 = A0(8);
        byte[] bArr = A0.f20687a;
        int i10 = A0.f20689c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        A0.f20689c = i17 + 1;
        q0(s0() + 8);
        return this;
    }

    @Override // okio.e
    public int W0(o0 o0Var) {
        qc.q.i(o0Var, "options");
        int f10 = ld.f.f(this, o0Var, false, 2, null);
        if (f10 == -1) {
            return -1;
        }
        skip(o0Var.h()[f10].D());
        return f10;
    }

    @Override // okio.d
    /* renamed from: X0  reason: merged with bridge method [inline-methods] */
    public c t(int i10) {
        v0 A0 = A0(2);
        byte[] bArr = A0.f20687a;
        int i11 = A0.f20689c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        A0.f20689c = i12 + 1;
        q0(s0() + 2);
        return this;
    }

    public boolean Y(long j10, f fVar, int i10, int i11) {
        qc.q.i(fVar, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || s0() - j10 < i11 || fVar.D() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (B(i12 + j10) != fVar.i(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public c Y0(String str, int i10, int i11, Charset charset) {
        boolean z10;
        boolean z11;
        qc.q.i(str, "string");
        qc.q.i(charset, "charset");
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 > str.length()) {
                    z12 = false;
                }
                if (z12) {
                    if (qc.q.d(charset, yc.d.f26303b)) {
                        return b1(str, i10, i11);
                    }
                    String substring = str.substring(i10, i11);
                    qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    qc.q.h(bytes, "this as java.lang.String).getBytes(charset)");
                    return d0(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
    }

    public c Z0(String str, Charset charset) {
        qc.q.i(str, "string");
        qc.q.i(charset, "charset");
        return Y0(str, 0, str.length(), charset);
    }

    @Override // okio.e
    public boolean a0(long j10, f fVar) {
        qc.q.i(fVar, "bytes");
        return Y(j10, fVar, 0, fVar.D());
    }

    @Override // okio.d
    /* renamed from: a1  reason: merged with bridge method [inline-methods] */
    public c W(String str) {
        qc.q.i(str, "string");
        return b1(str, 0, str.length());
    }

    public final void b() {
        skip(s0());
    }

    @Override // okio.e
    public String b0(Charset charset) {
        qc.q.i(charset, "charset");
        return k0(this.f20603m, charset);
    }

    public c b1(String str, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        char charAt;
        char c10;
        boolean z13;
        qc.q.i(str, "string");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= str.length()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    while (i10 < i11) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 128) {
                            v0 A0 = A0(1);
                            byte[] bArr = A0.f20687a;
                            int i12 = A0.f20689c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = A0.f20689c;
                            int i15 = (i12 + i10) - i14;
                            A0.f20689c = i14 + i15;
                            q0(s0() + i15);
                        } else {
                            if (charAt2 < 2048) {
                                v0 A02 = A0(2);
                                byte[] bArr2 = A02.f20687a;
                                int i16 = A02.f20689c;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                A02.f20689c = i16 + 2;
                                q0(s0() + 2);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i17 = i10 + 1;
                                if (i17 < i11) {
                                    c10 = str.charAt(i17);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c10 && c10 < 57344) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        int i18 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + 65536;
                                        v0 A03 = A0(4);
                                        byte[] bArr3 = A03.f20687a;
                                        int i19 = A03.f20689c;
                                        bArr3[i19] = (byte) ((i18 >> 18) | 240);
                                        bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                        bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                        bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                        A03.f20689c = i19 + 4;
                                        q0(s0() + 4);
                                        i10 += 2;
                                    }
                                }
                                D(63);
                                i10 = i17;
                            } else {
                                v0 A04 = A0(3);
                                byte[] bArr4 = A04.f20687a;
                                int i20 = A04.f20689c;
                                bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                                A04.f20689c = i20 + 3;
                                q0(s0() + 3);
                            }
                            i10++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
    }

    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public c clone() {
        return e();
    }

    public int c0(byte[] bArr, int i10, int i11) {
        qc.q.i(bArr, "sink");
        f1.b(bArr.length, i10, i11);
        v0 v0Var = this.f20602f;
        if (v0Var == null) {
            return -1;
        }
        int min = Math.min(i11, v0Var.f20689c - v0Var.f20688b);
        byte[] bArr2 = v0Var.f20687a;
        int i12 = v0Var.f20688b;
        ec.l.d(bArr2, bArr, i10, i12, i12 + min);
        v0Var.f20688b += min;
        q0(s0() - min);
        if (v0Var.f20688b == v0Var.f20689c) {
            this.f20602f = v0Var.b();
            w0.b(v0Var);
        }
        return min;
    }

    public c c1(int i10) {
        if (i10 < 128) {
            D(i10);
        } else if (i10 < 2048) {
            v0 A0 = A0(2);
            byte[] bArr = A0.f20687a;
            int i11 = A0.f20689c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            A0.f20689c = i11 + 2;
            q0(s0() + 2);
        } else {
            boolean z10 = false;
            if (55296 <= i10 && i10 < 57344) {
                z10 = true;
            }
            if (z10) {
                D(63);
            } else if (i10 < 65536) {
                v0 A02 = A0(3);
                byte[] bArr2 = A02.f20687a;
                int i12 = A02.f20689c;
                bArr2[i12] = (byte) ((i10 >> 12) | 224);
                bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
                A02.f20689c = i12 + 3;
                q0(s0() + 3);
            } else if (i10 <= 1114111) {
                v0 A03 = A0(4);
                byte[] bArr3 = A03.f20687a;
                int i13 = A03.f20689c;
                bArr3[i13] = (byte) ((i10 >> 18) | 240);
                bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
                A03.f20689c = i13 + 4;
                q0(s0() + 4);
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + f1.l(i10));
            }
        }
        return this;
    }

    public final long d() {
        long s02 = s0();
        if (s02 == 0) {
            return 0L;
        }
        v0 v0Var = this.f20602f;
        qc.q.f(v0Var);
        v0 v0Var2 = v0Var.f20693g;
        qc.q.f(v0Var2);
        if (v0Var2.f20689c < 8192 && v0Var2.f20691e) {
            s02 -= r3 - v0Var2.f20688b;
        }
        return s02;
    }

    public final c e() {
        c cVar = new c();
        if (s0() != 0) {
            v0 v0Var = this.f20602f;
            qc.q.f(v0Var);
            v0 d10 = v0Var.d();
            cVar.f20602f = d10;
            d10.f20693g = d10;
            d10.f20692f = d10;
            for (v0 v0Var2 = v0Var.f20692f; v0Var2 != v0Var; v0Var2 = v0Var2.f20692f) {
                v0 v0Var3 = d10.f20693g;
                qc.q.f(v0Var3);
                qc.q.f(v0Var2);
                v0Var3.c(v0Var2.d());
            }
            cVar.q0(s0());
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (s0() == cVar.s0()) {
                if (s0() == 0) {
                    return true;
                }
                v0 v0Var = this.f20602f;
                qc.q.f(v0Var);
                v0 v0Var2 = cVar.f20602f;
                qc.q.f(v0Var2);
                int i10 = v0Var.f20688b;
                int i11 = v0Var2.f20688b;
                long j10 = 0;
                while (j10 < s0()) {
                    long min = Math.min(v0Var.f20689c - i10, v0Var2.f20689c - i11);
                    long j11 = 0;
                    while (j11 < min) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (v0Var.f20687a[i10] == v0Var2.f20687a[i11]) {
                            j11++;
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == v0Var.f20689c) {
                        v0Var = v0Var.f20692f;
                        qc.q.f(v0Var);
                        i10 = v0Var.f20688b;
                    }
                    if (i11 == v0Var2.f20689c) {
                        v0Var2 = v0Var2.f20692f;
                        qc.q.f(v0Var2);
                        i11 = v0Var2.f20688b;
                    }
                    j10 += min;
                }
                return true;
            }
        }
        return false;
    }

    public final a f0(a aVar) {
        qc.q.i(aVar, "unsafeCursor");
        return ld.f.a(this, aVar);
    }

    @Override // okio.d
    public long g0(Source source) throws IOException {
        qc.q.i(source, "source");
        long j10 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read != -1) {
                j10 += read;
            } else {
                return j10;
            }
        }
    }

    @Override // okio.e
    public String h(long j10) throws EOFException {
        return k0(j10, yc.d.f26303b);
    }

    public int hashCode() {
        v0 v0Var = this.f20602f;
        if (v0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = v0Var.f20689c;
            for (int i12 = v0Var.f20688b; i12 < i11; i12++) {
                i10 = (i10 * 31) + v0Var.f20687a[i12];
            }
            v0Var = v0Var.f20692f;
            qc.q.f(v0Var);
        } while (v0Var != this.f20602f);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final c j(c cVar, long j10, long j11) {
        qc.q.i(cVar, "out");
        f1.b(s0(), j10, j11);
        if (j11 != 0) {
            cVar.q0(cVar.s0() + j11);
            v0 v0Var = this.f20602f;
            while (true) {
                qc.q.f(v0Var);
                int i10 = v0Var.f20689c;
                int i11 = v0Var.f20688b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                v0Var = v0Var.f20692f;
            }
            while (j11 > 0) {
                qc.q.f(v0Var);
                v0 d10 = v0Var.d();
                int i12 = d10.f20688b + ((int) j10);
                d10.f20688b = i12;
                d10.f20689c = Math.min(i12 + ((int) j11), d10.f20689c);
                v0 v0Var2 = cVar.f20602f;
                if (v0Var2 == null) {
                    d10.f20693g = d10;
                    d10.f20692f = d10;
                    cVar.f20602f = d10;
                } else {
                    qc.q.f(v0Var2);
                    v0 v0Var3 = v0Var2.f20693g;
                    qc.q.f(v0Var3);
                    v0Var3.c(d10);
                }
                j11 -= d10.f20689c - d10.f20688b;
                v0Var = v0Var.f20692f;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // okio.e
    public f j0() {
        return l(s0());
    }

    public String k0(long j10, Charset charset) throws EOFException {
        boolean z10;
        qc.q.i(charset, "charset");
        if (j10 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f20603m >= j10) {
                if (j10 == 0) {
                    return "";
                }
                v0 v0Var = this.f20602f;
                qc.q.f(v0Var);
                int i10 = v0Var.f20688b;
                if (i10 + j10 > v0Var.f20689c) {
                    return new String(v0(j10), charset);
                }
                int i11 = (int) j10;
                String str = new String(v0Var.f20687a, i10, i11, charset);
                int i12 = v0Var.f20688b + i11;
                v0Var.f20688b = i12;
                this.f20603m -= j10;
                if (i12 == v0Var.f20689c) {
                    this.f20602f = v0Var.b();
                    w0.b(v0Var);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    @Override // okio.e
    public f l(long j10) throws EOFException {
        boolean z10;
        if (j10 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (s0() >= j10) {
                if (j10 >= 4096) {
                    f z02 = z0((int) j10);
                    skip(j10);
                    return z02;
                }
                return new f(v0(j10));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    public String l0() {
        return k0(this.f20603m, yc.d.f26303b);
    }

    @Override // okio.e
    public boolean m0(long j10) {
        if (this.f20603m >= j10) {
            return true;
        }
        return false;
    }

    public int p0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (s0() != 0) {
            byte B = B(0L);
            boolean z10 = false;
            if ((B & 128) == 0) {
                i10 = B & Byte.MAX_VALUE;
                i11 = 1;
                i12 = 0;
            } else if ((B & 224) == 192) {
                i10 = B & 31;
                i11 = 2;
                i12 = 128;
            } else if ((B & 240) == 224) {
                i10 = B & 15;
                i11 = 3;
                i12 = RecyclerView.m.FLAG_MOVED;
            } else if ((B & 248) == 240) {
                i10 = B & 7;
                i11 = 4;
                i12 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j10 = i11;
            if (s0() >= j10) {
                for (int i13 = 1; i13 < i11; i13++) {
                    long j11 = i13;
                    byte B2 = B(j11);
                    if ((B2 & 192) == 128) {
                        i10 = (i10 << 6) | (B2 & 63);
                    } else {
                        skip(j11);
                        return 65533;
                    }
                }
                skip(j10);
                if (i10 > 1114111) {
                    return 65533;
                }
                if (55296 <= i10 && i10 < 57344) {
                    z10 = true;
                }
                if (z10 || i10 < i12) {
                    return 65533;
                }
                return i10;
            }
            throw new EOFException("size < " + i11 + ": " + s0() + " (to read code point prefixed 0x" + f1.k(B) + ')');
        }
        throw new EOFException();
    }

    public final void q0(long j10) {
        this.f20603m = j10;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        qc.q.i(byteBuffer, "sink");
        v0 v0Var = this.f20602f;
        if (v0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), v0Var.f20689c - v0Var.f20688b);
        byteBuffer.put(v0Var.f20687a, v0Var.f20688b, min);
        int i10 = v0Var.f20688b + min;
        v0Var.f20688b = i10;
        this.f20603m -= min;
        if (i10 == v0Var.f20689c) {
            this.f20602f = v0Var.b();
            w0.b(v0Var);
        }
        return min;
    }

    @Override // okio.e
    public byte readByte() throws EOFException {
        if (s0() != 0) {
            v0 v0Var = this.f20602f;
            qc.q.f(v0Var);
            int i10 = v0Var.f20688b;
            int i11 = v0Var.f20689c;
            int i12 = i10 + 1;
            byte b10 = v0Var.f20687a[i10];
            q0(s0() - 1);
            if (i12 == i11) {
                this.f20602f = v0Var.b();
                w0.b(v0Var);
            } else {
                v0Var.f20688b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // okio.e
    public void readFully(byte[] bArr) throws EOFException {
        qc.q.i(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int c02 = c0(bArr, i10, bArr.length - i10);
            if (c02 != -1) {
                i10 += c02;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.e
    public int readInt() throws EOFException {
        if (s0() >= 4) {
            v0 v0Var = this.f20602f;
            qc.q.f(v0Var);
            int i10 = v0Var.f20688b;
            int i11 = v0Var.f20689c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = v0Var.f20687a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            q0(s0() - 4);
            if (i17 == i11) {
                this.f20602f = v0Var.b();
                w0.b(v0Var);
            } else {
                v0Var.f20688b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // okio.e
    public long readLong() throws EOFException {
        if (s0() >= 8) {
            v0 v0Var = this.f20602f;
            qc.q.f(v0Var);
            int i10 = v0Var.f20688b;
            int i11 = v0Var.f20689c;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = v0Var.f20687a;
            long j10 = (bArr[i10] & 255) << 56;
            long j11 = j10 | ((bArr[r6] & 255) << 48);
            long j12 = j11 | ((bArr[r1] & 255) << 40);
            int i12 = i10 + 1 + 1 + 1 + 1;
            long j13 = ((bArr[r6] & 255) << 32) | j12;
            long j14 = j13 | ((bArr[i12] & 255) << 24);
            long j15 = j14 | ((bArr[r8] & 255) << 16);
            long j16 = j15 | ((bArr[r1] & 255) << 8);
            int i13 = i12 + 1 + 1 + 1 + 1;
            long j17 = j16 | (bArr[r8] & 255);
            q0(s0() - 8);
            if (i13 == i11) {
                this.f20602f = v0Var.b();
                w0.b(v0Var);
            } else {
                v0Var.f20688b = i13;
            }
            return j17;
        }
        throw new EOFException();
    }

    @Override // okio.e
    public short readShort() throws EOFException {
        if (s0() >= 2) {
            v0 v0Var = this.f20602f;
            qc.q.f(v0Var);
            int i10 = v0Var.f20688b;
            int i11 = v0Var.f20689c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = v0Var.f20687a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            q0(s0() - 2);
            if (i13 == i11) {
                this.f20602f = v0Var.b();
                w0.b(v0Var);
            } else {
                v0Var.f20688b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    public final long s0() {
        return this.f20603m;
    }

    @Override // okio.e
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            v0 v0Var = this.f20602f;
            if (v0Var != null) {
                int min = (int) Math.min(j10, v0Var.f20689c - v0Var.f20688b);
                long j11 = min;
                q0(s0() - j11);
                j10 -= j11;
                int i10 = v0Var.f20688b + min;
                v0Var.f20688b = i10;
                if (i10 == v0Var.f20689c) {
                    this.f20602f = v0Var.b();
                    w0.b(v0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.e
    public String t0() throws EOFException {
        return M(Long.MAX_VALUE);
    }

    @Override // okio.Source
    public a1 timeout() {
        return a1.NONE;
    }

    public String toString() {
        return x0().toString();
    }

    @Override // okio.e
    public int u0() throws EOFException {
        return f1.h(readInt());
    }

    @Override // okio.e
    public byte[] v0(long j10) throws EOFException {
        boolean z10;
        if (j10 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (s0() >= j10) {
                byte[] bArr = new byte[(int) j10];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        qc.q.i(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            v0 A0 = A0(1);
            int min = Math.min(i10, 8192 - A0.f20689c);
            byteBuffer.get(A0.f20687a, A0.f20689c, min);
            i10 -= min;
            A0.f20689c += min;
        }
        this.f20603m += remaining;
        return remaining;
    }

    public final f x0() {
        boolean z10;
        if (s0() <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return z0((int) s0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + s0()).toString());
    }

    public final f z0(int i10) {
        if (i10 == 0) {
            return f.f20622r;
        }
        f1.b(s0(), 0L, i10);
        v0 v0Var = this.f20602f;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            qc.q.f(v0Var);
            int i14 = v0Var.f20689c;
            int i15 = v0Var.f20688b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                v0Var = v0Var.f20692f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        v0 v0Var2 = this.f20602f;
        int i16 = 0;
        while (i11 < i10) {
            qc.q.f(v0Var2);
            bArr[i16] = v0Var2.f20687a;
            i11 += v0Var2.f20689c - v0Var2.f20688b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = v0Var2.f20688b;
            v0Var2.f20690d = true;
            i16++;
            v0Var2 = v0Var2.f20692f;
        }
        return new x0(bArr, iArr);
    }

    /* compiled from: Buffer.kt */
    /* loaded from: classes4.dex */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.s0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (c.this.s0() > 0) {
                return c.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            qc.q.i(bArr, "sink");
            return c.this.c0(bArr, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // okio.y0
    public void write(c cVar, long j10) {
        v0 v0Var;
        qc.q.i(cVar, "source");
        if (cVar != this) {
            f1.b(cVar.s0(), 0L, j10);
            while (j10 > 0) {
                v0 v0Var2 = cVar.f20602f;
                qc.q.f(v0Var2);
                int i10 = v0Var2.f20689c;
                qc.q.f(cVar.f20602f);
                if (j10 < i10 - r2.f20688b) {
                    v0 v0Var3 = this.f20602f;
                    if (v0Var3 != null) {
                        qc.q.f(v0Var3);
                        v0Var = v0Var3.f20693g;
                    } else {
                        v0Var = null;
                    }
                    if (v0Var != null && v0Var.f20691e) {
                        if ((v0Var.f20689c + j10) - (v0Var.f20690d ? 0 : v0Var.f20688b) <= 8192) {
                            v0 v0Var4 = cVar.f20602f;
                            qc.q.f(v0Var4);
                            v0Var4.g(v0Var, (int) j10);
                            cVar.q0(cVar.s0() - j10);
                            q0(s0() + j10);
                            return;
                        }
                    }
                    v0 v0Var5 = cVar.f20602f;
                    qc.q.f(v0Var5);
                    cVar.f20602f = v0Var5.e((int) j10);
                }
                v0 v0Var6 = cVar.f20602f;
                qc.q.f(v0Var6);
                long j11 = v0Var6.f20689c - v0Var6.f20688b;
                cVar.f20602f = v0Var6.b();
                v0 v0Var7 = this.f20602f;
                if (v0Var7 == null) {
                    this.f20602f = v0Var6;
                    v0Var6.f20693g = v0Var6;
                    v0Var6.f20692f = v0Var6;
                } else {
                    qc.q.f(v0Var7);
                    v0 v0Var8 = v0Var7.f20693g;
                    qc.q.f(v0Var8);
                    v0Var8.c(v0Var6).a();
                }
                cVar.q0(cVar.s0() - j11);
                q0(s0() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // okio.Source
    public long read(c cVar, long j10) {
        qc.q.i(cVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (s0() == 0) {
            return -1L;
        } else {
            if (j10 > s0()) {
                j10 = s0();
            }
            cVar.write(this, j10);
            return j10;
        }
    }

    @Override // okio.e, okio.d
    public c a() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.d, okio.y0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.d
    /* renamed from: q  reason: merged with bridge method [inline-methods] */
    public c r() {
        return this;
    }

    @Override // okio.d
    /* renamed from: z  reason: merged with bridge method [inline-methods] */
    public c J() {
        return this;
    }
}
