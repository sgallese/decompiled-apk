package p1;

import a1.b4;
import a1.c4;
import androidx.compose.ui.e;
import n1.y0;

/* compiled from: LayoutModifierNodeCoordinator.kt */
/* loaded from: classes.dex */
public final class f0 extends x0 {
    public static final a X = new a(null);
    private static final b4 Y;
    private e0 U;
    private j2.b V;
    private s0 W;

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    /* loaded from: classes.dex */
    private final class b extends s0 {
        public b() {
            super(f0.this);
        }

        @Override // p1.r0
        public int Y0(n1.a aVar) {
            int b10;
            qc.q.i(aVar, "alignmentLine");
            b10 = g0.b(this, aVar);
            t1().put(aVar, Integer.valueOf(b10));
            return b10;
        }

        @Override // p1.s0, n1.m
        public int a0(int i10) {
            e0 L2 = f0.this.L2();
            s0 P1 = f0.this.M2().P1();
            qc.q.f(P1);
            return L2.n(this, P1, i10);
        }

        @Override // p1.s0, n1.m
        public int g(int i10) {
            e0 L2 = f0.this.L2();
            s0 P1 = f0.this.M2().P1();
            qc.q.f(P1);
            return L2.r(this, P1, i10);
        }

        @Override // p1.s0, n1.m
        public int s(int i10) {
            e0 L2 = f0.this.L2();
            s0 P1 = f0.this.M2().P1();
            qc.q.f(P1);
            return L2.t(this, P1, i10);
        }

        @Override // p1.s0, n1.m
        public int t(int i10) {
            e0 L2 = f0.this.L2();
            s0 P1 = f0.this.M2().P1();
            qc.q.f(P1);
            return L2.f(this, P1, i10);
        }

        @Override // n1.g0
        public n1.y0 w(long j10) {
            f0 f0Var = f0.this;
            s0.p1(this, j10);
            f0Var.V = j2.b.b(j10);
            e0 L2 = f0Var.L2();
            s0 P1 = f0Var.M2().P1();
            qc.q.f(P1);
            s0.q1(this, L2.d(this, P1, j10));
            return this;
        }
    }

    static {
        b4 a10 = a1.o0.a();
        a10.v(a1.p1.f146b.b());
        a10.x(1.0f);
        a10.u(c4.f89a.b());
        Y = a10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, e0 e0Var) {
        super(j0Var);
        b bVar;
        qc.q.i(j0Var, "layoutNode");
        qc.q.i(e0Var, "measureNode");
        this.U = e0Var;
        if (j0Var.Z() != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        this.W = bVar;
    }

    @Override // p1.x0
    public void H1() {
        if (P1() == null) {
            O2(new b());
        }
    }

    public final e0 L2() {
        return this.U;
    }

    public final x0 M2() {
        x0 U1 = U1();
        qc.q.f(U1);
        return U1;
    }

    public final void N2(e0 e0Var) {
        qc.q.i(e0Var, "<set-?>");
        this.U = e0Var;
    }

    protected void O2(s0 s0Var) {
        this.W = s0Var;
    }

    @Override // p1.x0
    public s0 P1() {
        return this.W;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1.x0, n1.y0
    public void Q0(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
        n1.s sVar;
        int l10;
        j2.r k10;
        o0 o0Var;
        boolean D;
        super.Q0(j10, f10, lVar);
        if (l1()) {
            return;
        }
        o2();
        y0.a.C0453a c0453a = y0.a.f20041a;
        int g10 = j2.p.g(o0());
        j2.r layoutDirection = getLayoutDirection();
        sVar = y0.a.f20044d;
        l10 = c0453a.l();
        k10 = c0453a.k();
        o0Var = y0.a.f20045e;
        y0.a.f20043c = g10;
        y0.a.f20042b = layoutDirection;
        D = c0453a.D(this);
        g1().e();
        n1(D);
        y0.a.f20043c = l10;
        y0.a.f20042b = k10;
        y0.a.f20044d = sVar;
        y0.a.f20045e = o0Var;
    }

    @Override // p1.x0
    public e.c T1() {
        return this.U.getNode();
    }

    @Override // p1.r0
    public int Y0(n1.a aVar) {
        int b10;
        qc.q.i(aVar, "alignmentLine");
        s0 P1 = P1();
        if (P1 == null) {
            b10 = g0.b(this, aVar);
            return b10;
        }
        return P1.s1(aVar);
    }

    @Override // n1.m
    public int a0(int i10) {
        n1.l lVar;
        e0 e0Var = this.U;
        if (e0Var instanceof n1.l) {
            lVar = (n1.l) e0Var;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar.N1(this, M2(), i10);
        }
        return e0Var.n(this, M2(), i10);
    }

    @Override // n1.m
    public int g(int i10) {
        n1.l lVar;
        e0 e0Var = this.U;
        if (e0Var instanceof n1.l) {
            lVar = (n1.l) e0Var;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar.L1(this, M2(), i10);
        }
        return e0Var.r(this, M2(), i10);
    }

    @Override // p1.x0
    public void q2(a1.h1 h1Var) {
        qc.q.i(h1Var, "canvas");
        M2().E1(h1Var);
        if (n0.b(f1()).getShowLayoutBounds()) {
            F1(h1Var, Y);
        }
    }

    @Override // n1.m
    public int s(int i10) {
        n1.l lVar;
        e0 e0Var = this.U;
        if (e0Var instanceof n1.l) {
            lVar = (n1.l) e0Var;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar.O1(this, M2(), i10);
        }
        return e0Var.t(this, M2(), i10);
    }

    @Override // n1.m
    public int t(int i10) {
        n1.l lVar;
        e0 e0Var = this.U;
        if (e0Var instanceof n1.l) {
            lVar = (n1.l) e0Var;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar.M1(this, M2(), i10);
        }
        return e0Var.f(this, M2(), i10);
    }

    @Override // n1.g0
    public n1.y0 w(long j10) {
        n1.j0 d10;
        U0(j10);
        e0 L2 = L2();
        if (L2 instanceof n1.l) {
            n1.l lVar = (n1.l) L2;
            x0 M2 = M2();
            s0 P1 = P1();
            qc.q.f(P1);
            n1.j0 g12 = P1.g1();
            long a10 = j2.q.a(g12.getWidth(), g12.getHeight());
            j2.b bVar = this.V;
            qc.q.f(bVar);
            d10 = lVar.K1(this, M2, j10, a10, bVar.t());
        } else {
            d10 = L2.d(this, M2(), j10);
        }
        v2(d10);
        n2();
        return this;
    }
}
