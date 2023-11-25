package io.realm;

import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_inventory_CustomizationRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface j2 {
    Date realmGet$availableFrom();

    Date realmGet$availableUntil();

    String realmGet$category();

    String realmGet$customizationSet();

    String realmGet$customizationSetName();

    String realmGet$id();

    String realmGet$identifier();

    boolean realmGet$isBuyable();

    String realmGet$notes();

    Integer realmGet$price();

    Integer realmGet$setPrice();

    String realmGet$text();

    String realmGet$type();

    void realmSet$availableFrom(Date date);

    void realmSet$availableUntil(Date date);

    void realmSet$category(String str);

    void realmSet$customizationSet(String str);

    void realmSet$customizationSetName(String str);

    void realmSet$id(String str);

    void realmSet$identifier(String str);

    void realmSet$isBuyable(boolean z10);

    void realmSet$notes(String str);

    void realmSet$price(Integer num);

    void realmSet$setPrice(Integer num);

    void realmSet$text(String str);

    void realmSet$type(String str);
}
