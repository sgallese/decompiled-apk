package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestMember;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestProgressCollect;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Map;
import qc.q;

/* compiled from: QuestDeserializer.kt */
/* loaded from: classes4.dex */
public final class QuestDeserializer implements k<Quest> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public Quest deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        n i10 = lVar.i();
        Quest quest = new Quest();
        if (i10.D("progress")) {
            QuestProgress questProgress = new QuestProgress();
            questProgress.setKey(quest.getKey());
            n A = i10.A("progress");
            if (A.D("hp")) {
                questProgress.setHp(A.x("hp").e());
            }
            if (A.D("rage")) {
                questProgress.setRage(A.x("rage").e());
            }
            if (A.D("up")) {
                questProgress.setUp(A.x("up").f());
            }
            if (A.D("down")) {
                questProgress.setDown(A.x("down").f());
            }
            if (A.D("collectedItems")) {
                questProgress.setCollectedItems(A.x("collectedItems").g());
            }
            if (A.D("collect")) {
                questProgress.setCollect(new x0<>());
                for (Map.Entry<String, l> entry : A.A("collect").w()) {
                    q.f(entry);
                    String key = entry.getKey();
                    l value = entry.getValue();
                    QuestProgressCollect questProgressCollect = new QuestProgressCollect();
                    questProgressCollect.setKey(key);
                    questProgressCollect.setCount(value.g());
                    x0<QuestProgressCollect> collect = questProgress.getCollect();
                    if (collect != null) {
                        collect.add(questProgressCollect);
                    }
                }
            }
            quest.setProgress(questProgress);
        }
        if (i10.D("key") && !i10.x("key").n()) {
            String l10 = i10.x("key").l();
            q.h(l10, "getAsString(...)");
            quest.setKey(l10);
            if (i10.D("active")) {
                quest.setActive(i10.x("active").a());
            }
            if (i10.D("leader")) {
                quest.setLeader(i10.x("leader").l());
            }
            if (i10.D("RSVPNeeded")) {
                quest.setRSVPNeeded(i10.x("RSVPNeeded").a());
            }
            if (i10.D("members")) {
                x0<QuestMember> x0Var = new x0<>();
                for (Map.Entry<String, l> entry2 : i10.A("members").w()) {
                    q.f(entry2);
                    String key2 = entry2.getKey();
                    l value2 = entry2.getValue();
                    QuestMember questMember = new QuestMember();
                    questMember.setKey(key2);
                    if (value2.n()) {
                        questMember.setParticipating(null);
                    } else {
                        questMember.setParticipating(Boolean.valueOf(value2.a()));
                    }
                    x0Var.add(questMember);
                }
                quest.setMembers(x0Var);
            }
        }
        return quest;
    }
}
