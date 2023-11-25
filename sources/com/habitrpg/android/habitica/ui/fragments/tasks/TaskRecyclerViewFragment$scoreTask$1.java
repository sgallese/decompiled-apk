package com.habitrpg.android.habitica.ui.fragments.tasks;

import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$scoreTask$1 extends r implements p<TaskScoringResult, Integer, w> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$scoreTask$1(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(2);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(TaskScoringResult taskScoringResult, Integer num) {
        invoke(taskScoringResult, num.intValue());
        return w.f13270a;
    }

    public final void invoke(TaskScoringResult taskScoringResult, int i10) {
        q.i(taskScoringResult, "result");
        this.this$0.handleTaskResult(taskScoringResult, i10);
    }
}
