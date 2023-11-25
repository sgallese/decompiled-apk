package io.realm;

import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.user.Outfit;

/* compiled from: com_habitrpg_android_habitica_models_user_GearRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface l6 {
    Outfit realmGet$costume();

    Outfit realmGet$equipped();

    x0<Equipment> realmGet$owned();

    void realmSet$costume(Outfit outfit);

    void realmSet$equipped(Outfit outfit);

    void realmSet$owned(x0<Equipment> x0Var);
}
