package b2;

/* compiled from: TextFieldValue.kt */
/* loaded from: classes.dex */
public final class k0 {
    public static final v1.d a(j0 j0Var) {
        qc.q.i(j0Var, "<this>");
        return j0Var.e().o(j0Var.g());
    }

    public static final v1.d b(j0 j0Var, int i10) {
        qc.q.i(j0Var, "<this>");
        return j0Var.e().subSequence(v1.i0.k(j0Var.g()), Math.min(v1.i0.k(j0Var.g()) + i10, j0Var.h().length()));
    }

    public static final v1.d c(j0 j0Var, int i10) {
        qc.q.i(j0Var, "<this>");
        return j0Var.e().subSequence(Math.max(0, v1.i0.l(j0Var.g()) - i10), v1.i0.l(j0Var.g()));
    }
}
