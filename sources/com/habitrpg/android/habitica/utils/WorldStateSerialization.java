package com.habitrpg.android.habitica.utils;

import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.extensions.JsonObjectExtensionsKt;
import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import qc.q;

/* compiled from: WorldStateSerialization.kt */
/* loaded from: classes4.dex */
public final class WorldStateSerialization implements k<WorldState> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public WorldState deserialize(l lVar, Type type, j jVar) {
        WorldStateEvent worldStateEvent;
        WorldState worldState = new WorldState();
        n i10 = lVar != null ? lVar.i() : null;
        if (i10 == null) {
            return worldState;
        }
        l x10 = i10.x("worldBoss");
        n i11 = x10 != null ? x10.i() : null;
        if (i11 != null) {
            if (i11.D("active") && !i11.x("active").n()) {
                worldState.setWorldBossActive(i11.x("active").a());
            }
            if (i11.D("key") && !i11.x("key").n()) {
                String l10 = i11.x("key").l();
                q.h(l10, "getAsString(...)");
                worldState.setWorldBossKey(l10);
            }
            if (i11.D("progress")) {
                QuestProgress questProgress = new QuestProgress();
                n A = i11.A("progress");
                if (A.D("hp")) {
                    questProgress.setHp(A.x("hp").e());
                }
                if (A.D("rage")) {
                    questProgress.setRage(A.x("rage").e());
                }
                worldState.setProgress(questProgress);
            }
            if (i11.D("extra")) {
                n i12 = i11.x("extra").i();
                if (i12.D("worldDmg")) {
                    n i13 = i12.x("worldDmg").i();
                    worldState.setRageStrikes(new x0<>());
                    Set<Map.Entry<String, l>> w10 = i13.w();
                    q.h(w10, "entrySet(...)");
                    Iterator<T> it = w10.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        q.f(entry);
                        String str = (String) entry.getKey();
                        l lVar2 = (l) entry.getValue();
                        q.f(str);
                        QuestRageStrike questRageStrike = new QuestRageStrike(str, lVar2.a());
                        x0<QuestRageStrike> rageStrikes = worldState.getRageStrikes();
                        if (rageStrikes != null) {
                            rageStrikes.add(questRageStrike);
                        }
                    }
                }
            }
        }
        worldState.setNpcImageSuffix(JsonObjectExtensionsKt.getAsString(i10, "npcImageSuffix"));
        try {
            if (i10.D("currentEvent")) {
                l x11 = i10.x("currentEvent");
                boolean z10 = false;
                if (x11 != null && x11.o()) {
                    z10 = true;
                }
                if (z10) {
                    n A2 = i10.A("currentEvent");
                    if (A2 != null) {
                        worldState.setCurrentEvent(jVar != null ? (WorldStateEvent) jVar.a(A2, WorldStateEvent.class) : null);
                    }
                    if (i10.D("currentEventList")) {
                        x0<WorldStateEvent> x0Var = new x0<>();
                        Iterator<l> it2 = i10.y("currentEventList").iterator();
                        while (it2.hasNext()) {
                            l next = it2.next();
                            if (jVar != null && (worldStateEvent = (WorldStateEvent) jVar.a(next, WorldStateEvent.class)) != null) {
                                x0Var.add(worldStateEvent);
                            }
                        }
                        worldState.setEvents(x0Var);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return worldState;
    }
}
