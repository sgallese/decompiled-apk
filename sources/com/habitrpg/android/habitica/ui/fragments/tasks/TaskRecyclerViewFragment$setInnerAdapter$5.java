package com.habitrpg.android.habitica.ui.fragments.tasks;

import android.content.Context;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$setInnerAdapter$5 extends r implements p<Task, TaskDirection, w> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$setInnerAdapter$5(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(2);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(Task task, TaskDirection taskDirection) {
        invoke2(task, taskDirection);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task, TaskDirection taskDirection) {
        q.i(task, "task");
        q.i(taskDirection, "direction");
        this.this$0.playSound(taskDirection);
        Context context = this.this$0.getContext();
        if (context != null) {
            this.this$0.getNotificationsManager().dismissTaskNotification(context, task);
        }
        this.this$0.scoreTask(task, taskDirection);
    }
}
