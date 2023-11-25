package com.google.protobuf;

import com.google.protobuf.q1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends g {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f12242c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f12243d = p1.E();

    /* renamed from: a  reason: collision with root package name */
    k f12244a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12245b;

    /* loaded from: classes3.dex */
    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f12246e;

        /* renamed from: f  reason: collision with root package name */
        private final int f12247f;

        /* renamed from: g  reason: collision with root package name */
        private final int f12248g;

        /* renamed from: h  reason: collision with root package name */
        private int f12249h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                int i12 = i10 + i11;
                if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                    this.f12246e = bArr;
                    this.f12247f = i10;
                    this.f12249h = i10;
                    this.f12248g = i12;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B0(int i10, int i11) throws IOException {
            T0(i10, 0);
            C0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void C0(int i10) throws IOException {
            if (i10 >= 0) {
                V0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void F0(int i10, q0 q0Var, f1 f1Var) throws IOException {
            T0(i10, 2);
            V0(((com.google.protobuf.a) q0Var).r(f1Var));
            f1Var.b(q0Var, this.f12244a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void G0(q0 q0Var) throws IOException {
            V0(q0Var.k());
            q0Var.e(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H0(int i10, q0 q0Var) throws IOException {
            T0(1, 3);
            U0(2, i10);
            Z0(3, q0Var);
            T0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void I0(int i10, h hVar) throws IOException {
            T0(1, 3);
            U0(2, i10);
            l0(3, hVar);
            T0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R0(int i10, String str) throws IOException {
            T0(i10, 2);
            S0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S0(String str) throws IOException {
            int i10 = this.f12249h;
            try {
                int W = CodedOutputStream.W(str.length() * 3);
                int W2 = CodedOutputStream.W(str.length());
                if (W2 == W) {
                    int i11 = i10 + W2;
                    this.f12249h = i11;
                    int f10 = q1.f(str, this.f12246e, i11, f0());
                    this.f12249h = i10;
                    V0((f10 - i10) - W2);
                    this.f12249h = f10;
                } else {
                    V0(q1.g(str));
                    this.f12249h = q1.f(str, this.f12246e, this.f12249h, f0());
                }
            } catch (q1.d e10) {
                this.f12249h = i10;
                b0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T0(int i10, int i11) throws IOException {
            V0(r1.c(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U0(int i10, int i11) throws IOException {
            T0(i10, 0);
            V0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V0(int i10) throws IOException {
            if (CodedOutputStream.f12243d && !d.c() && f0() >= 5) {
                if ((i10 & (-128)) == 0) {
                    byte[] bArr = this.f12246e;
                    int i11 = this.f12249h;
                    this.f12249h = i11 + 1;
                    p1.K(bArr, i11, (byte) i10);
                    return;
                }
                byte[] bArr2 = this.f12246e;
                int i12 = this.f12249h;
                this.f12249h = i12 + 1;
                p1.K(bArr2, i12, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & (-128)) == 0) {
                    byte[] bArr3 = this.f12246e;
                    int i14 = this.f12249h;
                    this.f12249h = i14 + 1;
                    p1.K(bArr3, i14, (byte) i13);
                    return;
                }
                byte[] bArr4 = this.f12246e;
                int i15 = this.f12249h;
                this.f12249h = i15 + 1;
                p1.K(bArr4, i15, (byte) (i13 | 128));
                int i16 = i13 >>> 7;
                if ((i16 & (-128)) == 0) {
                    byte[] bArr5 = this.f12246e;
                    int i17 = this.f12249h;
                    this.f12249h = i17 + 1;
                    p1.K(bArr5, i17, (byte) i16);
                    return;
                }
                byte[] bArr6 = this.f12246e;
                int i18 = this.f12249h;
                this.f12249h = i18 + 1;
                p1.K(bArr6, i18, (byte) (i16 | 128));
                int i19 = i16 >>> 7;
                if ((i19 & (-128)) == 0) {
                    byte[] bArr7 = this.f12246e;
                    int i20 = this.f12249h;
                    this.f12249h = i20 + 1;
                    p1.K(bArr7, i20, (byte) i19);
                    return;
                }
                byte[] bArr8 = this.f12246e;
                int i21 = this.f12249h;
                this.f12249h = i21 + 1;
                p1.K(bArr8, i21, (byte) (i19 | 128));
                byte[] bArr9 = this.f12246e;
                int i22 = this.f12249h;
                this.f12249h = i22 + 1;
                p1.K(bArr9, i22, (byte) (i19 >>> 7));
                return;
            }
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f12246e;
                    int i23 = this.f12249h;
                    this.f12249h = i23 + 1;
                    bArr10[i23] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12249h), Integer.valueOf(this.f12248g), 1), e10);
                }
            }
            byte[] bArr11 = this.f12246e;
            int i24 = this.f12249h;
            this.f12249h = i24 + 1;
            bArr11[i24] = (byte) i10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W0(int i10, long j10) throws IOException {
            T0(i10, 0);
            X0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void X0(long j10) throws IOException {
            if (CodedOutputStream.f12243d && f0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f12246e;
                    int i10 = this.f12249h;
                    this.f12249h = i10 + 1;
                    p1.K(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f12246e;
                int i11 = this.f12249h;
                this.f12249h = i11 + 1;
                p1.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f12246e;
                    int i12 = this.f12249h;
                    this.f12249h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12249h), Integer.valueOf(this.f12248g), 1), e10);
                }
            }
            byte[] bArr4 = this.f12246e;
            int i13 = this.f12249h;
            this.f12249h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void Y0(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f12246e, this.f12249h, i11);
                this.f12249h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12249h), Integer.valueOf(this.f12248g), Integer.valueOf(i11)), e10);
            }
        }

        public final void Z0(int i10, q0 q0Var) throws IOException {
            T0(i10, 2);
            G0(q0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.g
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            Y0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int f0() {
            return this.f12248g - this.f12249h;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(byte b10) throws IOException {
            try {
                byte[] bArr = this.f12246e;
                int i10 = this.f12249h;
                this.f12249h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12249h), Integer.valueOf(this.f12248g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void h0(int i10, boolean z10) throws IOException {
            T0(i10, 0);
            g0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(byte[] bArr, int i10, int i11) throws IOException {
            V0(i11);
            Y0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(int i10, h hVar) throws IOException {
            T0(i10, 2);
            m0(hVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(h hVar) throws IOException {
            V0(hVar.size());
            hVar.D(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(int i10, int i11) throws IOException {
            T0(i10, 5);
            s0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s0(int i10) throws IOException {
            try {
                byte[] bArr = this.f12246e;
                int i11 = this.f12249h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f12249h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12249h), Integer.valueOf(this.f12248g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void t0(int i10, long j10) throws IOException {
            T0(i10, 1);
            u0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void u0(long j10) throws IOException {
            try {
                byte[] bArr = this.f12246e;
                int i10 = this.f12249h;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f12249h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12249h), Integer.valueOf(this.f12248g), 1), e10);
            }
        }
    }

    public static int A(int i10, d0 d0Var) {
        return U(i10) + B(d0Var);
    }

    public static int B(d0 d0Var) {
        return C(d0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, q0 q0Var) {
        return (U(1) * 2) + V(2, i10) + E(3, q0Var);
    }

    public static int E(int i10, q0 q0Var) {
        return U(i10) + G(q0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i10, q0 q0Var, f1 f1Var) {
        return U(i10) + H(q0Var, f1Var);
    }

    public static int G(q0 q0Var) {
        return C(q0Var.k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(q0 q0Var, f1 f1Var) {
        return C(((com.google.protobuf.a) q0Var).r(f1Var));
    }

    public static int I(int i10, h hVar) {
        return (U(1) * 2) + V(2, i10) + g(3, hVar);
    }

    @Deprecated
    public static int J(int i10) {
        return W(i10);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = q1.g(str);
        } catch (q1.d unused) {
            length = str.getBytes(z.f12480a).length;
        }
        return C(length);
    }

    public static int U(int i10) {
        return W(r1.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        if ((i10 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        if ((j10 & (-16384)) != 0) {
            return i10 + 1;
        }
        return i10;
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static CodedOutputStream d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static CodedOutputStream e0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i10, h hVar) {
        return U(i10) + h(hVar);
    }

    public static int h(h hVar) {
        return C(hVar.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int s(int i10, q0 q0Var, f1 f1Var) {
        return (U(i10) * 2) + u(q0Var, f1Var);
    }

    @Deprecated
    public static int t(q0 q0Var) {
        return q0Var.k();
    }

    @Deprecated
    static int u(q0 q0Var, f1 f1Var) {
        return ((com.google.protobuf.a) q0Var).r(f1Var);
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return W(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    public static int z(int i10, d0 d0Var) {
        return (U(1) * 2) + V(2, i10) + A(3, d0Var);
    }

    @Deprecated
    final void A0(q0 q0Var, f1 f1Var) throws IOException {
        f1Var.b(q0Var, this.f12244a);
    }

    public abstract void B0(int i10, int i11) throws IOException;

    public abstract void C0(int i10) throws IOException;

    public final void D0(int i10, long j10) throws IOException {
        W0(i10, j10);
    }

    public final void E0(long j10) throws IOException {
        X0(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void F0(int i10, q0 q0Var, f1 f1Var) throws IOException;

    public abstract void G0(q0 q0Var) throws IOException;

    public abstract void H0(int i10, q0 q0Var) throws IOException;

    public abstract void I0(int i10, h hVar) throws IOException;

    public final void J0(int i10, int i11) throws IOException {
        r0(i10, i11);
    }

    public final void K0(int i10) throws IOException {
        s0(i10);
    }

    public final void L0(int i10, long j10) throws IOException {
        t0(i10, j10);
    }

    public final void M0(long j10) throws IOException {
        u0(j10);
    }

    public final void N0(int i10, int i11) throws IOException {
        U0(i10, Z(i11));
    }

    public final void O0(int i10) throws IOException {
        V0(Z(i10));
    }

    public final void P0(int i10, long j10) throws IOException {
        W0(i10, a0(j10));
    }

    public final void Q0(long j10) throws IOException {
        X0(a0(j10));
    }

    public abstract void R0(int i10, String str) throws IOException;

    public abstract void S0(String str) throws IOException;

    public abstract void T0(int i10, int i11) throws IOException;

    public abstract void U0(int i10, int i11) throws IOException;

    public abstract void V0(int i10) throws IOException;

    public abstract void W0(int i10, long j10) throws IOException;

    public abstract void X0(long j10) throws IOException;

    @Override // com.google.protobuf.g
    public abstract void a(byte[] bArr, int i10, int i11) throws IOException;

    final void b0(String str, q1.d dVar) throws IOException {
        f12242c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(z.f12480a);
        try {
            V0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    public final void c() {
        if (f0() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c0() {
        return this.f12245b;
    }

    public abstract int f0();

    public abstract void g0(byte b10) throws IOException;

    public abstract void h0(int i10, boolean z10) throws IOException;

    public final void i0(boolean z10) throws IOException {
        g0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void j0(byte[] bArr) throws IOException {
        k0(bArr, 0, bArr.length);
    }

    abstract void k0(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void l0(int i10, h hVar) throws IOException;

    public abstract void m0(h hVar) throws IOException;

    public final void n0(int i10, double d10) throws IOException {
        t0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void o0(double d10) throws IOException {
        u0(Double.doubleToRawLongBits(d10));
    }

    public final void p0(int i10, int i11) throws IOException {
        B0(i10, i11);
    }

    public final void q0(int i10) throws IOException {
        C0(i10);
    }

    public abstract void r0(int i10, int i11) throws IOException;

    public abstract void s0(int i10) throws IOException;

    public abstract void t0(int i10, long j10) throws IOException;

    public abstract void u0(long j10) throws IOException;

    public final void v0(int i10, float f10) throws IOException {
        r0(i10, Float.floatToRawIntBits(f10));
    }

    public final void w0(float f10) throws IOException {
        s0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void x0(int i10, q0 q0Var) throws IOException {
        T0(i10, 3);
        z0(q0Var);
        T0(i10, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void y0(int i10, q0 q0Var, f1 f1Var) throws IOException {
        T0(i10, 3);
        A0(q0Var, f1Var);
        T0(i10, 4);
    }

    @Deprecated
    public final void z0(q0 q0Var) throws IOException {
        q0Var.e(this);
    }

    private CodedOutputStream() {
    }
}
