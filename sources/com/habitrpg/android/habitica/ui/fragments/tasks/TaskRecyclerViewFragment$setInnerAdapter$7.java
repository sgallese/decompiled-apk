package com.habitrpg.android.habitica.ui.fragments.tasks;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$setInnerAdapter$7 extends r implements l<Task, w> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$setInnerAdapter$7(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(1);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Task task) {
        invoke2(task);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task) {
        q.i(task, "it");
        this.this$0.showBrokenChallengeDialog(task);
    }
}
