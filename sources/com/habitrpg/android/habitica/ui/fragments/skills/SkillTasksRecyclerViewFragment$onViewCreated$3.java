package com.habitrpg.android.habitica.ui.fragments.skills;

import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter;
import dc.w;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: SkillTasksRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
final class SkillTasksRecyclerViewFragment$onViewCreated$3 extends r implements l<List<? extends Task>, w> {
    final /* synthetic */ SkillTasksRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillTasksRecyclerViewFragment$onViewCreated$3(SkillTasksRecyclerViewFragment skillTasksRecyclerViewFragment) {
        super(1);
        this.this$0 = skillTasksRecyclerViewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(List<? extends Task> list) {
        invoke2(list);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Task> list) {
        SkillTasksRecyclerViewAdapter adapter = this.this$0.getAdapter();
        q.f(list);
        adapter.setData(list);
    }
}
