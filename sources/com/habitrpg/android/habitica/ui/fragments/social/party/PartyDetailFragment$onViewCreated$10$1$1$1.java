package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
public final class PartyDetailFragment$onViewCreated$10$1$1$1 extends qc.r implements pc.l<Member, w> {
    final /* synthetic */ Member $invitedMember;
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$onViewCreated$10$1$1$1(PartyDetailFragment partyDetailFragment, Member member) {
        super(1);
        this.this$0 = partyDetailFragment;
        this.$invitedMember = member;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Member member) {
        invoke2(member);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Member member) {
        qc.q.i(member, "it");
        this.this$0.getViewModel().rescindInvite(this.$invitedMember);
    }
}
