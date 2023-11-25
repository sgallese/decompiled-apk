package r;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.z0;

/* compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f21958a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f21958a;
    }

    public static final <T> s.y<T> b(j0.l lVar, int i10) {
        lVar.e(904445851);
        if (j0.n.K()) {
            j0.n.V(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        j2.e eVar = (j2.e) lVar.C(z0.e());
        Float valueOf = Float.valueOf(eVar.getDensity());
        lVar.e(1157296644);
        boolean Q = lVar.Q(valueOf);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = s.a0.a(new j0(eVar));
            lVar.J(f10);
        }
        lVar.N();
        s.y<T> yVar = (s.y) f10;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return yVar;
    }
}
