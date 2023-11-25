package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.tasks.Task;

/* compiled from: HabitButtonWidgetActivity.kt */
/* loaded from: classes4.dex */
final class HabitButtonWidgetActivity$onCreate$1 extends qc.r implements pc.l<Task, dc.w> {
    final /* synthetic */ HabitButtonWidgetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitButtonWidgetActivity$onCreate$1(HabitButtonWidgetActivity habitButtonWidgetActivity) {
        super(1);
        this.this$0 = habitButtonWidgetActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Task task) {
        invoke2(task);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task) {
        qc.q.i(task, "it");
        this.this$0.taskSelected(task.getId());
    }
}
