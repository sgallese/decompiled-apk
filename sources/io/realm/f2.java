package io.realm;

import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;

/* compiled from: com_habitrpg_android_habitica_models_WorldStateRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface f2 {
    WorldStateEvent realmGet$currentEvent();

    x0<WorldStateEvent> realmGet$events();

    String realmGet$id();

    String realmGet$npcImageSuffix();

    QuestProgress realmGet$progress();

    x0<QuestRageStrike> realmGet$rageStrikes();

    boolean realmGet$worldBossActive();

    String realmGet$worldBossKey();

    void realmSet$currentEvent(WorldStateEvent worldStateEvent);

    void realmSet$events(x0<WorldStateEvent> x0Var);

    void realmSet$id(String str);

    void realmSet$npcImageSuffix(String str);

    void realmSet$progress(QuestProgress questProgress);

    void realmSet$rageStrikes(x0<QuestRageStrike> x0Var);

    void realmSet$worldBossActive(boolean z10);

    void realmSet$worldBossKey(String str);
}
