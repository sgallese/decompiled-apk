package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.inventory.MountDetailRecyclerAdapter;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: MountDetailRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class MountDetailRecyclerFragment$onViewCreated$4 extends r implements l<User, w> {
    final /* synthetic */ MountDetailRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MountDetailRecyclerFragment$onViewCreated$4(MountDetailRecyclerFragment mountDetailRecyclerFragment) {
        super(1);
        this.this$0 = mountDetailRecyclerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        MountDetailRecyclerAdapter adapter = this.this$0.getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.setCurrentMount(user != null ? user.getCurrentMount() : null);
    }
}
