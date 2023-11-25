package x;

import androidx.compose.ui.platform.z0;

/* compiled from: LazyListBeyondBoundsModifier.kt */
/* loaded from: classes.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [j0.l] */
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, a0 a0Var, int i10, boolean z10, u.o oVar, j0.l lVar, int i11) {
        qc.q.i(eVar, "<this>");
        qc.q.i(a0Var, "state");
        qc.q.i(oVar, "orientation");
        lVar.e(1452310458);
        if (j0.n.K()) {
            j0.n.V(1452310458, i11, -1, "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)");
        }
        j2.r rVar = (j2.r) lVar.C(z0.j());
        Integer valueOf = Integer.valueOf(i10);
        lVar.e(511388516);
        boolean Q = lVar.Q(valueOf) | lVar.Q(a0Var);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new h(a0Var, i10);
            lVar.J(f10);
        }
        lVar.N();
        h hVar = f10;
        y.g k10 = a0Var.k();
        Object[] objArr = {hVar, k10, Boolean.valueOf(z10), rVar, oVar};
        lVar.e(-568225417);
        boolean z11 = false;
        for (int i12 = 0; i12 < 5; i12++) {
            z11 |= lVar.Q(objArr[i12]);
        }
        Object f11 = lVar.f();
        if (z11 || f11 == j0.l.f18688a.a()) {
            f11 = new y.h(hVar, k10, z10, rVar, oVar);
            lVar.J(f11);
        }
        lVar.N();
        androidx.compose.ui.e a10 = eVar.a((androidx.compose.ui.e) f11);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return a10;
    }
}
