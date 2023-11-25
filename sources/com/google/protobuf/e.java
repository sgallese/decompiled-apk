package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.j0;
import com.google.protobuf.r1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: BinaryReader.java */
/* loaded from: classes3.dex */
abstract class e implements e1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BinaryReader.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12276a;

        static {
            int[] iArr = new int[r1.b.values().length];
            f12276a = iArr;
            try {
                iArr[r1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12276a[r1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12276a[r1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12276a[r1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12276a[r1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12276a[r1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12276a[r1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12276a[r1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12276a[r1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12276a[r1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12276a[r1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12276a[r1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12276a[r1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12276a[r1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12276a[r1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12276a[r1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12276a[r1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryReader.java */
    /* loaded from: classes3.dex */
    private static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f12277a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f12278b;

        /* renamed from: c  reason: collision with root package name */
        private int f12279c;

        /* renamed from: d  reason: collision with root package name */
        private final int f12280d;

        /* renamed from: e  reason: collision with root package name */
        private int f12281e;

        /* renamed from: f  reason: collision with root package name */
        private int f12282f;

        /* renamed from: g  reason: collision with root package name */
        private int f12283g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f12277a = z10;
            this.f12278b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f12279c = arrayOffset;
            this.f12280d = arrayOffset;
            this.f12281e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            if (this.f12279c == this.f12281e) {
                return true;
            }
            return false;
        }

        private byte S() throws IOException {
            int i10 = this.f12279c;
            if (i10 != this.f12281e) {
                byte[] bArr = this.f12278b;
                this.f12279c = i10 + 1;
                return bArr[i10];
            }
            throw InvalidProtocolBufferException.k();
        }

        private Object T(r1.b bVar, Class<?> cls, o oVar) throws IOException {
            switch (a.f12276a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(j());
                case 2:
                    return G();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(t());
                case 5:
                    return Integer.valueOf(i());
                case 6:
                    return Long.valueOf(c());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(I());
                case 9:
                    return Long.valueOf(N());
                case 10:
                    return h(cls, oVar);
                case 11:
                    return Integer.valueOf(K());
                case 12:
                    return Long.valueOf(l());
                case 13:
                    return Integer.valueOf(w());
                case 14:
                    return Long.valueOf(x());
                case 15:
                    return O();
                case 16:
                    return Integer.valueOf(o());
                case 17:
                    return Long.valueOf(b());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(f1<T> f1Var, o oVar) throws IOException {
            int i10 = this.f12283g;
            this.f12283g = r1.c(r1.a(this.f12282f), 4);
            try {
                T h10 = f1Var.h();
                f1Var.e(h10, this, oVar);
                f1Var.c(h10);
                if (this.f12282f == this.f12283g) {
                    return h10;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.f12283g = i10;
            }
        }

        private int V() throws IOException {
            f0(4);
            return W();
        }

        private int W() {
            int i10 = this.f12279c;
            byte[] bArr = this.f12278b;
            this.f12279c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long X() throws IOException {
            f0(8);
            return Y();
        }

        private long Y() {
            int i10 = this.f12279c;
            byte[] bArr = this.f12278b;
            this.f12279c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        private <T> T Z(f1<T> f1Var, o oVar) throws IOException {
            int c02 = c0();
            f0(c02);
            int i10 = this.f12281e;
            int i11 = this.f12279c + c02;
            this.f12281e = i11;
            try {
                T h10 = f1Var.h();
                f1Var.e(h10, this, oVar);
                f1Var.c(h10);
                if (this.f12279c == i11) {
                    return h10;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.f12281e = i10;
            }
        }

        private int c0() throws IOException {
            int i10;
            int i11 = this.f12279c;
            int i12 = this.f12281e;
            if (i12 != i11) {
                byte[] bArr = this.f12278b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f12279c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return (int) e0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b11 = bArr[i14];
                                i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                    if (bArr[i16] < 0) {
                                                        throw InvalidProtocolBufferException.f();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f12279c = i14;
                    return i10;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        private long e0() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((S() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void f0(int i10) throws IOException {
            if (i10 >= 0 && i10 <= this.f12281e - this.f12279c) {
                return;
            }
            throw InvalidProtocolBufferException.k();
        }

        private void g0(int i10) throws IOException {
            if (this.f12279c == i10) {
                return;
            }
            throw InvalidProtocolBufferException.k();
        }

        private void h0(int i10) throws IOException {
            if (r1.b(this.f12282f) == i10) {
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        private void i0(int i10) throws IOException {
            f0(i10);
            this.f12279c += i10;
        }

        private void j0() throws IOException {
            int i10 = this.f12283g;
            this.f12283g = r1.c(r1.a(this.f12282f), 4);
            while (B() != Integer.MAX_VALUE && J()) {
            }
            if (this.f12282f == this.f12283g) {
                this.f12283g = i10;
                return;
            }
            throw InvalidProtocolBufferException.h();
        }

        private void k0() throws IOException {
            int i10 = this.f12281e;
            int i11 = this.f12279c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f12278b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f12279c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            l0();
        }

        private void l0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void m0(int i10) throws IOException {
            f0(i10);
            if ((i10 & 3) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.h();
        }

        private void n0(int i10) throws IOException {
            f0(i10);
            if ((i10 & 7) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.e1
        public <T> T A(Class<T> cls, o oVar) throws IOException {
            h0(3);
            return (T) U(b1.a().d(cls), oVar);
        }

        @Override // com.google.protobuf.e1
        public int B() throws IOException {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int c02 = c0();
            this.f12282f = c02;
            if (c02 == this.f12283g) {
                return Integer.MAX_VALUE;
            }
            return r1.a(c02);
        }

        @Override // com.google.protobuf.e1
        public void C(List<String> list) throws IOException {
            b0(list, false);
        }

        @Override // com.google.protobuf.e1
        public <T> T D(f1<T> f1Var, o oVar) throws IOException {
            h0(2);
            return (T) Z(f1Var, oVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.e1
        public <K, V> void E(Map<K, V> map, j0.a<K, V> aVar, o oVar) throws IOException {
            h0(2);
            int c02 = c0();
            f0(c02);
            int i10 = this.f12281e;
            this.f12281e = this.f12279c + c02;
            try {
                Object obj = aVar.f12359b;
                Object obj2 = aVar.f12361d;
                while (true) {
                    int B = B();
                    if (B == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (B != 1) {
                        if (B != 2) {
                            try {
                                if (!J()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                    break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                if (!J()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                }
                            }
                        } else {
                            obj2 = T(aVar.f12360c, aVar.f12361d.getClass(), oVar);
                        }
                    } else {
                        obj = T(aVar.f12358a, null, null);
                    }
                }
            } finally {
                this.f12281e = i10;
            }
        }

        @Override // com.google.protobuf.e1
        public void F(List<String> list) throws IOException {
            b0(list, true);
        }

        @Override // com.google.protobuf.e1
        public h G() throws IOException {
            h h10;
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return h.f12293m;
            }
            f0(c02);
            if (this.f12277a) {
                h10 = h.C(this.f12278b, this.f12279c, c02);
            } else {
                h10 = h.h(this.f12278b, this.f12279c, c02);
            }
            this.f12279c += c02;
            return h10;
        }

        @Override // com.google.protobuf.e1
        public void H(List<Float> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof v) {
                v vVar = (v) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 2) {
                    if (b10 != 5) {
                        throw InvalidProtocolBufferException.e();
                    }
                    do {
                        vVar.g(readFloat());
                        if (R()) {
                            return;
                        }
                        i11 = this.f12279c;
                    } while (c0() == this.f12282f);
                    this.f12279c = i11;
                    return;
                }
                int c02 = c0();
                m0(c02);
                int i12 = this.f12279c + c02;
                while (this.f12279c < i12) {
                    vVar.g(Float.intBitsToFloat(W()));
                }
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 2) {
                if (b11 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i10;
                return;
            }
            int c03 = c0();
            m0(c03);
            int i13 = this.f12279c + c03;
            while (this.f12279c < i13) {
                list.add(Float.valueOf(Float.intBitsToFloat(W())));
            }
        }

        @Override // com.google.protobuf.e1
        public int I() throws IOException {
            h0(0);
            return c0();
        }

        @Override // com.google.protobuf.e1
        public boolean J() throws IOException {
            int i10;
            if (!R() && (i10 = this.f12282f) != this.f12283g) {
                int b10 = r1.b(i10);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 5) {
                                    i0(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.e();
                            }
                            j0();
                            return true;
                        }
                        i0(c0());
                        return true;
                    }
                    i0(8);
                    return true;
                }
                k0();
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.e1
        public int K() throws IOException {
            h0(5);
            return V();
        }

        @Override // com.google.protobuf.e1
        public void L(List<h> list) throws IOException {
            int i10;
            if (r1.b(this.f12282f) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(G());
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public void M(List<Double> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof l) {
                l lVar = (l) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 1) {
                    if (b10 == 2) {
                        int c02 = c0();
                        n0(c02);
                        int i12 = this.f12279c + c02;
                        while (this.f12279c < i12) {
                            lVar.g(Double.longBitsToDouble(Y()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    lVar.g(readDouble());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 1) {
                if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f12279c + c03;
                    while (this.f12279c < i13) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Double.valueOf(readDouble()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public long N() throws IOException {
            h0(0);
            return d0();
        }

        @Override // com.google.protobuf.e1
        public String O() throws IOException {
            return a0(true);
        }

        @Override // com.google.protobuf.e1
        public void P(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 1) {
                    if (b10 == 2) {
                        int c02 = c0();
                        n0(c02);
                        int i12 = this.f12279c + c02;
                        while (this.f12279c < i12) {
                            h0Var.h(Y());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    h0Var.h(c());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 1) {
                if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f12279c + c03;
                    while (this.f12279c < i13) {
                        list.add(Long.valueOf(Y()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(c()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public void a(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int c02 = this.f12279c + c0();
                        while (this.f12279c < c02) {
                            yVar.q(i.b(c0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    yVar.q(w());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int c03 = this.f12279c + c0();
                    while (this.f12279c < c03) {
                        list.add(Integer.valueOf(i.b(c0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(w()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        public String a0(boolean z10) throws IOException {
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return "";
            }
            f0(c02);
            if (z10) {
                byte[] bArr = this.f12278b;
                int i10 = this.f12279c;
                if (!q1.n(bArr, i10, i10 + c02)) {
                    throw InvalidProtocolBufferException.d();
                }
            }
            String str = new String(this.f12278b, this.f12279c, c02, z.f12480a);
            this.f12279c += c02;
            return str;
        }

        @Override // com.google.protobuf.e1
        public long b() throws IOException {
            h0(0);
            return d0();
        }

        public void b0(List<String> list, boolean z10) throws IOException {
            int i10;
            int i11;
            if (r1.b(this.f12282f) == 2) {
                if ((list instanceof f0) && !z10) {
                    f0 f0Var = (f0) list;
                    do {
                        f0Var.d(G());
                        if (R()) {
                            return;
                        }
                        i11 = this.f12279c;
                    } while (c0() == this.f12282f);
                    this.f12279c = i11;
                    return;
                }
                do {
                    list.add(a0(z10));
                    if (R()) {
                        return;
                    }
                    i10 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i10;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.protobuf.e1
        public long c() throws IOException {
            h0(1);
            return X();
        }

        @Override // com.google.protobuf.e1
        public void d(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 2) {
                    if (b10 != 5) {
                        throw InvalidProtocolBufferException.e();
                    }
                    do {
                        yVar.q(K());
                        if (R()) {
                            return;
                        }
                        i11 = this.f12279c;
                    } while (c0() == this.f12282f);
                    this.f12279c = i11;
                    return;
                }
                int c02 = c0();
                m0(c02);
                int i12 = this.f12279c + c02;
                while (this.f12279c < i12) {
                    yVar.q(W());
                }
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 2) {
                if (b11 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Integer.valueOf(K()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i10;
                return;
            }
            int c03 = c0();
            m0(c03);
            int i13 = this.f12279c + c03;
            while (this.f12279c < i13) {
                list.add(Integer.valueOf(W()));
            }
        }

        public long d0() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f12279c;
            int i12 = this.f12281e;
            if (i12 != i11) {
                byte[] bArr = this.f12278b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f12279c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return e0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i14 = i16;
                            j10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                long j13 = i18;
                                int i19 = i14 + 1;
                                long j14 = j13 ^ (bArr[i14] << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i14 = i19 + 1;
                                    long j15 = j14 ^ (bArr[i19] << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i19 = i14 + 1;
                                        j14 = j15 ^ (bArr[i14] << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i14 = i19 + 1;
                                            j15 = j14 ^ (bArr[i19] << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i20 = i14 + 1;
                                                long j16 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i14 = i20 + 1;
                                                    if (bArr[i20] < 0) {
                                                        throw InvalidProtocolBufferException.f();
                                                    }
                                                } else {
                                                    i14 = i20;
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                }
                                j10 = j14 ^ j12;
                                i14 = i19;
                            }
                        }
                        this.f12279c = i14;
                        return j10;
                    }
                    j10 = i10;
                    this.f12279c = i14;
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // com.google.protobuf.e1
        public void e(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int c02 = this.f12279c + c0();
                        while (this.f12279c < c02) {
                            h0Var.h(i.c(d0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    h0Var.h(x());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int c03 = this.f12279c + c0();
                    while (this.f12279c < c03) {
                        list.add(Long.valueOf(i.c(d0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(x()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.e1
        public <T> void f(List<T> list, f1<T> f1Var, o oVar) throws IOException {
            int i10;
            if (r1.b(this.f12282f) == 3) {
                int i11 = this.f12282f;
                do {
                    list.add(U(f1Var, oVar));
                    if (R()) {
                        return;
                    }
                    i10 = this.f12279c;
                } while (c0() == i11);
                this.f12279c = i10;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.protobuf.e1
        public void g(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int c02 = this.f12279c + c0();
                        while (this.f12279c < c02) {
                            yVar.q(c0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    yVar.q(o());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int c03 = this.f12279c + c0();
                    while (this.f12279c < c03) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(o()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public <T> T h(Class<T> cls, o oVar) throws IOException {
            h0(2);
            return (T) Z(b1.a().d(cls), oVar);
        }

        @Override // com.google.protobuf.e1
        public int i() throws IOException {
            h0(5);
            return V();
        }

        @Override // com.google.protobuf.e1
        public boolean j() throws IOException {
            h0(0);
            if (c0() == 0) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.e1
        public <T> void k(List<T> list, f1<T> f1Var, o oVar) throws IOException {
            int i10;
            if (r1.b(this.f12282f) == 2) {
                int i11 = this.f12282f;
                do {
                    list.add(Z(f1Var, oVar));
                    if (R()) {
                        return;
                    }
                    i10 = this.f12279c;
                } while (c0() == i11);
                this.f12279c = i10;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.protobuf.e1
        public long l() throws IOException {
            h0(1);
            return X();
        }

        @Override // com.google.protobuf.e1
        public void m(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int c02 = this.f12279c + c0();
                        while (this.f12279c < c02) {
                            h0Var.h(d0());
                        }
                        g0(c02);
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    h0Var.h(b());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int c03 = this.f12279c + c0();
                    while (this.f12279c < c03) {
                        list.add(Long.valueOf(d0()));
                    }
                    g0(c03);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(b()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public <T> T n(f1<T> f1Var, o oVar) throws IOException {
            h0(3);
            return (T) U(f1Var, oVar);
        }

        @Override // com.google.protobuf.e1
        public int o() throws IOException {
            h0(0);
            return c0();
        }

        @Override // com.google.protobuf.e1
        public void p(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int c02 = this.f12279c + c0();
                        while (this.f12279c < c02) {
                            h0Var.h(d0());
                        }
                        g0(c02);
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    h0Var.h(N());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int c03 = this.f12279c + c0();
                    while (this.f12279c < c03) {
                        list.add(Long.valueOf(d0()));
                    }
                    g0(c03);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(N()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public void q(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 1) {
                    if (b10 == 2) {
                        int c02 = c0();
                        n0(c02);
                        int i12 = this.f12279c + c02;
                        while (this.f12279c < i12) {
                            h0Var.h(Y());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    h0Var.h(l());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 1) {
                if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f12279c + c03;
                    while (this.f12279c < i13) {
                        list.add(Long.valueOf(Y()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(l()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public void r(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int c02 = this.f12279c + c0();
                        while (this.f12279c < c02) {
                            yVar.q(c0());
                        }
                        g0(c02);
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    yVar.q(I());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int c03 = this.f12279c + c0();
                    while (this.f12279c < c03) {
                        list.add(Integer.valueOf(c0()));
                    }
                    g0(c03);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(I()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public double readDouble() throws IOException {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        @Override // com.google.protobuf.e1
        public float readFloat() throws IOException {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        @Override // com.google.protobuf.e1
        public void s(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int c02 = this.f12279c + c0();
                        while (this.f12279c < c02) {
                            yVar.q(c0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    yVar.q(t());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int c03 = this.f12279c + c0();
                    while (this.f12279c < c03) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(t()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public int t() throws IOException {
            h0(0);
            return c0();
        }

        @Override // com.google.protobuf.e1
        public int u() {
            return this.f12282f;
        }

        @Override // com.google.protobuf.e1
        public void v(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 2) {
                    if (b10 != 5) {
                        throw InvalidProtocolBufferException.e();
                    }
                    do {
                        yVar.q(i());
                        if (R()) {
                            return;
                        }
                        i11 = this.f12279c;
                    } while (c0() == this.f12282f);
                    this.f12279c = i11;
                    return;
                }
                int c02 = c0();
                m0(c02);
                int i12 = this.f12279c + c02;
                while (this.f12279c < i12) {
                    yVar.q(W());
                }
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 2) {
                if (b11 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Integer.valueOf(i()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i10;
                return;
            }
            int c03 = c0();
            m0(c03);
            int i13 = this.f12279c + c03;
            while (this.f12279c < i13) {
                list.add(Integer.valueOf(W()));
            }
        }

        @Override // com.google.protobuf.e1
        public int w() throws IOException {
            h0(0);
            return i.b(c0());
        }

        @Override // com.google.protobuf.e1
        public long x() throws IOException {
            h0(0);
            return i.c(d0());
        }

        @Override // com.google.protobuf.e1
        public void y(List<Boolean> list) throws IOException {
            int i10;
            boolean z10;
            int i11;
            boolean z11;
            if (list instanceof f) {
                f fVar = (f) list;
                int b10 = r1.b(this.f12282f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int c02 = this.f12279c + c0();
                        while (this.f12279c < c02) {
                            if (c0() != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            fVar.h(z11);
                        }
                        g0(c02);
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    fVar.h(j());
                    if (R()) {
                        return;
                    }
                    i11 = this.f12279c;
                } while (c0() == this.f12282f);
                this.f12279c = i11;
                return;
            }
            int b11 = r1.b(this.f12282f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int c03 = this.f12279c + c0();
                    while (this.f12279c < c03) {
                        if (c0() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        list.add(Boolean.valueOf(z10));
                    }
                    g0(c03);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Boolean.valueOf(j()));
                if (R()) {
                    return;
                }
                i10 = this.f12279c;
            } while (c0() == this.f12282f);
            this.f12279c = i10;
        }

        @Override // com.google.protobuf.e1
        public String z() throws IOException {
            return a0(false);
        }
    }

    private e() {
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
