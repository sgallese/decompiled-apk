package e0;

import v1.g0;

/* compiled from: TextSelectionDelegate.kt */
/* loaded from: classes.dex */
public final class b0 {
    public static final float a(g0 g0Var, int i10, boolean z10, boolean z11) {
        int max;
        qc.q.i(g0Var, "<this>");
        boolean z12 = false;
        if ((z10 && !z11) || (!z10 && z11)) {
            max = i10;
        } else {
            max = Math.max(i10 - 1, 0);
        }
        if (g0Var.b(max) == g0Var.x(i10)) {
            z12 = true;
        }
        return g0Var.i(i10, z12);
    }

    public static final long b(g0 g0Var, int i10, boolean z10, boolean z11) {
        qc.q.i(g0Var, "textLayoutResult");
        return z0.g.a(a(g0Var, i10, z10, z11), g0Var.l(g0Var.p(i10)));
    }
}
