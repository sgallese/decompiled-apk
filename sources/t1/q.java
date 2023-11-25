package t1;

import androidx.compose.ui.e;
import okhttp3.internal.http2.Http2Connection;
import p1.j0;
import p1.s1;
import p1.z0;

/* compiled from: SemanticsNode.kt */
/* loaded from: classes.dex */
public final class q {
    public static final p a(j0 j0Var, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        qc.q.i(j0Var, "layoutNode");
        androidx.compose.ui.node.a i02 = j0Var.i0();
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
        e.c node = s1Var.getNode();
        l G = j0Var.G();
        qc.q.f(G);
        return new p(node, z10, j0Var, G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(p pVar) {
        return pVar.m() + 2000000000;
    }

    public static final j0 f(j0 j0Var, pc.l<? super j0, Boolean> lVar) {
        qc.q.i(j0Var, "<this>");
        qc.q.i(lVar, "selector");
        for (j0 l02 = j0Var.l0(); l02 != null; l02 = l02.l0()) {
            if (lVar.invoke(l02).booleanValue()) {
                return l02;
            }
        }
        return null;
    }

    public static final s1 g(j0 j0Var) {
        int i10;
        boolean z10;
        boolean z11;
        qc.q.i(j0Var, "<this>");
        androidx.compose.ui.node.a i02 = j0Var.i0();
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
                            if (((s1) cVar).b1()) {
                                s1Var = cVar;
                                break loop0;
                            }
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
                if ((k10.f1() & a10) == 0) {
                    break;
                }
                k10 = k10.g1();
            }
        }
        return s1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i h(p pVar) {
        return (i) m.a(pVar.u(), s.f23478a.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(p pVar) {
        return pVar.m() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }
}
