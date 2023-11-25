package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
/* loaded from: classes4.dex */
public final class GroupViewModel$rescindInvite$1 extends r implements l<Throwable, w> {
    final /* synthetic */ Member $invitedMember;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$rescindInvite$1(GroupViewModel groupViewModel, Member member) {
        super(1);
        this.this$0 = groupViewModel;
        this.$invitedMember = member;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        q.i(th, "it");
        this.this$0.getPendingInviteStates().put(this.$invitedMember.getId(), LoadingButtonState.FAILED);
    }
}
