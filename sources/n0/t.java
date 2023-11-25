package n0;

import java.util.Arrays;

/* compiled from: TrieNode.kt */
/* loaded from: classes.dex */
public final class t<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f19889e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final t f19890f = new t(0, 0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    private int f19891a;

    /* renamed from: b  reason: collision with root package name */
    private int f19892b;

    /* renamed from: c  reason: collision with root package name */
    private final p0.e f19893c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f19894d;

    /* compiled from: TrieNode.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final t a() {
            return t.f19890f;
        }
    }

    /* compiled from: TrieNode.kt */
    /* loaded from: classes.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private t<K, V> f19895a;

        /* renamed from: b  reason: collision with root package name */
        private final int f19896b;

        public b(t<K, V> tVar, int i10) {
            qc.q.i(tVar, "node");
            this.f19895a = tVar;
            this.f19896b = i10;
        }

        public final t<K, V> a() {
            return this.f19895a;
        }

        public final int b() {
            return this.f19896b;
        }

        public final void c(t<K, V> tVar) {
            qc.q.i(tVar, "<set-?>");
            this.f19895a = tVar;
        }
    }

    public t(int i10, int i11, Object[] objArr, p0.e eVar) {
        qc.q.i(objArr, "buffer");
        this.f19891a = i10;
        this.f19892b = i11;
        this.f19893c = eVar;
        this.f19894d = objArr;
    }

    private final t<K, V> A(int i10, f<K, V> fVar) {
        fVar.m(fVar.size() - 1);
        fVar.k(W(i10));
        if (this.f19894d.length == 2) {
            return null;
        }
        if (this.f19893c == fVar.i()) {
            this.f19894d = x.b(this.f19894d, i10);
            return this;
        }
        return new t<>(0, 0, x.b(this.f19894d, i10), fVar.i());
    }

    private final t<K, V> B(int i10, K k10, V v10, p0.e eVar) {
        int n10 = n(i10);
        if (this.f19893c == eVar) {
            this.f19894d = x.a(this.f19894d, n10, k10, v10);
            this.f19891a = i10 | this.f19891a;
            return this;
        }
        return new t<>(i10 | this.f19891a, this.f19892b, x.a(this.f19894d, n10, k10, v10), eVar);
    }

    private final t<K, V> C(int i10, int i11, int i12, K k10, V v10, int i13, p0.e eVar) {
        if (this.f19893c == eVar) {
            this.f19894d = d(i10, i11, i12, k10, v10, i13, eVar);
            this.f19891a ^= i11;
            this.f19892b |= i11;
            return this;
        }
        return new t<>(this.f19891a ^ i11, i11 | this.f19892b, d(i10, i11, i12, k10, v10, i13, eVar), eVar);
    }

    private final t<K, V> F(t<K, V> tVar, int i10, int i11, p0.b bVar, f<K, V> fVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (r(i10)) {
            t<K, V> N = N(O(i10));
            if (tVar.r(i10)) {
                return N.E(tVar.N(tVar.O(i10)), i11 + 5, bVar, fVar);
            }
            if (tVar.q(i10)) {
                int n10 = tVar.n(i10);
                K t10 = tVar.t(n10);
                V W = tVar.W(n10);
                int size = fVar.size();
                if (t10 != null) {
                    i15 = t10.hashCode();
                } else {
                    i15 = 0;
                }
                t<K, V> D = N.D(i15, t10, W, i11 + 5, fVar);
                if (fVar.size() == size) {
                    bVar.c(bVar.a() + 1);
                    return D;
                }
                return D;
            }
            return N;
        } else if (tVar.r(i10)) {
            t<K, V> N2 = tVar.N(tVar.O(i10));
            if (q(i10)) {
                int n11 = n(i10);
                K t11 = t(n11);
                if (t11 != null) {
                    i13 = t11.hashCode();
                } else {
                    i13 = 0;
                }
                int i17 = i11 + 5;
                if (N2.k(i13, t11, i17)) {
                    bVar.c(bVar.a() + 1);
                } else {
                    V W2 = W(n11);
                    if (t11 != null) {
                        i14 = t11.hashCode();
                    } else {
                        i14 = 0;
                    }
                    return N2.D(i14, t11, W2, i17, fVar);
                }
            }
            return N2;
        } else {
            int n12 = n(i10);
            K t12 = t(n12);
            V W3 = W(n12);
            int n13 = tVar.n(i10);
            K t13 = tVar.t(n13);
            V W4 = tVar.W(n13);
            if (t12 != null) {
                i12 = t12.hashCode();
            } else {
                i12 = 0;
            }
            if (t13 != null) {
                i16 = t13.hashCode();
            }
            return u(i12, t12, W3, i16, t13, W4, i11 + 5, fVar.i());
        }
    }

    private final t<K, V> I(int i10, int i11, f<K, V> fVar) {
        fVar.m(fVar.size() - 1);
        fVar.k(W(i10));
        if (this.f19894d.length == 2) {
            return null;
        }
        if (this.f19893c == fVar.i()) {
            this.f19894d = x.b(this.f19894d, i10);
            this.f19891a ^= i11;
            return this;
        }
        return new t<>(i11 ^ this.f19891a, this.f19892b, x.b(this.f19894d, i10), fVar.i());
    }

    private final t<K, V> J(int i10, int i11, p0.e eVar) {
        Object[] objArr = this.f19894d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f19893c == eVar) {
            this.f19894d = x.c(objArr, i10);
            this.f19892b ^= i11;
            return this;
        }
        return new t<>(this.f19891a, i11 ^ this.f19892b, x.c(objArr, i10), eVar);
    }

    private final t<K, V> K(t<K, V> tVar, t<K, V> tVar2, int i10, int i11, p0.e eVar) {
        if (tVar2 == null) {
            return J(i10, i11, eVar);
        }
        if (this.f19893c != eVar && tVar == tVar2) {
            return this;
        }
        return L(i10, tVar2, eVar);
    }

    private final t<K, V> L(int i10, t<K, V> tVar, p0.e eVar) {
        Object[] objArr = this.f19894d;
        if (objArr.length == 1 && tVar.f19894d.length == 2 && tVar.f19892b == 0) {
            tVar.f19891a = this.f19892b;
            return tVar;
        } else if (this.f19893c == eVar) {
            objArr[i10] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            qc.q.h(copyOf, "copyOf(this, size)");
            copyOf[i10] = tVar;
            return new t<>(this.f19891a, this.f19892b, copyOf, eVar);
        }
    }

    private final t<K, V> M(int i10, V v10, f<K, V> fVar) {
        if (this.f19893c == fVar.i()) {
            this.f19894d[i10 + 1] = v10;
            return this;
        }
        fVar.j(fVar.f() + 1);
        Object[] objArr = this.f19894d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        qc.q.h(copyOf, "copyOf(this, size)");
        copyOf[i10 + 1] = v10;
        return new t<>(this.f19891a, this.f19892b, copyOf, fVar.i());
    }

    private final t<K, V> R(int i10, int i11) {
        Object[] objArr = this.f19894d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(i11 ^ this.f19891a, this.f19892b, x.b(objArr, i10));
    }

    private final t<K, V> S(int i10, int i11) {
        Object[] objArr = this.f19894d;
        if (objArr.length == 1) {
            return null;
        }
        return new t<>(this.f19891a, i11 ^ this.f19892b, x.c(objArr, i10));
    }

    private final t<K, V> T(t<K, V> tVar, t<K, V> tVar2, int i10, int i11) {
        if (tVar2 == null) {
            return S(i10, i11);
        }
        if (tVar != tVar2) {
            return U(i10, i11, tVar2);
        }
        return this;
    }

    private final t<K, V> U(int i10, int i11, t<K, V> tVar) {
        Object[] objArr = tVar.f19894d;
        if (objArr.length == 2 && tVar.f19892b == 0) {
            if (this.f19894d.length == 1) {
                tVar.f19891a = this.f19892b;
                return tVar;
            }
            return new t<>(this.f19891a ^ i11, i11 ^ this.f19892b, x.e(this.f19894d, i10, n(i11), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.f19894d;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        qc.q.h(copyOf, "copyOf(this, newSize)");
        copyOf[i10] = tVar;
        return new t<>(this.f19891a, this.f19892b, copyOf);
    }

    private final t<K, V> V(int i10, V v10) {
        Object[] objArr = this.f19894d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        qc.q.h(copyOf, "copyOf(this, size)");
        copyOf[i10 + 1] = v10;
        return new t<>(this.f19891a, this.f19892b, copyOf);
    }

    private final V W(int i10) {
        return (V) this.f19894d[i10 + 1];
    }

    private final b<K, V> b() {
        return new b<>(this, 1);
    }

    private final b<K, V> c() {
        return new b<>(this, 0);
    }

    private final Object[] d(int i10, int i11, int i12, K k10, V v10, int i13, p0.e eVar) {
        int i14;
        K t10 = t(i10);
        if (t10 != null) {
            i14 = t10.hashCode();
        } else {
            i14 = 0;
        }
        t<K, V> u10 = u(i14, t10, W(i10), i12, k10, v10, i13 + 5, eVar);
        return x.d(this.f19894d, i10, O(i11) + 1, u10);
    }

    private final int e() {
        if (this.f19892b == 0) {
            return this.f19894d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f19891a);
        int length = this.f19894d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += N(i10).e();
        }
        return bitCount;
    }

    private final boolean f(K k10) {
        vc.f s10;
        vc.d r10;
        s10 = vc.l.s(0, this.f19894d.length);
        r10 = vc.l.r(s10, 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (!qc.q.d(k10, this.f19894d[h10])) {
                if (h10 != i10) {
                    h10 += j10;
                }
            }
            return true;
        }
        return false;
    }

    private final V g(K k10) {
        vc.f s10;
        vc.d r10;
        s10 = vc.l.s(0, this.f19894d.length);
        r10 = vc.l.r(s10, 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (!qc.q.d(k10, t(h10))) {
                if (h10 != i10) {
                    h10 += j10;
                } else {
                    return null;
                }
            }
            return W(h10);
        }
        return null;
    }

    private final b<K, V> h(K k10, V v10) {
        vc.f s10;
        vc.d r10;
        s10 = vc.l.s(0, this.f19894d.length);
        r10 = vc.l.r(s10, 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (!qc.q.d(k10, t(h10))) {
                if (h10 != i10) {
                    h10 += j10;
                }
            }
            if (v10 == W(h10)) {
                return null;
            }
            Object[] objArr = this.f19894d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            qc.q.h(copyOf, "copyOf(this, size)");
            copyOf[h10 + 1] = v10;
            return new t(0, 0, copyOf).c();
        }
        return new t(0, 0, x.a(this.f19894d, 0, k10, v10)).b();
    }

    private final t<K, V> i(K k10) {
        vc.f s10;
        vc.d r10;
        s10 = vc.l.s(0, this.f19894d.length);
        r10 = vc.l.r(s10, 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (!qc.q.d(k10, t(h10))) {
                if (h10 != i10) {
                    h10 += j10;
                }
            }
            return j(h10);
        }
        return this;
    }

    private final t<K, V> j(int i10) {
        Object[] objArr = this.f19894d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(0, 0, x.b(objArr, i10));
    }

    private final boolean l(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f19892b != tVar.f19892b || this.f19891a != tVar.f19891a) {
            return false;
        }
        int length = this.f19894d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f19894d[i10] != tVar.f19894d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i10) {
        if ((i10 & this.f19892b) != 0) {
            return true;
        }
        return false;
    }

    private final t<K, V> s(int i10, K k10, V v10) {
        return new t<>(i10 | this.f19891a, this.f19892b, x.a(this.f19894d, n(i10), k10, v10));
    }

    private final K t(int i10) {
        return (K) this.f19894d[i10];
    }

    private final t<K, V> u(int i10, K k10, V v10, int i11, K k11, V v11, int i12, p0.e eVar) {
        Object[] objArr;
        if (i12 > 30) {
            return new t<>(0, 0, new Object[]{k10, v10, k11, v11}, eVar);
        }
        int f10 = x.f(i10, i12);
        int f11 = x.f(i11, i12);
        if (f10 != f11) {
            if (f10 < f11) {
                objArr = new Object[]{k10, v10, k11, v11};
            } else {
                objArr = new Object[]{k11, v11, k10, v10};
            }
            return new t<>((1 << f10) | (1 << f11), 0, objArr, eVar);
        }
        return new t<>(0, 1 << f10, new Object[]{u(i10, k10, v10, i11, k11, v11, i12 + 5, eVar)}, eVar);
    }

    private final t<K, V> v(int i10, int i11, int i12, K k10, V v10, int i13) {
        return new t<>(this.f19891a ^ i11, i11 | this.f19892b, d(i10, i11, i12, k10, v10, i13, null));
    }

    private final t<K, V> w(K k10, V v10, f<K, V> fVar) {
        vc.f s10;
        vc.d r10;
        s10 = vc.l.s(0, this.f19894d.length);
        r10 = vc.l.r(s10, 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (!qc.q.d(k10, t(h10))) {
                if (h10 != i10) {
                    h10 += j10;
                }
            }
            fVar.k(W(h10));
            if (this.f19893c == fVar.i()) {
                this.f19894d[h10 + 1] = v10;
                return this;
            }
            fVar.j(fVar.f() + 1);
            Object[] objArr = this.f19894d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            qc.q.h(copyOf, "copyOf(this, size)");
            copyOf[h10 + 1] = v10;
            return new t<>(0, 0, copyOf, fVar.i());
        }
        fVar.m(fVar.size() + 1);
        return new t<>(0, 0, x.a(this.f19894d, 0, k10, v10), fVar.i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final t<K, V> x(t<K, V> tVar, p0.b bVar, p0.e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        vc.f s10;
        vc.d r10;
        if (this.f19892b == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0.a.a(z10);
        if (this.f19891a == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        p0.a.a(z11);
        if (tVar.f19892b == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        p0.a.a(z12);
        if (tVar.f19891a == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        p0.a.a(z13);
        Object[] objArr = this.f19894d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.f19894d.length);
        qc.q.h(copyOf, "copyOf(this, newSize)");
        int length = this.f19894d.length;
        s10 = vc.l.s(0, tVar.f19894d.length);
        r10 = vc.l.r(s10, 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (true) {
                if (!f(tVar.f19894d[h10])) {
                    Object[] objArr2 = tVar.f19894d;
                    copyOf[length] = objArr2[h10];
                    copyOf[length + 1] = objArr2[h10 + 1];
                    length += 2;
                } else {
                    bVar.c(bVar.a() + 1);
                }
                if (h10 == i10) {
                    break;
                }
                h10 += j10;
            }
        }
        if (length == this.f19894d.length) {
            return this;
        }
        if (length != tVar.f19894d.length) {
            if (length == copyOf.length) {
                return new t<>(0, 0, copyOf, eVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            qc.q.h(copyOf2, "copyOf(this, newSize)");
            return new t<>(0, 0, copyOf2, eVar);
        }
        return tVar;
    }

    private final t<K, V> y(K k10, V v10, f<K, V> fVar) {
        vc.f s10;
        vc.d r10;
        s10 = vc.l.s(0, this.f19894d.length);
        r10 = vc.l.r(s10, 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (true) {
                if (qc.q.d(k10, t(h10)) && qc.q.d(v10, W(h10))) {
                    return A(h10, fVar);
                }
                if (h10 == i10) {
                    break;
                }
                h10 += j10;
            }
        }
        return this;
    }

    private final t<K, V> z(K k10, f<K, V> fVar) {
        vc.f s10;
        vc.d r10;
        s10 = vc.l.s(0, this.f19894d.length);
        r10 = vc.l.r(s10, 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (!qc.q.d(k10, t(h10))) {
                if (h10 != i10) {
                    h10 += j10;
                }
            }
            return A(h10, fVar);
        }
        return this;
    }

    public final t<K, V> D(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        t<K, V> D;
        qc.q.i(fVar, "mutator");
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (qc.q.d(k10, t(n10))) {
                fVar.k(W(n10));
                if (W(n10) == v10) {
                    return this;
                }
                return M(n10, v10, fVar);
            }
            fVar.m(fVar.size() + 1);
            return C(n10, f10, i10, k10, v10, i11, fVar.i());
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                D = N.w(k10, v10, fVar);
            } else {
                D = N.D(i10, k10, v10, i11 + 5, fVar);
            }
            if (N == D) {
                return this;
            }
            return L(O, D, fVar.i());
        } else {
            fVar.m(fVar.size() + 1);
            return B(f10, k10, v10, fVar.i());
        }
    }

    public final t<K, V> E(t<K, V> tVar, int i10, p0.b bVar, f<K, V> fVar) {
        boolean z10;
        t<K, V> tVar2;
        qc.q.i(tVar, "otherNode");
        qc.q.i(bVar, "intersectionCounter");
        qc.q.i(fVar, "mutator");
        if (this == tVar) {
            bVar.b(e());
            return this;
        } else if (i10 > 30) {
            return x(tVar, bVar, fVar.i());
        } else {
            int i11 = this.f19892b | tVar.f19892b;
            int i12 = this.f19891a;
            int i13 = tVar.f19891a;
            int i14 = (i12 ^ i13) & (~i11);
            int i15 = i12 & i13;
            int i16 = i14;
            while (i15 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i15);
                if (qc.q.d(t(n(lowestOneBit)), tVar.t(tVar.n(lowestOneBit)))) {
                    i16 |= lowestOneBit;
                } else {
                    i11 |= lowestOneBit;
                }
                i15 ^= lowestOneBit;
            }
            int i17 = 0;
            if ((i11 & i16) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (qc.q.d(this.f19893c, fVar.i()) && this.f19891a == i16 && this.f19892b == i11) {
                    tVar2 = this;
                } else {
                    tVar2 = new t<>(i16, i11, new Object[(Integer.bitCount(i16) * 2) + Integer.bitCount(i11)]);
                }
                int i18 = i11;
                int i19 = 0;
                while (i18 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i18);
                    Object[] objArr = tVar2.f19894d;
                    objArr[(objArr.length - 1) - i19] = F(tVar, lowestOneBit2, i10, bVar, fVar);
                    i19++;
                    i18 ^= lowestOneBit2;
                }
                while (i16 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i16);
                    int i20 = i17 * 2;
                    if (!tVar.q(lowestOneBit3)) {
                        int n10 = n(lowestOneBit3);
                        tVar2.f19894d[i20] = t(n10);
                        tVar2.f19894d[i20 + 1] = W(n10);
                    } else {
                        int n11 = tVar.n(lowestOneBit3);
                        tVar2.f19894d[i20] = tVar.t(n11);
                        tVar2.f19894d[i20 + 1] = tVar.W(n11);
                        if (q(lowestOneBit3)) {
                            bVar.c(bVar.a() + 1);
                        }
                    }
                    i17++;
                    i16 ^= lowestOneBit3;
                }
                if (l(tVar2)) {
                    return this;
                }
                if (tVar.l(tVar2)) {
                    return tVar;
                }
                return tVar2;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final t<K, V> G(int i10, K k10, int i11, f<K, V> fVar) {
        t<K, V> G;
        qc.q.i(fVar, "mutator");
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (qc.q.d(k10, t(n10))) {
                return I(n10, f10, fVar);
            }
            return this;
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                G = N.z(k10, fVar);
            } else {
                G = N.G(i10, k10, i11 + 5, fVar);
            }
            return K(N, G, O, f10, fVar.i());
        } else {
            return this;
        }
    }

    public final t<K, V> H(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        t<K, V> H;
        qc.q.i(fVar, "mutator");
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (!qc.q.d(k10, t(n10)) || !qc.q.d(v10, W(n10))) {
                return this;
            }
            return I(n10, f10, fVar);
        } else if (!r(f10)) {
            return this;
        } else {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                H = N.y(k10, v10, fVar);
            } else {
                H = N.H(i10, k10, v10, i11 + 5, fVar);
            }
            return K(N, H, O, f10, fVar.i());
        }
    }

    public final t<K, V> N(int i10) {
        Object obj = this.f19894d[i10];
        qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i10) {
        return (this.f19894d.length - 1) - Integer.bitCount((i10 - 1) & this.f19892b);
    }

    public final b<K, V> P(int i10, K k10, V v10, int i11) {
        b<K, V> P;
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (qc.q.d(k10, t(n10))) {
                if (W(n10) == v10) {
                    return null;
                }
                return V(n10, v10).c();
            }
            return v(n10, f10, i10, k10, v10, i11).b();
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                P = N.h(k10, v10);
                if (P == null) {
                    return null;
                }
            } else {
                P = N.P(i10, k10, v10, i11 + 5);
                if (P == null) {
                    return null;
                }
            }
            P.c(U(O, f10, P.a()));
            return P;
        } else {
            return s(f10, k10, v10).b();
        }
    }

    public final t<K, V> Q(int i10, K k10, int i11) {
        t<K, V> Q;
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (qc.q.d(k10, t(n10))) {
                return R(n10, f10);
            }
            return this;
        } else if (r(f10)) {
            int O = O(f10);
            t<K, V> N = N(O);
            if (i11 == 30) {
                Q = N.i(k10);
            } else {
                Q = N.Q(i10, k10, i11 + 5);
            }
            return T(N, Q, O, f10);
        } else {
            return this;
        }
    }

    public final boolean k(int i10, K k10, int i11) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            return qc.q.d(k10, t(n(f10)));
        }
        if (r(f10)) {
            t<K, V> N = N(O(f10));
            if (i11 == 30) {
                return N.f(k10);
            }
            return N.k(i10, k10, i11 + 5);
        }
        return false;
    }

    public final int m() {
        return Integer.bitCount(this.f19891a);
    }

    public final int n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f19891a) * 2;
    }

    public final V o(int i10, K k10, int i11) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (!qc.q.d(k10, t(n10))) {
                return null;
            }
            return W(n10);
        } else if (!r(f10)) {
            return null;
        } else {
            t<K, V> N = N(O(f10));
            if (i11 == 30) {
                return N.g(k10);
            }
            return N.o(i10, k10, i11 + 5);
        }
    }

    public final Object[] p() {
        return this.f19894d;
    }

    public final boolean q(int i10) {
        if ((i10 & this.f19891a) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
        qc.q.i(objArr, "buffer");
    }
}
