package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import dc.w;
import j0.z1;
import java.util.List;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupPlanMemberList.kt */
/* loaded from: classes4.dex */
public final class GroupPlanMemberListKt$GroupPlanMemberList$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Group $group;
    final /* synthetic */ List<Member> $members;
    final /* synthetic */ pc.l<String, w> $onMemberClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupPlanMemberListKt$GroupPlanMemberList$2(List<? extends Member> list, Group group, pc.l<? super String, w> lVar, int i10) {
        super(2);
        this.$members = list;
        this.$group = group;
        this.$onMemberClicked = lVar;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        GroupPlanMemberListKt.GroupPlanMemberList(this.$members, this.$group, this.$onMemberClicked, lVar, z1.a(this.$$changed | 1));
    }
}
