package io.realm;

import com.habitrpg.android.habitica.models.invitations.GuildInvite;
import com.habitrpg.android.habitica.models.invitations.PartyInvite;

/* compiled from: com_habitrpg_android_habitica_models_invitations_InvitationsRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface b4 {
    x0<GuildInvite> realmGet$guilds();

    x0<PartyInvite> realmGet$parties();

    PartyInvite realmGet$party();

    void realmSet$guilds(x0<GuildInvite> x0Var);

    void realmSet$parties(x0<PartyInvite> x0Var);

    void realmSet$party(PartyInvite partyInvite);
}
