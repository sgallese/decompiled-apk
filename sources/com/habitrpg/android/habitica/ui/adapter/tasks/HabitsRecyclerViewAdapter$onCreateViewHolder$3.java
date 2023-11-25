package com.habitrpg.android.habitica.ui.adapter.tasks;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: HabitsRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class HabitsRecyclerViewAdapter$onCreateViewHolder$3 extends r implements l<Task, w> {
    final /* synthetic */ HabitsRecyclerViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitsRecyclerViewAdapter$onCreateViewHolder$3(HabitsRecyclerViewAdapter habitsRecyclerViewAdapter) {
        super(1);
        this.this$0 = habitsRecyclerViewAdapter;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Task task) {
        invoke2(task);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task) {
        q.i(task, "task");
        l<Task, w> brokenTaskEvents = this.this$0.getBrokenTaskEvents();
        if (brokenTaskEvents != null) {
            brokenTaskEvents.invoke(task);
        }
    }
}
