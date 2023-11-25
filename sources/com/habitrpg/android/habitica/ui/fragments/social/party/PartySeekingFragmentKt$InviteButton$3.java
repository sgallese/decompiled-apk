package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import dc.w;
import j0.z1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
public final class PartySeekingFragmentKt$InviteButton$3 extends qc.r implements pc.p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isAlreadyInvited;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.a<w> $onClick;
    final /* synthetic */ LoadingButtonState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingFragmentKt$InviteButton$3(LoadingButtonState loadingButtonState, pc.a<w> aVar, androidx.compose.ui.e eVar, boolean z10, int i10, int i11) {
        super(2);
        this.$state = loadingButtonState;
        this.$onClick = aVar;
        this.$modifier = eVar;
        this.$isAlreadyInvited = z10;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        PartySeekingFragmentKt.InviteButton(this.$state, this.$onClick, this.$modifier, this.$isAlreadyInvited, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
