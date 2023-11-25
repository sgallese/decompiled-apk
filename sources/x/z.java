package x;

import y.c0;

/* compiled from: LazyListSemantics.kt */
/* loaded from: classes.dex */
public final class z {
    public static final c0 a(a0 a0Var, boolean z10, j0.l lVar, int i10) {
        qc.q.i(a0Var, "state");
        lVar.e(596174919);
        if (j0.n.K()) {
            j0.n.V(596174919, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:23)");
        }
        Boolean valueOf = Boolean.valueOf(z10);
        lVar.e(511388516);
        boolean Q = lVar.Q(valueOf) | lVar.Q(a0Var);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = e.a(a0Var, z10);
            lVar.J(f10);
        }
        lVar.N();
        c0 c0Var = (c0) f10;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return c0Var;
    }
}
