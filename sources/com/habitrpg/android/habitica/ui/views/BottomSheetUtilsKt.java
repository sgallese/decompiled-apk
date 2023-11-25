package com.habitrpg.android.habitica.ui.views;

import a1.p1;
import ad.k0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.habitrpg.android.habitica.R;
import dc.w;
import f0.x0;
import f0.y0;
import f0.z0;
import j0.d3;
import j0.g2;
import j0.h0;
import j0.j1;
import j0.l;
import j0.n;
import j0.x;
import pc.q;

/* compiled from: BottomSheetUtils.kt */
/* loaded from: classes4.dex */
public final class BottomSheetUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomSheetWrapper(ViewGroup viewGroup, ComposeView composeView, q<? super pc.a<w>, ? super j0.l, ? super Integer, w> qVar, j0.l lVar, int i10) {
        j0.l q10 = lVar.q(-1043332230);
        if (n.K()) {
            n.V(-1043332230, i10, -1, "com.habitrpg.android.habitica.ui.views.BottomSheetWrapper (BottomSheetUtils.kt:72)");
        }
        q10.e(773894976);
        q10.e(-492369756);
        Object f10 = q10.f();
        l.a aVar = j0.l.f18688a;
        if (f10 == aVar.a()) {
            x xVar = new x(h0.h(hc.g.f16601f, q10));
            q10.J(xVar);
            f10 = xVar;
        }
        q10.N();
        k0 a10 = ((x) f10).a();
        q10.N();
        y0 n10 = x0.n(z0.Hidden, null, null, true, q10, 3078, 6);
        q10.e(-492369756);
        Object f11 = q10.f();
        if (f11 == aVar.a()) {
            f11 = d3.e(Boolean.FALSE, null, 2, null);
            q10.J(f11);
        }
        q10.N();
        j1 j1Var = (j1) f11;
        d6.d e10 = d6.e.e(null, q10, 0, 1);
        long a11 = s1.c.a(R.color.content_background, q10, 6);
        p1 g10 = p1.g(a11);
        q10.e(511388516);
        boolean Q = q10.Q(g10) | q10.Q(e10);
        Object f12 = q10.f();
        if (Q || f12 == aVar.a()) {
            f12 = new BottomSheetUtilsKt$BottomSheetWrapper$1$1(e10, a11);
            q10.J(f12);
        }
        q10.N();
        h0.b(e10, (pc.l) f12, q10, 0);
        float j10 = j2.h.j(20);
        x0.c(q0.c.b(q10, -803540824, true, new BottomSheetUtilsKt$BottomSheetWrapper$2(j10, qVar, i10, a10, n10)), null, n10, false, b0.i.f(j10, j10, 0.0f, 0.0f, 12, null), 0.0f, p1.f146b.d(), 0L, p1.o(s1.c.a(R.color.content_background, q10, 6), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), ComposableSingletons$BottomSheetUtilsKt.INSTANCE.m149getLambda1$Habitica_2311256681_prodRelease(), q10, (y0.f15290f << 6) | 806879238, 170);
        d.a.a(false, new BottomSheetUtilsKt$BottomSheetWrapper$3(a10, n10), q10, 0, 1);
        h0.d(n10.f(), new BottomSheetUtilsKt$BottomSheetWrapper$4(n10, e10, a11, viewGroup, composeView, a10, j1Var, null), q10, 64);
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new BottomSheetUtilsKt$BottomSheetWrapper$5(viewGroup, composeView, qVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomSheetWrapper$lambda$2(j1<Boolean> j1Var) {
        return j1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomSheetWrapper$lambda$3(j1<Boolean> j1Var, boolean z10) {
        j1Var.setValue(Boolean.valueOf(z10));
    }

    private static final void addContentToView(ViewGroup viewGroup, q<? super pc.a<w>, ? super j0.l, ? super Integer, w> qVar) {
        Context context = viewGroup.getContext();
        qc.q.h(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(q0.c.c(-1701267500, true, new BottomSheetUtilsKt$addContentToView$1$1(viewGroup, composeView, qVar)));
        viewGroup.addView(composeView);
    }

    public static final void showAsBottomSheet(Activity activity, q<? super pc.a<w>, ? super j0.l, ? super Integer, w> qVar) {
        qc.q.i(activity, "<this>");
        qc.q.i(qVar, "content");
        View findViewById = activity.findViewById(16908290);
        qc.q.g(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        addContentToView((ViewGroup) findViewById, qVar);
    }

    public static final void showAsBottomSheet(Fragment fragment, q<? super pc.a<w>, ? super j0.l, ? super Integer, w> qVar) {
        qc.q.i(fragment, "<this>");
        qc.q.i(qVar, "content");
        View findViewById = fragment.requireActivity().findViewById(16908290);
        qc.q.g(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        addContentToView((ViewGroup) findViewById, qVar);
    }
}
