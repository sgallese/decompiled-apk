package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.shared.habitica.models.Avatar;
import dc.w;
import j0.z1;
import java.util.List;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
public final class AppHeaderViewKt$AppHeaderView$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isMyProfile;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.a<w> $onAvatarClicked;
    final /* synthetic */ pc.a<w> $onClassSelectionClicked;
    final /* synthetic */ pc.a<w> $onMemberRowClicked;
    final /* synthetic */ TeamPlan $teamPlan;
    final /* synthetic */ List<Member> $teamPlanMembers;
    final /* synthetic */ Avatar $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppHeaderViewKt$AppHeaderView$2(Avatar avatar, androidx.compose.ui.e eVar, boolean z10, TeamPlan teamPlan, List<? extends Member> list, pc.a<w> aVar, pc.a<w> aVar2, pc.a<w> aVar3, int i10, int i11) {
        super(2);
        this.$user = avatar;
        this.$modifier = eVar;
        this.$isMyProfile = z10;
        this.$teamPlan = teamPlan;
        this.$teamPlanMembers = list;
        this.$onAvatarClicked = aVar;
        this.$onMemberRowClicked = aVar2;
        this.$onClassSelectionClicked = aVar3;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        AppHeaderViewKt.AppHeaderView(this.$user, this.$modifier, this.$isMyProfile, this.$teamPlan, this.$teamPlanMembers, this.$onAvatarClicked, this.$onMemberRowClicked, this.$onClassSelectionClicked, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
