package h0;

import a1.p1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.j0;
import j0.g3;

/* compiled from: Ripple.android.kt */
/* loaded from: classes.dex */
public final class d extends e {
    public /* synthetic */ d(boolean z10, float f10, g3 g3Var, qc.h hVar) {
        this(z10, f10, g3Var);
    }

    private final ViewGroup c(j0.l lVar, int i10) {
        lVar.e(-1737891121);
        if (j0.n.K()) {
            j0.n.V(-1737891121, i10, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:104)");
        }
        Object C = lVar.C(j0.k());
        while (!(C instanceof ViewGroup)) {
            ViewParent parent = ((View) C).getParent();
            if (parent instanceof View) {
                qc.q.h(parent, "parent");
                C = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + C + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) C;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return viewGroup;
    }

    @Override // h0.e
    public m b(v.k kVar, boolean z10, float f10, g3<p1> g3Var, g3<f> g3Var2, j0.l lVar, int i10) {
        View view;
        qc.q.i(kVar, "interactionSource");
        qc.q.i(g3Var, "color");
        qc.q.i(g3Var2, "rippleAlpha");
        lVar.e(331259447);
        if (j0.n.K()) {
            j0.n.V(331259447, i10, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:57)");
        }
        ViewGroup c10 = c(lVar, (i10 >> 15) & 14);
        lVar.e(1643267286);
        if (c10.isInEditMode()) {
            lVar.e(511388516);
            boolean Q = lVar.Q(kVar) | lVar.Q(this);
            Object f11 = lVar.f();
            if (Q || f11 == j0.l.f18688a.a()) {
                f11 = new b(z10, f10, g3Var, g3Var2, null);
                lVar.J(f11);
            }
            lVar.N();
            b bVar = (b) f11;
            lVar.N();
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return bVar;
        }
        lVar.N();
        int childCount = c10.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 < childCount) {
                view = c10.getChildAt(i11);
                if (view instanceof i) {
                    break;
                }
                i11++;
            } else {
                view = null;
                break;
            }
        }
        if (view == null) {
            Context context = c10.getContext();
            qc.q.h(context, "view.context");
            view = new i(context);
            c10.addView(view);
        }
        lVar.e(1618982084);
        boolean Q2 = lVar.Q(kVar) | lVar.Q(this) | lVar.Q(view);
        Object f12 = lVar.f();
        if (Q2 || f12 == j0.l.f18688a.a()) {
            f12 = new a(z10, f10, g3Var, g3Var2, (i) view, null);
            lVar.J(f12);
        }
        lVar.N();
        a aVar = (a) f12;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private d(boolean z10, float f10, g3<p1> g3Var) {
        super(z10, f10, g3Var, null);
        qc.q.i(g3Var, "color");
    }
}
