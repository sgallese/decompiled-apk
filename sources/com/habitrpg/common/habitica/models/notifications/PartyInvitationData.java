package com.habitrpg.common.habitica.models.notifications;

/* compiled from: PartyInvitationData.kt */
/* loaded from: classes4.dex */
public class PartyInvitationData implements NotificationData {
    private PartyInvite invitation;

    public final PartyInvite getInvitation() {
        return this.invitation;
    }

    public final void setInvitation(PartyInvite partyInvite) {
        this.invitation = partyInvite;
    }
}
