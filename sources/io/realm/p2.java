package io.realm;

import com.habitrpg.android.habitica.models.inventory.ItemEvent;

/* compiled from: com_habitrpg_android_habitica_models_inventory_FoodRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface p2 {
    String realmGet$article();

    Boolean realmGet$canDrop();

    ItemEvent realmGet$event();

    String realmGet$key();

    String realmGet$notes();

    String realmGet$target();

    String realmGet$text();

    int realmGet$value();

    void realmSet$article(String str);

    void realmSet$canDrop(Boolean bool);

    void realmSet$event(ItemEvent itemEvent);

    void realmSet$key(String str);

    void realmSet$notes(String str);

    void realmSet$target(String str);

    void realmSet$text(String str);

    void realmSet$value(int i10);
}
