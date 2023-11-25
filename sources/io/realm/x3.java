package io.realm;

import com.habitrpg.android.habitica.models.inventory.ItemEvent;

/* compiled from: com_habitrpg_android_habitica_models_inventory_SpecialItemRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface x3 {
    ItemEvent realmGet$event();

    boolean realmGet$isMysteryItem();

    String realmGet$key();

    String realmGet$notes();

    String realmGet$target();

    String realmGet$text();

    int realmGet$value();

    void realmSet$event(ItemEvent itemEvent);

    void realmSet$isMysteryItem(boolean z10);

    void realmSet$key(String str);

    void realmSet$notes(String str);

    void realmSet$target(String str);

    void realmSet$text(String str);

    void realmSet$value(int i10);
}
