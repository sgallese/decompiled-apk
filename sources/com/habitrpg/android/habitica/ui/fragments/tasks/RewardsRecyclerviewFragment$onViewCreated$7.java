package com.habitrpg.android.habitica.ui.fragments.tasks;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RewardsRecyclerviewFragment.kt */
/* loaded from: classes4.dex */
final class RewardsRecyclerviewFragment$onViewCreated$7 extends r implements l<Task, w> {
    final /* synthetic */ RewardsRecyclerviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerviewFragment$onViewCreated$7(RewardsRecyclerviewFragment rewardsRecyclerviewFragment) {
        super(1);
        this.this$0 = rewardsRecyclerviewFragment;
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
