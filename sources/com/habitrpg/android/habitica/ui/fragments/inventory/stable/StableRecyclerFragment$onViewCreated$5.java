package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.inventory.StableRecyclerAdapter;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: StableRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class StableRecyclerFragment$onViewCreated$5 extends r implements l<User, w> {
    final /* synthetic */ StableRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableRecyclerFragment$onViewCreated$5(StableRecyclerFragment stableRecyclerFragment) {
        super(1);
        this.this$0 = stableRecyclerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        StableRecyclerAdapter adapter = this.this$0.getAdapter();
        if (adapter != null) {
            adapter.setCurrentPet(user != null ? user.getCurrentPet() : null);
        }
        StableRecyclerAdapter adapter2 = this.this$0.getAdapter();
        if (adapter2 == null) {
            return;
        }
        adapter2.setCurrentMount(user != null ? user.getCurrentMount() : null);
    }
}
