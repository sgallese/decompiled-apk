package com.habitrpg.android.habitica.ui.views.social;

import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: PartySeekingListItem.kt */
/* loaded from: classes4.dex */
final class PartySeekingListItemKt$PartySeekingListItem$1 extends r implements pc.a<w> {
    final /* synthetic */ Member $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingListItemKt$PartySeekingListItem$1(Member member) {
        super(0);
        this.$user = member;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MainNavDirections.OpenProfileActivity openProfileActivity = MainNavDirections.openProfileActivity(this.$user.getId());
        q.h(openProfileActivity, "openProfileActivity(...)");
        MainNavigationController.INSTANCE.navigate(openProfileActivity);
    }
}
