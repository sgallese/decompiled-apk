package io.realm;

import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.shops.ShopItemUnlockCondition;

/* compiled from: com_habitrpg_android_habitica_models_shops_ShopItemRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface l4 {
    String realmGet$categoryIdentifier();

    String realmGet$currency();

    ItemEvent realmGet$event();

    String realmGet$habitClass();

    String realmGet$imageName();

    boolean realmGet$isLimited();

    String realmGet$isSuggested();

    String realmGet$key();

    Integer realmGet$level();

    Integer realmGet$limitedNumberLeft();

    boolean realmGet$locked();

    String realmGet$notes();

    String realmGet$path();

    String realmGet$pinType();

    String realmGet$previous();

    String realmGet$purchaseType();

    x0<String> realmGet$setImageNames();

    String realmGet$text();

    ShopItemUnlockCondition realmGet$unlockCondition();

    String realmGet$unlockPath();

    int realmGet$value();

    void realmSet$categoryIdentifier(String str);

    void realmSet$currency(String str);

    void realmSet$event(ItemEvent itemEvent);

    void realmSet$habitClass(String str);

    void realmSet$imageName(String str);

    void realmSet$isLimited(boolean z10);

    void realmSet$isSuggested(String str);

    void realmSet$key(String str);

    void realmSet$level(Integer num);

    void realmSet$limitedNumberLeft(Integer num);

    void realmSet$locked(boolean z10);

    void realmSet$notes(String str);

    void realmSet$path(String str);

    void realmSet$pinType(String str);

    void realmSet$previous(String str);

    void realmSet$purchaseType(String str);

    void realmSet$setImageNames(x0<String> x0Var);

    void realmSet$text(String str);

    void realmSet$unlockCondition(ShopItemUnlockCondition shopItemUnlockCondition);

    void realmSet$unlockPath(String str);

    void realmSet$value(int i10);
}
