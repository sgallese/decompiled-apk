package j0;

import l0.g;

/* compiled from: CompositionLocalMap.kt */
/* loaded from: classes.dex */
public final class w {
    /* JADX WARN: Type inference failed for: r6v1, types: [j0.p1] */
    public static final p1 a(w1<?>[] w1VarArr, p1 p1Var, l lVar, int i10) {
        qc.q.i(w1VarArr, "values");
        qc.q.i(p1Var, "parentScope");
        lVar.e(-300354947);
        if (n.K()) {
            n.V(-300354947, i10, -1, "androidx.compose.runtime.compositionLocalMapOf (CompositionLocalMap.kt:91)");
        }
        g.a<t<Object>, g3<? extends Object>> l10 = q0.e.a().l();
        for (w1<?> w1Var : w1VarArr) {
            lVar.e(680845765);
            if (w1Var.a() || !b(p1Var, w1Var.b())) {
                t<?> b10 = w1Var.b();
                qc.q.g(b10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                l10.put(b10, w1Var.b().b(w1Var.c(), lVar, 8));
            }
            lVar.N();
        }
        ?? e10 = l10.e();
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return e10;
    }

    public static final <T> boolean b(p1 p1Var, t<T> tVar) {
        qc.q.i(p1Var, "<this>");
        qc.q.i(tVar, "key");
        return p1Var.containsKey(tVar);
    }

    public static final <T> T c(p1 p1Var, t<T> tVar) {
        qc.q.i(p1Var, "<this>");
        qc.q.i(tVar, "key");
        g3 g3Var = (g3) p1Var.get(tVar);
        if (g3Var != null) {
            return (T) g3Var.getValue();
        }
        return null;
    }

    public static final <T> T d(p1 p1Var, t<T> tVar) {
        qc.q.i(p1Var, "<this>");
        qc.q.i(tVar, "key");
        if (b(p1Var, tVar)) {
            return (T) c(p1Var, tVar);
        }
        return tVar.a().getValue();
    }
}
