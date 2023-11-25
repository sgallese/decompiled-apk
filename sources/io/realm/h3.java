package io.realm;

import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.inventory.QuestBoss;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import com.habitrpg.android.habitica.models.inventory.QuestColors;
import com.habitrpg.android.habitica.models.inventory.QuestDrops;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestContentRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface h3 {
    QuestBoss realmGet$boss();

    String realmGet$category();

    x0<QuestCollect> realmGet$collect();

    QuestColors realmGet$colors();

    String realmGet$completion();

    QuestDrops realmGet$drop();

    ItemEvent realmGet$event();

    boolean realmGet$isCanBuy();

    String realmGet$key();

    int realmGet$lvl();

    String realmGet$notes();

    String realmGet$previous();

    String realmGet$text();

    int realmGet$value();

    void realmSet$boss(QuestBoss questBoss);

    void realmSet$category(String str);

    void realmSet$collect(x0<QuestCollect> x0Var);

    void realmSet$colors(QuestColors questColors);

    void realmSet$completion(String str);

    void realmSet$drop(QuestDrops questDrops);

    void realmSet$event(ItemEvent itemEvent);

    void realmSet$isCanBuy(boolean z10);

    void realmSet$key(String str);

    void realmSet$lvl(int i10);

    void realmSet$notes(String str);

    void realmSet$previous(String str);

    void realmSet$text(String str);

    void realmSet$value(int i10);
}
