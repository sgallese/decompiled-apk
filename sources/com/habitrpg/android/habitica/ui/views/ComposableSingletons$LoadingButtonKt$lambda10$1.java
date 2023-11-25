package com.habitrpg.android.habitica.ui.views;

import dc.w;
import f0.f2;
import j0.n;
import pc.q;
import qc.r;
import w.a0;

/* compiled from: LoadingButton.kt */
/* renamed from: com.habitrpg.android.habitica.ui.views.ComposableSingletons$LoadingButtonKt$lambda-10$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$LoadingButtonKt$lambda10$1 extends r implements q<a0, j0.l, Integer, w> {
    public static final ComposableSingletons$LoadingButtonKt$lambda10$1 INSTANCE = new ComposableSingletons$LoadingButtonKt$lambda10$1();

    ComposableSingletons$LoadingButtonKt$lambda10$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(a0 a0Var, j0.l lVar, Integer num) {
        invoke(a0Var, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(a0 a0Var, j0.l lVar, int i10) {
        qc.q.i(a0Var, "$this$LoadingButton");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(1617394523, i10, -1, "com.habitrpg.android.habitica.ui.views.ComposableSingletons$LoadingButtonKt.lambda-10.<anonymous> (LoadingButton.kt:268)");
        }
        f2.b("Do something", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 6, 0, 131070);
        if (n.K()) {
            n.U();
        }
    }
}
