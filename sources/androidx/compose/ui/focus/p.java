package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import n1.t;
import p1.j0;
import p1.x0;
import p1.z0;

/* compiled from: FocusTraversal.kt */
/* loaded from: classes.dex */
public final class p {

    /* compiled from: FocusTraversal.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2404a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2405b;

        static {
            int[] iArr = new int[j2.r.values().length];
            try {
                iArr[j2.r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j2.r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2404a = iArr;
            int[] iArr2 = new int[y0.p.values().length];
            try {
                iArr2[y0.p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[y0.p.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[y0.p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[y0.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f2405b = iArr2;
        }
    }

    public static final k a(FocusTargetNode focusTargetNode, int i10, j2.r rVar) {
        k k10;
        qc.q.i(focusTargetNode, "$this$customFocusSearch");
        qc.q.i(rVar, "layoutDirection");
        g M1 = focusTargetNode.M1();
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.e())) {
            return M1.c();
        }
        if (d.l(i10, aVar.f())) {
            return M1.h();
        }
        if (d.l(i10, aVar.h())) {
            return M1.i();
        }
        if (d.l(i10, aVar.a())) {
            return M1.l();
        }
        boolean z10 = false;
        if (d.l(i10, aVar.d())) {
            int i11 = a.f2404a[rVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    k10 = M1.k();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                k10 = M1.a();
            }
            if (k10 == k.f2395b.b()) {
                z10 = true;
            }
            if (z10) {
                k10 = null;
            }
            if (k10 == null) {
                return M1.b();
            }
        } else if (d.l(i10, aVar.g())) {
            int i12 = a.f2404a[rVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    k10 = M1.a();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                k10 = M1.k();
            }
            if (k10 == k.f2395b.b()) {
                z10 = true;
            }
            if (z10) {
                k10 = null;
            }
            if (k10 == null) {
                return M1.f();
            }
        } else if (d.l(i10, aVar.b())) {
            return M1.n().invoke(d.i(i10));
        } else {
            if (d.l(i10, aVar.c())) {
                return M1.j().invoke(d.i(i10));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return k10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0054, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.p.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (focusTargetNode.getNode().p1()) {
            e.c m12 = focusTargetNode.getNode().m1();
            j0 k10 = p1.k.k(focusTargetNode);
            while (k10 != null) {
                if ((k10.i0().k().f1() & a10) != 0) {
                    while (m12 != null) {
                        if ((m12.k1() & a10) != 0) {
                            e.c cVar = m12;
                            k0.f fVar = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.M1().g()) {
                                        return focusTargetNode2;
                                    }
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
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final z0.h d(FocusTargetNode focusTargetNode) {
        z0.h L;
        qc.q.i(focusTargetNode, "<this>");
        x0 h12 = focusTargetNode.h1();
        if (h12 == null || (L = t.d(h12).L(h12, false)) == null) {
            return z0.h.f26359e.a();
        }
        return L;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i10, j2.r rVar, pc.l<? super FocusTargetNode, Boolean> lVar) {
        boolean l10;
        boolean l11;
        boolean l12;
        boolean l13;
        FocusTargetNode focusTargetNode2;
        int g10;
        Boolean t10;
        qc.q.i(focusTargetNode, "$this$focusSearch");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(lVar, "onFound");
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.e())) {
            l10 = true;
        } else {
            l10 = d.l(i10, aVar.f());
        }
        if (l10) {
            return r.f(focusTargetNode, i10, lVar);
        }
        if (d.l(i10, aVar.d())) {
            l11 = true;
        } else {
            l11 = d.l(i10, aVar.g());
        }
        if (l11) {
            l12 = true;
        } else {
            l12 = d.l(i10, aVar.h());
        }
        if (l12) {
            l13 = true;
        } else {
            l13 = d.l(i10, aVar.a());
        }
        if (l13) {
            Boolean t11 = s.t(focusTargetNode, i10, lVar);
            if (t11 != null) {
                return t11.booleanValue();
            }
        } else if (d.l(i10, aVar.b())) {
            int i11 = a.f2404a[rVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    g10 = aVar.d();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                g10 = aVar.g();
            }
            FocusTargetNode b10 = b(focusTargetNode);
            if (b10 != null && (t10 = s.t(b10, g10, lVar)) != null) {
                return t10.booleanValue();
            }
        } else if (d.l(i10, aVar.c())) {
            FocusTargetNode b11 = b(focusTargetNode);
            if (b11 != null) {
                focusTargetNode2 = c(b11);
            } else {
                focusTargetNode2 = null;
            }
            if (focusTargetNode2 != null && !qc.q.d(focusTargetNode2, focusTargetNode)) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.n(i10))).toString());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.p.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        boolean z10;
        boolean z11;
        j0 f12;
        j0 f13;
        qc.q.i(focusTargetNode, "<this>");
        x0 h12 = focusTargetNode.h1();
        if (h12 != null && (f13 = h12.f1()) != null && f13.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            x0 h13 = focusTargetNode.h1();
            if (h13 != null && (f12 = h13.f1()) != null && f12.H0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }
}
