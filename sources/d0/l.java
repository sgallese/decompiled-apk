package d0;

import a1.e1;
import a1.g1;
import a1.h1;
import a1.o4;
import a1.p1;
import a2.l;
import androidx.compose.ui.e;
import dc.w;
import g2.u;
import j2.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n1.j0;
import n1.l0;
import n1.n;
import n1.y0;
import p1.e0;
import p1.h0;
import p1.r;
import p1.r1;
import p1.s;
import p1.s1;
import p1.t1;
import qc.q;
import t1.v;
import t1.x;
import v1.g0;
import v1.k0;
import v1.m;

/* compiled from: TextStringSimpleNode.kt */
/* loaded from: classes.dex */
public final class l extends e.c implements e0, r, s1 {
    private String A;
    private k0 B;
    private l.b C;
    private int D;
    private boolean E;
    private int F;
    private int G;
    private a1.s1 H;
    private Map<n1.a, Integer> I;
    private f J;
    private pc.l<? super List<g0>, Boolean> K;

    /* compiled from: TextStringSimpleNode.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<List<g0>, Boolean> {
        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<g0> list) {
            q.i(list, "textLayoutResult");
            g0 n10 = l.this.K1().n();
            if (n10 != null) {
                list.add(n10);
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f13049f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0 y0Var) {
            super(1);
            this.f13049f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.n(aVar, this.f13049f, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ l(String str, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12, a1.s1 s1Var, qc.h hVar) {
        this(str, k0Var, bVar, i10, z10, i11, i12, s1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f K1() {
        if (this.J == null) {
            this.J = new f(this.A, this.B, this.C, this.D, this.E, this.F, this.G, null);
        }
        f fVar = this.J;
        q.f(fVar);
        return fVar;
    }

    private final f L1(j2.e eVar) {
        f K1 = K1();
        K1.l(eVar);
        return K1;
    }

    public final void J1(boolean z10, boolean z11, boolean z12) {
        if (z11 && p1()) {
            t1.b(this);
        }
        if (z11 || z12) {
            K1().o(this.A, this.B, this.C, this.D, this.E, this.F, this.G);
            if (p1()) {
                h0.b(this);
            }
            s.a(this);
        }
        if (z10) {
            s.a(this);
        }
    }

    public final boolean M1(a1.s1 s1Var, k0 k0Var) {
        q.i(k0Var, "style");
        boolean z10 = !q.d(s1Var, this.H);
        this.H = s1Var;
        if (z10 || !k0Var.F(this.B)) {
            return true;
        }
        return false;
    }

    public final boolean N1(k0 k0Var, int i10, int i11, boolean z10, l.b bVar, int i12) {
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        boolean z11 = !this.B.G(k0Var);
        this.B = k0Var;
        if (this.G != i10) {
            this.G = i10;
            z11 = true;
        }
        if (this.F != i11) {
            this.F = i11;
            z11 = true;
        }
        if (this.E != z10) {
            this.E = z10;
            z11 = true;
        }
        if (!q.d(this.C, bVar)) {
            this.C = bVar;
            z11 = true;
        }
        if (!u.e(this.D, i12)) {
            this.D = i12;
            return true;
        }
        return z11;
    }

    public final boolean O1(String str) {
        q.i(str, "text");
        if (q.d(this.A, str)) {
            return false;
        }
        this.A = str;
        return true;
    }

    @Override // p1.s1
    public void Z0(x xVar) {
        q.i(xVar, "<this>");
        pc.l lVar = this.K;
        if (lVar == null) {
            lVar = new a();
            this.K = lVar;
        }
        v.V(xVar, new v1.d(this.A, null, null, 6, null));
        v.n(xVar, null, lVar, 1, null);
    }

    @Override // p1.s1
    public /* synthetic */ boolean b0() {
        return r1.a(this);
    }

    @Override // p1.s1
    public /* synthetic */ boolean b1() {
        return r1.b(this);
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, n1.g0 g0Var, long j10) {
        int d10;
        int d11;
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        f L1 = L1(l0Var);
        boolean g10 = L1.g(j10, l0Var.getLayoutDirection());
        L1.c();
        m d12 = L1.d();
        q.f(d12);
        long b10 = L1.b();
        if (g10) {
            h0.a(this);
            Map<n1.a, Integer> map = this.I;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            n1.k a10 = n1.b.a();
            d10 = sc.c.d(d12.i());
            map.put(a10, Integer.valueOf(d10));
            n1.k b11 = n1.b.b();
            d11 = sc.c.d(d12.e());
            map.put(b11, Integer.valueOf(d11));
            this.I = map;
        }
        y0 w10 = g0Var.w(j2.b.f18972b.c(p.g(b10), p.f(b10)));
        int g11 = p.g(b10);
        int f10 = p.f(b10);
        Map<n1.a, Integer> map2 = this.I;
        q.f(map2);
        return l0Var.e0(g11, f10, map2, new b(w10));
    }

    @Override // p1.r
    public /* synthetic */ void d0() {
        p1.q.a(this);
    }

    @Override // p1.e0
    public int f(n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return L1(nVar).i(nVar.getLayoutDirection());
    }

    @Override // p1.e0
    public int n(n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return L1(nVar).e(i10, nVar.getLayoutDirection());
    }

    @Override // p1.e0
    public int r(n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return L1(nVar).e(i10, nVar.getLayoutDirection());
    }

    @Override // p1.r
    public void s(c1.c cVar) {
        long e10;
        boolean z10;
        long a10;
        q.i(cVar, "<this>");
        m d10 = K1().d();
        if (d10 != null) {
            h1 d11 = cVar.y0().d();
            boolean a11 = K1().a();
            boolean z11 = false;
            if (a11) {
                z0.h b10 = z0.i.b(z0.f.f26354b.c(), z0.m.a(p.g(K1().b()), p.f(K1().b())));
                d11.k();
                g1.e(d11, b10, 0, 2, null);
            }
            try {
                g2.k A = this.B.A();
                if (A == null) {
                    A = g2.k.f16065b.c();
                }
                g2.k kVar = A;
                o4 x10 = this.B.x();
                if (x10 == null) {
                    x10 = o4.f137d.a();
                }
                o4 o4Var = x10;
                c1.g i10 = this.B.i();
                if (i10 == null) {
                    i10 = c1.k.f8683a;
                }
                c1.g gVar = i10;
                e1 g10 = this.B.g();
                if (g10 != null) {
                    v1.l.b(d10, d11, g10, this.B.d(), o4Var, kVar, gVar, 0, 64, null);
                } else {
                    a1.s1 s1Var = this.H;
                    if (s1Var != null) {
                        e10 = s1Var.a();
                    } else {
                        e10 = p1.f146b.e();
                    }
                    p1.a aVar = p1.f146b;
                    if (e10 != aVar.e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (this.B.h() != aVar.e()) {
                            z11 = true;
                        }
                        if (z11) {
                            a10 = this.B.h();
                        } else {
                            a10 = aVar.a();
                        }
                        e10 = a10;
                    }
                    v1.l.a(d10, d11, e10, o4Var, kVar, gVar, 0, 32, null);
                }
                if (a11) {
                    return;
                }
                return;
            } finally {
                if (a11) {
                    d11.p();
                }
            }
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // p1.e0
    public int t(n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return L1(nVar).j(nVar.getLayoutDirection());
    }

    private l(String str, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12, a1.s1 s1Var) {
        q.i(str, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        this.A = str;
        this.B = k0Var;
        this.C = bVar;
        this.D = i10;
        this.E = z10;
        this.F = i11;
        this.G = i12;
        this.H = s1Var;
    }
}
