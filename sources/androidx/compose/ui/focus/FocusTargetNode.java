package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import p1.c1;
import p1.d1;
import p1.j0;
import p1.u0;
import p1.z0;
import qc.f0;

/* compiled from: FocusTargetNode.kt */
/* loaded from: classes.dex */
public final class FocusTargetNode extends e.c implements c1, o1.i {
    private boolean A;
    private boolean B;
    private y0.p C = y0.p.Inactive;

    /* compiled from: FocusTargetNode.kt */
    /* loaded from: classes.dex */
    public static final class FocusTargetElement extends u0<FocusTargetNode> {

        /* renamed from: c  reason: collision with root package name */
        public static final FocusTargetElement f2364c = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        @Override // p1.u0
        public int hashCode() {
            return 1739042953;
        }

        @Override // p1.u0
        /* renamed from: v  reason: merged with bridge method [inline-methods] */
        public FocusTargetNode e() {
            return new FocusTargetNode();
        }

        @Override // p1.u0
        /* renamed from: x  reason: merged with bridge method [inline-methods] */
        public void m(FocusTargetNode focusTargetNode) {
            qc.q.i(focusTargetNode, "node");
        }
    }

    /* compiled from: FocusTargetNode.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2365a;

        static {
            int[] iArr = new int[y0.p.values().length];
            try {
                iArr[y0.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.p.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.p.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2365a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FocusTargetNode.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0<g> f2366f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2367m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f0<g> f0Var, FocusTargetNode focusTargetNode) {
            super(0);
            this.f2366f = f0Var;
            this.f2367m = focusTargetNode;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.g] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2366f.f21676f = this.f2367m.M1();
        }
    }

    @Override // p1.c1
    public void E0() {
        y0.p O1 = O1();
        P1();
        if (O1 != O1()) {
            y0.d.c(this);
        }
    }

    public final g M1() {
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h hVar = new h();
        int a10 = z0.a(RecyclerView.m.FLAG_MOVED);
        int a11 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        e.c node = getNode();
        int i10 = a10 | a11;
        if (getNode().p1()) {
            e.c node2 = getNode();
            j0 k10 = p1.k.k(this);
            loop0: while (k10 != null) {
                if ((k10.i0().k().f1() & i10) != 0) {
                    while (node2 != null) {
                        if ((node2.k1() & i10) != 0) {
                            if (node2 != node) {
                                if ((node2.k1() & a11) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    break loop0;
                                }
                            }
                            if ((node2.k1() & a10) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                e.c cVar = node2;
                                k0.f fVar = null;
                                while (cVar != null) {
                                    if (cVar instanceof y0.k) {
                                        ((y0.k) cVar).U(hVar);
                                    } else {
                                        if ((cVar.k1() & a10) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11 && (cVar instanceof p1.l)) {
                                            int i11 = 0;
                                            for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                                if ((J1.k1() & a10) != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (z12) {
                                                    i11++;
                                                    if (i11 == 1) {
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
                                            if (i11 == 1) {
                                            }
                                        }
                                    }
                                    cVar = p1.k.g(fVar);
                                }
                            }
                        }
                        node2 = node2.m1();
                    }
                }
                k10 = k10.l0();
                if (k10 != null && (i02 = k10.i0()) != null) {
                    node2 = i02.o();
                } else {
                    node2 = null;
                }
            }
            return hVar;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public final n1.c N1() {
        return (n1.c) o(n1.d.a());
    }

    public y0.p O1() {
        return this.C;
    }

    public final void P1() {
        g gVar;
        int i10 = a.f2365a[O1().ordinal()];
        if (i10 == 1 || i10 == 2) {
            f0 f0Var = new f0();
            d1.a(this, new b(f0Var, this));
            T t10 = f0Var.f21676f;
            if (t10 == 0) {
                qc.q.z("focusProperties");
                gVar = null;
            } else {
                gVar = (g) t10;
            }
            if (!gVar.g()) {
                p1.k.l(this).getFocusOwner().m(true);
            }
        }
    }

    public final void Q1() {
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        e.c node = getNode();
        int a10 = z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        k0.f fVar = null;
        while (node != null) {
            if (node instanceof y0.c) {
                y0.d.b((y0.c) node);
            } else {
                if ((node.k1() & a10) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && (node instanceof p1.l)) {
                    int i10 = 0;
                    for (e.c J1 = ((p1.l) node).J1(); J1 != null; J1 = J1.g1()) {
                        if ((J1.k1() & a10) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i10++;
                            if (i10 == 1) {
                                node = J1;
                            } else {
                                if (fVar == null) {
                                    fVar = new k0.f(new e.c[16], 0);
                                }
                                if (node != null) {
                                    fVar.d(node);
                                    node = null;
                                }
                                fVar.d(J1);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
            }
            node = p1.k.g(fVar);
        }
        int a11 = z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) | z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (getNode().p1()) {
            e.c m12 = getNode().m1();
            j0 k10 = p1.k.k(this);
            while (k10 != null) {
                if ((k10.i0().k().f1() & a11) != 0) {
                    while (m12 != null) {
                        if ((m12.k1() & a11) != 0) {
                            if ((z0.a(UserVerificationMethods.USER_VERIFY_ALL) & m12.k1()) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && m12.p1()) {
                                int a12 = z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                                k0.f fVar2 = null;
                                e.c cVar = m12;
                                while (cVar != null) {
                                    if (cVar instanceof y0.c) {
                                        y0.d.b((y0.c) cVar);
                                    } else {
                                        if ((cVar.k1() & a12) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11 && (cVar instanceof p1.l)) {
                                            int i11 = 0;
                                            for (e.c J12 = ((p1.l) cVar).J1(); J12 != null; J12 = J12.g1()) {
                                                if ((J12.k1() & a12) != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (z12) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        cVar = J12;
                                                    } else {
                                                        if (fVar2 == null) {
                                                            fVar2 = new k0.f(new e.c[16], 0);
                                                        }
                                                        if (cVar != null) {
                                                            fVar2.d(cVar);
                                                            cVar = null;
                                                        }
                                                        fVar2.d(J12);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                    }
                                    cVar = p1.k.g(fVar2);
                                }
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public void R1(y0.p pVar) {
        qc.q.i(pVar, "<set-?>");
        this.C = pVar;
    }

    @Override // o1.i
    public /* synthetic */ o1.g l0() {
        return o1.h.b(this);
    }

    @Override // o1.i, o1.l
    public /* synthetic */ Object o(o1.c cVar) {
        return o1.h.a(this, cVar);
    }

    @Override // androidx.compose.ui.e.c
    public void u1() {
        int i10 = a.f2365a[O1().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    Q1();
                    return;
                }
                return;
            }
            Q1();
            R1(y0.p.Inactive);
            return;
        }
        p1.k.l(this).getFocusOwner().m(true);
    }
}
