package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import yc.v;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
final class PartyInviteFragmentKt$PartyInviteView$1$1$1$4 extends qc.r implements pc.l<String, w> {
    final /* synthetic */ int $index;
    final /* synthetic */ PartyInviteViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragmentKt$PartyInviteView$1$1$1$4(PartyInviteViewModel partyInviteViewModel, int i10) {
        super(1);
        this.$viewModel = partyInviteViewModel;
        this.$index = i10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        boolean u10;
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.$viewModel.getInvites().size() - 1 == this.$index) {
            u10 = v.u(this.$viewModel.getInvites().get(this.$index));
            if (u10) {
                this.$viewModel.getInvites().add("");
            }
        }
        this.$viewModel.getInvites().set(this.$index, str);
    }
}
