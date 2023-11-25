package w;

import j0.i2;
import j0.l3;
import p1.g;

/* compiled from: Spacer.kt */
/* loaded from: classes.dex */
public final class d0 {
    public static final void a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
        qc.q.i(eVar, "modifier");
        lVar.e(-72882467);
        if (j0.n.K()) {
            j0.n.V(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        e0 e0Var = e0.f25168a;
        lVar.e(-1323940314);
        int a10 = j0.j.a(lVar, 0);
        j0.v F = lVar.F();
        g.a aVar = p1.g.f20790l;
        pc.a<p1.g> a11 = aVar.a();
        pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(eVar);
        int i11 = (((((i10 << 3) & 112) | 384) << 9) & 7168) | 6;
        if (!(lVar.u() instanceof j0.f)) {
            j0.j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a11);
        } else {
            lVar.H();
        }
        j0.l a13 = l3.a(lVar);
        l3.b(a13, e0Var, aVar.e());
        l3.b(a13, F, aVar.g());
        pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
        if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
            a13.J(Integer.valueOf(a10));
            a13.I(Integer.valueOf(a10), b10);
        }
        a12.invoke(i2.a(i2.b(lVar)), lVar, Integer.valueOf((i11 >> 3) & 112));
        lVar.e(2058660585);
        lVar.N();
        lVar.O();
        lVar.N();
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
    }
}
