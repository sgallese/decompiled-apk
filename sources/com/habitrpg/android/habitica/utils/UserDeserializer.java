package com.habitrpg.android.habitica.utils;

import com.google.android.gms.common.Scopes;
import com.google.firebase.perf.metrics.Trace;
import com.google.gson.JsonParseException;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.habitrpg.android.habitica.extensions.JsonObjectExtensionsKt;
import com.habitrpg.android.habitica.models.PushDevice;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.ABTest;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.Permissions;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserAchievement;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import ec.u;
import io.realm.o0;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qc.q;
import s9.e;

/* compiled from: UserDeserializer.kt */
/* loaded from: classes4.dex */
public final class UserDeserializer implements k<User> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public User deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        int s10;
        x0<OwnedItem> special;
        SubscriptionPlan plan;
        Quest quest;
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        Trace e10 = e.c().e("UserDeserialize");
        q.h(e10, "newTrace(...)");
        e10.start();
        User user = new User();
        n i10 = lVar.i();
        if (i10.D("_id")) {
            user.setId(JsonObjectExtensionsKt.getAsString(i10, "_id"));
        }
        if (i10.D("_v")) {
            user.setVersionNumber(i10.x("_v").g());
        }
        if (i10.D("balance")) {
            user.setBalance(i10.x("balance").e());
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_STATS)) {
            user.setStats((Stats) jVar.a(i10.x(NavigationDrawerFragment.SIDEBAR_STATS), Stats.class));
        }
        if (i10.D("inbox")) {
            user.setInbox((Inbox) jVar.a(i10.x("inbox"), Inbox.class));
        }
        if (i10.D("permissions")) {
            user.setPermissions$Habitica_2311256681_prodRelease((Permissions) jVar.a(i10.x("permissions"), Permissions.class));
        }
        if (i10.D("preferences")) {
            user.setPreferences((Preferences) jVar.a(i10.x("preferences"), Preferences.class));
        }
        if (i10.D(Scopes.PROFILE)) {
            user.setProfile((Profile) jVar.a(i10.x(Scopes.PROFILE), Profile.class));
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_PARTY)) {
            n A = i10.A(NavigationDrawerFragment.SIDEBAR_PARTY);
            user.setParty((UserParty) jVar.a(A, UserParty.class));
            if (user.getParty() != null) {
                UserParty party = user.getParty();
                if ((party != null ? party.getQuest() : null) != null) {
                    UserParty party2 = user.getParty();
                    Quest quest2 = party2 != null ? party2.getQuest() : null;
                    if (quest2 != null) {
                        quest2.setId(user.getId());
                    }
                    if (!A.A("quest").D("RSVPNeeded") && (quest = (Quest) o0.Z0().k1(Quest.class).n("id", user.getId()).q()) != null && quest.isValid()) {
                        UserParty party3 = user.getParty();
                        Quest quest3 = party3 != null ? party3.getQuest() : null;
                        if (quest3 != null) {
                            quest3.setRSVPNeeded(quest.getRSVPNeeded());
                        }
                    }
                    if (A.A("quest").D(Task.FILTER_COMPLETED) && !A.A("quest").x(Task.FILTER_COMPLETED).n()) {
                        UserParty party4 = user.getParty();
                        Quest quest4 = party4 != null ? party4.getQuest() : null;
                        if (quest4 != null) {
                            quest4.setCompleted(i10.A(NavigationDrawerFragment.SIDEBAR_PARTY).A("quest").x(Task.FILTER_COMPLETED).l());
                        }
                    }
                }
            }
        }
        if (i10.D("purchased")) {
            user.setPurchased((Purchases) jVar.a(i10.x("purchased"), Purchases.class));
            if (i10.A("purchased").D("plan") && i10.A("purchased").A("plan").D("mysteryItems")) {
                Purchases purchased = user.getPurchased();
                SubscriptionPlan plan2 = purchased != null ? purchased.getPlan() : null;
                if (plan2 != null) {
                    plan2.setMysteryItemCount(i10.A("purchased").A("plan").y("mysteryItems").size());
                }
            }
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_ITEMS)) {
            user.setItems((Items) jVar.a(i10.x(NavigationDrawerFragment.SIDEBAR_ITEMS), Items.class));
            OwnedItem ownedItem = new OwnedItem();
            ownedItem.setItemType("special");
            ownedItem.setKey("inventory_present");
            ownedItem.setUserID(user.getId());
            Purchases purchased2 = user.getPurchased();
            ownedItem.setNumberOwned((purchased2 == null || (plan = purchased2.getPlan()) == null) ? 0 : plan.getMysteryItemCount());
            Items items = user.getItems();
            if (items != null && (special = items.getSpecial()) != null) {
                special.add(ownedItem);
            }
            Items items2 = user.getItems();
            if (items2 != null) {
                items2.setItemTypes();
            }
        }
        if (i10.D("auth")) {
            user.setAuthentication((Authentication) jVar.a(i10.x("auth"), Authentication.class));
        }
        if (i10.D("flags")) {
            user.setFlags((Flags) jVar.a(i10.x("flags"), Flags.class));
        }
        if (i10.D("contributor")) {
            user.setContributor((ContributorInfo) jVar.a(i10.x("contributor"), ContributorInfo.class));
        }
        if (i10.D("backer")) {
            user.setBacker((Backer) jVar.a(i10.x("backer"), Backer.class));
        }
        if (i10.D("invitations")) {
            user.setInvitations((Invitations) jVar.a(i10.x("invitations"), Invitations.class));
        }
        if (i10.D("tags")) {
            Object a10 = jVar.a(i10.x("tags"), new TypeToken<x0<Tag>>() { // from class: com.habitrpg.android.habitica.utils.UserDeserializer$deserialize$1
            }.getType());
            q.h(a10, "deserialize(...)");
            user.setTags((x0) a10);
            Iterator<Tag> it = user.getTags().iterator();
            while (it.hasNext()) {
                it.next().setUserId(user.getId());
            }
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS)) {
            x0<UserAchievement> x0Var = new x0<>();
            for (Map.Entry<String, l> entry : i10.A(NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS).w()) {
                if (entry.getValue().p()) {
                    UserAchievement userAchievement = new UserAchievement();
                    userAchievement.setKey(entry.getKey());
                    userAchievement.setEarned(entry.getValue().a());
                    x0Var.add(userAchievement);
                }
            }
            user.setAchievements(x0Var);
        }
        if (i10.D("tasksOrder")) {
            user.setTasksOrder((TasksOrder) jVar.a(i10.x("tasksOrder"), TasksOrder.class));
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_CHALLENGES)) {
            user.setChallenges(new x0<>());
            i y10 = i10.y(NavigationDrawerFragment.SIDEBAR_CHALLENGES);
            q.h(y10, "getAsJsonArray(...)");
            for (l lVar2 : y10) {
                x0<ChallengeMembership> challenges = user.getChallenges();
                if (challenges != null) {
                    String id2 = user.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    String l10 = lVar2.l();
                    q.h(l10, "getAsString(...)");
                    challenges.add(new ChallengeMembership(id2, l10));
                }
            }
        }
        if (i10.D("pushDevices")) {
            user.setPushDevices(new ArrayList());
            i y11 = i10.y("pushDevices");
            q.h(y11, "getAsJsonArray(...)");
            s10 = u.s(y11, 10);
            ArrayList<PushDevice> arrayList = new ArrayList(s10);
            Iterator<l> it2 = y11.iterator();
            while (it2.hasNext()) {
                arrayList.add((PushDevice) jVar.a(it2.next(), PushDevice.class));
            }
            for (PushDevice pushDevice : arrayList) {
                List<PushDevice> pushDevices = user.getPushDevices();
                ArrayList arrayList2 = pushDevices instanceof ArrayList ? (ArrayList) pushDevices : null;
                if (arrayList2 != null) {
                    arrayList2.add(pushDevice);
                }
            }
        }
        if (i10.D("lastCron")) {
            user.setLastCron((Date) jVar.a(i10.x("lastCron"), Date.class));
        }
        if (i10.D("needsCron")) {
            user.setNeedsCron(i10.x("needsCron").a());
        }
        if (i10.D(NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS)) {
            n A2 = i10.A(NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS);
            if (A2.D("streak")) {
                try {
                    user.setStreakCount(i10.A(NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS).x("streak").g());
                } catch (UnsupportedOperationException unused) {
                }
            }
            if (A2.D("quests")) {
                x0<QuestAchievement> x0Var2 = new x0<>();
                for (Map.Entry<String, l> entry2 : A2.A("quests").w()) {
                    QuestAchievement questAchievement = new QuestAchievement();
                    questAchievement.setQuestKey(entry2.getKey());
                    questAchievement.setCount(entry2.getValue().g());
                    x0Var2.add(questAchievement);
                }
                user.setQuestAchievements(x0Var2);
            }
            if (A2.D(NavigationDrawerFragment.SIDEBAR_CHALLENGES)) {
                x0<String> x0Var3 = new x0<>();
                Iterator<l> it3 = A2.y(NavigationDrawerFragment.SIDEBAR_CHALLENGES).iterator();
                while (it3.hasNext()) {
                    x0Var3.add(it3.next().l());
                }
                user.setChallengeAchievements(x0Var3);
            }
        }
        if (i10.D("_ABTests")) {
            user.setAbTests(new x0<>());
            for (Map.Entry<String, l> entry3 : i10.A("_ABTests").w()) {
                ABTest aBTest = new ABTest();
                String key = entry3.getKey();
                q.h(key, "<get-key>(...)");
                aBTest.setName(key);
                String l11 = entry3.getValue().l();
                q.h(l11, "getAsString(...)");
                aBTest.setGroup(l11);
                x0<ABTest> abTests = user.getAbTests();
                if (abTests != null) {
                    abTests.add(aBTest);
                }
            }
        }
        e10.stop();
        return user;
    }
}
