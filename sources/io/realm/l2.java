package io.realm;

import com.habitrpg.android.habitica.models.inventory.ItemEvent;

/* compiled from: com_habitrpg_android_habitica_models_inventory_EggRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface l2 {
    String realmGet$adjective();

    ItemEvent realmGet$event();

    String realmGet$key();

    String realmGet$mountText();

    String realmGet$notes();

    String realmGet$text();

    int realmGet$value();

    void realmSet$adjective(String str);

    void realmSet$event(ItemEvent itemEvent);

    void realmSet$key(String str);

    void realmSet$mountText(String str);

    void realmSet$notes(String str);

    void realmSet$text(String str);

    void realmSet$value(int i10);
}
