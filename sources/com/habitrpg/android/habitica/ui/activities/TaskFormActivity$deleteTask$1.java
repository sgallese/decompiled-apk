package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
public final class TaskFormActivity$deleteTask$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$deleteTask$1(TaskFormActivity taskFormActivity) {
        super(2);
        this.this$0 = taskFormActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        Task task;
        Task task2;
        String id2;
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        task = this.this$0.task;
        boolean z10 = false;
        if (task != null && task.isValid()) {
            z10 = true;
        }
        if (z10) {
            task2 = this.this$0.task;
            if (task2 != null && (id2 = task2.getId()) != null) {
                TaskFormActivity taskFormActivity = this.this$0;
                ad.i.d(androidx.lifecycle.w.a(taskFormActivity), ad.a1.c(), null, new TaskFormActivity$deleteTask$1$1$1(taskFormActivity, id2, null), 2, null);
            }
            this.this$0.finish();
        }
    }
}
