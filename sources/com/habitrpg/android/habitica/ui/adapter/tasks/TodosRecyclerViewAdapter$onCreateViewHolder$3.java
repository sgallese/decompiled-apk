package com.habitrpg.android.habitica.ui.adapter.tasks;

import android.view.View;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: TodosRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class TodosRecyclerViewAdapter$onCreateViewHolder$3 extends r implements l<dc.l<? extends Task, ? extends View>, w> {
    final /* synthetic */ TodosRecyclerViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodosRecyclerViewAdapter$onCreateViewHolder$3(TodosRecyclerViewAdapter todosRecyclerViewAdapter) {
        super(1);
        this.this$0 = todosRecyclerViewAdapter;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(dc.l<? extends Task, ? extends View> lVar) {
        invoke2(lVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(dc.l<? extends Task, ? extends View> lVar) {
        q.i(lVar, "task");
        p<Task, View, w> taskOpenEvents = this.this$0.getTaskOpenEvents();
        if (taskOpenEvents != null) {
            taskOpenEvents.invoke(lVar.c(), lVar.d());
        }
    }
}
