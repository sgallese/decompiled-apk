package com.habitrpg.android.habitica.models;

import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
import fa.c;
import io.realm.d1;
import io.realm.f2;
import io.realm.internal.o;
import io.realm.x0;
import qc.q;

/* compiled from: WorldState.kt */
/* loaded from: classes4.dex */
public class WorldState extends d1 implements BaseObject, f2 {
    public static final int $stable = 8;
    private WorldStateEvent currentEvent;
    @c("currentEventList")
    private x0<WorldStateEvent> events;

    /* renamed from: id  reason: collision with root package name */
    private String f12509id;
    private String npcImageSuffix;
    private QuestProgress progress;
    private x0<QuestRageStrike> rageStrikes;
    private boolean worldBossActive;
    private String worldBossKey;

    public WorldState() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id("habitica");
        realmSet$worldBossKey("");
        realmSet$events(new x0());
    }

    public final WorldStateEvent getCurrentEvent() {
        return realmGet$currentEvent();
    }

    public final x0<WorldStateEvent> getEvents() {
        return realmGet$events();
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getNpcImageSuffix() {
        return realmGet$npcImageSuffix();
    }

    public final QuestProgress getProgress() {
        return realmGet$progress();
    }

    public final x0<QuestRageStrike> getRageStrikes() {
        return realmGet$rageStrikes();
    }

    public final boolean getWorldBossActive() {
        return realmGet$worldBossActive();
    }

    public final String getWorldBossKey() {
        return realmGet$worldBossKey();
    }

    @Override // io.realm.f2
    public WorldStateEvent realmGet$currentEvent() {
        return this.currentEvent;
    }

    @Override // io.realm.f2
    public x0 realmGet$events() {
        return this.events;
    }

    @Override // io.realm.f2
    public String realmGet$id() {
        return this.f12509id;
    }

    @Override // io.realm.f2
    public String realmGet$npcImageSuffix() {
        return this.npcImageSuffix;
    }

    @Override // io.realm.f2
    public QuestProgress realmGet$progress() {
        return this.progress;
    }

    @Override // io.realm.f2
    public x0 realmGet$rageStrikes() {
        return this.rageStrikes;
    }

    @Override // io.realm.f2
    public boolean realmGet$worldBossActive() {
        return this.worldBossActive;
    }

    @Override // io.realm.f2
    public String realmGet$worldBossKey() {
        return this.worldBossKey;
    }

    @Override // io.realm.f2
    public void realmSet$currentEvent(WorldStateEvent worldStateEvent) {
        this.currentEvent = worldStateEvent;
    }

    @Override // io.realm.f2
    public void realmSet$events(x0 x0Var) {
        this.events = x0Var;
    }

    @Override // io.realm.f2
    public void realmSet$id(String str) {
        this.f12509id = str;
    }

    @Override // io.realm.f2
    public void realmSet$npcImageSuffix(String str) {
        this.npcImageSuffix = str;
    }

    @Override // io.realm.f2
    public void realmSet$progress(QuestProgress questProgress) {
        this.progress = questProgress;
    }

    @Override // io.realm.f2
    public void realmSet$rageStrikes(x0 x0Var) {
        this.rageStrikes = x0Var;
    }

    @Override // io.realm.f2
    public void realmSet$worldBossActive(boolean z10) {
        this.worldBossActive = z10;
    }

    @Override // io.realm.f2
    public void realmSet$worldBossKey(String str) {
        this.worldBossKey = str;
    }

    public final void setCurrentEvent(WorldStateEvent worldStateEvent) {
        realmSet$currentEvent(worldStateEvent);
    }

    public final void setEvents(x0<WorldStateEvent> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$events(x0Var);
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public final void setNpcImageSuffix(String str) {
        realmSet$npcImageSuffix(str);
    }

    public final void setProgress(QuestProgress questProgress) {
        realmSet$progress(questProgress);
    }

    public final void setRageStrikes(x0<QuestRageStrike> x0Var) {
        realmSet$rageStrikes(x0Var);
    }

    public final void setWorldBossActive(boolean z10) {
        realmSet$worldBossActive(z10);
    }

    public final void setWorldBossKey(String str) {
        q.i(str, "<set-?>");
        realmSet$worldBossKey(str);
    }
}
