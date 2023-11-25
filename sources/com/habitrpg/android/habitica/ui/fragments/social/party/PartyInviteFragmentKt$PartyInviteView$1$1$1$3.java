package com.habitrpg.android.habitica.ui.fragments.social.party;

import dc.w;
import yc.v;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
final class PartyInviteFragmentKt$PartyInviteView$1$1$1$3 extends qc.r implements pc.l<y0.o, w> {
    final /* synthetic */ int $index;
    final /* synthetic */ PartyInviteViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragmentKt$PartyInviteView$1$1$1$3(PartyInviteViewModel partyInviteViewModel, int i10) {
        super(1);
        this.$viewModel = partyInviteViewModel;
        this.$index = i10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(y0.o oVar) {
        invoke2(oVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(y0.o oVar) {
        boolean u10;
        qc.q.i(oVar, "it");
        if (oVar.isFocused() || this.$viewModel.getInvites().size() <= this.$index) {
            return;
        }
        u10 = v.u(this.$viewModel.getInvites().get(this.$index));
        if (!u10 || this.$viewModel.getInvites().size() - 1 == this.$index || this.$viewModel.getInvites().size() <= 1) {
            return;
        }
        this.$viewModel.getInvites().remove(this.$index);
    }
}
