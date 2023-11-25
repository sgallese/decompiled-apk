package com.habitrpg.android.habitica.models.invitations;

import io.realm.d1;
import io.realm.d4;
import io.realm.internal.o;

/* compiled from: PartyInvite.kt */
/* loaded from: classes4.dex */
public class PartyInvite extends d1 implements GenericInvitation, d4 {
    public static final int $stable = 8;

    /* renamed from: id  reason: collision with root package name */
    private String f12514id;
    private String inviter;
    private String name;

    public PartyInvite() {
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

    @Override // io.realm.d4
    public String realmGet$id() {
        return this.f12514id;
    }

    @Override // io.realm.d4
    public String realmGet$inviter() {
        return this.inviter;
    }

    @Override // io.realm.d4
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.d4
    public void realmSet$id(String str) {
        this.f12514id = str;
    }

    @Override // io.realm.d4
    public void realmSet$inviter(String str) {
        this.inviter = str;
    }

    @Override // io.realm.d4
    public void realmSet$name(String str) {
        this.name = str;
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
}
