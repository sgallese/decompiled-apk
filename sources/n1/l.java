package n1;

import androidx.compose.ui.e;
import n1.y0;
import p1.b1;

/* compiled from: IntermediateLayoutModifierNode.kt */
/* loaded from: classes.dex */
public final class l extends e.c implements p1.e0 {
    private pc.q<Object, ? super g0, ? super j2.b, ? extends j0> A;
    private final f0 B;
    private e0 C;

    /* compiled from: IntermediateLayoutModifierNode.kt */
    /* loaded from: classes.dex */
    private final class a implements e0, ad.k0, l0 {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntermediateLayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class b implements b1.e {
        b() {
        }

        @Override // p1.b1.e
        public final j0 d(l0 l0Var, g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$maxHeight");
            qc.q.i(g0Var, "intrinsicMeasurable");
            pc.q<Object, g0, j2.b, j0> J1 = l.this.J1();
            l.I1(l.this);
            return J1.invoke(null, g0Var, j2.b.b(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntermediateLayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class c implements b1.e {
        c() {
        }

        @Override // p1.b1.e
        public final j0 d(l0 l0Var, g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$maxWidth");
            qc.q.i(g0Var, "intrinsicMeasurable");
            pc.q<Object, g0, j2.b, j0> J1 = l.this.J1();
            l.I1(l.this);
            return J1.invoke(null, g0Var, j2.b.b(j10));
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f20019f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y0 y0Var) {
            super(1);
            this.f20019f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            y0.a.n(aVar, this.f20019f, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntermediateLayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class e implements b1.e {
        e() {
        }

        @Override // p1.b1.e
        public final j0 d(l0 l0Var, g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$minHeight");
            qc.q.i(g0Var, "intrinsicMeasurable");
            pc.q<Object, g0, j2.b, j0> J1 = l.this.J1();
            l.I1(l.this);
            return J1.invoke(null, g0Var, j2.b.b(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntermediateLayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class f implements b1.e {
        f() {
        }

        @Override // p1.b1.e
        public final j0 d(l0 l0Var, g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$minWidth");
            qc.q.i(g0Var, "intrinsicMeasurable");
            pc.q<Object, g0, j2.b, j0> J1 = l.this.J1();
            l.I1(l.this);
            return J1.invoke(null, g0Var, j2.b.b(j10));
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.a<s> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p1.j0 f20022f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p1.j0 j0Var) {
            super(0);
            this.f20022f = j0Var;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            p1.j0 l02 = this.f20022f.l0();
            qc.q.f(l02);
            return l02.O().b1();
        }
    }

    public static final /* synthetic */ a I1(l lVar) {
        lVar.getClass();
        return null;
    }

    public final pc.q<Object, g0, j2.b, j0> J1() {
        return this.A;
    }

    public final j0 K1(l0 l0Var, g0 g0Var, long j10, long j11, long j12) {
        qc.q.i(l0Var, "$this$intermediateMeasure");
        qc.q.i(g0Var, "measurable");
        throw null;
    }

    public final int L1(n nVar, m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        return p1.b1.f20763a.a(new b(), nVar, mVar, i10);
    }

    public final int M1(n nVar, m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        return p1.b1.f20763a.b(new c(), nVar, mVar, i10);
    }

    public final int N1(n nVar, m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        return p1.b1.f20763a.c(new e(), nVar, mVar, i10);
    }

    public final int O1(n nVar, m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        return p1.b1.f20763a.d(new f(), nVar, mVar, i10);
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new d(w10), 4, null);
    }

    @Override // p1.e0
    public /* synthetic */ int f(n nVar, m mVar, int i10) {
        return p1.d0.b(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int n(n nVar, m mVar, int i10) {
        return p1.d0.c(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int r(n nVar, m mVar, int i10) {
        return p1.d0.a(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.e.c
    public void s1() {
        c0 c0Var;
        boolean z10;
        boolean z11;
        f0 f0Var;
        f0 f0Var2;
        androidx.compose.ui.node.a i02;
        boolean z12;
        boolean z13;
        p1.x0 h12 = h1();
        qc.q.f(h12);
        p1.j0 f12 = h12.f1();
        p1.x0 h13 = h1();
        qc.q.f(h13);
        p1.s0 P1 = h13.P1();
        if (P1 != null) {
            c0Var = P1.v1();
        } else {
            c0Var = null;
        }
        if (c0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            p1.j0 Z = f12.Z();
            if (Z != null && Z.J0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f0Var2 = new f0(new g(Z));
            } else {
                int a10 = p1.z0.a(512);
                if (getNode().p1()) {
                    e.c m12 = getNode().m1();
                    p1.j0 k10 = p1.k.k(this);
                    l lVar = null;
                    while (k10 != null) {
                        if ((k10.i0().k().f1() & a10) != 0) {
                            while (m12 != null) {
                                if ((m12.k1() & a10) != 0) {
                                    e.c cVar = m12;
                                    k0.f fVar = null;
                                    while (cVar != null) {
                                        if (cVar instanceof l) {
                                            lVar = (l) cVar;
                                        } else {
                                            if ((cVar.k1() & a10) != 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12 && (cVar instanceof p1.l)) {
                                                int i10 = 0;
                                                for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                                    if ((J1.k1() & a10) != 0) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (z13) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            cVar = J1;
                                                        } else {
                                                            if (fVar == null) {
                                                                fVar = new k0.f(new e.c[16], 0);
                                                            }
                                                            if (cVar != null) {
                                                                fVar.d(cVar);
                                                                cVar = null;
                                                            }
                                                            fVar.d(J1);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                        }
                                        cVar = p1.k.g(fVar);
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
                    if (lVar == null || (f0Var = lVar.B) == null) {
                        f0Var = this.B;
                    }
                    f0Var2 = f0Var;
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            this.C = f0Var2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // p1.e0
    public /* synthetic */ int t(n nVar, m mVar, int i10) {
        return p1.d0.d(this, nVar, mVar, i10);
    }
}
