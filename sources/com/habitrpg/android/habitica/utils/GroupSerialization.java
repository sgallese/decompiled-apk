package com.habitrpg.android.habitica.utils;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonParseException;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.GroupCategory;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import io.realm.o0;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: GroupSerialization.kt */
/* loaded from: classes4.dex */
public final class GroupSerialization implements k<Group>, q<Group> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // com.google.gson.k
    public Group deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        x0<String> managers;
        qc.q.i(lVar, "json");
        qc.q.i(type, "typeOfT");
        qc.q.i(jVar, "context");
        Group group = new Group();
        n i10 = lVar.i();
        String l10 = i10.x("_id").l();
        qc.q.h(l10, "getAsString(...)");
        group.setId(l10);
        group.setName(i10.x(AppMeasurementSdk.ConditionalUserProperty.NAME).l());
        if (i10.D("description") && !i10.x("description").n()) {
            group.setDescription(i10.x("description").l());
        }
        if (i10.D("summary") && !i10.x("summary").n()) {
            group.setSummary(i10.x("summary").l());
        }
        if (i10.D("leaderMessage") && !i10.x("leaderMessage").n()) {
            group.setLeaderMessage(i10.x("leaderMessage").l());
        }
        if (i10.D("privacy")) {
            group.setPrivacy(i10.x("privacy").l());
        }
        if (i10.D("memberCount")) {
            group.setMemberCount(i10.x("memberCount").g());
        }
        if (i10.D("balance")) {
            group.setBalance(i10.x("balance").e());
        }
        if (i10.D("logo") && !i10.x("logo").n()) {
            group.setLogo(i10.x("logo").l());
        }
        if (i10.D(TaskFormActivity.TASK_TYPE_KEY)) {
            group.setType(i10.x(TaskFormActivity.TASK_TYPE_KEY).l());
        }
        if (i10.D("leader")) {
            if (i10.x("leader").p()) {
                group.setLeaderID(i10.x("leader").l());
            } else {
                n i11 = i10.x("leader").i();
                group.setLeaderID(i11.x("_id").l());
                if (i11.D(Scopes.PROFILE) && !i11.x(Scopes.PROFILE).n() && i11.x(Scopes.PROFILE).i().D(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    group.setLeaderName(i11.x(Scopes.PROFILE).i().x(AppMeasurementSdk.ConditionalUserProperty.NAME).l());
                }
            }
        }
        if (i10.D("managers")) {
            group.setManagers(new x0<>());
            for (Map.Entry<String, l> entry : i10.A("managers").w()) {
                if (entry.getValue().a() && (managers = group.getManagers()) != null) {
                    managers.add(entry.getKey());
                }
            }
        }
        if (i10.D("quest")) {
            group.setQuest((Quest) jVar.a(i10.x("quest"), new TypeToken<Quest>() { // from class: com.habitrpg.android.habitica.utils.GroupSerialization$deserialize$1
            }.getType()));
            Quest quest = group.getQuest();
            if (quest != null) {
                quest.setId(group.getId());
            }
            n A = i10.A("quest");
            if (A.D("members")) {
                n A2 = i10.A("quest").A("members");
                o0 Z0 = o0.Z0();
                List<Member> z02 = Z0.z0(Z0.k1(Member.class).n("party.id", group.getId()).p());
                Z0.close();
                qc.q.f(z02);
                for (Member member : z02) {
                    if (A2.D(member.getId())) {
                        l x10 = A2.x(member.getId());
                        if (x10.n()) {
                            member.setParticipatesInQuest(null);
                        } else {
                            member.setParticipatesInQuest(Boolean.valueOf(x10.a()));
                        }
                    } else {
                        member.setParticipatesInQuest(null);
                    }
                    A2.F(member.getId());
                }
                Set<Map.Entry<String, l>> w10 = A2.w();
                qc.q.h(w10, "entrySet(...)");
                Iterator<T> it = w10.iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    qc.q.f(entry2);
                    String str = (String) entry2.getKey();
                    l lVar2 = (l) entry2.getValue();
                    Member member2 = new Member();
                    qc.q.f(str);
                    member2.setId(str);
                    if (!lVar2.n()) {
                        member2.setParticipatesInQuest(Boolean.valueOf(lVar2.a()));
                    }
                    z02.add(member2);
                }
                x0<Member> x0Var = new x0<>();
                x0Var.addAll(z02);
                Quest quest2 = group.getQuest();
                if (quest2 != null) {
                    quest2.setParticipants(x0Var);
                }
            }
            if (A.D("extra") && A.x("extra").i().D("worldDmg")) {
                Set<Map.Entry<String, l>> w11 = A.A("extra").A("worldDmg").w();
                qc.q.h(w11, "entrySet(...)");
                Iterator<T> it2 = w11.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it2.next();
                    qc.q.f(entry3);
                    String str2 = (String) entry3.getKey();
                    l lVar3 = (l) entry3.getValue();
                    qc.q.f(str2);
                    QuestRageStrike questRageStrike = new QuestRageStrike(str2, lVar3.a());
                    Quest quest3 = group.getQuest();
                    if (quest3 != null) {
                        quest3.addRageStrike(questRageStrike);
                    }
                }
            }
        }
        if (i10.D("leaderOnly")) {
            n A3 = i10.A("leaderOnly");
            if (A3.D(NavigationDrawerFragment.SIDEBAR_CHALLENGES)) {
                group.setLeaderOnlyChallenges(A3.x(NavigationDrawerFragment.SIDEBAR_CHALLENGES).a());
            }
            if (A3.D("getGems")) {
                group.setLeaderOnlyGetGems(A3.x("getGems").a());
            }
        }
        if (i10.D("tasksOrder")) {
            group.setTasksOrder((TasksOrder) jVar.a(i10.x("tasksOrder"), TasksOrder.class));
        }
        if (i10.D("categories")) {
            group.setCategories(new x0<>());
            i y10 = i10.y("categories");
            qc.q.h(y10, "getAsJsonArray(...)");
            for (l lVar4 : y10) {
                x0<GroupCategory> categories = group.getCategories();
                if (categories != null) {
                    categories.add(jVar.a(lVar4, GroupCategory.class));
                }
            }
        }
        return group;
    }

    @Override // com.google.gson.q
    public l serialize(Group group, Type type, p pVar) {
        qc.q.i(group, "src");
        qc.q.i(type, "typeOfSrc");
        qc.q.i(pVar, "context");
        n nVar = new n();
        nVar.u(AppMeasurementSdk.ConditionalUserProperty.NAME, group.getName());
        nVar.u("description", group.getDescription());
        nVar.u("summary", group.getSummary());
        nVar.u("logo", group.getLogo());
        nVar.u(TaskFormActivity.TASK_TYPE_KEY, group.getType());
        nVar.u(TaskFormActivity.TASK_TYPE_KEY, group.getType());
        nVar.u("leader", group.getLeaderID());
        n nVar2 = new n();
        nVar2.s(NavigationDrawerFragment.SIDEBAR_CHALLENGES, Boolean.valueOf(group.getLeaderOnlyChallenges()));
        nVar2.s("getGems", Boolean.valueOf(group.getLeaderOnlyGetGems()));
        nVar.r("leaderOnly", nVar2);
        return nVar;
    }
}
