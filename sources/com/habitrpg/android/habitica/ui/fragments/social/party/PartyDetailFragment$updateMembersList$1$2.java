package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
public final class PartyDetailFragment$updateMembersList$1$2 extends qc.r implements pc.a<w> {
    final /* synthetic */ Member $member;
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$updateMembersList$1$2(PartyDetailFragment partyDetailFragment, Member member) {
        super(0);
        this.this$0 = partyDetailFragment;
        this.$member = member;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.showSendMessageToUserDialog(this.$member.getId(), this.$member.getDisplayName());
    }
}
