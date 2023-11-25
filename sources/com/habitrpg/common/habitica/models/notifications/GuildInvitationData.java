package com.habitrpg.common.habitica.models.notifications;

/* compiled from: GuildInvitationData.kt */
/* loaded from: classes4.dex */
public class GuildInvitationData implements NotificationData {
    private GuildInvite invitation;

    public final GuildInvite getInvitation() {
        return this.invitation;
    }

    public final void setInvitation(GuildInvite guildInvite) {
        this.invitation = guildInvite;
    }
}
