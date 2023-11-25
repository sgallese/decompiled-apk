package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: PetDetailRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class PetDetailRecyclerFragment$onViewCreated$5 extends r implements l<User, w> {
    final /* synthetic */ PetDetailRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetDetailRecyclerFragment$onViewCreated$5(PetDetailRecyclerFragment petDetailRecyclerFragment) {
        super(1);
        this.this$0 = petDetailRecyclerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        this.this$0.getAdapter().setCurrentPet(user != null ? user.getCurrentPet() : null);
    }
}
