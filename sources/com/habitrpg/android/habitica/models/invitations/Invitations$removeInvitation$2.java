package com.habitrpg.android.habitica.models.invitations;

import pc.l;
import qc.q;
import qc.r;

/* compiled from: Invitations.kt */
/* loaded from: classes4.dex */
final class Invitations$removeInvitation$2 extends r implements l<PartyInvite, Boolean> {
    final /* synthetic */ String $groupID;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Invitations$removeInvitation$2(String str) {
        super(1);
        this.$groupID = str;
    }

    @Override // pc.l
    public final Boolean invoke(PartyInvite partyInvite) {
        return Boolean.valueOf(q.d(partyInvite.getId(), this.$groupID));
    }
}
