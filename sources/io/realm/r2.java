package io.realm;

import com.habitrpg.android.habitica.models.inventory.ItemEvent;

/* compiled from: com_habitrpg_android_habitica_models_inventory_HatchingPotionRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface r2 {
    ItemEvent realmGet$event();

    String realmGet$key();

    Boolean realmGet$limited();

    String realmGet$notes();

    Boolean realmGet$premium();

    String realmGet$text();

    int realmGet$value();

    void realmSet$event(ItemEvent itemEvent);

    void realmSet$key(String str);

    void realmSet$limited(Boolean bool);

    void realmSet$notes(String str);

    void realmSet$premium(Boolean bool);

    void realmSet$text(String str);

    void realmSet$value(int i10);
}
