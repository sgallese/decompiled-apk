package io.realm;

import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;

/* compiled from: com_habitrpg_android_habitica_models_social_UserStylesRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface h5 {
    Authentication realmGet$authentication();

    double realmGet$balance();

    Flags realmGet$flags();

    Items realmGet$items();

    Preferences realmGet$preferences();

    Stats realmGet$stats();

    void realmSet$authentication(Authentication authentication);

    void realmSet$balance(double d10);

    void realmSet$flags(Flags flags);

    void realmSet$items(Items items);

    void realmSet$preferences(Preferences preferences);

    void realmSet$stats(Stats stats);
}
