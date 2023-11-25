package com.habitrpg.android.habitica.ui.adapter.tasks;

import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: RewardsRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class RewardsRecyclerViewAdapter$onCreateViewHolder$1 extends r implements p<Task, TaskDirection, w> {
    final /* synthetic */ RewardsRecyclerViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerViewAdapter$onCreateViewHolder$1(RewardsRecyclerViewAdapter rewardsRecyclerViewAdapter) {
        super(2);
        this.this$0 = rewardsRecyclerViewAdapter;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(Task task, TaskDirection taskDirection) {
        invoke2(task, taskDirection);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task, TaskDirection taskDirection) {
        p<Task, TaskDirection, w> taskScoreEvents;
        Stats stats;
        Double gp;
        q.i(task, "task");
        q.i(taskDirection, "direction");
        double value = task.getValue();
        User user = this.this$0.getUser();
        if (value > ((user == null || (stats = user.getStats()) == null || (gp = stats.getGp()) == null) ? 0.0d : gp.doubleValue()) || (taskScoreEvents = this.this$0.getTaskScoreEvents()) == null) {
            return;
        }
        taskScoreEvents.invoke(task, taskDirection);
    }
}
