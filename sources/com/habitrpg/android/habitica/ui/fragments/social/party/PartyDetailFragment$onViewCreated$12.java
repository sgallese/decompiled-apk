package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.models.user.User;
import dc.w;

/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
final class PartyDetailFragment$onViewCreated$12 extends qc.r implements pc.l<User, w> {
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$onViewCreated$12(PartyDetailFragment partyDetailFragment) {
        super(1);
        this.this$0 = partyDetailFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        this.this$0.updateUser(user);
    }
}
