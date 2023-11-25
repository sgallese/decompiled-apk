package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.views.progress.HabiticaCircularProgressViewKt;

/* compiled from: ArmoireActivity.kt */
/* renamed from: com.habitrpg.android.habitica.ui.activities.ComposableSingletons$ArmoireActivityKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$ArmoireActivityKt$lambda1$1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    public static final ComposableSingletons$ArmoireActivityKt$lambda1$1 INSTANCE = new ComposableSingletons$ArmoireActivityKt$lambda1$1();

    ComposableSingletons$ArmoireActivityKt$lambda1$1() {
        super(2);
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(1381488804, i10, -1, "com.habitrpg.android.habitica.ui.activities.ComposableSingletons$ArmoireActivityKt.lambda-1.<anonymous> (ArmoireActivity.kt:94)");
        }
        HabiticaCircularProgressViewKt.m171HabiticaCircularProgressViewQuyCDyQ(null, 0.0f, false, j2.h.j(60), 0, 0.0f, lVar, 3072, 55);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
