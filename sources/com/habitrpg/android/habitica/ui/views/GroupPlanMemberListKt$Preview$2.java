package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupPlanMemberList.kt */
/* loaded from: classes4.dex */
public final class GroupPlanMemberListKt$Preview$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Member $member;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupPlanMemberListKt$Preview$2(Member member, int i10) {
        super(2);
        this.$member = member;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        GroupPlanMemberListKt.Preview(this.$member, lVar, z1.a(this.$$changed | 1));
    }
}
