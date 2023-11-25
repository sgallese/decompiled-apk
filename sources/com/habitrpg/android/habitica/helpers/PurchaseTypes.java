package com.habitrpg.android.habitica.helpers;

import ec.t;
import java.util.List;
import qc.q;

/* compiled from: PurchaseTypes.kt */
/* loaded from: classes4.dex */
public final class PurchaseTypes {
    public static final int $stable;
    public static final PurchaseTypes INSTANCE = new PurchaseTypes();
    public static final String JubilantGrphatrice = "com.habitrpg.android.habitica.iap.pets.gryphatrice_jubilant";
    public static final String Purchase21Gems = "com.habitrpg.android.habitica.iap.21gems";
    public static final String Purchase42Gems = "com.habitrpg.android.habitica.iap.42gems";
    public static final String Purchase4Gems = "com.habitrpg.android.habitica.iap.4gems";
    public static final String Purchase84Gems = "com.habitrpg.android.habitica.iap.84gems";
    public static final String Subscription12Month = "com.habitrpg.android.habitica.subscription.12month";
    public static final String Subscription12MonthNoRenew = "com.habitrpg.android.habitica.norenew_subscription.12month";
    public static final String Subscription1Month = "com.habitrpg.android.habitica.subscription.1month";
    public static final String Subscription1MonthNoRenew = "com.habitrpg.android.habitica.norenew_subscription.1month";
    public static final String Subscription3Month = "com.habitrpg.android.habitica.subscription.3month";
    public static final String Subscription3MonthNoRenew = "com.habitrpg.android.habitica.norenew_subscription.3month";
    public static final String Subscription6Month = "com.habitrpg.android.habitica.subscription.6month";
    public static final String Subscription6MonthNoRenew = "com.habitrpg.android.habitica.norenew_subscription.6month";
    private static final List<String> allGemTypes;
    private static List<String> allSubscriptionNoRenewTypes;
    private static final List<String> allSubscriptionTypes;

    static {
        List<String> l10;
        List<String> n10;
        List<String> l11;
        l10 = t.l(Purchase4Gems, Purchase21Gems, Purchase42Gems, Purchase84Gems);
        allGemTypes = l10;
        n10 = t.n(Subscription1Month, Subscription3Month, Subscription6Month, Subscription12Month);
        allSubscriptionTypes = n10;
        l11 = t.l(Subscription1MonthNoRenew, Subscription3MonthNoRenew, Subscription6MonthNoRenew, Subscription12MonthNoRenew);
        allSubscriptionNoRenewTypes = l11;
        $stable = 8;
    }

    private PurchaseTypes() {
    }

    public final List<String> getAllGemTypes() {
        return allGemTypes;
    }

    public final List<String> getAllSubscriptionNoRenewTypes() {
        return allSubscriptionNoRenewTypes;
    }

    public final List<String> getAllSubscriptionTypes() {
        return allSubscriptionTypes;
    }

    public final void setAllSubscriptionNoRenewTypes(List<String> list) {
        q.i(list, "<set-?>");
        allSubscriptionNoRenewTypes = list;
    }
}
