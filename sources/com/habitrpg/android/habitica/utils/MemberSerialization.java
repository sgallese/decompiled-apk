package com.habitrpg.android.habitica.utils;

import com.google.android.gms.common.Scopes;
import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.members.MemberFlags;
import com.habitrpg.android.habitica.models.members.MemberPreferences;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import io.realm.a1;
import io.realm.o0;
import java.lang.reflect.Type;
import qc.q;
import yc.v;

/* compiled from: MemberSerialization.kt */
/* loaded from: classes4.dex */
public final class MemberSerialization implements k<Member> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public Member deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        boolean u10;
        Quest quest;
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        n i10 = lVar.i();
        String l10 = i10.x("_id").l();
        o0 Z0 = o0.Z0();
        Member member = (Member) Z0.k1(Member.class).n("id", l10).q();
        if (member == null) {
            member = new Member();
        }
        u10 = v.u(member.getId());
        if (u10) {
            q.f(l10);
            member.setId(l10);
        } else {
            a1 s02 = Z0.s0(member);
            q.h(s02, "copyFromRealm(...)");
            member = (Member) s02;
        }
        Z0.close();
        if (i10.D("flags")) {
            member.setFlags((MemberFlags) jVar.a(i10.x("flags"), MemberFlags.class));
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_STATS)) {
            member.setStats((Stats) jVar.a(i10.x(NavigationDrawerFragment.SIDEBAR_STATS), Stats.class));
        }
        if (i10.D("inbox")) {
            member.setInbox((Inbox) jVar.a(i10.x("inbox"), Inbox.class));
        }
        if (i10.D("preferences")) {
            member.setPreferences((MemberPreferences) jVar.a(i10.x("preferences"), MemberPreferences.class));
        }
        if (i10.D(Scopes.PROFILE)) {
            member.setProfile((Profile) jVar.a(i10.x(Scopes.PROFILE), Profile.class));
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_PARTY)) {
            member.setParty((UserParty) jVar.a(i10.x(NavigationDrawerFragment.SIDEBAR_PARTY), UserParty.class));
            if (member.getParty() != null) {
                UserParty party = member.getParty();
                if ((party != null ? party.getQuest() : null) != null) {
                    UserParty party2 = member.getParty();
                    Quest quest2 = party2 != null ? party2.getQuest() : null;
                    if (quest2 != null) {
                        quest2.setId(member.getId());
                    }
                    if (!i10.x(NavigationDrawerFragment.SIDEBAR_PARTY).i().x("quest").i().D("RSVPNeeded") && (quest = (Quest) Z0.k1(Quest.class).n("id", member.getId()).q()) != null && quest.isValid()) {
                        UserParty party3 = member.getParty();
                        Quest quest3 = party3 != null ? party3.getQuest() : null;
                        if (quest3 != null) {
                            quest3.setRSVPNeeded(quest.getRSVPNeeded());
                        }
                    }
                }
            }
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_ITEMS)) {
            member.setItems((Items) jVar.a(i10.x(NavigationDrawerFragment.SIDEBAR_ITEMS), Items.class));
            Items items = member.getItems();
            if (items != null) {
                items.setGear(null);
            }
            Items items2 = member.getItems();
            if (items2 != null) {
                items2.setSpecial(null);
            }
            n A = i10.A(NavigationDrawerFragment.SIDEBAR_ITEMS);
            if (A.D("currentMount") && A.x("currentMount").p()) {
                member.setCurrentMount(A.x("currentMount").l());
            }
            if (A.D("currentPet") && A.x("currentPet").p()) {
                member.setCurrentPet(A.x("currentPet").l());
            }
            if (A.D("gear")) {
                n A2 = A.A("gear");
                if (A2.D("costume")) {
                    member.setCostume((Outfit) jVar.a(A2.x("costume"), Outfit.class));
                }
                if (A2.D("equipped")) {
                    member.setEquipped((Outfit) jVar.a(A2.x("equipped"), Outfit.class));
                }
            }
        }
        if (i10.D("contributor")) {
            member.setContributor((ContributorInfo) jVar.a(i10.x("contributor"), ContributorInfo.class));
        }
        if (i10.D("backer")) {
            member.setBacker((Backer) jVar.a(i10.x("backer"), Backer.class));
        }
        if (i10.D("auth")) {
            member.setAuthentication((Authentication) jVar.a(i10.x("auth"), Authentication.class));
        }
        if (i10.D("loginIncentives")) {
            member.setLoginIncentives(i10.x("loginIncentives").g());
        }
        member.setId(member.getId());
        return member;
    }
}
