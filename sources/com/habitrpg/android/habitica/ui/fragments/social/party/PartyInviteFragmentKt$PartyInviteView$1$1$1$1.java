package com.habitrpg.android.habitica.ui.fragments.social.party;

import dc.w;
import yc.v;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
final class PartyInviteFragmentKt$PartyInviteView$1$1$1$1 extends qc.r implements pc.a<w> {
    final /* synthetic */ int $index;
    final /* synthetic */ PartyInviteViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragmentKt$PartyInviteView$1$1$1$1(PartyInviteViewModel partyInviteViewModel, int i10) {
        super(0);
        this.$viewModel = partyInviteViewModel;
        this.$index = i10;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean u10;
        if (this.$viewModel.getInvites().size() - 1 >= this.$index) {
            u10 = v.u(this.$viewModel.getInvites().get(this.$index));
            if ((!u10) == true) {
                this.$viewModel.getInvites().remove(this.$index);
            }
        }
    }
}
