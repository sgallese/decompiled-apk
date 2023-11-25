package com.habitrpg.android.habitica.ui.views.social;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import qc.r;

/* compiled from: PartySeekingListItem.kt */
/* loaded from: classes4.dex */
final class PartySeekingListItemKt$PartySeekingListItem$2$2 extends r implements pc.a<w> {
    final /* synthetic */ pc.l<Member, w> $onInvite;
    final /* synthetic */ Member $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartySeekingListItemKt$PartySeekingListItem$2$2(pc.l<? super Member, w> lVar, Member member) {
        super(0);
        this.$onInvite = lVar;
        this.$user = member;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onInvite.invoke(this.$user);
    }
}
