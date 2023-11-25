package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.a1;
import ad.l0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.w;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentSubscriptionBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.helpers.PurchaseTypes;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment;
import com.habitrpg.android.habitica.ui.views.DayNightTextView;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionDetailsView;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionOptionView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import ec.t;
import java.util.Date;
import java.util.List;

/* compiled from: SubscriptionFragment.kt */
/* loaded from: classes4.dex */
public final class SubscriptionFragment extends Hilt_SubscriptionFragment<FragmentSubscriptionBinding> {
    public AppConfigManager appConfigManager;
    private FragmentSubscriptionBinding binding;
    private boolean hasLoadedSubscriptionOptions;
    public InventoryRepository inventoryRepository;
    public PurchaseHandler purchaseHandler;
    private com.android.billingclient.api.e selectedSubscriptionSku;
    private List<com.android.billingclient.api.e> skus;
    private User user;
    public UserRepository userRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SubscriptionFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final void showGiftSubscriptionDialog(Context context, boolean z10) {
            qc.q.i(context, "context");
            View inflate = ContextExtensionsKt.getLayoutInflater(context).inflate(R.layout.dialog_choose_message_recipient, (ViewGroup) null);
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setTitle(context.getString(R.string.gift_title));
            String string = context.getString(R.string.action_continue);
            qc.q.h(string, "getString(...)");
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (pc.p) new SubscriptionFragment$Companion$showGiftSubscriptionDialog$1(inflate, context), 12, (Object) null);
            AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, SubscriptionFragment$Companion$showGiftSubscriptionDialog$2.INSTANCE, 1, null);
            habiticaAlertDialog.setAdditionalContentView(inflate);
            habiticaAlertDialog.show();
        }
    }

    public SubscriptionFragment() {
        List<com.android.billingclient.api.e> i10;
        i10 = t.i();
        this.skus = i10;
    }

    private final SubscriptionOptionView buttonForSku(com.android.billingclient.api.e eVar) {
        return buttonForSku(eVar != null ? eVar.b() : null);
    }

    private final void checkIfNeedsCancellation() {
        ad.g.d(l0.a(a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SubscriptionFragment$checkIfNeedsCancellation$1(this, null), 2, null);
    }

    private final void loadInventory() {
        ExceptionHandlerKt.launchCatching$default(l0.a(a1.b()), null, new SubscriptionFragment$loadInventory$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(SubscriptionFragment subscriptionFragment, View view) {
        String str;
        qc.q.i(subscriptionFragment, "this$0");
        Context context = subscriptionFragment.getContext();
        if (context != null) {
            Companion companion = Companion;
            HabiticaPromotion activePromo = subscriptionFragment.getAppConfigManager().activePromo();
            if (activePromo != null) {
                str = activePromo.getIdentifier();
            } else {
                str = null;
            }
            companion.showGiftSubscriptionDialog(context, qc.q.d(str, "g1g1"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(SubscriptionFragment subscriptionFragment, View view) {
        qc.q.i(subscriptionFragment, "this$0");
        subscriptionFragment.purchaseSubscription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(SubscriptionFragment subscriptionFragment, View view) {
        qc.q.i(subscriptionFragment, "this$0");
        subscriptionFragment.getParentFragmentManager().q().s(R.id.fragment_container, new PromoInfoFragment()).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(SubscriptionFragment subscriptionFragment) {
        qc.q.i(subscriptionFragment, "this$0");
        subscriptionFragment.refresh();
    }

    private final void purchaseSubscription() {
        androidx.fragment.app.q activity;
        com.android.billingclient.api.e eVar = this.selectedSubscriptionSku;
        if (eVar != null && (activity = getActivity()) != null) {
            PurchaseHandler purchaseHandler = getPurchaseHandler();
            qc.q.f(activity);
            PurchaseHandler.purchase$default(purchaseHandler, activity, eVar, null, null, false, 28, null);
        }
    }

    private final void refresh() {
        ad.g.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SubscriptionFragment$refresh$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectSubscription(com.android.billingclient.api.e eVar) {
        Button button;
        SubscriptionOptionView buttonForSku;
        com.android.billingclient.api.e eVar2 = this.selectedSubscriptionSku;
        if (eVar2 != null && (buttonForSku = buttonForSku(eVar2)) != null) {
            buttonForSku.setIsSelected(false);
        }
        this.selectedSubscriptionSku = eVar;
        SubscriptionOptionView buttonForSku2 = buttonForSku(eVar);
        if (buttonForSku2 != null) {
            buttonForSku2.setIsSelected(true);
        }
        FragmentSubscriptionBinding binding = getBinding();
        Button button2 = null;
        if (binding != null) {
            button = binding.subscribeButton;
        } else {
            button = null;
        }
        if (button != null) {
            FragmentSubscriptionBinding binding2 = getBinding();
            if (binding2 != null) {
                button2 = binding2.subscribeButton;
            }
            if (button2 != null) {
                button2.setEnabled(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSubscriptionOptions() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        FragmentSubscriptionBinding binding = getBinding();
        if (binding != null) {
            linearLayout = binding.subscriptionOptions;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        FragmentSubscriptionBinding binding2 = getBinding();
        if (binding2 != null && (linearLayout2 = binding2.subscriptionOptions) != null) {
            linearLayout2.postDelayed(new Runnable() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.n
                @Override // java.lang.Runnable
                public final void run() {
                    SubscriptionFragment.showSubscriptionOptions$lambda$10(SubscriptionFragment.this);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSubscriptionOptions$lambda$10(SubscriptionFragment subscriptionFragment) {
        NestedScrollView nestedScrollView;
        int i10;
        LinearLayout linearLayout;
        qc.q.i(subscriptionFragment, "this$0");
        FragmentSubscriptionBinding binding = subscriptionFragment.getBinding();
        if (binding != null && (nestedScrollView = binding.scrollView) != null) {
            FragmentSubscriptionBinding binding2 = subscriptionFragment.getBinding();
            if (binding2 != null && (linearLayout = binding2.subscriptionOptions) != null) {
                i10 = linearLayout.getTop();
            } else {
                i10 = 0;
            }
            nestedScrollView.smoothScrollTo(0, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonLabel(final com.android.billingclient.api.e eVar, String str) {
        SubscriptionOptionView buttonForSku = buttonForSku(eVar);
        if (buttonForSku != null) {
            buttonForSku.setPriceText(str);
            buttonForSku.setSku(eVar.b());
            buttonForSku.setOnPurchaseClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubscriptionFragment.updateButtonLabel$lambda$6(SubscriptionFragment.this, eVar, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateButtonLabel$lambda$6(SubscriptionFragment subscriptionFragment, com.android.billingclient.api.e eVar, View view) {
        qc.q.i(subscriptionFragment, "this$0");
        qc.q.i(eVar, "$sku");
        subscriptionFragment.selectSubscription(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubscriptionInfo() {
        boolean z10;
        SubscriptionDetailsView subscriptionDetailsView;
        ImageView imageView;
        SubscriptionDetailsView subscriptionDetailsView2;
        DayNightTextView dayNightTextView;
        ImageView imageView2;
        ImageView imageView3;
        SubscriptionDetailsView subscriptionDetailsView3;
        SubscriptionDetailsView subscriptionDetailsView4;
        LinearLayout linearLayout;
        DayNightTextView dayNightTextView2;
        Purchases purchased;
        SubscriptionPlan plan;
        FragmentSubscriptionBinding binding;
        SubscriptionDetailsView subscriptionDetailsView5;
        String str;
        ImageView imageView4;
        LinearLayout linearLayout2;
        ProgressBar progressBar;
        boolean z11 = false;
        ProgressBar progressBar2 = null;
        if (this.hasLoadedSubscriptionOptions) {
            FragmentSubscriptionBinding binding2 = getBinding();
            if (binding2 != null) {
                linearLayout2 = binding2.subscriptionOptions;
            } else {
                linearLayout2 = null;
            }
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            FragmentSubscriptionBinding binding3 = getBinding();
            if (binding3 != null) {
                progressBar = binding3.loadingIndicator;
            } else {
                progressBar = null;
            }
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
        User user = this.user;
        if (user != null) {
            if (user != null) {
                z10 = user.isSubscribed();
            } else {
                z10 = false;
            }
            FragmentSubscriptionBinding binding4 = getBinding();
            if (binding4 != null) {
                subscriptionDetailsView = binding4.subscriptionDetails;
            } else {
                subscriptionDetailsView = null;
            }
            if (subscriptionDetailsView == null) {
                return;
            }
            boolean z12 = true;
            if (z10) {
                Context context = getContext();
                if (context == null || !ContextExtensionsKt.isUsingNightModeResources(context)) {
                    z12 = false;
                }
                if (z12) {
                    FragmentSubscriptionBinding binding5 = getBinding();
                    if (binding5 != null && (imageView4 = binding5.headerImageView) != null) {
                        imageView4.setImageResource(R.drawable.subscriber_banner_dark);
                    }
                } else {
                    FragmentSubscriptionBinding binding6 = getBinding();
                    if (binding6 != null && (imageView3 = binding6.headerImageView) != null) {
                        imageView3.setImageResource(R.drawable.subscriber_header);
                    }
                }
                FragmentSubscriptionBinding binding7 = getBinding();
                if (binding7 != null) {
                    subscriptionDetailsView3 = binding7.subscriptionDetails;
                } else {
                    subscriptionDetailsView3 = null;
                }
                if (subscriptionDetailsView3 != null) {
                    subscriptionDetailsView3.setVisibility(0);
                }
                FragmentSubscriptionBinding binding8 = getBinding();
                if (binding8 != null) {
                    subscriptionDetailsView4 = binding8.subscriptionDetails;
                } else {
                    subscriptionDetailsView4 = null;
                }
                if (subscriptionDetailsView4 != null) {
                    User user2 = this.user;
                    if (user2 != null) {
                        str = user2.getId();
                    } else {
                        str = null;
                    }
                    subscriptionDetailsView4.setCurrentUserID(str);
                }
                User user3 = this.user;
                if (user3 != null && (purchased = user3.getPurchased()) != null && (plan = purchased.getPlan()) != null && (binding = getBinding()) != null && (subscriptionDetailsView5 = binding.subscriptionDetails) != null) {
                    subscriptionDetailsView5.setPlan(plan);
                }
                FragmentSubscriptionBinding binding9 = getBinding();
                if (binding9 != null && (dayNightTextView2 = binding9.subscribeBenefitsTitle) != null) {
                    dayNightTextView2.setText(R.string.subscribe_prompt_thanks);
                }
                FragmentSubscriptionBinding binding10 = getBinding();
                if (binding10 != null) {
                    linearLayout = binding10.subscriptionOptions;
                } else {
                    linearLayout = null;
                }
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            } else {
                Context context2 = getContext();
                if (context2 != null && ContextExtensionsKt.isUsingNightModeResources(context2)) {
                    z11 = true;
                }
                if (z11) {
                    FragmentSubscriptionBinding binding11 = getBinding();
                    if (binding11 != null && (imageView2 = binding11.headerImageView) != null) {
                        imageView2.setImageResource(R.drawable.subscribe_header_dark);
                    }
                } else {
                    FragmentSubscriptionBinding binding12 = getBinding();
                    if (binding12 != null && (imageView = binding12.headerImageView) != null) {
                        imageView.setImageResource(R.drawable.subscribe_header);
                    }
                }
                if (!this.hasLoadedSubscriptionOptions) {
                    return;
                }
                FragmentSubscriptionBinding binding13 = getBinding();
                if (binding13 != null) {
                    subscriptionDetailsView2 = binding13.subscriptionDetails;
                } else {
                    subscriptionDetailsView2 = null;
                }
                if (subscriptionDetailsView2 != null) {
                    subscriptionDetailsView2.setVisibility(8);
                }
                FragmentSubscriptionBinding binding14 = getBinding();
                if (binding14 != null && (dayNightTextView = binding14.subscribeBenefitsTitle) != null) {
                    dayNightTextView.setText(R.string.subscribe_prompt);
                }
            }
            FragmentSubscriptionBinding binding15 = getBinding();
            if (binding15 != null) {
                progressBar2 = binding15.loadingIndicator;
            }
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
        }
    }

    public final AppConfigManager getAppConfigManager() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("appConfigManager");
        return null;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    public final PurchaseHandler getPurchaseHandler() {
        PurchaseHandler purchaseHandler = this.purchaseHandler;
        if (purchaseHandler != null) {
            return purchaseHandler;
        }
        qc.q.z("purchaseHandler");
        return null;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new SubscriptionFragment$onResume$1(this, null), 1, null);
        refresh();
        loadInventory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        SubscriptionDetailsView subscriptionDetailsView;
        SubscriptionDetailsView subscriptionDetailsView2;
        RelativeLayout relativeLayout;
        Date date;
        SwipeRefreshLayout swipeRefreshLayout;
        ComposeView composeView;
        RelativeLayout relativeLayout2;
        Button button;
        Button button2;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentSubscriptionBinding binding = getBinding();
        ComposeView composeView2 = null;
        if (binding != null) {
            linearLayout = binding.subscriptionOptions;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        FragmentSubscriptionBinding binding2 = getBinding();
        if (binding2 != null) {
            subscriptionDetailsView = binding2.subscriptionDetails;
        } else {
            subscriptionDetailsView = null;
        }
        if (subscriptionDetailsView != null) {
            subscriptionDetailsView.setVisibility(8);
        }
        FragmentSubscriptionBinding binding3 = getBinding();
        if (binding3 != null) {
            subscriptionDetailsView2 = binding3.subscriptionDetails;
        } else {
            subscriptionDetailsView2 = null;
        }
        if (subscriptionDetailsView2 != null) {
            subscriptionDetailsView2.setOnShowSubscriptionOptions(new SubscriptionFragment$onViewCreated$1(this));
        }
        FragmentSubscriptionBinding binding4 = getBinding();
        if (binding4 != null && (button2 = binding4.giftSubscriptionButton) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubscriptionFragment.onViewCreated$lambda$1(SubscriptionFragment.this, view2);
                }
            });
        }
        FragmentSubscriptionBinding binding5 = getBinding();
        if (binding5 != null && (button = binding5.subscribeButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubscriptionFragment.onViewCreated$lambda$2(SubscriptionFragment.this, view2);
                }
            });
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new SubscriptionFragment$onViewCreated$4(this, null), 1, null);
        HabiticaPromotion activePromo = getAppConfigManager().activePromo();
        if (activePromo != null) {
            FragmentSubscriptionBinding binding6 = getBinding();
            if (binding6 != null) {
                activePromo.configurePurchaseBanner(binding6);
            }
            FragmentSubscriptionBinding binding7 = getBinding();
            if (binding7 != null && (relativeLayout2 = binding7.promoBanner) != null) {
                relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SubscriptionFragment.onViewCreated$lambda$4(SubscriptionFragment.this, view2);
                    }
                });
            }
        } else {
            FragmentSubscriptionBinding binding8 = getBinding();
            if (binding8 != null) {
                relativeLayout = binding8.promoBanner;
            } else {
                relativeLayout = null;
            }
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
        }
        WorldStateEvent birthdayEvent = getAppConfigManager().getBirthdayEvent();
        if (birthdayEvent != null) {
            date = birthdayEvent.getEnd();
        } else {
            date = null;
        }
        if (date != null) {
            FragmentSubscriptionBinding binding9 = getBinding();
            if (binding9 != null && (composeView = binding9.promoComposeView) != null) {
                composeView.setContent(q0.c.c(-1147778067, true, new SubscriptionFragment$onViewCreated$7(date)));
            }
            FragmentSubscriptionBinding binding10 = getBinding();
            if (binding10 != null) {
                composeView2 = binding10.promoComposeView;
            }
            if (composeView2 != null) {
                composeView2.setVisibility(0);
            }
        }
        FragmentSubscriptionBinding binding11 = getBinding();
        if (binding11 != null && (swipeRefreshLayout = binding11.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.r
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
                public final void onRefresh() {
                    SubscriptionFragment.onViewCreated$lambda$5(SubscriptionFragment.this);
                }
            });
        }
        Analytics.INSTANCE.sendNavigationEvent("subscription screen");
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setPurchaseHandler(PurchaseHandler purchaseHandler) {
        qc.q.i(purchaseHandler, "<set-?>");
        this.purchaseHandler = purchaseHandler;
    }

    public final void setUser(User user) {
        qc.q.i(user, "newUser");
        this.user = user;
        updateSubscriptionInfo();
        checkIfNeedsCancellation();
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    private final SubscriptionOptionView buttonForSku(String str) {
        FragmentSubscriptionBinding binding;
        FragmentSubscriptionBinding binding2;
        FragmentSubscriptionBinding binding3;
        FragmentSubscriptionBinding binding4;
        if (str != null) {
            switch (str.hashCode()) {
                case -2028149442:
                    if (str.equals(PurchaseTypes.Subscription12Month) && (binding = getBinding()) != null) {
                        return binding.subscription12month;
                    }
                    return null;
                case 958953680:
                    if (str.equals(PurchaseTypes.Subscription1Month) && (binding2 = getBinding()) != null) {
                        return binding2.subscription1month;
                    }
                    return null;
                case 1016211982:
                    if (str.equals(PurchaseTypes.Subscription3Month) && (binding3 = getBinding()) != null) {
                        return binding3.subscription3month;
                    }
                    return null;
                case 1102099435:
                    if (str.equals(PurchaseTypes.Subscription6Month) && (binding4 = getBinding()) != null) {
                        return binding4.subscription6month;
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSubscriptionBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentSubscriptionBinding inflate = FragmentSubscriptionBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSubscriptionBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentSubscriptionBinding fragmentSubscriptionBinding) {
        this.binding = fragmentSubscriptionBinding;
    }
}
