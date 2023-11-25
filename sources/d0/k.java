package d0;

import a1.e1;
import a1.g1;
import a1.h1;
import a1.o4;
import a1.p1;
import a2.l;
import androidx.compose.ui.e;
import dc.w;
import ec.n0;
import j2.p;
import java.util.List;
import java.util.Map;
import n1.j0;
import n1.l0;
import n1.m;
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
import v1.d;
import v1.g0;
import v1.k0;
import v1.u;

/* compiled from: TextAnnotatedStringNode.kt */
/* loaded from: classes.dex */
public final class k extends e.c implements e0, r, s1 {
    private v1.d A;
    private k0 B;
    private l.b C;
    private pc.l<? super g0, w> D;
    private int E;
    private boolean F;
    private int G;
    private int H;
    private List<d.b<u>> I;
    private pc.l<? super List<z0.h>, w> J;
    private h K;
    private a1.s1 L;
    private Map<n1.a, Integer> M;
    private e N;
    private pc.l<? super List<g0>, Boolean> O;

    /* compiled from: TextAnnotatedStringNode.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<List<g0>, Boolean> {
        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<g0> list) {
            boolean z10;
            q.i(list, "textLayoutResult");
            g0 a10 = k.this.L1().a();
            if (a10 != null) {
                list.add(a10);
            } else {
                a10 = null;
            }
            if (a10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAnnotatedStringNode.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f13047f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0 y0Var) {
            super(1);
            this.f13047f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.n(aVar, this.f13047f, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ k(v1.d dVar, k0 k0Var, l.b bVar, pc.l lVar, int i10, boolean z10, int i11, int i12, List list, pc.l lVar2, h hVar, a1.s1 s1Var, qc.h hVar2) {
        this(dVar, k0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, s1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e L1() {
        if (this.N == null) {
            this.N = new e(this.A, this.B, this.C, this.E, this.F, this.G, this.H, this.I, null);
        }
        e eVar = this.N;
        q.f(eVar);
        return eVar;
    }

    private final e M1(j2.e eVar) {
        e L1 = L1();
        L1.j(eVar);
        return L1;
    }

    public final void J1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 && p1()) {
            t1.b(this);
        }
        if (z11 || z12 || z13) {
            L1().m(this.A, this.B, this.C, this.E, this.F, this.G, this.H, this.I);
            if (p1()) {
                h0.b(this);
            }
            s.a(this);
        }
        if (z10) {
            s.a(this);
        }
    }

    public final void K1(c1.c cVar) {
        q.i(cVar, "contentDrawScope");
        s(cVar);
    }

    public final int N1(n nVar, m mVar, int i10) {
        q.i(nVar, "intrinsicMeasureScope");
        q.i(mVar, "measurable");
        return r(nVar, mVar, i10);
    }

    public final int O1(n nVar, m mVar, int i10) {
        q.i(nVar, "intrinsicMeasureScope");
        q.i(mVar, "measurable");
        return f(nVar, mVar, i10);
    }

    public final j0 P1(l0 l0Var, n1.g0 g0Var, long j10) {
        q.i(l0Var, "measureScope");
        q.i(g0Var, "measurable");
        return d(l0Var, g0Var, j10);
    }

    public final int Q1(n nVar, m mVar, int i10) {
        q.i(nVar, "intrinsicMeasureScope");
        q.i(mVar, "measurable");
        return n(nVar, mVar, i10);
    }

    public final int R1(n nVar, m mVar, int i10) {
        q.i(nVar, "intrinsicMeasureScope");
        q.i(mVar, "measurable");
        return t(nVar, mVar, i10);
    }

    public final boolean S1(pc.l<? super g0, w> lVar, pc.l<? super List<z0.h>, w> lVar2, h hVar) {
        boolean z10;
        if (!q.d(this.D, lVar)) {
            this.D = lVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!q.d(this.J, lVar2)) {
            this.J = lVar2;
            z10 = true;
        }
        if (!q.d(this.K, hVar)) {
            this.K = hVar;
            return true;
        }
        return z10;
    }

    public final boolean T1(a1.s1 s1Var, k0 k0Var) {
        q.i(k0Var, "style");
        boolean z10 = !q.d(s1Var, this.L);
        this.L = s1Var;
        if (z10 || !k0Var.F(this.B)) {
            return true;
        }
        return false;
    }

    public final boolean U1(k0 k0Var, List<d.b<u>> list, int i10, int i11, boolean z10, l.b bVar, int i12) {
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        boolean z11 = !this.B.G(k0Var);
        this.B = k0Var;
        if (!q.d(this.I, list)) {
            this.I = list;
            z11 = true;
        }
        if (this.H != i10) {
            this.H = i10;
            z11 = true;
        }
        if (this.G != i11) {
            this.G = i11;
            z11 = true;
        }
        if (this.F != z10) {
            this.F = z10;
            z11 = true;
        }
        if (!q.d(this.C, bVar)) {
            this.C = bVar;
            z11 = true;
        }
        if (!g2.u.e(this.E, i12)) {
            this.E = i12;
            return true;
        }
        return z11;
    }

    public final boolean V1(v1.d dVar) {
        q.i(dVar, "text");
        if (q.d(this.A, dVar)) {
            return false;
        }
        this.A = dVar;
        return true;
    }

    @Override // p1.s1
    public void Z0(x xVar) {
        q.i(xVar, "<this>");
        pc.l lVar = this.O;
        if (lVar == null) {
            lVar = new a();
            this.O = lVar;
        }
        v.V(xVar, this.A);
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
        Map<n1.a, Integer> k10;
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        e M1 = M1(l0Var);
        boolean e10 = M1.e(j10, l0Var.getLayoutDirection());
        g0 b10 = M1.b();
        b10.v().i().b();
        if (e10) {
            h0.a(this);
            pc.l<? super g0, w> lVar = this.D;
            if (lVar != null) {
                lVar.invoke(b10);
            }
            h hVar = this.K;
            if (hVar != null) {
                hVar.h(b10);
            }
            n1.k a10 = n1.b.a();
            d10 = sc.c.d(b10.g());
            n1.k b11 = n1.b.b();
            d11 = sc.c.d(b10.j());
            k10 = n0.k(dc.r.a(a10, Integer.valueOf(d10)), dc.r.a(b11, Integer.valueOf(d11)));
            this.M = k10;
        }
        pc.l<? super List<z0.h>, w> lVar2 = this.J;
        if (lVar2 != null) {
            lVar2.invoke(b10.z());
        }
        y0 w10 = g0Var.w(j2.b.f18972b.c(p.g(b10.A()), p.f(b10.A())));
        int g10 = p.g(b10.A());
        int f10 = p.f(b10.A());
        Map<n1.a, Integer> map = this.M;
        q.f(map);
        return l0Var.e0(g10, f10, map, new b(w10));
    }

    @Override // p1.r
    public /* synthetic */ void d0() {
        p1.q.a(this);
    }

