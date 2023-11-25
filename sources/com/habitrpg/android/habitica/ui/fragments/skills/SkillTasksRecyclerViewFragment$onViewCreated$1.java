package com.habitrpg.android.habitica.ui.fragments.skills;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: SkillTasksRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
final class SkillTasksRecyclerViewFragment$onViewCreated$1 extends r implements l<Task, w> {
    final /* synthetic */ SkillTasksRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillTasksRecyclerViewFragment$onViewCreated$1(SkillTasksRecyclerViewFragment skillTasksRecyclerViewFragment) {
        super(1);
        this.this$0 = skillTasksRecyclerViewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Task task) {
        invoke2(task);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task) {
        q.i(task, "it");
        l<Task, w> onTaskSelection = this.this$0.getOnTaskSelection();
        if (onTaskSelection != null) {
            onTaskSelection.invoke(task);
        }
    }
}
