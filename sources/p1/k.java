package p1;

import androidx.compose.ui.e;

/* compiled from: DelegatableNode.kt */
/* loaded from: classes.dex */
public final class k {
    public static final void c(k0.f<e.c> fVar, e.c cVar) {
        k0.f<j0> t02 = k(cVar).t0();
        int o10 = t02.o();
        if (o10 > 0) {
            int i10 = o10 - 1;
            j0[] n10 = t02.n();
            do {
                fVar.d(n10[i10].i0().k());
                i10--;
            } while (i10 >= 0);
        }
    }

    public static final e0 d(e.c cVar) {
        boolean z10;
        boolean z11;
        qc.q.i(cVar, "<this>");
        if ((z0.a(2) & cVar.k1()) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        if (cVar instanceof e0) {
            return (e0) cVar;
        }
        if (cVar instanceof l) {
            e.c J1 = ((l) cVar).J1();
            while (J1 != null) {
                if (J1 instanceof e0) {
                    return (e0) J1;
                }
                if (J1 instanceof l) {
                    if ((z0.a(2) & J1.k1()) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        J1 = ((l) J1).J1();
                    }
                }
                J1 = J1.g1();
            }
        }
        return null;
    }

    public static final boolean e(j jVar, int i10) {
        qc.q.i(jVar, "$this$has");
        if ((jVar.getNode().f1() & i10) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean f(j jVar) {
        qc.q.i(jVar, "<this>");
        if (jVar.getNode() == jVar) {
            return true;
        }
        return false;
    }

    public static final e.c g(k0.f<e.c> fVar) {
        if (fVar != null && !fVar.r()) {
            return fVar.x(fVar.o() - 1);
        }
        return null;
    }

    public static final x0 h(j jVar, int i10) {
        qc.q.i(jVar, "$this$requireCoordinator");
        x0 h12 = jVar.getNode().h1();
        qc.q.f(h12);
        if (h12.T1() == jVar && a1.i(i10)) {
            x0 U1 = h12.U1();
            qc.q.f(U1);
            return U1;
        }
        return h12;
    }

    public static final j2.e i(j jVar) {
        qc.q.i(jVar, "<this>");
        return k(jVar).I();
    }

    public static final j2.r j(j jVar) {
        qc.q.i(jVar, "<this>");
        return k(jVar).getLayoutDirection();
    }

    public static final j0 k(j jVar) {
        qc.q.i(jVar, "<this>");
        x0 h12 = jVar.getNode().h1();
        if (h12 != null) {
            return h12.f1();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    public static final i1 l(j jVar) {
        qc.q.i(jVar, "<this>");
        i1 k02 = k(jVar).k0();
        if (k02 != null) {
            return k02;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
