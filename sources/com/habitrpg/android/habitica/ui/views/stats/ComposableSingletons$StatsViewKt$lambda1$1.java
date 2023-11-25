package com.habitrpg.android.habitica.ui.views.stats;

import a1.l0;
import android.graphics.Bitmap;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import dc.w;
import j0.l;
import j0.n;
import pc.q;
import qc.r;
import t.u;
import w.a0;

/* compiled from: StatsView.kt */
/* renamed from: com.habitrpg.android.habitica.ui.views.stats.ComposableSingletons$StatsViewKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$StatsViewKt$lambda1$1 extends r implements q<a0, l, Integer, w> {
    public static final ComposableSingletons$StatsViewKt$lambda1$1 INSTANCE = new ComposableSingletons$StatsViewKt$lambda1$1();

    ComposableSingletons$StatsViewKt$lambda1$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(a0 a0Var, l lVar, Integer num) {
        invoke(a0Var, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(a0 a0Var, l lVar, int i10) {
        qc.q.i(a0Var, "$this$TextButton");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(1472375464, i10, -1, "com.habitrpg.android.habitica.ui.views.stats.ComposableSingletons$StatsViewKt.lambda-1.<anonymous> (StatsView.kt:107)");
        }
        Bitmap imageOfAttributeAllocateButton = HabiticaIconsHelper.imageOfAttributeAllocateButton();
        qc.q.h(imageOfAttributeAllocateButton, "imageOfAttributeAllocateButton(...)");
        u.b(l0.c(imageOfAttributeAllocateButton), null, null, null, null, 0.0f, null, 0, lVar, 56, 252);
        if (n.K()) {
            n.U();
        }
    }
}