    @Override // p1.e0
    public int f(n nVar, m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return M1(nVar).g(nVar.getLayoutDirection());
    }

    @Override // p1.e0
    public int n(n nVar, m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return M1(nVar).c(i10, nVar.getLayoutDirection());
    }

    @Override // p1.e0
    public int r(n nVar, m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return M1(nVar).c(i10, nVar.getLayoutDirection());
    }

    @Override // p1.r
    public void s(c1.c cVar) {
        boolean z10;
        long e10;
        boolean z11;
        boolean z12;
        q.i(cVar, "<this>");
        h hVar = this.K;
        if (hVar != null) {
            hVar.e(cVar);
        }
        h1 d10 = cVar.y0().d();
        g0 b10 = L1().b();
        v1.h v10 = b10.v();
        boolean z13 = true;
        if (b10.h() && !g2.u.e(this.E, g2.u.f16099a.c())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z0.h b11 = z0.i.b(z0.f.f26354b.c(), z0.m.a(p.g(b10.A()), p.f(b10.A())));
            d10.k();
            g1.e(d10, b11, 0, 2, null);
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
                v1.h.D(v10, d10, g10, this.B.d(), o4Var, kVar, gVar, 0, 64, null);
            } else {
                a1.s1 s1Var = this.L;
                if (s1Var != null) {
                    e10 = s1Var.a();
                } else {
                    e10 = p1.f146b.e();
                }
                p1.a aVar = p1.f146b;
                if (e10 != aVar.e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (this.B.h() != aVar.e()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        e10 = this.B.h();
                    } else {
                        e10 = aVar.a();
                    }
                }
                v1.h.B(v10, d10, e10, o4Var, kVar, gVar, 0, 32, null);
            }
            List<d.b<u>> list = this.I;
            if (list != null && !list.isEmpty()) {
                z13 = false;
            }
            if (!z13) {
                cVar.d1();
            }
        } finally {
            if (z10) {
                d10.p();
            }
        }
    }

    @Override // p1.e0
    public int t(n nVar, m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return M1(nVar).h(nVar.getLayoutDirection());
    }

    private k(v1.d dVar, k0 k0Var, l.b bVar, pc.l<? super g0, w> lVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list, pc.l<? super List<z0.h>, w> lVar2, h hVar, a1.s1 s1Var) {
        q.i(dVar, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        this.A = dVar;
        this.B = k0Var;
        this.C = bVar;
        this.D = lVar;
        this.E = i10;
        this.F = z10;
        this.G = i11;
        this.H = i12;
        this.I = list;
        this.J = lVar2;
        this.K = hVar;
        this.L = s1Var;
    }
}
