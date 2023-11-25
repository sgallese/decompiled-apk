package io.realm;

import com.habitrpg.android.habitica.models.user.OwnedCustomization;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;

/* compiled from: com_habitrpg_android_habitica_models_user_PurchasesRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface l7 {
    x0<OwnedCustomization> realmGet$customizations();

    SubscriptionPlan realmGet$plan();

    User realmGet$user();

    void realmSet$customizations(x0<OwnedCustomization> x0Var);

    void realmSet$plan(SubscriptionPlan subscriptionPlan);

    void realmSet$user(User user);
}
