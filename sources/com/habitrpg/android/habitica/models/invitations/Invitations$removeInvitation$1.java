package com.habitrpg.android.habitica.models.invitations;

import pc.l;
import qc.q;
import qc.r;

/* compiled from: Invitations.kt */
/* loaded from: classes4.dex */
final class Invitations$removeInvitation$1 extends r implements l<GuildInvite, Boolean> {
    final /* synthetic */ String $groupID;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Invitations$removeInvitation$1(String str) {
        super(1);
        this.$groupID = str;
    }

    @Override // pc.l
    public final Boolean invoke(GuildInvite guildInvite) {
        return Boolean.valueOf(q.d(guildInvite.getId(), this.$groupID));
    }
}
