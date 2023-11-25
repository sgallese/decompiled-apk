package u;

import r.k0;
import t.i0;

/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f23988a = new v();

    private v() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [v0.g, qc.h] */
    public final m a(j0.l lVar, int i10) {
        lVar.e(1107739818);
        if (j0.n.K()) {
            j0.n.V(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:193)");
        }
        s.y b10 = k0.b(lVar, 0);
        lVar.e(1157296644);
        boolean Q = lVar.Q(b10);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            ?? r22 = 0;
            f10 = new e(b10, r22, 2, r22);
            lVar.J(f10);
        }
        lVar.N();
        e eVar = (e) f10;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return eVar;
    }

    public final i0 b(j0.l lVar, int i10) {
        lVar.e(1809802212);
        if (j0.n.K()) {
            j0.n.V(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:206)");
        }
        i0 b10 = t.b.b(lVar, 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return b10;
    }

    public final boolean c(j2.r rVar, o oVar, boolean z10) {
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(oVar, "orientation");
        boolean z11 = true;
        boolean z12 = !z10;
        if (rVar != j2.r.Rtl) {
            z11 = false;
        }
        if (z11 && oVar != o.Vertical) {
            return !z12;
        }
        return z12;
    }
}
