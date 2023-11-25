package com.habitrpg.android.habitica.ui.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.android.billingclient.api.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityGiftSubscriptionBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.helpers.PurchaseTypes;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionOptionView;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import java.util.Iterator;
import java.util.List;

/* compiled from: GiftSubscriptionActivity.kt */
/* loaded from: classes4.dex */
public final class GiftSubscriptionActivity extends Hilt_GiftSubscriptionActivity {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private ActivityGiftSubscriptionBinding binding;
    private String giftedUserID;
    private String giftedUsername;
    public PurchaseHandler purchaseHandler;
    private com.android.billingclient.api.e selectedSubscriptionSku;
    private List<com.android.billingclient.api.e> skus;
    public SocialRepository socialRepository;

    public GiftSubscriptionActivity() {
        List<com.android.billingclient.api.e> i10;
        i10 = ec.t.i();
        this.skus = i10;
    }

    private final SubscriptionOptionView buttonForSku(com.android.billingclient.api.e eVar) {
        return buttonForSku(eVar != null ? eVar.b() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(GiftSubscriptionActivity giftSubscriptionActivity, View view) {
        qc.q.i(giftSubscriptionActivity, "this$0");
        com.android.billingclient.api.e eVar = giftSubscriptionActivity.selectedSubscriptionSku;
        if (eVar != null) {
            giftSubscriptionActivity.purchaseSubscription(eVar);
        }
    }

    private final void purchaseSubscription(com.android.billingclient.api.e eVar) {
        boolean z10;
        String str = this.giftedUserID;
        if (str != null) {
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            PurchaseHandler.Companion companion = PurchaseHandler.Companion;
            String b10 = eVar.b();
            qc.q.h(b10, "getProductId(...)");
            String str2 = this.giftedUsername;
            if (str2 == null) {
                str2 = str;
            }
            companion.addGift(b10, str, str2);
            PurchaseHandler.purchase$default(getPurchaseHandler(), this, eVar, null, null, false, 28, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectSubscription(com.android.billingclient.api.e eVar) {
        Iterator<com.android.billingclient.api.e> it = this.skus.iterator();
        while (it.hasNext()) {
            SubscriptionOptionView buttonForSku = buttonForSku(it.next());
            if (buttonForSku != null) {
                buttonForSku.setIsSelected(false);
            }
        }
        this.selectedSubscriptionSku = eVar;
        SubscriptionOptionView buttonForSku2 = buttonForSku(eVar);
        if (buttonForSku2 != null) {
            buttonForSku2.setIsSelected(true);
        }
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding = this.binding;
        if (activityGiftSubscriptionBinding == null) {
            qc.q.z("binding");
            activityGiftSubscriptionBinding = null;
        }
        activityGiftSubscriptionBinding.subscriptionButton.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonLabel(final com.android.billingclient.api.e eVar) {
        String str;
        SubscriptionOptionView buttonForSku = buttonForSku(eVar);
        if (buttonForSku != null) {
            e.a a10 = eVar.a();
            if (a10 == null || (str = a10.a()) == null) {
                str = "";
            }
            buttonForSku.setPriceText(str);
            buttonForSku.setSku(eVar.b());
            buttonForSku.setOnPurchaseClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GiftSubscriptionActivity.updateButtonLabel$lambda$2(GiftSubscriptionActivity.this, eVar, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateButtonLabel$lambda$2(GiftSubscriptionActivity giftSubscriptionActivity, com.android.billingclient.api.e eVar, View view) {
        qc.q.i(giftSubscriptionActivity, "this$0");
        qc.q.i(eVar, "$sku");
        giftSubscriptionActivity.selectSubscription(eVar);
    }

    public final AppConfigManager getAppConfigManager() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("appConfigManager");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityGiftSubscriptionBinding inflate = ActivityGiftSubscriptionBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        LinearLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_gift_subscription);
    }

    public final PurchaseHandler getPurchaseHandler() {
        PurchaseHandler purchaseHandler = this.purchaseHandler;
        if (purchaseHandler != null) {
            return purchaseHandler;
        }
        qc.q.z("purchaseHandler");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTitle(R.string.gift_subscription);
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding = this.binding;
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding2 = null;
        if (activityGiftSubscriptionBinding == null) {
            qc.q.z("binding");
            activityGiftSubscriptionBinding = null;
        }
        setSupportActionBar(activityGiftSubscriptionBinding.toolbar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.u(true);
        }
        this.giftedUserID = getIntent().getStringExtra("userID");
        String stringExtra = getIntent().getStringExtra("username");
        this.giftedUsername = stringExtra;
        if (this.giftedUserID == null && stringExtra == null) {
            this.giftedUserID = ((GiftSubscriptionActivityArgs) new k3.g(qc.g0.b(GiftSubscriptionActivityArgs.class), new GiftSubscriptionActivity$onCreate$$inlined$navArgs$1(this)).getValue()).getUserID();
            this.giftedUsername = ((GiftSubscriptionActivityArgs) new k3.g(qc.g0.b(GiftSubscriptionActivityArgs.class), new GiftSubscriptionActivity$onCreate$$inlined$navArgs$2(this)).getValue()).getUsername();
        }
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding3 = this.binding;
        if (activityGiftSubscriptionBinding3 == null) {
            qc.q.z("binding");
            activityGiftSubscriptionBinding3 = null;
        }
        activityGiftSubscriptionBinding3.subscriptionButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftSubscriptionActivity.onCreate$lambda$1(GiftSubscriptionActivity.this, view);
            }
        });
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GiftSubscriptionActivity$onCreate$2(this, null), 2, null);
        HabiticaPromotion activePromo = getAppConfigManager().activePromo();
        if (activePromo != null) {
            str = activePromo.getIdentifier();
        } else {
            str = null;
        }
        if (qc.q.d(str, "g1g1")) {
            ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding4 = this.binding;
            if (activityGiftSubscriptionBinding4 == null) {
                qc.q.z("binding");
            } else {
                activityGiftSubscriptionBinding2 = activityGiftSubscriptionBinding4;
            }
            activityGiftSubscriptionBinding2.giftSubscriptionContainer.setVisibility(0);
            return;
        }
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding5 = this.binding;
        if (activityGiftSubscriptionBinding5 == null) {
            qc.q.z("binding");
        } else {
            activityGiftSubscriptionBinding2 = activityGiftSubscriptionBinding5;
        }
        activityGiftSubscriptionBinding2.giftSubscriptionContainer.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.q, android.app.Activity
    public void onStart() {
        super.onStart();
        ad.i.d(ad.l0.a(ad.a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GiftSubscriptionActivity$onStart$1(this, null), 2, null);
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setPurchaseHandler(PurchaseHandler purchaseHandler) {
        qc.q.i(purchaseHandler, "<set-?>");
        this.purchaseHandler = purchaseHandler;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    private final SubscriptionOptionView buttonForSku(String str) {
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding = null;
        if (str != null) {
            switch (str.hashCode()) {
                case -1680960131:
                    if (str.equals(PurchaseTypes.Subscription1MonthNoRenew)) {
                        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding2 = this.binding;
                        if (activityGiftSubscriptionBinding2 == null) {
                            qc.q.z("binding");
                        } else {
                            activityGiftSubscriptionBinding = activityGiftSubscriptionBinding2;
                        }
                        return activityGiftSubscriptionBinding.subscription1MonthView;
                    }
                    return null;
                case -1623701829:
                    if (str.equals(PurchaseTypes.Subscription3MonthNoRenew)) {
                        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding3 = this.binding;
                        if (activityGiftSubscriptionBinding3 == null) {
                            qc.q.z("binding");
                        } else {
                            activityGiftSubscriptionBinding = activityGiftSubscriptionBinding3;
                        }
                        return activityGiftSubscriptionBinding.subscription3MonthView;
                    }
                    return null;
                case -1537814376:
                    if (str.equals(PurchaseTypes.Subscription6MonthNoRenew)) {
                        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding4 = this.binding;
                        if (activityGiftSubscriptionBinding4 == null) {
                            qc.q.z("binding");
                        } else {
                            activityGiftSubscriptionBinding = activityGiftSubscriptionBinding4;
                        }
                        return activityGiftSubscriptionBinding.subscription6MonthView;
                    }
                    return null;
                case 2033868337:
                    if (str.equals(PurchaseTypes.Subscription12MonthNoRenew)) {
                        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding5 = this.binding;
                        if (activityGiftSubscriptionBinding5 == null) {
                            qc.q.z("binding");
                        } else {
                            activityGiftSubscriptionBinding = activityGiftSubscriptionBinding5;
                        }
                        return activityGiftSubscriptionBinding.subscription12MonthView;
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }
}
