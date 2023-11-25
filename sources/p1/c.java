package p1;

import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import p1.i1;

/* compiled from: BackwardsCompatNode.kt */
/* loaded from: classes.dex */
public final class c extends e.c implements e0, r, s1, o1, o1.i, o1.l, l1, c0, u, y0.c, y0.k, y0.n, j1, x0.b {
    private e.b A;
    private boolean B;
    private o1.a C;
    private HashSet<o1.c<?>> D;
    private n1.s E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<dc.w> {
        a() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.Q1();
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    public static final class b implements i1.b {
        b() {
        }

        @Override // p1.i1.b
        public void c() {
            if (c.this.E == null) {
                c cVar = c.this;
                cVar.p(k.h(cVar, z0.a(128)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackwardsCompatNode.kt */
    /* renamed from: p1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0465c extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e.b f20769f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c f20770m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0465c(e.b bVar, c cVar) {
            super(0);
            this.f20769f = bVar;
            this.f20770m = cVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((x0.g) this.f20769f).c(this.f20770m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.a<dc.w> {
        d() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            e.b J1 = c.this.J1();
            qc.q.g(J1, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((o1.d) J1).o(c.this);
        }
    }

    public c(e.b bVar) {
        qc.q.i(bVar, "element");
        C1(a1.f(bVar));
        this.A = bVar;
        this.B = true;
        this.D = new HashSet<>();
    }

    private final void L1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (p1()) {
            e.b bVar = this.A;
            boolean z17 = false;
            if ((z0.a(32) & k1()) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (bVar instanceof o1.d) {
                    G1(new a());
                }
                if (bVar instanceof o1.k) {
                    R1((o1.k) bVar);
                }
            }
            if ((z0.a(4) & k1()) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (bVar instanceof x0.g) {
                    this.B = true;
                }
                if (!z10) {
                    h0.a(this);
                }
            }
            if ((z0.a(2) & k1()) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                if (p1.d.d(this)) {
                    x0 h12 = h1();
                    qc.q.f(h12);
                    ((f0) h12).N2(this);
                    h12.k2();
                }
                if (!z10) {
                    h0.a(this);
                    k.k(this).D0();
                }
            }
            if (bVar instanceof n1.b1) {
                ((n1.b1) bVar).u(k.k(this));
            }
            if ((z0.a(128) & k1()) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                if ((bVar instanceof n1.s0) && p1.d.d(this)) {
                    k.k(this).D0();
                }
                if (bVar instanceof n1.r0) {
                    this.E = null;
                    if (p1.d.d(this)) {
                        k.l(this).n(new b());
                    }
                }
            }
            if ((z0.a(UserVerificationMethods.USER_VERIFY_HANDPRINT) & k1()) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15 && (bVar instanceof n1.q0) && p1.d.d(this)) {
                k.k(this).D0();
            }
            if (bVar instanceof y0.m) {
                ((y0.m) bVar).i().d().d(this);
            }
            if ((z0.a(16) & k1()) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16 && (bVar instanceof k1.j0)) {
                ((k1.j0) bVar).k().f(h1());
            }
            if ((z0.a(8) & k1()) != 0) {
                z17 = true;
            }
            if (z17) {
                k.l(this).q();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void O1() {
        boolean z10;
        if (p1()) {
            e.b bVar = this.A;
            boolean z11 = true;
            if ((z0.a(32) & k1()) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (bVar instanceof o1.k) {
                    k.l(this).getModifierLocalManager().d(this, ((o1.k) bVar).getKey());
                }
                if (bVar instanceof o1.d) {
                    ((o1.d) bVar).o(p1.d.a());
                }
            }
            if ((z0.a(8) & k1()) == 0) {
                z11 = false;
            }
            if (z11) {
                k.l(this).q();
            }
            if (bVar instanceof y0.m) {
                ((y0.m) bVar).i().d().v(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void P1() {
        e.b bVar = this.A;
        if (bVar instanceof x0.g) {
            k.l(this).getSnapshotObserver().h(this, p1.d.b(), new C0465c(bVar, this));
        }
        this.B = false;
    }

    private final void R1(o1.k<?> kVar) {
        o1.a aVar = this.C;
        if (aVar != null && aVar.a(kVar.getKey())) {
            aVar.c(kVar);
            k.l(this).getModifierLocalManager().f(this, kVar.getKey());
            return;
        }
        this.C = new o1.a(kVar);
        if (p1.d.d(this)) {
            k.l(this).getModifierLocalManager().a(this, kVar.getKey());
        }
    }

    public final e.b J1() {
        return this.A;
    }

    public final HashSet<o1.c<?>> K1() {
        return this.D;
    }

    @Override // p1.j1
    public boolean M() {
        return p1();
    }

    public final void M1() {
        this.B = true;
        s.a(this);
    }

    public final void N1(e.b bVar) {
        qc.q.i(bVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (p1()) {
            O1();
        }
        this.A = bVar;
        C1(a1.f(bVar));
        if (p1()) {
            L1(false);
        }
    }

    @Override // p1.o1
    public void O(k1.r rVar, k1.t tVar, long j10) {
        qc.q.i(rVar, "pointerEvent");
        qc.q.i(tVar, "pass");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((k1.j0) bVar).k().e(rVar, tVar, j10);
    }

    @Override // p1.o1
    public boolean Q0() {
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((k1.j0) bVar).k().c();
    }

    public final void Q1() {
        if (p1()) {
            this.D.clear();
            k.l(this).getSnapshotObserver().h(this, p1.d.c(), new d());
        }
    }

    @Override // y0.k
    public void U(androidx.compose.ui.focus.g gVar) {
        qc.q.i(gVar, "focusProperties");
        e.b bVar = this.A;
        if (bVar instanceof y0.i) {
            new t((y0.i) bVar).invoke(gVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // p1.o1
    public /* synthetic */ void U0() {
        n1.c(this);
    }

    @Override // p1.s1
    public void Z0(t1.x xVar) {
        qc.q.i(xVar, "<this>");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        ((t1.l) xVar).e(((t1.n) bVar).q());
    }

    @Override // p1.o1
    public void a0() {
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((k1.j0) bVar).k().d();
    }

    @Override // x0.b
    public long b() {
        return j2.q.c(k.h(this, z0.a(128)).a());
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
    public n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(g0Var, "measurable");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((n1.z) bVar).d(l0Var, g0Var, j10);
    }

    @Override // p1.r
    public void d0() {
        this.B = true;
        s.a(this);
    }

    @Override // p1.e0
    public int f(n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((n1.z) bVar).f(nVar, mVar, i10);
    }

    @Override // p1.c0
    public void g(long j10) {
        e.b bVar = this.A;
        if (bVar instanceof n1.s0) {
            ((n1.s0) bVar).g(j10);
        }
    }

    @Override // p1.o1
    public boolean g0() {
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((k1.j0) bVar).k().a();
    }

    @Override // x0.b
    public j2.e getDensity() {
        return k.k(this).I();
    }

    @Override // x0.b
    public j2.r getLayoutDirection() {
        return k.k(this).getLayoutDirection();
    }

    @Override // y0.c
    public void j(y0.o oVar) {
        qc.q.i(oVar, "focusState");
        e.b bVar = this.A;
        if (bVar instanceof y0.b) {
            ((y0.b) bVar).j(oVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // o1.i
    public o1.g l0() {
        o1.a aVar = this.C;
        if (aVar == null) {
            return o1.j.a();
        }
        return aVar;
    }

    @Override // p1.o1
    public /* synthetic */ void m0() {
        n1.b(this);
    }

    @Override // p1.e0
    public int n(n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((n1.z) bVar).n(nVar, mVar, i10);
    }

    @Override // o1.i, o1.l
    public <T> T o(o1.c<T> cVar) {
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        qc.q.i(cVar, "<this>");
        this.D.add(cVar);
        int a10 = z0.a(32);
        if (getNode().p1()) {
            e.c m12 = getNode().m1();
            j0 k10 = k.k(this);
            while (k10 != null) {
                if ((k10.i0().k().f1() & a10) != 0) {
                    while (m12 != null) {
                        if ((m12.k1() & a10) != 0) {
                            e.c cVar2 = m12;
                            k0.f fVar = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof o1.i) {
                                    o1.i iVar = (o1.i) cVar2;
                                    if (iVar.l0().a(cVar)) {
                                        return (T) iVar.l0().b(cVar);
                                    }
                                } else {
                                    if ((cVar2.k1() & a10) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10 && (cVar2 instanceof l)) {
                                        int i10 = 0;
                                        for (e.c J1 = ((l) cVar2).J1(); J1 != null; J1 = J1.g1()) {
                                            if ((J1.k1() & a10) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar2 = J1;
                                                } else {
                                                    if (fVar == null) {
                                                        fVar = new k0.f(new e.c[16], 0);
                                                    }
                                                    if (cVar2 != null) {
                                                        fVar.d(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    fVar.d(J1);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                }
                                cVar2 = k.g(fVar);
                            }
                        }
                        m12 = m12.m1();
                    }
                }
                k10 = k10.l0();
                if (k10 != null && (i02 = k10.i0()) != null) {
                    m12 = i02.o();
                } else {
                    m12 = null;
                }
            }
            return cVar.a().invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Override // p1.c0
    public void p(n1.s sVar) {
        qc.q.i(sVar, "coordinates");
        this.E = sVar;
        e.b bVar = this.A;
        if (bVar instanceof n1.r0) {
            ((n1.r0) bVar).p(sVar);
        }
    }

    @Override // p1.e0
    public int r(n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((n1.z) bVar).r(nVar, mVar, i10);
    }

    @Override // p1.r
    public void s(c1.c cVar) {
        qc.q.i(cVar, "<this>");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        x0.h hVar = (x0.h) bVar;
        if (this.B && (bVar instanceof x0.g)) {
            P1();
        }
        hVar.s(cVar);
    }

    @Override // androidx.compose.ui.e.c
    public void s1() {
        L1(true);
    }

    @Override // p1.e0
    public int t(n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((n1.z) bVar).t(nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        O1();
    }

    public String toString() {
        return this.A.toString();
    }

    @Override // p1.u
    public void w(n1.s sVar) {
        qc.q.i(sVar, "coordinates");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((n1.q0) bVar).w(sVar);
    }

    @Override // p1.l1
    public Object y(j2.e eVar, Object obj) {
        qc.q.i(eVar, "<this>");
        e.b bVar = this.A;
        qc.q.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((n1.v0) bVar).y(eVar, obj);
    }
}
