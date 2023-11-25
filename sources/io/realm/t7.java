package io.realm;

import com.habitrpg.android.habitica.models.user.AdditionalSubscriptionInfo;
import com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive;
import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_user_SubscriptionPlanRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface t7 {
    Boolean realmGet$active();

    AdditionalSubscriptionInfo realmGet$additionalData();

    SubscriptionPlanConsecutive realmGet$consecutive();

    String realmGet$customerId();

    Date realmGet$dateCreated();

    Date realmGet$dateTerminated();

    Date realmGet$dateUpdated();

    Integer realmGet$extraMonths();

    Integer realmGet$gemsBought();

    int realmGet$mysteryItemCount();

    String realmGet$ownerID();

    String realmGet$paymentMethod();

    int realmGet$perkMonthCount();

    String realmGet$planId();

    Integer realmGet$quantity();

    void realmSet$active(Boolean bool);

    void realmSet$additionalData(AdditionalSubscriptionInfo additionalSubscriptionInfo);

    void realmSet$consecutive(SubscriptionPlanConsecutive subscriptionPlanConsecutive);

    void realmSet$customerId(String str);

    void realmSet$dateCreated(Date date);

    void realmSet$dateTerminated(Date date);

    void realmSet$dateUpdated(Date date);

    void realmSet$extraMonths(Integer num);

    void realmSet$gemsBought(Integer num);

    void realmSet$mysteryItemCount(int i10);

    void realmSet$ownerID(String str);

    void realmSet$paymentMethod(String str);

    void realmSet$perkMonthCount(int i10);

    void realmSet$planId(String str);

    void realmSet$quantity(Integer num);
}
