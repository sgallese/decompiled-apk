package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: CodedInputStream.java */
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    int f12312a;

    /* renamed from: b  reason: collision with root package name */
    int f12313b;

    /* renamed from: c  reason: collision with root package name */
    int f12314c;

    /* renamed from: d  reason: collision with root package name */
    j f12315d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12316e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* loaded from: classes3.dex */
    public static final class b extends i {

        /* renamed from: f  reason: collision with root package name */
        private final byte[] f12317f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f12318g;

        /* renamed from: h  reason: collision with root package name */
        private int f12319h;

        /* renamed from: i  reason: collision with root package name */
        private int f12320i;

        /* renamed from: j  reason: collision with root package name */
        private int f12321j;

        /* renamed from: k  reason: collision with root package name */
        private int f12322k;

        /* renamed from: l  reason: collision with root package name */
        private int f12323l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f12324m;

        /* renamed from: n  reason: collision with root package name */
        private int f12325n;

        private void K() {
            int i10 = this.f12319h + this.f12320i;
            this.f12319h = i10;
            int i11 = i10 - this.f12322k;
            int i12 = this.f12325n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f12320i = i13;
                this.f12319h = i10 - i13;
                return;
            }
            this.f12320i = 0;
        }

        private void N() throws IOException {
            if (this.f12319h - this.f12321j >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f12317f;
                int i11 = this.f12321j;
                this.f12321j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void P() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.i
        public int A() throws IOException {
            return H();
        }

        @Override // com.google.protobuf.i
        public long B() throws IOException {
            return I();
        }

        @Override // com.google.protobuf.i
        public boolean C(int i10) throws IOException {
            int b10 = r1.b(i10);
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 != 4) {
                                if (b10 == 5) {
                                    M(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.e();
                            }
                            return false;
                        }
                        L();
                        a(r1.c(r1.a(i10), 4));
                        return true;
                    }
                    M(H());
                    return true;
                }
                M(8);
                return true;
            }
            N();
            return true;
        }

        public byte D() throws IOException {
            int i10 = this.f12321j;
            if (i10 != this.f12319h) {
                byte[] bArr = this.f12317f;
                this.f12321j = i10 + 1;
                return bArr[i10];
            }
            throw InvalidProtocolBufferException.k();
        }

        public byte[] E(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f12319h;
                int i12 = this.f12321j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f12321j = i13;
                    return Arrays.copyOfRange(this.f12317f, i12, i13);
                }
            }
            if (i10 <= 0) {
                if (i10 == 0) {
                    return z.f12482c;
                }
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.k();
        }

        public int F() throws IOException {
            int i10 = this.f12321j;
            if (this.f12319h - i10 >= 4) {
                byte[] bArr = this.f12317f;
                this.f12321j = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.k();
        }

        public long G() throws IOException {
            int i10 = this.f12321j;
            if (this.f12319h - i10 >= 8) {
                byte[] bArr = this.f12317f;
                this.f12321j = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.k();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int H() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f12321j
                int r1 = r5.f12319h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f12317f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f12321j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.J()
                int r1 = (int) r0
                return r1
            L70:
                r5.f12321j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.b.H():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long I() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.b.I():long");
        }

        long J() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((D() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void L() throws IOException {
            int z10;
            do {
                z10 = z();
                if (z10 == 0) {
                    return;
                }
            } while (C(z10));
        }

        public void M(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f12319h;
                int i12 = this.f12321j;
                if (i10 <= i11 - i12) {
                    this.f12321j = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // com.google.protobuf.i
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f12323l == i10) {
                return;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.i
        public int d() {
            return this.f12321j - this.f12322k;
        }

        @Override // com.google.protobuf.i
        public boolean e() throws IOException {
            if (this.f12321j == this.f12319h) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public void i(int i10) {
            this.f12325n = i10;
            K();
        }

        @Override // com.google.protobuf.i
        public int j(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int d10 = i10 + d();
                if (d10 >= 0) {
                    int i11 = this.f12325n;
                    if (d10 <= i11) {
                        this.f12325n = d10;
                        K();
                        return i11;
                    }
                    throw InvalidProtocolBufferException.k();
                }
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // com.google.protobuf.i
        public boolean k() throws IOException {
            if (I() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public h l() throws IOException {
            h h10;
            int H = H();
            if (H > 0) {
                int i10 = this.f12319h;
                int i11 = this.f12321j;
                if (H <= i10 - i11) {
                    if (this.f12318g && this.f12324m) {
                        h10 = h.C(this.f12317f, i11, H);
                    } else {
                        h10 = h.h(this.f12317f, i11, H);
                    }
                    this.f12321j += H;
                    return h10;
                }
            }
            if (H == 0) {
                return h.f12293m;
            }
            return h.A(E(H));
        }

        @Override // com.google.protobuf.i
        public double m() throws IOException {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.protobuf.i
        public int n() throws IOException {
            return H();
        }

        @Override // com.google.protobuf.i
        public int o() throws IOException {
            return F();
        }

        @Override // com.google.protobuf.i
        public long p() throws IOException {
            return G();
        }

        @Override // com.google.protobuf.i
        public float q() throws IOException {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.protobuf.i
        public int r() throws IOException {
            return H();
        }

        @Override // com.google.protobuf.i
        public long s() throws IOException {
            return I();
        }

        @Override // com.google.protobuf.i
        public int t() throws IOException {
            return F();
        }

        @Override // com.google.protobuf.i
        public long u() throws IOException {
            return G();
        }

        @Override // com.google.protobuf.i
        public int v() throws IOException {
            return i.b(H());
        }

        @Override // com.google.protobuf.i
        public long w() throws IOException {
            return i.c(I());
        }

        @Override // com.google.protobuf.i
        public String x() throws IOException {
            int H = H();
            if (H > 0) {
                int i10 = this.f12319h;
                int i11 = this.f12321j;
                if (H <= i10 - i11) {
                    String str = new String(this.f12317f, i11, H, z.f12480a);
                    this.f12321j += H;
                    return str;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // com.google.protobuf.i
        public String y() throws IOException {
            int H = H();
            if (H > 0) {
                int i10 = this.f12319h;
                int i11 = this.f12321j;
                if (H <= i10 - i11) {
                    String e10 = q1.e(this.f12317f, i11, H);
                    this.f12321j += H;
                    return e10;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // com.google.protobuf.i
        public int z() throws IOException {
            if (e()) {
                this.f12323l = 0;
                return 0;
            }
            int H = H();
            this.f12323l = H;
            if (r1.a(H) != 0) {
                return this.f12323l;
            }
            throw InvalidProtocolBufferException.c();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f12325n = Integer.MAX_VALUE;
            this.f12317f = bArr;
            this.f12319h = i11 + i10;
            this.f12321j = i10;
            this.f12322k = i10;
            this.f12318g = z10;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static i f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static i g(byte[] bArr, int i10, int i11) {
        return h(bArr, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i h(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.j(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract boolean C(int i10) throws IOException;

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void i(int i10);

    public abstract int j(int i10) throws InvalidProtocolBufferException;

    public abstract boolean k() throws IOException;

    public abstract h l() throws IOException;

    public abstract double m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract float q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract String x() throws IOException;

    public abstract String y() throws IOException;

    public abstract int z() throws IOException;

    private i() {
        this.f12313b = 100;
        this.f12314c = Integer.MAX_VALUE;
        this.f12316e = false;
    }
}
