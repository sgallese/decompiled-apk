package o1;

import androidx.compose.ui.e;
import p1.j0;
import p1.z0;
import qc.q;

/* compiled from: ModifierLocalModifierNode.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static Object a(i iVar, c cVar) {
        androidx.compose.ui.node.a i02;
        boolean z10;
        boolean z11;
        q.i(cVar, "<this>");
        if (iVar.getNode().p1()) {
            int a10 = z0.a(32);
            if (iVar.getNode().p1()) {
                e.c m12 = iVar.getNode().m1();
                j0 k10 = p1.k.k(iVar);
                while (k10 != null) {
                    if ((k10.i0().k().f1() & a10) != 0) {
                        while (m12 != null) {
                            if ((m12.k1() & a10) != 0) {
                                e.c cVar2 = m12;
                                k0.f fVar = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof i) {
                                        i iVar2 = (i) cVar2;
                                        if (iVar2.l0().a(cVar)) {
                                            return iVar2.l0().b(cVar);
                                        }
                                    } else {
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
                return cVar.a().invoke();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static g b(i iVar) {
        return b.f20335a;
    }
}
