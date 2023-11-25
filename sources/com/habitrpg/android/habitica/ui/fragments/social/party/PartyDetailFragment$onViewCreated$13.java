package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import java.util.List;

/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
final class PartyDetailFragment$onViewCreated$13 extends qc.r implements pc.l<List<? extends Member>, w> {
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$onViewCreated$13(PartyDetailFragment partyDetailFragment) {
        super(1);
        this.this$0 = partyDetailFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(List<? extends Member> list) {
        invoke2(list);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Member> list) {
        this.this$0.updateMembersList(list);
    }
}
