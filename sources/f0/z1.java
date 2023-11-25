package f0;

import a1.r4;
import j0.g3;
import j0.y2;

/* compiled from: TextFieldDefaults.kt */
/* loaded from: classes.dex */
public final class z1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final g3<t.g> b(boolean z10, boolean z11, v.k kVar, w1 w1Var, float f10, float f11, j0.l lVar, int i10) {
        float f12;
        g3<j2.h> m10;
        lVar.e(1097899920);
        if (j0.n.K()) {
            j0.n.V(1097899920, i10, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:835)");
        }
        g3<Boolean> a10 = v.f.a(kVar, lVar, (i10 >> 6) & 14);
        g3<a1.p1> h10 = w1Var.h(z10, z11, kVar, lVar, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168));
        if (c(a10)) {
            f12 = f10;
        } else {
            f12 = f11;
        }
        qc.h hVar = null;
        if (z10) {
            lVar.e(1685712066);
            m10 = s.c.c(f12, s.k.i(150, 0, null, 6, null), null, null, lVar, 48, 12);
            lVar.N();
        } else {
            lVar.e(1685712164);
            m10 = y2.m(j2.h.f(f11), lVar, (i10 >> 15) & 14);
            lVar.N();
        }
        g3<t.g> m11 = y2.m(new t.g(m10.getValue().o(), new r4(h10.getValue().y(), hVar), hVar), lVar, 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return m11;
    }

    private static final boolean c(g3<Boolean> g3Var) {
        return g3Var.getValue().booleanValue();
    }
}
