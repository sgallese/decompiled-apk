package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import n1.c;
import p1.j0;
import p1.z0;

/* compiled from: BeyondBoundsLayout.kt */
/* loaded from: classes.dex */
public final class a {
    public static final <T> T a(FocusTargetNode focusTargetNode, int i10, pc.l<? super c.a, ? extends T> lVar) {
        FocusTargetNode focusTargetNode2;
        n1.c N1;
        int c10;
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        qc.q.i(focusTargetNode, "$this$searchBeyondBounds");
        qc.q.i(lVar, "block");
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (focusTargetNode.getNode().p1()) {
            e.c m12 = focusTargetNode.getNode().m1();
            j0 k10 = p1.k.k(focusTargetNode);
            loop0: while (true) {
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
                                        int i11 = 0;
                                        for (e.c J1 = ((p1.l) focusTargetNode2).J1(); J1 != null; J1 = J1.g1()) {
                                            if ((J1.k1() & a10) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                i11++;
                                                if (i11 == 1) {
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
                                        if (i11 == 1) {
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
            if ((focusTargetNode3 != null && qc.q.d(focusTargetNode3.N1(), focusTargetNode.N1())) || (N1 = focusTargetNode.N1()) == null) {
                return null;
            }
            d.a aVar = d.f2368b;
            if (d.l(i10, aVar.h())) {
                c10 = c.b.f19945a.a();
            } else if (d.l(i10, aVar.a())) {
                c10 = c.b.f19945a.d();
            } else if (d.l(i10, aVar.d())) {
                c10 = c.b.f19945a.e();
            } else if (d.l(i10, aVar.g())) {
                c10 = c.b.f19945a.f();
            } else if (d.l(i10, aVar.e())) {
                c10 = c.b.f19945a.b();
            } else if (d.l(i10, aVar.f())) {
                c10 = c.b.f19945a.c();
            } else {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            return (T) N1.e(c10, lVar);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
