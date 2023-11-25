package n1;

/* compiled from: LookaheadLayoutCoordinates.kt */
/* loaded from: classes.dex */
public final class d0 {
    public static final p1.s0 a(p1.s0 s0Var) {
        p1.j0 j0Var;
        qc.q.i(s0Var, "<this>");
        p1.j0 f12 = s0Var.f1();
        while (true) {
            p1.j0 l02 = f12.l0();
            p1.j0 j0Var2 = null;
            if (l02 != null) {
                j0Var = l02.Z();
            } else {
                j0Var = null;
            }
            if (j0Var != null) {
                p1.j0 l03 = f12.l0();
                if (l03 != null) {
                    j0Var2 = l03.Z();
                }
                qc.q.f(j0Var2);
                if (j0Var2.J0()) {
                    f12 = f12.l0();
                    qc.q.f(f12);
                } else {
                    p1.j0 l04 = f12.l0();
                    qc.q.f(l04);
                    f12 = l04.Z();
                    qc.q.f(f12);
                }
            } else {
                p1.s0 P1 = f12.j0().P1();
                qc.q.f(P1);
                return P1;
            }
        }
    }
}
