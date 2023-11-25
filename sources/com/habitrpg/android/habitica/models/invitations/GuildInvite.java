package com.habitrpg.android.habitica.models.invitations;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.z3;

/* compiled from: GuildInvite.kt */
/* loaded from: classes4.dex */
public class GuildInvite extends d1 implements GenericInvitation, z3 {
    public static final int $stable = 8;

    /* renamed from: id  reason: collision with root package name */
    private String f12513id;
    private String inviter;
    private String name;
    private Boolean publicGuild;

    public GuildInvite() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GenericInvitation
    public String getId() {
        return realmGet$id();
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GenericInvitation
    public String getInviter() {
        return realmGet$inviter();
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GenericInvitation
    public String getName() {
        return realmGet$name();
    }

    public final Boolean getPublicGuild() {
        return realmGet$publicGuild();
    }

    @Override // io.realm.z3
    public String realmGet$id() {
        return this.f12513id;
    }

    @Override // io.realm.z3
    public String realmGet$inviter() {
        return this.inviter;
    }

    @Override // io.realm.z3
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.z3
    public Boolean realmGet$publicGuild() {
        return this.publicGuild;
    }

    @Override // io.realm.z3
    public void realmSet$id(String str) {
        this.f12513id = str;
    }

    @Override // io.realm.z3
    public void realmSet$inviter(String str) {
        this.inviter = str;
    }

    @Override // io.realm.z3
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // io.realm.z3
    public void realmSet$publicGuild(Boolean bool) {
        this.publicGuild = bool;
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GenericInvitation
    public void setId(String str) {
        realmSet$id(str);
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GenericInvitation
    public void setInviter(String str) {
        realmSet$inviter(str);
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GenericInvitation
    public void setName(String str) {
        realmSet$name(str);
    }

    public final void setPublicGuild(Boolean bool) {
        realmSet$publicGuild(bool);
    }
}
