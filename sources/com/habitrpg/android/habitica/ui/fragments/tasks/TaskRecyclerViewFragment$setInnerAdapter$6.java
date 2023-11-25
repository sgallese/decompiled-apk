package com.habitrpg.android.habitica.ui.fragments.tasks;

import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$setInnerAdapter$6 extends r implements p<Task, ChecklistItem, w> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$setInnerAdapter$6(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(2);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(Task task, ChecklistItem checklistItem) {
        invoke2(task, checklistItem);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task, ChecklistItem checklistItem) {
        q.i(task, "task");
        q.i(checklistItem, "item");
        this.this$0.scoreChecklistItem(task, checklistItem);
    }
}
