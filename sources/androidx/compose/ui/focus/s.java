package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import n1.c;
import p1.z0;

/* compiled from: TwoDimensionalFocusSearch.kt */
/* loaded from: classes.dex */
public final class s {

    /* compiled from: TwoDimensionalFocusSearch.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2412a;

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
            f2412a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TwoDimensionalFocusSearch.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<c.a, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2413f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2414m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f2415p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.l<FocusTargetNode, Boolean> f2416q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f2413f = focusTargetNode;
            this.f2414m = focusTargetNode2;
            this.f2415p = i10;
            this.f2416q = lVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(c.a aVar) {
            boolean z10;
            qc.q.i(aVar, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(s.r(this.f2413f, this.f2414m, this.f2415p, this.f2416q));
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

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        boolean z10;
        if (focusTargetNode.O1() == y0.p.ActiveParent) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            FocusTargetNode b10 = p.b(focusTargetNode);
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final boolean c(z0.h hVar, z0.h hVar2, z0.h hVar3, int i10) {
        if (d(hVar3, i10, hVar) || !d(hVar2, i10, hVar)) {
            return false;
        }
        if (e(hVar3, i10, hVar)) {
            d.a aVar = d.f2368b;
            if (!d.l(i10, aVar.d()) && !d.l(i10, aVar.g()) && f(hVar2, i10, hVar) >= g(hVar3, i10, hVar)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(z0.h hVar, int i10, z0.h hVar2) {
        boolean l10;
        boolean l11;
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.d())) {
            l10 = true;
        } else {
            l10 = d.l(i10, aVar.g());
        }
        if (l10) {
            if (hVar.e() > hVar2.l() && hVar.l() < hVar2.e()) {
                return true;
            }
        } else {
            if (d.l(i10, aVar.h())) {
                l11 = true;
            } else {
                l11 = d.l(i10, aVar.a());
            }
            if (l11) {
                if (hVar.j() > hVar2.i() && hVar.i() < hVar2.j()) {
                    return true;
                }
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return false;
    }

    private static final boolean e(z0.h hVar, int i10, z0.h hVar2) {
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.d())) {
            if (hVar2.i() >= hVar.j()) {
                return true;
            }
        } else if (d.l(i10, aVar.g())) {
            if (hVar2.j() <= hVar.i()) {
                return true;
            }
        } else if (d.l(i10, aVar.h())) {
            if (hVar2.l() >= hVar.e()) {
                return true;
            }
        } else if (d.l(i10, aVar.a())) {
            if (hVar2.e() <= hVar.l()) {
                return true;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return false;
    }

    private static final float f(z0.h hVar, int i10, z0.h hVar2) {
        float l10;
        float e10;
        float l11;
        float e11;
        float f10;
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.d())) {
            l11 = hVar2.i();
            e11 = hVar.j();
        } else {
            if (d.l(i10, aVar.g())) {
                l10 = hVar.i();
                e10 = hVar2.j();
            } else if (d.l(i10, aVar.h())) {
                l11 = hVar2.l();
                e11 = hVar.e();
            } else if (d.l(i10, aVar.a())) {
                l10 = hVar.l();
                e10 = hVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f10 = l10 - e10;
            return Math.max(0.0f, f10);
        }
        f10 = l11 - e11;
        return Math.max(0.0f, f10);
    }

    private static final float g(z0.h hVar, int i10, z0.h hVar2) {
        float e10;
        float e11;
        float l10;
        float l11;
        float f10;
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.d())) {
            l10 = hVar2.i();
            l11 = hVar.i();
        } else {
            if (d.l(i10, aVar.g())) {
                e10 = hVar.j();
                e11 = hVar2.j();
            } else if (d.l(i10, aVar.h())) {
                l10 = hVar2.l();
                l11 = hVar.l();
            } else if (d.l(i10, aVar.a())) {
                e10 = hVar.e();
                e11 = hVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f10 = e10 - e11;
            return Math.max(1.0f, f10);
        }
        f10 = l10 - l11;
        return Math.max(1.0f, f10);
    }

    private static final z0.h h(z0.h hVar) {
        return new z0.h(hVar.j(), hVar.e(), hVar.j(), hVar.e());
    }

    private static final void i(p1.j jVar, k0.f<FocusTargetNode> fVar) {
        boolean z10;
        boolean z11;
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (jVar.getNode().p1()) {
            k0.f fVar2 = new k0.f(new e.c[16], 0);
            e.c g12 = jVar.getNode().g1();
            if (g12 == null) {
                p1.k.c(fVar2, jVar.getNode());
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
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                    if (focusTargetNode.p1()) {
                                        if (focusTargetNode.M1().g()) {
                                            fVar.d(focusTargetNode);
                                        } else {
                                            i(focusTargetNode, fVar);
                                        }
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
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final FocusTargetNode j(k0.f<FocusTargetNode> fVar, z0.h hVar, int i10) {
        z0.h q10;
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.d())) {
            q10 = hVar.q(hVar.n() + 1, 0.0f);
        } else if (d.l(i10, aVar.g())) {
            q10 = hVar.q(-(hVar.n() + 1), 0.0f);
        } else if (d.l(i10, aVar.h())) {
            q10 = hVar.q(0.0f, hVar.h() + 1);
        } else if (d.l(i10, aVar.a())) {
            q10 = hVar.q(0.0f, -(hVar.h() + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        int o10 = fVar.o();
        FocusTargetNode focusTargetNode = null;
        if (o10 > 0) {
            FocusTargetNode[] n10 = fVar.n();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = n10[i11];
                if (p.g(focusTargetNode2)) {
                    z0.h d10 = p.d(focusTargetNode2);
                    if (m(d10, q10, hVar, i10)) {
                        focusTargetNode = focusTargetNode2;
                        q10 = d10;
                    }
                }
                i11++;
            } while (i11 < o10);
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
        boolean l10;
        z0.h h10;
        Object obj;
        qc.q.i(focusTargetNode, "$this$findChildCorrespondingToFocusEnter");
        qc.q.i(lVar, "onFound");
        k0.f fVar = new k0.f(new FocusTargetNode[16], 0);
        i(focusTargetNode, fVar);
        boolean z10 = true;
        if (fVar.o() <= 1) {
            if (fVar.r()) {
                obj = null;
            } else {
                obj = fVar.n()[0];
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj;
            if (focusTargetNode2 == null) {
                return false;
            }
            return lVar.invoke(focusTargetNode2).booleanValue();
        }
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.b())) {
            i10 = aVar.g();
        }
        if (d.l(i10, aVar.g())) {
            l10 = true;
        } else {
            l10 = d.l(i10, aVar.a());
        }
        if (l10) {
            h10 = s(p.d(focusTargetNode));
        } else {
            if (!d.l(i10, aVar.d())) {
                z10 = d.l(i10, aVar.h());
            }
            if (z10) {
                h10 = h(p.d(focusTargetNode));
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        FocusTargetNode j10 = j(fVar, h10, i10);
        if (j10 == null) {
            return false;
        }
        return lVar.invoke(j10).booleanValue();
    }

    private static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
        if (r(focusTargetNode, focusTargetNode2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(focusTargetNode, focusTargetNode2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(z0.h hVar, z0.h hVar2, z0.h hVar3, int i10) {
        if (!n(hVar, i10, hVar3)) {
            return false;
        }
        if (n(hVar2, i10, hVar3) && !c(hVar3, hVar, hVar2, i10) && (c(hVar3, hVar2, hVar, i10) || q(i10, hVar3, hVar) >= q(i10, hVar3, hVar2))) {
            return false;
        }
        return true;
    }

    private static final boolean n(z0.h hVar, int i10, z0.h hVar2) {
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.d())) {
            if ((hVar2.j() > hVar.j() || hVar2.i() >= hVar.j()) && hVar2.i() > hVar.i()) {
                return true;
            }
        } else if (d.l(i10, aVar.g())) {
            if ((hVar2.i() < hVar.i() || hVar2.j() <= hVar.i()) && hVar2.j() < hVar.j()) {
                return true;
            }
        } else if (d.l(i10, aVar.h())) {
            if ((hVar2.e() > hVar.e() || hVar2.l() >= hVar.e()) && hVar2.l() > hVar.l()) {
                return true;
            }
        } else if (d.l(i10, aVar.a())) {
            if ((hVar2.l() < hVar.l() || hVar2.e() <= hVar.l()) && hVar2.e() < hVar.e()) {
                return true;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return false;
    }

    private static final float o(z0.h hVar, int i10, z0.h hVar2) {
        float l10;
        float e10;
        float l11;
        float e11;
        float f10;
        d.a aVar = d.f2368b;
        if (d.l(i10, aVar.d())) {
            l11 = hVar2.i();
            e11 = hVar.j();
        } else {
            if (d.l(i10, aVar.g())) {
                l10 = hVar.i();
                e10 = hVar2.j();
            } else if (d.l(i10, aVar.h())) {
                l11 = hVar2.l();
                e11 = hVar.e();
            } else if (d.l(i10, aVar.a())) {
                l10 = hVar.l();
                e10 = hVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f10 = l10 - e10;
            return Math.max(0.0f, f10);
        }
        f10 = l11 - e11;
        return Math.max(0.0f, f10);
    }

    private static final float p(z0.h hVar, int i10, z0.h hVar2) {
        boolean l10;
        float f10;
        float i11;
        float i12;
        float n10;
        d.a aVar = d.f2368b;
        boolean z10 = true;
        if (d.l(i10, aVar.d())) {
            l10 = true;
        } else {
            l10 = d.l(i10, aVar.g());
        }
        if (l10) {
            f10 = 2;
            i11 = hVar2.l() + (hVar2.h() / f10);
            i12 = hVar.l();
            n10 = hVar.h();
        } else {
            if (!d.l(i10, aVar.h())) {
                z10 = d.l(i10, aVar.a());
            }
            if (z10) {
                f10 = 2;
                i11 = hVar2.i() + (hVar2.n() / f10);
                i12 = hVar.i();
                n10 = hVar.n();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return i11 - (i12 + (n10 / f10));
    }

    private static final long q(int i10, z0.h hVar, z0.h hVar2) {
        long abs = Math.abs(o(hVar2, i10, hVar));
        long abs2 = Math.abs(p(hVar2, i10, hVar));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode j10;
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
            while (fVar.s() && (j10 = j(fVar, p.d(focusTargetNode2), i10)) != null) {
                if (j10.M1().g()) {
                    return lVar.invoke(j10).booleanValue();
                }
                if (l(j10, focusTargetNode2, i10, lVar)) {
                    return true;
                }
                fVar.v(j10);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final z0.h s(z0.h hVar) {
        return new z0.h(hVar.i(), hVar.l(), hVar.i(), hVar.l());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i10, pc.l<? super FocusTargetNode, Boolean> lVar) {
        qc.q.i(focusTargetNode, "$this$twoDimensionalFocusSearch");
        qc.q.i(lVar, "onFound");
        y0.p O1 = focusTargetNode.O1();
        int[] iArr = a.f2412a;
        int i11 = iArr[O1.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 == 4) {
                    if (focusTargetNode.M1().g()) {
                        return lVar.invoke(focusTargetNode);
                    }
                    return Boolean.FALSE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(k(focusTargetNode, i10, lVar));
        }
        FocusTargetNode f10 = p.f(focusTargetNode);
        if (f10 != null) {
            int i12 = iArr[f10.O1().ordinal()];
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                return Boolean.valueOf(l(focusTargetNode, f10, i10, lVar));
            }
            Boolean t10 = t(f10, i10, lVar);
            if (!qc.q.d(t10, Boolean.FALSE)) {
                return t10;
            }
            return Boolean.valueOf(l(focusTargetNode, b(f10), i10, lVar));
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }
}
