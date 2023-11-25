package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import kotlin.NoWhenBranchMatchedException;
import p1.d1;
import p1.i1;
import p1.j0;
import p1.x0;
import p1.z0;

/* compiled from: FocusTransactions.kt */
/* loaded from: classes.dex */
public final class o {

    /* compiled from: FocusTransactions.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2401a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2402b;

        static {
            int[] iArr = new int[y0.a.values().length];
            try {
                iArr[y0.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.a.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.a.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y0.a.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2401a = iArr;
            int[] iArr2 = new int[y0.p.values().length];
            try {
                iArr2[y0.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[y0.p.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[y0.p.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[y0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f2402b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FocusTransactions.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2403f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f2403f = focusTargetNode;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2403f.M1();
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode f10 = p.f(focusTargetNode);
        if (f10 != null) {
            return c(f10, z10, z11);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return a(focusTargetNode, z10, z11);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        qc.q.i(focusTargetNode, "<this>");
        int i10 = a.f2402b[focusTargetNode.O1().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (a(focusTargetNode, z10, z11)) {
                    focusTargetNode.R1(y0.p.Inactive);
                    if (z11) {
                        y0.d.c(focusTargetNode);
                    }
                } else {
                    return false;
                }
            } else if (z10) {
                focusTargetNode.R1(y0.p.Inactive);
                if (z11) {
                    y0.d.c(focusTargetNode);
                    return z10;
                }
                return z10;
            } else {
                return z10;
            }
        } else {
            focusTargetNode.R1(y0.p.Inactive);
            if (z11) {
                y0.d.c(focusTargetNode);
            }
        }
        return true;
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        d1.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.f2402b[focusTargetNode.O1().ordinal()];
        if (i10 == 3 || i10 == 4) {
            focusTargetNode.R1(y0.p.Active);
            return true;
        }
        return true;
    }

    public static final y0.a e(FocusTargetNode focusTargetNode, int i10) {
        qc.q.i(focusTargetNode, "$this$performCustomClearFocus");
        int i11 = a.f2402b[focusTargetNode.O1().ordinal()];
        boolean z10 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    FocusTargetNode f10 = p.f(focusTargetNode);
                    if (f10 != null) {
                        y0.a e10 = e(f10, i10);
                        if (e10 != y0.a.None) {
                            z10 = false;
                        }
                        if (z10) {
                            e10 = null;
                        }
                        if (e10 == null) {
                            return g(focusTargetNode, i10);
                        }
                        return e10;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                return y0.a.Cancelled;
            }
        }
        return y0.a.None;
    }

    private static final y0.a f(FocusTargetNode focusTargetNode, int i10) {
        boolean z10;
        y0.a aVar;
        z10 = focusTargetNode.B;
        if (!z10) {
            focusTargetNode.B = true;
            try {
                k invoke = focusTargetNode.M1().n().invoke(d.i(i10));
                k.a aVar2 = k.f2395b;
                if (invoke != aVar2.b()) {
                    if (invoke == aVar2.a()) {
                        return y0.a.Cancelled;
                    }
                    if (invoke.c()) {
                        aVar = y0.a.Redirected;
                    } else {
                        aVar = y0.a.RedirectCancelled;
                    }
                    return aVar;
                }
            } finally {
                focusTargetNode.B = false;
            }
        }
        return y0.a.None;
    }

    private static final y0.a g(FocusTargetNode focusTargetNode, int i10) {
        boolean z10;
        y0.a aVar;
        z10 = focusTargetNode.A;
        if (!z10) {
            focusTargetNode.A = true;
            try {
                k invoke = focusTargetNode.M1().j().invoke(d.i(i10));
                k.a aVar2 = k.f2395b;
                if (invoke != aVar2.b()) {
                    if (invoke == aVar2.a()) {
                        return y0.a.Cancelled;
                    }
                    if (invoke.c()) {
                        aVar = y0.a.Redirected;
                    } else {
                        aVar = y0.a.RedirectCancelled;
                    }
                    return aVar;
                }
            } finally {
                focusTargetNode.A = false;
            }
        }
        return y0.a.None;
    }

    public static final y0.a h(FocusTargetNode focusTargetNode, int i10) {
        y0.a aVar;
        FocusTargetNode focusTargetNode2;
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        qc.q.i(focusTargetNode, "$this$performCustomRequestFocus");
        int i11 = a.f2402b[focusTargetNode.O1().ordinal()];
        boolean z12 = true;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
                    if (focusTargetNode.getNode().p1()) {
                        e.c m12 = focusTargetNode.getNode().m1();
                        j0 k10 = p1.k.k(focusTargetNode);
                        loop0: while (true) {
                            aVar = null;
                            if (k10 != null) {
                                if ((k10.i0().k().f1() & a10) != 0) {
                                    while (m12 != null) {
                                        if ((m12.k1() & a10) != 0) {
                                            focusTargetNode2 = m12;
                                            k0.f fVar = null;
                                            while (focusTargetNode2 != null) {
                                                if (focusTargetNode2 instanceof FocusTargetNode) {
                                                    break loop0;
                                                }
                                                if ((focusTargetNode2.k1() & a10) != 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10 && (focusTargetNode2 instanceof p1.l)) {
                                                    int i12 = 0;
                                                    for (e.c J1 = ((p1.l) focusTargetNode2).J1(); J1 != null; J1 = J1.g1()) {
                                                        if ((J1.k1() & a10) != 0) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            i12++;
                                                            if (i12 == 1) {
                                                                focusTargetNode2 = J1;
                                                            } else {
                                                                if (fVar == null) {
                                                                    fVar = new k0.f(new e.c[16], 0);
                                                                }
                                                                if (focusTargetNode2 != null) {
                                                                    fVar.d(focusTargetNode2);
                                                                    focusTargetNode2 = null;
                                                                }
                                                                fVar.d(J1);
                                                            }
                                                        }
                                                    }
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                focusTargetNode2 = p1.k.g(fVar);
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
                            } else {
                                focusTargetNode2 = null;
                                break;
                            }
                        }
                        FocusTargetNode focusTargetNode3 = focusTargetNode2;
                        if (focusTargetNode3 == null) {
                            return y0.a.None;
                        }
                        int i13 = a.f2402b[focusTargetNode3.O1().ordinal()];
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    if (i13 == 4) {
                                        y0.a h10 = h(focusTargetNode3, i10);
                                        if (h10 != y0.a.None) {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            aVar = h10;
                                        }
                                        if (aVar == null) {
                                            return f(focusTargetNode3, i10);
                                        }
                                        return aVar;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                return h(focusTargetNode3, i10);
                            }
                            return y0.a.Cancelled;
                        }
                        return f(focusTargetNode3, i10);
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetNode f10 = p.f(focusTargetNode);
            if (f10 != null) {
                return e(f10, i10);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        return y0.a.None;
    }

    public static final boolean i(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        qc.q.i(focusTargetNode, "<this>");
        int i10 = a.f2402b[focusTargetNode.O1().ordinal()];
        boolean z12 = true;
        if (i10 != 1 && i10 != 2) {
            FocusTargetNode focusTargetNode2 = null;
            if (i10 != 3) {
                if (i10 == 4) {
                    int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
                    if (focusTargetNode.getNode().p1()) {
                        e.c m12 = focusTargetNode.getNode().m1();
                        j0 k10 = p1.k.k(focusTargetNode);
                        loop0: while (true) {
                            if (k10 == null) {
                                break;
                            }
                            if ((k10.i0().k().f1() & a10) != 0) {
                                while (m12 != null) {
                                    if ((m12.k1() & a10) != 0) {
                                        e.c cVar = m12;
                                        k0.f fVar = null;
                                        while (cVar != null) {
                                            if (cVar instanceof FocusTargetNode) {
                                                focusTargetNode2 = cVar;
                                                break loop0;
                                            }
                                            if ((cVar.k1() & a10) != 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10 && (cVar instanceof p1.l)) {
                                                int i11 = 0;
                                                for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                                    if ((J1.k1() & a10) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
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
                        FocusTargetNode focusTargetNode3 = focusTargetNode2;
                        if (focusTargetNode3 != null) {
                            return k(focusTargetNode3, focusTargetNode);
                        }
                        if (!l(focusTargetNode) || !d(focusTargetNode)) {
                            z12 = false;
                        }
                        if (z12) {
                            y0.d.c(focusTargetNode);
                            return z12;
                        }
                        return z12;
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!b(focusTargetNode, false, false, 3, null) || !d(focusTargetNode)) {
                z12 = false;
            }
            if (z12) {
                y0.d.c(focusTargetNode);
                return z12;
            }
            return z12;
        }
        y0.d.c(focusTargetNode);
        return true;
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        qc.q.i(focusTargetNode, "<this>");
        int i10 = a.f2401a[h(focusTargetNode, d.f2368b.b()).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3 && i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return false;
        }
        return i(focusTargetNode);
    }

    private static final boolean k(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3;
        boolean z10;
        e.c cVar;
        androidx.compose.ui.node.a i02;
        boolean z11;
        boolean z12;
        androidx.compose.ui.node.a i03;
        boolean z13;
        boolean z14;
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (focusTargetNode2.getNode().p1()) {
            e.c m12 = focusTargetNode2.getNode().m1();
            j0 k10 = p1.k.k(focusTargetNode2);
            loop0: while (true) {
                focusTargetNode3 = null;
                z10 = true;
                if (k10 != null) {
                    if ((k10.i0().k().f1() & a10) != 0) {
                        while (m12 != null) {
                            if ((m12.k1() & a10) != 0) {
                                cVar = m12;
                                k0.f fVar = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((cVar.k1() & a10) != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13 && (cVar instanceof p1.l)) {
                                        int i10 = 0;
                                        for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                            if ((J1.k1() & a10) != 0) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
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
                                    cVar = p1.k.g(fVar);
                                }
                            }
                            m12 = m12.m1();
                        }
                    }
                    k10 = k10.l0();
                    if (k10 != null && (i03 = k10.i0()) != null) {
                        m12 = i03.o();
                    } else {
                        m12 = null;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
            if (qc.q.d(cVar, focusTargetNode)) {
                int i11 = a.f2402b[focusTargetNode.O1().ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        return false;
                    }
                    if (i11 != 3) {
                        if (i11 == 4) {
                            int a11 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
                            if (focusTargetNode.getNode().p1()) {
                                e.c m13 = focusTargetNode.getNode().m1();
                                j0 k11 = p1.k.k(focusTargetNode);
                                loop4: while (true) {
                                    if (k11 == null) {
                                        break;
                                    }
                                    if ((k11.i0().k().f1() & a11) != 0) {
                                        while (m13 != null) {
                                            if ((m13.k1() & a11) != 0) {
                                                e.c cVar2 = m13;
                                                k0.f fVar2 = null;
                                                while (cVar2 != null) {
                                                    if (cVar2 instanceof FocusTargetNode) {
                                                        focusTargetNode3 = cVar2;
                                                        break loop4;
                                                    }
                                                    if ((cVar2.k1() & a11) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11 && (cVar2 instanceof p1.l)) {
                                                        int i12 = 0;
                                                        for (e.c J12 = ((p1.l) cVar2).J1(); J12 != null; J12 = J12.g1()) {
                                                            if ((J12.k1() & a11) != 0) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (z12) {
                                                                i12++;
                                                                if (i12 == 1) {
                                                                    cVar2 = J12;
                                                                } else {
                                                                    if (fVar2 == null) {
                                                                        fVar2 = new k0.f(new e.c[16], 0);
                                                                    }
                                                                    if (cVar2 != null) {
                                                                        fVar2.d(cVar2);
                                                                        cVar2 = null;
                                                                    }
                                                                    fVar2.d(J12);
                                                                }
                                                            }
                                                        }
                                                        if (i12 == 1) {
                                                        }
                                                    }
                                                    cVar2 = p1.k.g(fVar2);
                                                }
                                            }
                                            m13 = m13.m1();
                                        }
                                    }
                                    k11 = k11.l0();
                                    if (k11 != null && (i02 = k11.i0()) != null) {
                                        m13 = i02.o();
                                    } else {
                                        m13 = null;
                                    }
                                }
                                FocusTargetNode focusTargetNode4 = focusTargetNode3;
                                if (focusTargetNode4 == null && l(focusTargetNode)) {
                                    focusTargetNode.R1(y0.p.Active);
                                    y0.d.c(focusTargetNode);
                                    return k(focusTargetNode, focusTargetNode2);
                                } else if (focusTargetNode4 == null || !k(focusTargetNode4, focusTargetNode)) {
                                    return false;
                                } else {
                                    boolean k12 = k(focusTargetNode, focusTargetNode2);
                                    if (focusTargetNode.O1() != y0.p.ActiveParent) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        return k12;
                                    }
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                        throw new NoWhenBranchMatchedException();
                    } else if (p.f(focusTargetNode) != null) {
                        if (!b(focusTargetNode, false, false, 3, null) || !d(focusTargetNode2)) {
                            z10 = false;
                        }
                        if (z10) {
                            y0.d.c(focusTargetNode2);
                        }
                        return z10;
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                boolean d10 = d(focusTargetNode2);
                if (d10) {
                    focusTargetNode.R1(y0.p.ActiveParent);
                    y0.d.c(focusTargetNode2);
                    y0.d.c(focusTargetNode);
                    return d10;
                }
                return d10;
            }
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    private static final boolean l(FocusTargetNode focusTargetNode) {
        j0 f12;
        i1 k02;
        x0 h12 = focusTargetNode.h1();
        if (h12 != null && (f12 = h12.f1()) != null && (k02 = f12.k0()) != null) {
            return k02.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
