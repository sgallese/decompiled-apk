package com.habitrpg.android.habitica.ui.adapter.social.challenges;

import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: ChallengeTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$5 extends r implements p<Task, ChecklistItem, w> {
    public static final ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$5 INSTANCE = new ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$5();

    ChallengeTasksRecyclerViewAdapter$onCreateViewHolder$viewHolder$5() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task, ChecklistItem checklistItem) {
        q.i(task, "<anonymous parameter 0>");
        q.i(checklistItem, "<anonymous parameter 1>");
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(Task task, ChecklistItem checklistItem) {
        invoke2(task, checklistItem);
        return w.f13270a;
    }
}
