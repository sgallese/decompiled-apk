package com.habitrpg.android.habitica.ui.fragments.social.party;

import dc.w;
import j0.z1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
public final class PartyInviteFragmentKt$PartyInviteView$2 extends qc.r implements pc.p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ pc.a<w> $dismiss;
    final /* synthetic */ PartyInviteViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragmentKt$PartyInviteView$2(PartyInviteViewModel partyInviteViewModel, pc.a<w> aVar, int i10) {
        super(2);
        this.$viewModel = partyInviteViewModel;
        this.$dismiss = aVar;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        PartyInviteFragmentKt.PartyInviteView(this.$viewModel, this.$dismiss, lVar, z1.a(this.$$changed | 1));
    }
}
