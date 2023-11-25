package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$2 extends qc.r implements pc.l<User, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$2(TaskFormActivity taskFormActivity) {
        super(1);
        this.this$0 = taskFormActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(User user) {
        invoke2(user);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        Preferences preferences;
        TaskFormActivity taskFormActivity = this.this$0;
        boolean z10 = false;
        if (qc.q.d((user == null || (preferences = user.getPreferences()) == null) ? null : preferences.getAllocationMode(), Stats.AUTO_ALLOCATE_TASKBASED)) {
            Preferences preferences2 = user.getPreferences();
            if (preferences2 != null && preferences2.getAutomaticAllocation()) {
                z10 = true;
            }
        }
        taskFormActivity.usesTaskAttributeStats = z10;
        this.this$0.configureForm();
    }
}
