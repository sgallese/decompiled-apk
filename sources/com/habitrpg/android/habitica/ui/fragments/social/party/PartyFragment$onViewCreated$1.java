package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.models.social.Group;
import dc.w;

/* compiled from: PartyFragment.kt */
/* loaded from: classes4.dex */
final class PartyFragment$onViewCreated$1 extends qc.r implements pc.l<Group, w> {
    final /* synthetic */ PartyFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyFragment$onViewCreated$1(PartyFragment partyFragment) {
        super(1);
        this.this$0 = partyFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Group group) {
        invoke2(group);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Group group) {
        this.this$0.updateGroupUI(group);
    }
}
