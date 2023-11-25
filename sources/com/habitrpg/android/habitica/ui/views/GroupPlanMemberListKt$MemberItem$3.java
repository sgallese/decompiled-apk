package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupPlanMemberList.kt */
/* loaded from: classes4.dex */
public final class GroupPlanMemberListKt$MemberItem$3 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Member $member;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.l<String, w> $onMemberClicked;
    final /* synthetic */ String $role;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupPlanMemberListKt$MemberItem$3(Member member, String str, pc.l<? super String, w> lVar, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$member = member;
        this.$role = str;
        this.$onMemberClicked = lVar;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        GroupPlanMemberListKt.MemberItem(this.$member, this.$role, this.$onMemberClicked, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
