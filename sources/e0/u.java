package e0;

import v1.g0;
import v1.i0;
import v1.j0;

/* compiled from: TextFieldSelectionDelegate.kt */
/* loaded from: classes.dex */
public final class u {
    public static final long a(g0 g0Var, int i10, int i11, i0 i0Var, boolean z10, k kVar) {
        qc.q.i(kVar, "adjustment");
        if (g0Var != null) {
            long b10 = j0.b(i10, i11);
            if (i0Var == null && qc.q.d(kVar, k.f13641a.c())) {
                return b10;
            }
            return kVar.a(g0Var, b10, -1, z10, i0Var);
        }
        return j0.b(0, 0);
    }
}
