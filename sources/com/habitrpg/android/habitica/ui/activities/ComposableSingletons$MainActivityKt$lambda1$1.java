package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;

/* compiled from: MainActivity.kt */
/* renamed from: com.habitrpg.android.habitica.ui.activities.ComposableSingletons$MainActivityKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$MainActivityKt$lambda1$1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    public static final ComposableSingletons$MainActivityKt$lambda1$1 INSTANCE = new ComposableSingletons$MainActivityKt$lambda1$1();

    ComposableSingletons$MainActivityKt$lambda1$1() {
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
            j0.n.V(-1684339878, i10, -1, "com.habitrpg.android.habitica.ui.activities.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:330)");
        }
        f0.f2.b(s1.h.a(R.string.open_profile, lVar, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
