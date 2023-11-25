package t1;

import androidx.compose.ui.e;
import p1.j0;
import p1.s1;
import p1.z0;

/* compiled from: SemanticsOwner.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f23477a;

    public r(j0 j0Var) {
        qc.q.i(j0Var, "rootNode");
        this.f23477a = j0Var;
    }

    public final p a() {
        int i10;
        boolean z10;
        boolean z11;
        androidx.compose.ui.node.a i02 = this.f23477a.i0();
        int a10 = z0.a(8);
        i10 = i02.i();
        s1 s1Var = null;
        if ((i10 & a10) != 0) {
            e.c k10 = i02.k();
            loop0: while (true) {
                if (k10 == null) {
                    break;
                }
                if ((k10.k1() & a10) != 0) {
                    e.c cVar = k10;
                    k0.f fVar = null;
                    while (cVar != null) {
                        if (cVar instanceof s1) {
                            s1Var = cVar;
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
                if ((k10.f1() & a10) == 0) {
                    break;
                }
                k10 = k10.g1();
            }
        }
        qc.q.f(s1Var);
        return new p(s1Var.getNode(), false, this.f23477a, new l());
    }
}
