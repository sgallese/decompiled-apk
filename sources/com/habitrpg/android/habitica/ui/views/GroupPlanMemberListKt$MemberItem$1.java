package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import qc.r;

/* compiled from: GroupPlanMemberList.kt */
/* loaded from: classes4.dex */
final class GroupPlanMemberListKt$MemberItem$1 extends r implements pc.a<w> {
    final /* synthetic */ Member $member;
    final /* synthetic */ pc.l<String, w> $onMemberClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupPlanMemberListKt$MemberItem$1(Member member, pc.l<? super String, w> lVar) {
        super(0);
        this.$member = member;
        this.$onMemberClicked = lVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String id2 = this.$member.getId();
        if (id2 != null) {
            this.$onMemberClicked.invoke(id2);
        }
    }
}
