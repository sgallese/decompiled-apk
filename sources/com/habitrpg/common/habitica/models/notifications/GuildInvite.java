package com.habitrpg.common.habitica.models.notifications;

/* compiled from: GuildInvitationData.kt */
/* loaded from: classes4.dex */
public final class GuildInvite {

    /* renamed from: id  reason: collision with root package name */
    private String f12937id;
    private String inviter;
    private String name;
    private Boolean publicGuild;

    public final String getId() {
        return this.f12937id;
    }

    public final String getInviter() {
        return this.inviter;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getPublicGuild() {
        return this.publicGuild;
    }

    public final void setId(String str) {
        this.f12937id = str;
    }

    public final void setInviter(String str) {
        this.inviter = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPublicGuild(Boolean bool) {
        this.publicGuild = bool;
    }
}
