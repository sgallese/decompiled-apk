package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.MainNavigationController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClassSelectionActivity.kt */
/* loaded from: classes4.dex */
public final class ClassSelectionActivity$displayClassChanged$2 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
    final /* synthetic */ ClassSelectionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassSelectionActivity$displayClassChanged$2(ClassSelectionActivity classSelectionActivity) {
        super(2);
        this.this$0 = classSelectionActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        this.this$0.dismiss();
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.FAQOverviewFragment, null, 2, null);
    }
}
