package io.realm;

import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_user_ItemsRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface t6 {
    String realmGet$currentMount();

    String realmGet$currentPet();

    x0<OwnedItem> realmGet$eggs();

    x0<OwnedItem> realmGet$food();

    Gear realmGet$gear();

    x0<OwnedItem> realmGet$hatchingPotions();

    int realmGet$lastDropCount();

    Date realmGet$lastDropDate();

    x0<OwnedMount> realmGet$mounts();

    x0<OwnedPet> realmGet$pets();

    x0<OwnedItem> realmGet$quests();

    x0<OwnedItem> realmGet$special();

    void realmSet$currentMount(String str);

    void realmSet$currentPet(String str);

    void realmSet$eggs(x0<OwnedItem> x0Var);

    void realmSet$food(x0<OwnedItem> x0Var);

    void realmSet$gear(Gear gear);

    void realmSet$hatchingPotions(x0<OwnedItem> x0Var);

    void realmSet$lastDropCount(int i10);

    void realmSet$lastDropDate(Date date);

    void realmSet$mounts(x0<OwnedMount> x0Var);

    void realmSet$pets(x0<OwnedPet> x0Var);

    void realmSet$quests(x0<OwnedItem> x0Var);

    void realmSet$special(x0<OwnedItem> x0Var);
}
