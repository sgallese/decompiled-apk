package com.habitrpg.android.habitica.ui.fragments.tasks;

import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.tasks.RewardsRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: RewardsRecyclerviewFragment.kt */
/* loaded from: classes4.dex */
final class RewardsRecyclerviewFragment$onViewCreated$8 extends r implements l<User, w> {
    final /* synthetic */ RewardsRecyclerviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerviewFragment$onViewCreated$8(RewardsRecyclerviewFragment rewardsRecyclerviewFragment) {
        super(1);
        this.this$0 = rewardsRecyclerviewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        TaskRecyclerViewAdapter recyclerAdapter = this.this$0.getRecyclerAdapter();
        RewardsRecyclerViewAdapter rewardsRecyclerViewAdapter = recyclerAdapter instanceof RewardsRecyclerViewAdapter ? (RewardsRecyclerViewAdapter) recyclerAdapter : null;
        if (rewardsRecyclerViewAdapter == null) {
            return;
        }
        rewardsRecyclerViewAdapter.setUser(user);
    }
}
