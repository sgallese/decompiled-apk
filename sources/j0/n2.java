package j0;

import androidx.recyclerview.widget.RecyclerView;
import j0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: v  reason: collision with root package name */
    public static final a f18827v = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final k2 f18828a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f18829b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f18830c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<d> f18831d;

    /* renamed from: e  reason: collision with root package name */
    private int f18832e;

    /* renamed from: f  reason: collision with root package name */
    private int f18833f;

    /* renamed from: g  reason: collision with root package name */
    private int f18834g;

    /* renamed from: h  reason: collision with root package name */
    private int f18835h;

    /* renamed from: i  reason: collision with root package name */
    private int f18836i;

    /* renamed from: j  reason: collision with root package name */
    private int f18837j;

    /* renamed from: k  reason: collision with root package name */
    private int f18838k;

    /* renamed from: l  reason: collision with root package name */
    private int f18839l;

    /* renamed from: m  reason: collision with root package name */
    private int f18840m;

    /* renamed from: n  reason: collision with root package name */
    private int f18841n;

    /* renamed from: o  reason: collision with root package name */
    private final m0 f18842o;

    /* renamed from: p  reason: collision with root package name */
    private final m0 f18843p;

    /* renamed from: q  reason: collision with root package name */
    private final m0 f18844q;

    /* renamed from: r  reason: collision with root package name */
    private int f18845r;

    /* renamed from: s  reason: collision with root package name */
    private int f18846s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f18847t;

    /* renamed from: u  reason: collision with root package name */
    private s1 f18848u;

    /* compiled from: SlotTable.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<d> b(n2 n2Var, int i10, n2 n2Var2, boolean z10, boolean z11, boolean z12) {
            boolean z13;
            List<d> i11;
            ArrayList arrayList;
            int i12;
            int i13;
            int i14;
            int d02 = n2Var.d0(i10);
            int i15 = i10 + d02;
            int K = n2Var.K(i10);
            int K2 = n2Var.K(i15);
            int i16 = K2 - K;
            boolean H = n2Var.H(i10);
            n2Var2.i0(d02);
            n2Var2.j0(i16, n2Var2.V());
            if (n2Var.f18832e < i15) {
                n2Var.r0(i15);
            }
            if (n2Var.f18837j < K2) {
                n2Var.t0(K2, i15);
            }
            int[] iArr = n2Var2.f18829b;
            int V = n2Var2.V();
            ec.o.g(n2Var.f18829b, iArr, V * 5, i10 * 5, i15 * 5);
            Object[] objArr = n2Var2.f18830c;
            int i17 = n2Var2.f18835h;
            ec.o.i(n2Var.f18830c, objArr, i17, K, K2);
            int W = n2Var2.W();
            m2.z(iArr, V, W);
            int i18 = V - i10;
            int i19 = V + d02;
            int L = i17 - n2Var2.L(iArr, V);
            int i20 = n2Var2.f18839l;
            int i21 = n2Var2.f18838k;
            int length = objArr.length;
            int i22 = i20;
            int i23 = V;
            while (true) {
                z13 = false;
                if (i23 >= i19) {
                    break;
                }
                if (i23 != V) {
                    i12 = i19;
                    m2.z(iArr, i23, m2.r(iArr, i23) + i18);
                } else {
                    i12 = i19;
                }
                int L2 = n2Var2.L(iArr, i23) + L;
                if (i22 < i23) {
                    i13 = L;
                    i14 = 0;
                } else {
                    i13 = L;
                    i14 = n2Var2.f18837j;
                }
                m2.v(iArr, i23, n2Var2.N(L2, i14, i21, length));
                if (i23 == i22) {
                    i22++;
                }
                i23++;
                L = i13;
                i19 = i12;
            }
            int i24 = i19;
            n2Var2.f18839l = i22;
            int n10 = m2.n(n2Var.f18831d, i10, n2Var.X());
            int n11 = m2.n(n2Var.f18831d, i15, n2Var.X());
            if (n10 < n11) {
                ArrayList arrayList2 = n2Var.f18831d;
                ArrayList arrayList3 = new ArrayList(n11 - n10);
                for (int i25 = n10; i25 < n11; i25++) {
                    Object obj = arrayList2.get(i25);
                    qc.q.h(obj, "sourceAnchors[anchorIndex]");
                    d dVar = (d) obj;
                    dVar.c(dVar.a() + i18);
                    arrayList3.add(dVar);
                }
                n2Var2.f18831d.addAll(m2.n(n2Var2.f18831d, n2Var2.V(), n2Var2.X()), arrayList3);
                arrayList2.subList(n10, n11).clear();
                arrayList = arrayList3;
            } else {
                i11 = ec.t.i();
                arrayList = i11;
            }
            int z02 = n2Var.z0(i10);
            int i26 = 1;
            if (z12) {
                if (!z10) {
                    z13 = n2Var.G0(i10, d02);
                    n2Var.H0(K, i16, i10 - 1);
                } else {
                    if (z02 >= 0) {
                        z13 = true;
                    }
                    if (z13) {
                        n2Var.U0();
                        n2Var.z(z02 - n2Var.V());
                        n2Var.U0();
                    }
                    n2Var.z(i10 - n2Var.V());
                    boolean F0 = n2Var.F0();
                    if (z13) {
                        n2Var.P0();
                        n2Var.O();
                        n2Var.P0();
                        n2Var.O();
                    }
                    z13 = F0;
                }
            }
            if ((!z13) != false) {
                int i27 = n2Var2.f18841n;
                if (!m2.l(iArr, V)) {
                    i26 = m2.o(iArr, V);
                }
                n2Var2.f18841n = i27 + i26;
                if (z11) {
                    n2Var2.f18845r = i24;
                    n2Var2.f18835h = i17 + i16;
                }
                if (H) {
                    n2Var2.b1(W);
                }
                return arrayList;
            }
            n.w("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }

        static /* synthetic */ List c(a aVar, n2 n2Var, int i10, n2 n2Var2, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            boolean z13;
            if ((i11 & 32) != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            return aVar.b(n2Var, i10, n2Var2, z10, z11, z13);
        }
    }

    /* compiled from: SlotTable.kt */
    /* loaded from: classes.dex */
    public static final class b implements Iterator<Object>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f18849f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f18850m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ n2 f18851p;

        b(int i10, int i11, n2 n2Var) {
            this.f18850m = i11;
            this.f18851p = n2Var;
            this.f18849f = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f18849f < this.f18850m) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object[] objArr = this.f18851p.f18830c;
                n2 n2Var = this.f18851p;
                int i10 = this.f18849f;
                this.f18849f = i10 + 1;
                return objArr[n2Var.M(i10)];
            }
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n2(k2 k2Var) {
        qc.q.i(k2Var, "table");
        this.f18828a = k2Var;
        this.f18829b = k2Var.k();
        this.f18830c = k2Var.m();
        this.f18831d = k2Var.j();
        this.f18832e = k2Var.l();
        this.f18833f = (this.f18829b.length / 5) - k2Var.l();
        this.f18834g = k2Var.l();
        this.f18837j = k2Var.n();
        this.f18838k = this.f18830c.length - k2Var.n();
        this.f18839l = k2Var.l();
        this.f18842o = new m0();
        this.f18843p = new m0();
        this.f18844q = new m0();
        this.f18846s = -1;
    }

    private final int A0(int[] iArr, int i10) {
        return B0(m2.r(iArr, a0(i10)));
    }

    private final int B0(int i10) {
        if (i10 <= -2) {
            return X() + i10 + 2;
        }
        return i10;
    }

    private final int C(int[] iArr, int i10) {
        return L(iArr, i10) + m2.d(m2.f(iArr, i10) >> 29);
    }

    private final int C0(int i10, int i11) {
        if (i10 >= i11) {
            return -((X() - i10) + 2);
        }
        return i10;
    }

    private final void D0() {
        s1 s1Var = this.f18848u;
        if (s1Var != null) {
            while (s1Var.b()) {
                c1(s1Var.d(), s1Var);
            }
        }
    }

    private final boolean E(int i10) {
        int i11 = i10 + 1;
        int d02 = i10 + d0(i10);
        while (i11 < d02) {
            if (m2.b(this.f18829b, a0(i11))) {
                return true;
            }
            i11 += d0(i11);
        }
        return false;
    }

    private final boolean E0(int i10, int i11) {
        int i12 = i11 + i10;
        int n10 = m2.n(this.f18831d, i12, T() - this.f18833f);
        if (n10 >= this.f18831d.size()) {
            n10--;
        }
        int i13 = n10 + 1;
        boolean z10 = false;
        int i14 = 0;
        while (n10 >= 0) {
            d dVar = this.f18831d.get(n10);
            qc.q.h(dVar, "anchors[index]");
            d dVar2 = dVar;
            int B = B(dVar2);
            if (B < i10) {
                break;
            }
            if (B < i12) {
                dVar2.c(RecyclerView.UNDEFINED_DURATION);
                if (i14 == 0) {
                    i14 = n10 + 1;
                }
                i13 = n10;
            }
            n10--;
        }
        if (i13 < i14) {
            z10 = true;
        }
        if (z10) {
            this.f18831d.subList(i13, i14).clear();
        }
        return z10;
    }

    private final void F() {
        int i10 = this.f18837j;
        ec.o.r(this.f18830c, null, i10, this.f18838k + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G0(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList<d> arrayList = this.f18831d;
            r0(i10);
            if ((!arrayList.isEmpty()) != false) {
                z10 = E0(i10, i11);
            }
            this.f18832e = i10;
            this.f18833f += i11;
            int i12 = this.f18839l;
            if (i12 > i10) {
                this.f18839l = Math.max(i10, i12 - i11);
            }
            int i13 = this.f18834g;
            if (i13 >= this.f18832e) {
                this.f18834g = i13 - i11;
            }
            if (I(this.f18846s)) {
                b1(this.f18846s);
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H(int i10) {
        if (i10 >= 0 && m2.b(this.f18829b, a0(i10))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f18838k;
            int i14 = i10 + i11;
            t0(i14, i12);
            this.f18837j = i10;
            this.f18838k = i13 + i11;
            ec.o.r(this.f18830c, null, i10, i14);
            int i15 = this.f18836i;
            if (i15 >= i10) {
                this.f18836i = i15 - i11;
            }
        }
    }

    private final boolean I(int i10) {
        if (i10 >= 0 && m2.c(this.f18829b, a0(i10))) {
            return true;
        }
        return false;
    }

    private final int J(int i10, int i11, int i12) {
        if (i10 < 0) {
            return (i12 - i11) + i10 + 1;
        }
        return i10;
    }

    private final int J0() {
        int T = (T() - this.f18833f) - this.f18843p.h();
        this.f18834g = T;
        return T;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int K(int i10) {
        return L(this.f18829b, a0(i10));
    }

    private final void K0() {
        this.f18843p.i((T() - this.f18833f) - this.f18834g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L(int[] iArr, int i10) {
        if (i10 >= T()) {
            return this.f18830c.length - this.f18838k;
        }
        return J(m2.e(iArr, i10), this.f18838k, this.f18830c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int M(int i10) {
        if (i10 >= this.f18837j) {
            return i10 + this.f18838k;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N(int i10, int i11, int i12, int i13) {
        if (i10 > i11) {
            return -(((i13 - i12) - i10) + 1);
        }
        return i10;
    }

    private final void S(int i10, int i11, int i12) {
        int C0 = C0(i10, this.f18832e);
        while (i12 < i11) {
            m2.z(this.f18829b, a0(i12), C0);
            int g10 = m2.g(this.f18829b, a0(i12)) + i12;
            S(i12, g10, i12 + 1);
            i12 = g10;
        }
    }

    private final int S0(int[] iArr, int i10) {
        if (i10 >= T()) {
            return this.f18830c.length - this.f18838k;
        }
        return J(m2.t(iArr, i10), this.f18838k, this.f18830c.length);
    }

    private final int T() {
        return this.f18829b.length / 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W0(int i10, Object obj, boolean z10, Object obj2) {
        boolean z11;
        int g10;
        int i11;
        int i12;
        if (this.f18840m > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f18844q.i(this.f18841n);
        if (z11) {
            i0(1);
            int i13 = this.f18845r;
            int a02 = a0(i13);
            l.a aVar = l.f18688a;
            if (obj != aVar.a()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!z10 && obj2 != aVar.a()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            m2.k(this.f18829b, a02, i10, z10, i11, i12, this.f18846s, this.f18835h);
            this.f18836i = this.f18835h;
            int i14 = (z10 ? 1 : 0) + i11 + i12;
            if (i14 > 0) {
                j0(i14, i13);
                Object[] objArr = this.f18830c;
                int i15 = this.f18835h;
                if (z10) {
                    objArr[i15] = obj2;
                    i15++;
                }
                if (i11 != 0) {
                    objArr[i15] = obj;
                    i15++;
                }
                if (i12 != 0) {
                    objArr[i15] = obj2;
                    i15++;
                }
                this.f18835h = i15;
            }
            this.f18841n = 0;
            g10 = i13 + 1;
            this.f18846s = i13;
            this.f18845r = g10;
        } else {
            this.f18842o.i(this.f18846s);
            K0();
            int i16 = this.f18845r;
            int a03 = a0(i16);
            if (!qc.q.d(obj2, l.f18688a.a())) {
                if (z10) {
                    f1(obj2);
                } else {
                    a1(obj2);
                }
            }
            this.f18835h = S0(this.f18829b, a03);
            this.f18836i = L(this.f18829b, a0(this.f18845r + 1));
            this.f18841n = m2.o(this.f18829b, a03);
            this.f18846s = i16;
            this.f18845r = i16 + 1;
            g10 = i16 + m2.g(this.f18829b, a03);
        }
        this.f18834g = g10;
    }

    private final void Z0(int i10, int i11) {
        int i12;
        int T = T() - this.f18833f;
        if (i10 < i11) {
            for (int n10 = m2.n(this.f18831d, i10, T); n10 < this.f18831d.size(); n10++) {
                d dVar = this.f18831d.get(n10);
                qc.q.h(dVar, "anchors[index]");
                d dVar2 = dVar;
                int a10 = dVar2.a();
                if (a10 < 0 && (i12 = a10 + T) < i11) {
                    dVar2.c(i12);
                } else {
                    return;
                }
            }
            return;
        }
        for (int n11 = m2.n(this.f18831d, i11, T); n11 < this.f18831d.size(); n11++) {
            d dVar3 = this.f18831d.get(n11);
            qc.q.h(dVar3, "anchors[index]");
            d dVar4 = dVar3;
            int a11 = dVar4.a();
            if (a11 >= 0) {
                dVar4.c(-(T - a11));
            } else {
                return;
            }
        }
    }

    private final int a0(int i10) {
        if (i10 >= this.f18832e) {
            return i10 + this.f18833f;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, qc.h] */
    public final void b1(int i10) {
        if (i10 >= 0) {
            s1 s1Var = this.f18848u;
            if (s1Var == null) {
                ?? r22 = 0;
                s1Var = new s1(r22, 1, r22);
                this.f18848u = s1Var;
            }
            s1Var.a(i10);
        }
    }

    private final void c1(int i10, s1 s1Var) {
        boolean z10;
        int a02 = a0(i10);
        boolean E = E(i10);
        if (m2.c(this.f18829b, a02) != E) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m2.u(this.f18829b, a02, E);
            int z02 = z0(i10);
            if (z02 >= 0) {
                s1Var.a(z02);
            }
        }
    }

    private final void d1(int[] iArr, int i10, int i11) {
        m2.v(iArr, i10, N(i11, this.f18837j, this.f18838k, this.f18830c.length));
    }

    private final void g1(int i10, Object obj) {
        boolean z10;
        int a02 = a0(i10);
        int[] iArr = this.f18829b;
        if (a02 < iArr.length && m2.l(iArr, a02)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18830c[M(y0(this.f18829b, a02))] = obj;
            return;
        }
        n.w(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i10) {
        int i11;
        if (i10 > 0) {
            int i12 = this.f18845r;
            r0(i12);
            int i13 = this.f18832e;
            int i14 = this.f18833f;
            int[] iArr = this.f18829b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            int i16 = 0;
            if (i14 < i10) {
                int max = Math.max(Math.max(length * 2, i15 + i10), 32);
                int[] iArr2 = new int[max * 5];
                int i17 = max - i15;
                ec.o.g(iArr, iArr2, 0, 0, i13 * 5);
                ec.o.g(iArr, iArr2, (i13 + i17) * 5, (i14 + i13) * 5, length * 5);
                this.f18829b = iArr2;
                i14 = i17;
            }
            int i18 = this.f18834g;
            if (i18 >= i13) {
                this.f18834g = i18 + i10;
            }
            int i19 = i13 + i10;
            this.f18832e = i19;
            this.f18833f = i14 - i10;
            if (i15 > 0) {
                i11 = K(i12 + i10);
            } else {
                i11 = 0;
            }
            if (this.f18839l >= i13) {
                i16 = this.f18837j;
            }
            int N = N(i11, i16, this.f18838k, this.f18830c.length);
            for (int i20 = i13; i20 < i19; i20++) {
                m2.v(this.f18829b, i20, N);
            }
            int i21 = this.f18839l;
            if (i21 >= i13) {
                this.f18839l = i21 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(int i10, int i11) {
        if (i10 > 0) {
            t0(this.f18835h, i11);
            int i12 = this.f18837j;
            int i13 = this.f18838k;
            if (i13 < i10) {
                Object[] objArr = this.f18830c;
                int length = objArr.length;
                int i14 = length - i13;
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[max];
                for (int i15 = 0; i15 < max; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = max - i14;
                int i17 = i13 + i12;
                ec.o.i(objArr, objArr2, 0, 0, i12);
                ec.o.i(objArr, objArr2, i12 + i16, i17, length);
                this.f18830c = objArr2;
                i13 = i16;
            }
            int i18 = this.f18836i;
            if (i18 >= i12) {
                this.f18836i = i18 + i10;
            }
            this.f18837j = i12 + i10;
            this.f18838k = i13 - i10;
        }
    }

    public static /* synthetic */ void n0(n2 n2Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = n2Var.f18846s;
        }
        n2Var.m0(i10);
    }

    private final void o0(int i10, int i11, int i12) {
        int i13 = i12 + i10;
        int X = X();
        int n10 = m2.n(this.f18831d, i10, X);
        ArrayList arrayList = new ArrayList();
        if (n10 >= 0) {
            while (n10 < this.f18831d.size()) {
                d dVar = this.f18831d.get(n10);
                qc.q.h(dVar, "anchors[index]");
                d dVar2 = dVar;
                int B = B(dVar2);
                if (B < i10 || B >= i13) {
                    break;
                }
                arrayList.add(dVar2);
                this.f18831d.remove(n10);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            d dVar3 = (d) arrayList.get(i15);
            int B2 = B(dVar3) + i14;
            if (B2 >= this.f18832e) {
                dVar3.c(-(X - B2));
            } else {
                dVar3.c(B2);
            }
            this.f18831d.add(m2.n(this.f18831d, B2, X), dVar3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int i10) {
        int i11 = this.f18833f;
        int i12 = this.f18832e;
        if (i12 != i10) {
            boolean z10 = true;
            if ((!this.f18831d.isEmpty()) != false) {
                Z0(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f18829b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    ec.o.g(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    ec.o.g(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int T = T();
            if (i12 >= T) {
                z10 = false;
            }
            n.T(z10);
            while (i12 < T) {
                int r10 = m2.r(this.f18829b, i12);
                int C0 = C0(B0(r10), i10);
                if (C0 != r10) {
                    m2.z(this.f18829b, i12, C0);
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f18832e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12 = this.f18838k;
        int i13 = this.f18837j;
        int i14 = this.f18839l;
        if (i13 != i10) {
            Object[] objArr = this.f18830c;
            if (i10 < i13) {
                ec.o.i(objArr, objArr, i10 + i12, i10, i13);
            } else {
                ec.o.i(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
        }
        int min = Math.min(i11 + 1, X());
        if (i14 != min) {
            int length = this.f18830c.length - i12;
            if (min < i14) {
                int a02 = a0(min);
                int a03 = a0(i14);
                int i15 = this.f18832e;
                while (a02 < a03) {
                    int e10 = m2.e(this.f18829b, a02);
                    if (e10 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        m2.v(this.f18829b, a02, -((length - e10) + 1));
                        a02++;
                        if (a02 == i15) {
                            a02 += this.f18833f;
                        }
                    } else {
                        n.w("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int a04 = a0(i14);
                int a05 = a0(min);
                while (a04 < a05) {
                    int e11 = m2.e(this.f18829b, a04);
                    if (e11 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        m2.v(this.f18829b, a04, e11 + length + 1);
                        a04++;
                        if (a04 == this.f18832e) {
                            a04 += this.f18833f;
                        }
                    } else {
                        n.w("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.f18839l = min;
        }
        this.f18837j = i10;
    }

    private final int y0(int[] iArr, int i10) {
        return L(iArr, i10);
    }

    public final d A(int i10) {
        ArrayList<d> arrayList = this.f18831d;
        int s10 = m2.s(arrayList, i10, X());
        if (s10 < 0) {
            if (i10 > this.f18832e) {
                i10 = -(X() - i10);
            }
            d dVar = new d(i10);
            arrayList.add(-(s10 + 1), dVar);
            return dVar;
        }
        d dVar2 = arrayList.get(s10);
        qc.q.h(dVar2, "get(location)");
        return dVar2;
    }

    public final int B(d dVar) {
        qc.q.i(dVar, "anchor");
        int a10 = dVar.a();
        if (a10 < 0) {
            return a10 + X();
        }
        return a10;
    }

    public final void D() {
        int i10 = this.f18840m;
        this.f18840m = i10 + 1;
        if (i10 == 0) {
            K0();
        }
    }

    public final boolean F0() {
        boolean z10;
        if (this.f18840m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = this.f18845r;
            int i11 = this.f18835h;
            int O0 = O0();
            s1 s1Var = this.f18848u;
            if (s1Var != null) {
                while (s1Var.b() && s1Var.c() >= i10) {
                    s1Var.d();
                }
            }
            boolean G0 = G0(i10, this.f18845r - i10);
            H0(i11, this.f18835h - i11, i10 - 1);
            this.f18845r = i10;
            this.f18835h = i11;
            this.f18841n -= O0;
            return G0;
        }
        n.w("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void G() {
        this.f18847t = true;
        if (this.f18842o.d()) {
            r0(X());
            t0(this.f18830c.length - this.f18838k, this.f18832e);
            F();
            D0();
        }
        this.f18828a.h(this, this.f18829b, this.f18832e, this.f18830c, this.f18837j, this.f18831d);
    }

    public final void I0() {
        boolean z10;
        if (this.f18840m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            D0();
            this.f18845r = 0;
            this.f18834g = T() - this.f18833f;
            this.f18835h = 0;
            this.f18836i = 0;
            this.f18841n = 0;
            return;
        }
        n.w("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Object L0(int i10, Object obj) {
        int S0 = S0(this.f18829b, a0(this.f18845r));
        boolean z10 = true;
        int L = L(this.f18829b, a0(this.f18845r + 1));
        int i11 = S0 + i10;
        if (i11 < S0 || i11 >= L) {
            z10 = false;
        }
        if (z10) {
            int M = M(i11);
            Object[] objArr = this.f18830c;
            Object obj2 = objArr[M];
            objArr[M] = obj;
            return obj2;
        }
        n.w(("Write to an invalid slot index " + i10 + " for group " + this.f18845r).toString());
        throw new KotlinNothingValueException();
    }

    public final void M0(Object obj) {
        boolean z10;
        int i10 = this.f18835h;
        if (i10 <= this.f18836i) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18830c[M(i10 - 1)] = obj;
        } else {
            n.w("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Object N0() {
        if (this.f18840m > 0) {
            j0(1, this.f18846s);
        }
        Object[] objArr = this.f18830c;
        int i10 = this.f18835h;
        this.f18835h = i10 + 1;
        return objArr[M(i10)];
    }

    public final int O() {
        boolean z10;
        int i10;
        int i11 = 1;
        int i12 = 0;
        if (this.f18840m > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = this.f18845r;
        int i14 = this.f18834g;
        int i15 = this.f18846s;
        int a02 = a0(i15);
        int i16 = this.f18841n;
        int i17 = i13 - i15;
        boolean l10 = m2.l(this.f18829b, a02);
        if (z10) {
            m2.w(this.f18829b, a02, i17);
            m2.y(this.f18829b, a02, i16);
            int h10 = this.f18844q.h();
            if (!l10) {
                i11 = i16;
            }
            this.f18841n = h10 + i11;
            this.f18846s = A0(this.f18829b, i15);
        } else {
            if (i13 != i14) {
                i11 = 0;
            }
            if (i11 != 0) {
                int g10 = m2.g(this.f18829b, a02);
                int o10 = m2.o(this.f18829b, a02);
                m2.w(this.f18829b, a02, i17);
                m2.y(this.f18829b, a02, i16);
                int h11 = this.f18842o.h();
                J0();
                this.f18846s = h11;
                int A0 = A0(this.f18829b, i15);
                int h12 = this.f18844q.h();
                this.f18841n = h12;
                if (A0 == h11) {
                    if (!l10) {
                        i12 = i16 - o10;
                    }
                    this.f18841n = h12 + i12;
                } else {
                    int i18 = i17 - g10;
                    if (l10) {
                        i10 = 0;
                    } else {
                        i10 = i16 - o10;
                    }
                    if (i18 != 0 || i10 != 0) {
                        while (A0 != 0 && A0 != h11 && (i10 != 0 || i18 != 0)) {
                            int a03 = a0(A0);
                            if (i18 != 0) {
                                m2.w(this.f18829b, a03, m2.g(this.f18829b, a03) + i18);
                            }
                            if (i10 != 0) {
                                int[] iArr = this.f18829b;
                                m2.y(iArr, a03, m2.o(iArr, a03) + i10);
                            }
                            if (m2.l(this.f18829b, a03)) {
                                i10 = 0;
                            }
                            A0 = A0(this.f18829b, A0);
                        }
                    }
                    this.f18841n += i10;
                }
            } else {
                n.w("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i16;
    }

    public final int O0() {
        int a02 = a0(this.f18845r);
        int g10 = this.f18845r + m2.g(this.f18829b, a02);
        this.f18845r = g10;
        this.f18835h = L(this.f18829b, a0(g10));
        if (m2.l(this.f18829b, a02)) {
            return 1;
        }
        return m2.o(this.f18829b, a02);
    }

    public final void P() {
        boolean z10;
        int i10 = this.f18840m;
        boolean z11 = true;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = i10 - 1;
            this.f18840m = i11;
            if (i11 == 0) {
                if (this.f18844q.b() != this.f18842o.b()) {
                    z11 = false;
                }
                if (z11) {
                    J0();
                    return;
                } else {
                    n.w("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void P0() {
        int i10 = this.f18834g;
        this.f18845r = i10;
        this.f18835h = L(this.f18829b, a0(i10));
    }

    public final void Q(int i10) {
        boolean z10;
        boolean z11 = true;
        if (this.f18840m <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = this.f18846s;
            if (i11 != i10) {
                if (i10 < i11 || i10 >= this.f18834g) {
                    z11 = false;
                }
                if (z11) {
                    int i12 = this.f18845r;
                    int i13 = this.f18835h;
                    int i14 = this.f18836i;
                    this.f18845r = i10;
                    U0();
                    this.f18845r = i12;
                    this.f18835h = i13;
                    this.f18836i = i14;
                    return;
                }
                n.w(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
                throw new KotlinNothingValueException();
            }
            return;
        }
        n.w("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Object Q0(int i10, int i11) {
        int S0 = S0(this.f18829b, a0(i10));
        boolean z10 = true;
        int L = L(this.f18829b, a0(i10 + 1));
        int i12 = i11 + S0;
        if (S0 > i12 || i12 >= L) {
            z10 = false;
        }
        if (!z10) {
            return l.f18688a.a();
        }
        return this.f18830c[M(i12)];
    }

    public final void R(d dVar) {
        qc.q.i(dVar, "anchor");
        Q(dVar.e(this));
    }

    public final Object R0(d dVar, int i10) {
        qc.q.i(dVar, "anchor");
        return Q0(B(dVar), i10);
    }

    public final void T0(int i10, Object obj, Object obj2) {
        W0(i10, obj, false, obj2);
    }

    public final boolean U() {
        return this.f18847t;
    }

    public final void U0() {
        boolean z10;
        if (this.f18840m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            l.a aVar = l.f18688a;
            W0(0, aVar.a(), false, aVar.a());
            return;
        }
        n.w("Key must be supplied when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final int V() {
        return this.f18845r;
    }

    public final void V0(int i10, Object obj) {
        W0(i10, obj, false, l.f18688a.a());
    }

    public final int W() {
        return this.f18846s;
    }

    public final int X() {
        return T() - this.f18833f;
    }

    public final void X0(int i10, Object obj) {
        W0(i10, obj, true, l.f18688a.a());
    }

    public final k2 Y() {
        return this.f18828a;
    }

    public final Object Y0(Object obj) {
        Object N0 = N0();
        M0(obj);
        return N0;
    }

    public final Object Z(int i10) {
        int a02 = a0(i10);
        if (m2.h(this.f18829b, a02)) {
            return this.f18830c[C(this.f18829b, a02)];
        }
        return l.f18688a.a();
    }

    public final void a1(Object obj) {
        int a02 = a0(this.f18845r);
        if (m2.h(this.f18829b, a02)) {
            this.f18830c[M(C(this.f18829b, a02))] = obj;
        } else {
            n.w("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final int b0(int i10) {
        return m2.m(this.f18829b, a0(i10));
    }

    public final Object c0(int i10) {
        int a02 = a0(i10);
        if (m2.j(this.f18829b, a02)) {
            return this.f18830c[m2.q(this.f18829b, a02)];
        }
        return null;
    }

    public final int d0(int i10) {
        return m2.g(this.f18829b, a0(i10));
    }

    public final Iterator<Object> e0() {
        int L = L(this.f18829b, a0(this.f18845r));
        int[] iArr = this.f18829b;
        int i10 = this.f18845r;
        return new b(L, L(iArr, a0(i10 + d0(i10))), this);
    }

    public final void e1(d dVar, Object obj) {
        qc.q.i(dVar, "anchor");
        g1(dVar.e(this), obj);
    }

    public final boolean f0(int i10) {
        return g0(i10, this.f18845r);
    }

    public final void f1(Object obj) {
        g1(this.f18845r, obj);
    }

    public final boolean g0(int i10, int i11) {
        int T;
        int d02;
        if (i11 == this.f18846s) {
            T = this.f18834g;
        } else {
            if (i11 > this.f18842o.g(0)) {
                d02 = d0(i11);
            } else {
                int c10 = this.f18842o.c(i11);
                if (c10 < 0) {
                    d02 = d0(i11);
                } else {
                    T = (T() - this.f18833f) - this.f18843p.f(c10);
                }
            }
            T = d02 + i11;
        }
        if (i10 <= i11 || i10 >= T) {
            return false;
        }
        return true;
    }

    public final boolean h0(int i10) {
        int i11 = this.f18846s;
        if ((i10 > i11 && i10 < this.f18834g) || (i11 == 0 && i10 == 0)) {
            return true;
        }
        return false;
    }

    public final boolean k0() {
        int i10 = this.f18845r;
        if (i10 < this.f18834g && m2.l(this.f18829b, a0(i10))) {
            return true;
        }
        return false;
    }

    public final boolean l0(int i10) {
        return m2.l(this.f18829b, a0(i10));
    }

    public final void m0(int i10) {
        int a02 = a0(i10);
        if (!m2.i(this.f18829b, a02)) {
            m2.x(this.f18829b, a02, true);
            if (!m2.c(this.f18829b, a02)) {
                b1(z0(i10));
            }
        }
    }

    public final List<d> p0(k2 k2Var, int i10, boolean z10) {
        boolean z11;
        qc.q.i(k2Var, "table");
        if (this.f18840m > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        n.T(z11);
        if (i10 == 0 && this.f18845r == 0 && this.f18828a.l() == 0 && m2.g(k2Var.k(), i10) == k2Var.l()) {
            int[] iArr = this.f18829b;
            Object[] objArr = this.f18830c;
            ArrayList<d> arrayList = this.f18831d;
            int[] k10 = k2Var.k();
            int l10 = k2Var.l();
            Object[] m10 = k2Var.m();
            int n10 = k2Var.n();
            this.f18829b = k10;
            this.f18830c = m10;
            this.f18831d = k2Var.j();
            this.f18832e = l10;
            this.f18833f = (k10.length / 5) - l10;
            this.f18837j = n10;
            this.f18838k = m10.length - n10;
            this.f18839l = l10;
            k2Var.v(iArr, 0, objArr, 0, arrayList);
            return this.f18831d;
        }
        n2 t10 = k2Var.t();
        try {
            return f18827v.b(t10, i10, this, true, true, z10);
        } finally {
            t10.G();
        }
    }

    public final void q0(int i10) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        if (this.f18840m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i10 == 0) {
                    return;
                }
                int i12 = this.f18845r;
                int i13 = this.f18846s;
                int i14 = this.f18834g;
                int i15 = i12;
                for (int i16 = i10; i16 > 0; i16--) {
                    i15 += m2.g(this.f18829b, a0(i15));
                    if (i15 <= i14) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        n.w("Parameter offset is out of bounds".toString());
                        throw new KotlinNothingValueException();
                    }
                }
                int g10 = m2.g(this.f18829b, a0(i15));
                int i17 = this.f18835h;
                int L = L(this.f18829b, a0(i15));
                int i18 = i15 + g10;
                int L2 = L(this.f18829b, a0(i18));
                int i19 = L2 - L;
                j0(i19, Math.max(this.f18845r - 1, 0));
                i0(g10);
                int[] iArr = this.f18829b;
                int a02 = a0(i18) * 5;
                ec.o.g(iArr, iArr, a0(i12) * 5, a02, (g10 * 5) + a02);
                if (i19 > 0) {
                    Object[] objArr = this.f18830c;
                    ec.o.i(objArr, objArr, i17, M(L + i19), M(L2 + i19));
                }
                int i20 = L + i19;
                int i21 = i20 - i17;
                int i22 = this.f18837j;
                int i23 = this.f18838k;
                int length = this.f18830c.length;
                int i24 = this.f18839l;
                int i25 = i12 + g10;
                int i26 = i12;
                while (i26 < i25) {
                    int a03 = a0(i26);
                    int i27 = i22;
                    int L3 = L(iArr, a03) - i21;
                    int i28 = i21;
                    if (i24 < a03) {
                        i11 = 0;
                    } else {
                        i11 = i27;
                    }
                    d1(iArr, a03, N(L3, i11, i23, length));
                    i26++;
                    i22 = i27;
                    i21 = i28;
                }
                o0(i18, i12, g10);
                if ((!G0(i18, g10)) != false) {
                    S(i13, this.f18834g, i12);
                    if (i19 > 0) {
                        H0(i20, i19, i18 - 1);
                        return;
                    }
                    return;
                }
                n.w("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
            n.w("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        }
        n.w("Cannot move a group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (d0(r12.f18845r + r13) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<j0.d> s0(int r13, j0.k2 r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "table"
            qc.q.i(r14, r0)
            int r0 = r12.f18840m
            if (r0 > 0) goto L14
            int r0 = r12.f18845r
            int r0 = r0 + r13
            int r0 = r12.d0(r0)
            r1 = 1
            if (r0 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            j0.n.T(r1)
            int r0 = r12.f18845r
            int r1 = r12.f18835h
            int r2 = r12.f18836i
            r12.z(r13)
            r12.U0()
            r12.D()
            j0.n2 r13 = r14.t()
            j0.n2$a r3 = j0.n2.f18827v     // Catch: java.lang.Throwable -> L4a
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 32
            r11 = 0
            r4 = r13
            r5 = r15
            r6 = r12
            java.util.List r14 = j0.n2.a.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4a
            r13.G()
            r12.P()
            r12.O()
            r12.f18845r = r0
            r12.f18835h = r1
            r12.f18836i = r2
            return r14
        L4a:
            r14 = move-exception
            r13.G()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.n2.s0(int, j0.k2, int):java.util.List");
    }

    public String toString() {
        return "SlotWriter(current = " + this.f18845r + " end=" + this.f18834g + " size = " + X() + " gap=" + this.f18832e + '-' + (this.f18832e + this.f18833f) + ')';
    }

    public final List<d> u0(d dVar, int i10, n2 n2Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int x02;
        boolean z13;
        qc.q.i(dVar, "anchor");
        qc.q.i(n2Var, "writer");
        boolean z14 = true;
        if (n2Var.f18840m > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        n.T(z10);
        if (this.f18840m == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        n.T(z11);
        n.T(dVar.b());
        int B = B(dVar) + i10;
        int i11 = this.f18845r;
        if (i11 <= B && B < this.f18834g) {
            z12 = true;
        } else {
            z12 = false;
        }
        n.T(z12);
        int z02 = z0(B);
        int d02 = d0(B);
        if (l0(B)) {
            x02 = 1;
        } else {
            x02 = x0(B);
        }
        List<d> c10 = a.c(f18827v, this, B, n2Var, false, false, false, 32, null);
        b1(z02);
        if (x02 > 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        while (z02 >= i11) {
            int a02 = a0(z02);
            int[] iArr = this.f18829b;
            m2.w(iArr, a02, m2.g(iArr, a02) - d02);
            if (z13) {
                if (m2.l(this.f18829b, a02)) {
                    z13 = false;
                } else {
                    int[] iArr2 = this.f18829b;
                    m2.y(iArr2, a02, m2.o(iArr2, a02) - x02);
                }
            }
            z02 = z0(z02);
        }
        if (z13) {
            if (this.f18841n < x02) {
                z14 = false;
            }
            n.T(z14);
            this.f18841n -= x02;
        }
        return c10;
    }

    public final Object v0(int i10) {
        int a02 = a0(i10);
        if (m2.l(this.f18829b, a02)) {
            return this.f18830c[M(y0(this.f18829b, a02))];
        }
        return null;
    }

    public final Object w0(d dVar) {
        qc.q.i(dVar, "anchor");
        return v0(dVar.e(this));
    }

    public final int x0(int i10) {
        return m2.o(this.f18829b, a0(i10));
    }

    public final void z(int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f18840m <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i10 == 0) {
                    return;
                }
                int i11 = this.f18845r + i10;
                if (i11 < this.f18846s || i11 > this.f18834g) {
                    z12 = false;
                }
                if (z12) {
                    this.f18845r = i11;
                    int L = L(this.f18829b, a0(i11));
                    this.f18835h = L;
                    this.f18836i = L;
                    return;
                }
                n.w(("Cannot seek outside the current group (" + this.f18846s + '-' + this.f18834g + ')').toString());
                throw new KotlinNothingValueException();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        n.w("Cannot seek backwards".toString());
        throw new KotlinNothingValueException();
    }

    public final int z0(int i10) {
        return A0(this.f18829b, i10);
    }
}
