package com.habitrpg.android.habitica.ui.views.social;

import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartySeekingListItem.kt */
/* loaded from: classes4.dex */
public final class PartySeekingListItemKt$PartySeekingListItem$3 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ LoadingButtonState $inviteState;
    final /* synthetic */ boolean $isInvited;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.l<Member, w> $onInvite;
    final /* synthetic */ boolean $showExtendedInfo;
    final /* synthetic */ boolean $showHeader;
    final /* synthetic */ Member $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartySeekingListItemKt$PartySeekingListItem$3(Member member, androidx.compose.ui.e eVar, LoadingButtonState loadingButtonState, boolean z10, boolean z11, boolean z12, pc.l<? super Member, w> lVar, int i10, int i11) {
        super(2);
        this.$user = member;
        this.$modifier = eVar;
        this.$inviteState = loadingButtonState;
        this.$isInvited = z10;
        this.$showHeader = z11;
        this.$showExtendedInfo = z12;
        this.$onInvite = lVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        PartySeekingListItemKt.PartySeekingListItem(this.$user, this.$modifier, this.$inviteState, this.$isInvited, this.$showHeader, this.$showExtendedInfo, this.$onInvite, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
