package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
final class TaskFormActivity$onBackPressed$2 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
    final /* synthetic */ HabiticaAlertDialog $alert;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onBackPressed$2(TaskFormActivity taskFormActivity, HabiticaAlertDialog habiticaAlertDialog) {
        super(2);
        this.this$0 = taskFormActivity;
        this.$alert = habiticaAlertDialog;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        this.this$0.isDiscardCancelled = true;
        this.$alert.dismiss();
    }
}
