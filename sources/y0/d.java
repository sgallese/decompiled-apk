package y0;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import p1.j0;
import p1.z0;

/* compiled from: FocusEventModifierNode.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: FocusEventModifierNode.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26165a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26165a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00a4, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y0.o a(y0.c r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.a(y0.c):y0.o");
    }

    public static final void b(c cVar) {
        qc.q.i(cVar, "<this>");
        p1.k.l(cVar).getFocusOwner().d(cVar);
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        qc.q.i(focusTargetNode, "<this>");
        int a10 = z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        int a11 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        e.c node = focusTargetNode.getNode();
        int i10 = a10 | a11;
        if (focusTargetNode.getNode().p1()) {
            e.c node2 = focusTargetNode.getNode();
            j0 k10 = p1.k.k(focusTargetNode);
            while (k10 != null) {
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
                                    return;
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
                                    if (cVar instanceof c) {
                                        c cVar2 = (c) cVar;
                                        cVar2.j(a(cVar2));
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
