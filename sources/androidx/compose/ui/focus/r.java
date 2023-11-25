package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import n1.c;
import p1.j0;
import p1.z0;

/* compiled from: OneDimensionalFocusSearch.kt */
/* loaded from: classes.dex */
public final class r {

    /* compiled from: OneDimensionalFocusSearch.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2407a;

        static {
            int[] iArr = new int[y0.p.values().length];
            try {
                iArr[y0.p.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.p.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2407a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OneDimensionalFocusSearch.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<c.a, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2408f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2409m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f2410p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.l<FocusTargetNode, Boolean> f2411q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f2408f = focusTargetNode;
            this.f2409m = focusTargetNode2;
            this.f2410p = i10;
            this.f2411q = lVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(c.a aVar) {
            boolean z10;
            qc.q.i(aVar, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(r.i(this.f2408f, this.f2409m, this.f2410p, this.f2411q));
            if (!valueOf.booleanValue() && aVar.a()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            return valueOf;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, pc.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z10;
        y0.p O1 = focusTargetNode.O1();
        int[] iArr = a.f2407a;
        int i10 = iArr[O1.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    if (!g(focusTargetNode, lVar)) {
                        if (focusTargetNode.M1().g()) {
                            z10 = lVar.invoke(focusTargetNode).booleanValue();
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            return false;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return g(focusTargetNode, lVar);
            }
        } else {
            FocusTargetNode f10 = p.f(focusTargetNode);
            if (f10 != null) {
                int i11 = iArr[f10.O1().ordinal()];
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        if (i11 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    return d(focusTargetNode, f10, d.f2368b.f(), lVar);
                } else if (!b(f10, lVar) && !d(focusTargetNode, f10, d.f2368b.f(), lVar) && (!f10.M1().g() || !lVar.invoke(f10).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return true;
    }

    private static final boolean c(FocusTargetNode focusTargetNode, pc.l<? super FocusTargetNode, Boolean> lVar) {
        int i10 = a.f2407a[focusTargetNode.O1().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    if (focusTargetNode.M1().g()) {
                        return lVar.invoke(focusTargetNode).booleanValue();
                    }
                    return h(focusTargetNode, lVar);
                }
                throw new NoWhenBranchMatchedException();
            }
            return h(focusTargetNode, lVar);
        }
        FocusTargetNode f10 = p.f(focusTargetNode);
        if (f10 != null) {
            if (c(f10, lVar) || d(focusTargetNode, f10, d.f2368b.e(), lVar)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
        if (i(focusTargetNode, focusTargetNode2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(focusTargetNode, focusTargetNode2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        e.c cVar;
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (focusTargetNode.getNode().p1()) {
            e.c m12 = focusTargetNode.getNode().m1();
            j0 k10 = p1.k.k(focusTargetNode);
            loop0: while (true) {
                cVar = null;
                if (k10 == null) {
                    break;
                }
                if ((k10.i0().k().f1() & a10) != 0) {
                    while (m12 != null) {
                        if ((m12.k1() & a10) != 0) {
                            e.c cVar2 = m12;
                            k0.f fVar = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof FocusTargetNode) {
                                    cVar = cVar2;
                                    break loop0;
                                }
                                if ((cVar2.k1() & a10) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && (cVar2 instanceof p1.l)) {
                                    int i10 = 0;
                                    for (e.c J1 = ((p1.l) cVar2).J1(); J1 != null; J1 = J1.g1()) {
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
                                cVar2 = p1.k.g(fVar);
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
            if (cVar != null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
        qc.q.i(focusTargetNode, "$this$oneDimensionalFocusSearch");
        qc.q.i(lVar, "onFound");
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.e())) {
            return c(focusTargetNode, lVar);
        }
        if (d.l(i10, aVar.f())) {
            return b(focusTargetNode, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    private static final boolean g(FocusTargetNode focusTargetNode, pc.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z10;
        boolean z11;
        k0.f fVar = new k0.f(new FocusTargetNode[16], 0);
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (focusTargetNode.getNode().p1()) {
            k0.f fVar2 = new k0.f(new e.c[16], 0);
            e.c g12 = focusTargetNode.getNode().g1();
            if (g12 == null) {
                p1.k.c(fVar2, focusTargetNode.getNode());
            } else {
                fVar2.d(g12);
            }
            while (fVar2.s()) {
                e.c cVar = (e.c) fVar2.x(fVar2.o() - 1);
                if ((cVar.f1() & a10) == 0) {
                    p1.k.c(fVar2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.k1() & a10) != 0) {
                            k0.f fVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    fVar.d((FocusTargetNode) cVar);
                                } else {
                                    if ((cVar.k1() & a10) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10 && (cVar instanceof p1.l)) {
                                        int i10 = 0;
                                        for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                            if ((J1.k1() & a10) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar = J1;
                                                } else {
                                                    if (fVar3 == null) {
                                                        fVar3 = new k0.f(new e.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        fVar3.d(cVar);
                                                        cVar = null;
                                                    }
                                                    fVar3.d(J1);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                }
                                cVar = p1.k.g(fVar3);
                            }
                        } else {
                            cVar = cVar.g1();
                        }
                    }
                }
            }
            fVar.B(q.f2406f);
            int o10 = fVar.o();
            if (o10 > 0) {
                int i11 = o10 - 1;
                Object[] n10 = fVar.n();
                do {
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) n10[i11];
                    if (p.g(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                        return true;
                    }
                    i11--;
                } while (i11 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final boolean h(FocusTargetNode focusTargetNode, pc.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        k0.f fVar = new k0.f(new FocusTargetNode[16], 0);
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (focusTargetNode.getNode().p1()) {
            k0.f fVar2 = new k0.f(new e.c[16], 0);
            e.c g12 = focusTargetNode.getNode().g1();
            if (g12 == null) {
                p1.k.c(fVar2, focusTargetNode.getNode());
            } else {
                fVar2.d(g12);
            }
            while (fVar2.s()) {
                e.c cVar = (e.c) fVar2.x(fVar2.o() - 1);
                if ((cVar.f1() & a10) == 0) {
                    p1.k.c(fVar2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.k1() & a10) != 0) {
                            k0.f fVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    fVar.d((FocusTargetNode) cVar);
                                } else {
                                    if ((cVar.k1() & a10) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 && (cVar instanceof p1.l)) {
                                        int i10 = 0;
                                        for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                            if ((J1.k1() & a10) != 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar = J1;
                                                } else {
                                                    if (fVar3 == null) {
                                                        fVar3 = new k0.f(new e.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        fVar3.d(cVar);
                                                        cVar = null;
                                                    }
                                                    fVar3.d(J1);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                }
                                cVar = p1.k.g(fVar3);
                            }
                        } else {
                            cVar = cVar.g1();
                        }
                    }
                }
            }
            fVar.B(q.f2406f);
            int o10 = fVar.o();
            if (o10 <= 0) {
                return false;
            }
            Object[] n10 = fVar.n();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) n10[i11];
                if (p.g(focusTargetNode2) && c(focusTargetNode2, lVar)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
                i11++;
            } while (i11 < o10);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (focusTargetNode.O1() == y0.p.ActiveParent) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            k0.f fVar = new k0.f(new FocusTargetNode[16], 0);
            int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
            if (focusTargetNode.getNode().p1()) {
                k0.f fVar2 = new k0.f(new e.c[16], 0);
                e.c g12 = focusTargetNode.getNode().g1();
                if (g12 == null) {
                    p1.k.c(fVar2, focusTargetNode.getNode());
                } else {
                    fVar2.d(g12);
                }
                while (fVar2.s()) {
                    e.c cVar = (e.c) fVar2.x(fVar2.o() - 1);
                    if ((cVar.f1() & a10) == 0) {
                        p1.k.c(fVar2, cVar);
                    } else {
                        while (true) {
                            if (cVar == null) {
                                break;
                            } else if ((cVar.k1() & a10) != 0) {
                                k0.f fVar3 = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        fVar.d((FocusTargetNode) cVar);
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
                                                        if (fVar3 == null) {
                                                            fVar3 = new k0.f(new e.c[16], 0);
                                                        }
                                                        if (cVar != null) {
                                                            fVar3.d(cVar);
                                                            cVar = null;
                                                        }
                                                        fVar3.d(J1);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                    }
                                    cVar = p1.k.g(fVar3);
                                }
                            } else {
                                cVar = cVar.g1();
                            }
                        }
                    }
                }
                fVar.B(q.f2406f);
                d.a aVar = d.f2368b;
                if (d.l(i10, aVar.e())) {
                    vc.f fVar4 = new vc.f(0, fVar.o() - 1);
                    int h10 = fVar4.h();
                    int i12 = fVar4.i();
                    if (h10 <= i12) {
                        boolean z13 = false;
                        while (true) {
                            if (z13) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) fVar.n()[h10];
                                if (p.g(focusTargetNode3) && c(focusTargetNode3, lVar)) {
                                    return true;
                                }
                            }
                            if (qc.q.d(fVar.n()[h10], focusTargetNode2)) {
                                z13 = true;
                            }
                            if (h10 == i12) {
                                break;
                            }
                            h10++;
                        }
                    }
                } else if (d.l(i10, aVar.f())) {
                    vc.f fVar5 = new vc.f(0, fVar.o() - 1);
                    int h11 = fVar5.h();
                    int i13 = fVar5.i();
                    if (h11 <= i13) {
                        boolean z14 = false;
                        while (true) {
                            if (z14) {
                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) fVar.n()[i13];
                                if (p.g(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                                    return true;
                                }
                            }
                            if (qc.q.d(fVar.n()[i13], focusTargetNode2)) {
                                z14 = true;
                            }
                            if (i13 == h11) {
                                break;
                            }
                            i13--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                if (d.l(i10, d.f2368b.e()) || !focusTargetNode.M1().g() || e(focusTargetNode)) {
                    return false;
                }
                return lVar.invoke(focusTargetNode).booleanValue();
            }
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
