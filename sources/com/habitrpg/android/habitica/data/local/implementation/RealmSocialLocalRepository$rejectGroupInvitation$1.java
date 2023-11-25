package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmSocialLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmSocialLocalRepository$rejectGroupInvitation$1 extends r implements l<o0, w> {
    final /* synthetic */ String $groupID;
    final /* synthetic */ User $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmSocialLocalRepository$rejectGroupInvitation$1(User user, String str) {
        super(1);
        this.$user = user;
        this.$groupID = str;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        Invitations invitations;
        q.i(o0Var, "it");
        User user = this.$user;
        if (user == null || (invitations = user.getInvitations()) == null) {
            return;
        }
        invitations.removeInvitation(this.$groupID);
    }
}
