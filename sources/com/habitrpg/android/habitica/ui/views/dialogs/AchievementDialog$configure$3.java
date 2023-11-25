package com.habitrpg.android.habitica.ui.views.dialogs;

import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: AchievementDialog.kt */
/* loaded from: classes4.dex */
final class AchievementDialog$configure$3 extends r implements p<HabiticaAlertDialog, Integer, w> {
    public static final AchievementDialog$configure$3 INSTANCE = new AchievementDialog$configure$3();

    AchievementDialog$configure$3() {
        super(2);
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.achievementsFragment, null, 2, null);
    }
}
