package com.habitrpg.android.habitica.models.invitations;

import com.habitrpg.android.habitica.models.BaseObject;
import ec.y;
import io.realm.b4;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.x0;
import qc.q;

/* compiled from: Invitations.kt */
/* loaded from: classes4.dex */
public class Invitations extends d1 implements BaseObject, b4 {
    public static final int $stable = 8;
    private x0<GuildInvite> guilds;
    private x0<PartyInvite> parties;
    private PartyInvite party;

    public Invitations() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final x0<GuildInvite> getGuilds() {
        return realmGet$guilds();
    }

    public final x0<PartyInvite> getParties() {
        return realmGet$parties();
    }

    public final PartyInvite getParty() {
        return realmGet$party();
    }

    @Override // io.realm.b4
    public x0 realmGet$guilds() {
        return this.guilds;
    }

    @Override // io.realm.b4
    public x0 realmGet$parties() {
        return this.parties;
    }

    @Override // io.realm.b4
    public PartyInvite realmGet$party() {
        return this.party;
    }

    @Override // io.realm.b4
    public void realmSet$guilds(x0 x0Var) {
        this.guilds = x0Var;
    }

    @Override // io.realm.b4
    public void realmSet$parties(x0 x0Var) {
        this.parties = x0Var;
    }

    @Override // io.realm.b4
    public void realmSet$party(PartyInvite partyInvite) {
        this.party = partyInvite;
    }

    public final void removeInvitation(String str) {
        String str2;
        q.i(str, "groupID");
        PartyInvite realmGet$party = realmGet$party();
        if (realmGet$party != null) {
            str2 = realmGet$party.getId();
        } else {
            str2 = null;
        }
        if (q.d(str2, str)) {
            realmSet$party(null);
        }
        x0 realmGet$guilds = realmGet$guilds();
        if (realmGet$guilds != null) {
            y.C(realmGet$guilds, new Invitations$removeInvitation$1(str));
        }
        x0 realmGet$parties = realmGet$parties();
        if (realmGet$parties != null) {
            y.C(realmGet$parties, new Invitations$removeInvitation$2(str));
        }
    }

    public final void setGuilds(x0<GuildInvite> x0Var) {
        realmSet$guilds(x0Var);
    }

    public final void setParties(x0<PartyInvite> x0Var) {
        realmSet$parties(x0Var);
    }

    public final void setParty(PartyInvite partyInvite) {
        realmSet$party(partyInvite);
    }
}
