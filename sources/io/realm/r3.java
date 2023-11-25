package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestProgressCollect;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestProgressRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface r3 {
    x0<QuestProgressCollect> realmGet$collect();

    int realmGet$collectedItems();

    float realmGet$down();

    double realmGet$hp();

    String realmGet$id();

    String realmGet$key();

    double realmGet$rage();

    float realmGet$up();

    void realmSet$collect(x0<QuestProgressCollect> x0Var);

    void realmSet$collectedItems(int i10);

    void realmSet$down(float f10);

    void realmSet$hp(double d10);

    void realmSet$id(String str);

    void realmSet$key(String str);

    void realmSet$rage(double d10);

    void realmSet$up(float f10);
}
