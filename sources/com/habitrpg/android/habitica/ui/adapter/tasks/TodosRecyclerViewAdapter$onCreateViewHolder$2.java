package com.habitrpg.android.habitica.ui.adapter.tasks;

import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: TodosRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class TodosRecyclerViewAdapter$onCreateViewHolder$2 extends r implements p<Task, ChecklistItem, w> {
    final /* synthetic */ TodosRecyclerViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodosRecyclerViewAdapter$onCreateViewHolder$2(TodosRecyclerViewAdapter todosRecyclerViewAdapter) {
        super(2);
        this.this$0 = todosRecyclerViewAdapter;
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
        p<Task, ChecklistItem, w> checklistItemScoreEvents = this.this$0.getChecklistItemScoreEvents();
        if (checklistItemScoreEvents != null) {
            checklistItemScoreEvents.invoke(task, checklistItem);
        }
    }
}
