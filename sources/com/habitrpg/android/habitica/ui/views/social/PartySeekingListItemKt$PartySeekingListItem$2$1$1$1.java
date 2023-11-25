package com.habitrpg.android.habitica.ui.views.social;

import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.ui.views.UsernameLabelKt;
import dc.w;
import j0.n;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartySeekingListItem.kt */
/* loaded from: classes4.dex */
public final class PartySeekingListItemKt$PartySeekingListItem$2$1$1$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ Member $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingListItemKt$PartySeekingListItem$2$1$1$1(Member member) {
        super(2);
        this.$user = member;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1638899527, i10, -1, "com.habitrpg.android.habitica.ui.views.social.PartySeekingListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PartySeekingListItem.kt:90)");
        }
        String displayName = this.$user.getDisplayName();
        ContributorInfo contributor = this.$user.getContributor();
        UsernameLabelKt.ComposableUsernameLabel(displayName, contributor != null ? contributor.getLevel() : 0, null, false, lVar, 0, 12);
        if (n.K()) {
            n.U();
        }
    }
}
