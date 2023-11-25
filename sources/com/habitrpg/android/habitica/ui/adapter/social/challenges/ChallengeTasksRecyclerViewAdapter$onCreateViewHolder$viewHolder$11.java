package com.habitrpg.android.habitica.ui.adapter.social.challenges;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$11 extends r implements l<Task, w> {
    final /* synthetic */ ChallengeTasksRecyclerViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$11(ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter) {
        super(1);
        this.this$0 = challengeTasksRecyclerViewAdapter;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Task task) {
        invoke2(task);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task) {
        q.i(task, "task");
        l<Task, w> onTaskOpen = this.this$0.getOnTaskOpen();
        if (onTaskOpen != null) {
            onTaskOpen.invoke(task);
        }
    }
}
