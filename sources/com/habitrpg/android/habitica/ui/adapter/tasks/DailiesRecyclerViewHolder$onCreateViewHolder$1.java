package com.habitrpg.android.habitica.ui.adapter.tasks;

import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: DailiesRecyclerViewHolder.kt */
/* loaded from: classes4.dex */
final class DailiesRecyclerViewHolder$onCreateViewHolder$1 extends r implements p<Task, TaskDirection, w> {
    final /* synthetic */ DailiesRecyclerViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailiesRecyclerViewHolder$onCreateViewHolder$1(DailiesRecyclerViewHolder dailiesRecyclerViewHolder) {
        super(2);
        this.this$0 = dailiesRecyclerViewHolder;
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
        p<Task, TaskDirection, w> taskScoreEvents = this.this$0.getTaskScoreEvents();
        if (taskScoreEvents != null) {
            taskScoreEvents.invoke(task, taskDirection);
        }
    }
}
