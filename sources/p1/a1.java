package p1;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import okhttp3.internal.http2.Http2;

/* compiled from: NodeKind.kt */
/* loaded from: classes.dex */
public final class a1 {
    public static final void a(e.c cVar) {
        qc.q.i(cVar, "node");
        if (cVar.p1()) {
            b(cVar, -1, 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void b(e.c cVar, int i10, int i11) {
        qc.q.i(cVar, "node");
        if (cVar instanceof l) {
            l lVar = (l) cVar;
            c(cVar, lVar.K1() & i10, i11);
            int i12 = (~lVar.K1()) & i10;
            for (e.c J1 = lVar.J1(); J1 != null; J1 = J1.g1()) {
                b(J1, i12, i11);
            }
            return;
        }
        c(cVar, i10 & cVar.k1(), i11);
    }

    private static final void c(e.c cVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (i11 == 0 && !cVar.n1()) {
            return;
        }
        boolean z17 = true;
        if ((z0.a(2) & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (cVar instanceof e0)) {
            h0.b((e0) cVar);
            if (i11 == 2) {
                k.h(cVar, z0.a(2)).p2();
            }
        }
        if ((z0.a(UserVerificationMethods.USER_VERIFY_HANDPRINT) & i10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (cVar instanceof u)) {
            k.k(cVar).D0();
        }
        if ((z0.a(4) & i10) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (cVar instanceof r)) {
            s.a((r) cVar);
        }
        if ((z0.a(8) & i10) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && (cVar instanceof s1)) {
            t1.b((s1) cVar);
        }
        if ((z0.a(64) & i10) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && (cVar instanceof l1)) {
            m1.a((l1) cVar);
        }
        if ((z0.a(UserVerificationMethods.USER_VERIFY_ALL) & i10) != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15 && (cVar instanceof FocusTargetNode)) {
            if (i11 == 2) {
                cVar.u1();
            } else {
                k.l(cVar).getFocusOwner().b((FocusTargetNode) cVar);
            }
        }
        if ((z0.a(RecyclerView.m.FLAG_MOVED) & i10) != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16 && (cVar instanceof y0.k)) {
            y0.k kVar = (y0.k) cVar;
            if (k(kVar)) {
                if (i11 == 2) {
                    j(kVar);
                } else {
                    y0.l.a(kVar);
                }
            }
        }
        if ((i10 & z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT)) == 0) {
            z17 = false;
        }
        if (z17 && (cVar instanceof y0.c)) {
            y0.d.b((y0.c) cVar);
        }
    }

    public static final void d(e.c cVar) {
        qc.q.i(cVar, "node");
        if (cVar.p1()) {
            b(cVar, -1, 2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void e(e.c cVar) {
        qc.q.i(cVar, "node");
        if (cVar.p1()) {
            b(cVar, -1, 0);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final int f(e.b bVar) {
        qc.q.i(bVar, "element");
        int a10 = z0.a(1);
        if (bVar instanceof n1.z) {
            a10 |= z0.a(2);
        }
        if (bVar instanceof x0.h) {
            a10 |= z0.a(4);
        }
        if (bVar instanceof t1.n) {
            a10 |= z0.a(8);
        }
        if (bVar instanceof k1.j0) {
            a10 |= z0.a(16);
        }
        if ((bVar instanceof o1.d) || (bVar instanceof o1.k)) {
            a10 |= z0.a(32);
        }
        if (bVar instanceof y0.b) {
            a10 |= z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        if (bVar instanceof y0.i) {
            a10 |= z0.a(RecyclerView.m.FLAG_MOVED);
        }
        if (bVar instanceof n1.q0) {
            a10 |= z0.a(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
        if (bVar instanceof n1.v0) {
            a10 |= z0.a(64);
        }
        if ((bVar instanceof n1.r0) || (bVar instanceof n1.s0)) {
            return a10 | z0.a(128);
        }
        return a10;
    }

    public static final int g(e.c cVar) {
        qc.q.i(cVar, "node");
        if (cVar.k1() != 0) {
            return cVar.k1();
        }
        int a10 = z0.a(1);
        if (cVar instanceof e0) {
            a10 |= z0.a(2);
        }
        if (cVar instanceof r) {
            a10 |= z0.a(4);
        }
        if (cVar instanceof s1) {
            a10 |= z0.a(8);
        }
        if (cVar instanceof o1) {
            a10 |= z0.a(16);
        }
        if (cVar instanceof o1.i) {
            a10 |= z0.a(32);
        }
        if (cVar instanceof l1) {
            a10 |= z0.a(64);
        }
        if (cVar instanceof c0) {
            a10 |= z0.a(128);
        }
        if (cVar instanceof u) {
            a10 |= z0.a(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
        if (cVar instanceof n1.l) {
            a10 |= z0.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            a10 |= z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        }
        if (cVar instanceof y0.k) {
            a10 |= z0.a(RecyclerView.m.FLAG_MOVED);
        }
        if (cVar instanceof y0.c) {
            a10 |= z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        if (cVar instanceof i1.e) {
            a10 |= z0.a(8192);
        }
        if (cVar instanceof m1.a) {
            a10 |= z0.a(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        if (cVar instanceof h) {
            a10 |= z0.a(32768);
        }
        if (cVar instanceof i1.g) {
            return a10 | z0.a(131072);
        }
        return a10;
    }

    public static final int h(e.c cVar) {
        qc.q.i(cVar, "node");
        if (cVar instanceof l) {
            l lVar = (l) cVar;
            int K1 = lVar.K1();
            for (e.c J1 = lVar.J1(); J1 != null; J1 = J1.g1()) {
                K1 |= h(J1);
            }
            return K1;
        }
        return g(cVar);
    }

    public static final boolean i(int i10) {
        if ((i10 & z0.a(128)) != 0) {
            return true;
        }
        return false;
    }

    private static final void j(y0.k kVar) {
        boolean z10;
        boolean z11;
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        if (kVar.getNode().p1()) {
            k0.f fVar = new k0.f(new e.c[16], 0);
            e.c g12 = kVar.getNode().g1();
            if (g12 == null) {
                k.c(fVar, kVar.getNode());
            } else {
                fVar.d(g12);
            }
            while (fVar.s()) {
                e.c cVar = (e.c) fVar.x(fVar.o() - 1);
                if ((cVar.f1() & a10) == 0) {
                    k.c(fVar, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.k1() & a10) != 0) {
                            k0.f fVar2 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    y0.q.a((FocusTargetNode) cVar);
                                } else {
                                    if ((cVar.k1() & a10) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10 && (cVar instanceof l)) {
                                        int i10 = 0;
                                        for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
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
                                                    if (fVar2 == null) {
                                                        fVar2 = new k0.f(new e.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        fVar2.d(cVar);
                                                        cVar = null;
                                                    }
                                                    fVar2.d(J1);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                }
                                cVar = k.g(fVar2);
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

    private static final boolean k(y0.k kVar) {
        e eVar = e.f20781a;
        eVar.e();
        kVar.U(eVar);
        return eVar.d();
    }
}
