package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.a1;
import ad.l0;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import com.google.android.material.card.MaterialCardView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentBottomsheetSubscriptionBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.helpers.PurchaseTypes;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionOptionView;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import ec.t;
import java.util.List;

/* compiled from: SubscriptionBottomSheetFragment.kt */
/* loaded from: classes4.dex */
public class SubscriptionBottomSheetFragment extends Hilt_SubscriptionBottomSheetFragment {
    public static final String TAG = "SubscriptionBottomSheet";
    private FragmentBottomsheetSubscriptionBinding _binding;
    public AppConfigManager appConfigManager;
    private boolean hasLoadedSubscriptionOptions;
    public InventoryRepository inventoryRepository;
    public PurchaseHandler purchaseHandler;
    private com.android.billingclient.api.e selectedSubscriptionSku;
    private List<com.android.billingclient.api.e> skus;
    private User user;
    public UserRepository userRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SubscriptionBottomSheetFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    public SubscriptionBottomSheetFragment() {
        List<com.android.billingclient.api.e> i10;
        i10 = t.i();
        this.skus = i10;
    }

    private final SubscriptionOptionView buttonForSku(com.android.billingclient.api.e eVar) {
        return buttonForSku(eVar != null ? eVar.b() : null);
    }

    private final void checkIfNeedsCancellation() {
        ad.i.d(l0.a(a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SubscriptionBottomSheetFragment$checkIfNeedsCancellation$1(this, null), 2, null);
    }

    private final void loadInventory() {
        ExceptionHandlerKt.launchCatching$default(l0.a(a1.b()), null, new SubscriptionBottomSheetFragment$loadInventory$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$2(DialogInterface dialogInterface) {
        qc.q.i(dialogInterface, "dialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        aVar.getBehavior().P0(6);
        aVar.getBehavior().C0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, View view) {
        qc.q.i(subscriptionBottomSheetFragment, "this$0");
        subscriptionBottomSheetFragment.dismiss();
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.subscriptionPurchaseActivity, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, View view) {
        qc.q.i(subscriptionBottomSheetFragment, "this$0");
        subscriptionBottomSheetFragment.purchaseSubscription();
    }

    private final void purchaseSubscription() {
        androidx.fragment.app.q activity;
        com.android.billingclient.api.e eVar = this.selectedSubscriptionSku;
        if (eVar != null && (activity = getActivity()) != null) {
            PurchaseHandler purchaseHandler = getPurchaseHandler();
            qc.q.f(activity);
            PurchaseHandler.purchase$default(purchaseHandler, activity, eVar, null, null, false, 28, null);
            dismiss();
        }
    }

    private final void refresh() {
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SubscriptionBottomSheetFragment$refresh$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectSubscription(com.android.billingclient.api.e eVar) {
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
        getBinding().subscribeButton.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonLabel(final com.android.billingclient.api.e eVar, String str) {
        SubscriptionOptionView buttonForSku = buttonForSku(eVar);
        if (buttonForSku != null) {
            buttonForSku.setPriceText(str);
            buttonForSku.setSku(eVar.b());
            buttonForSku.setOnPurchaseClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubscriptionBottomSheetFragment.updateButtonLabel$lambda$3(SubscriptionBottomSheetFragment.this, eVar, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateButtonLabel$lambda$3(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, com.android.billingclient.api.e eVar, View view) {
        qc.q.i(subscriptionBottomSheetFragment, "this$0");
        qc.q.i(eVar, "$sku");
        subscriptionBottomSheetFragment.selectSubscription(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubscriptionInfo() {
        if (this.hasLoadedSubscriptionOptions) {
            getBinding().subscriptionOptions.setVisibility(0);
            getBinding().loadingIndicator.setVisibility(8);
        }
        if (this.user != null) {
            getBinding().loadingIndicator.setVisibility(8);
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

    public final FragmentBottomsheetSubscriptionBinding getBinding() {
        FragmentBottomsheetSubscriptionBinding fragmentBottomsheetSubscriptionBinding = this._binding;
        qc.q.f(fragmentBottomsheetSubscriptionBinding);
        return fragmentBottomsheetSubscriptionBinding;
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

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.y, androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        qc.q.g(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.j
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SubscriptionBottomSheetFragment.onCreateDialog$lambda$2(dialogInterface);
            }
        });
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        this._binding = FragmentBottomsheetSubscriptionBinding.inflate(getLayoutInflater());
        MaterialCardView root = getBinding().getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new SubscriptionBottomSheetFragment$onResume$1(this, null), 1, null);
        refresh();
        loadInventory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        getBinding().subscriptionOptions.setVisibility(8);
        getBinding().seeMoreOptions.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SubscriptionBottomSheetFragment.onViewCreated$lambda$0(SubscriptionBottomSheetFragment.this, view2);
            }
        });
        getBinding().subscribeButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SubscriptionBottomSheetFragment.onViewCreated$lambda$1(SubscriptionBottomSheetFragment.this, view2);
            }
        });
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new SubscriptionBottomSheetFragment$onViewCreated$3(this, null), 1, null);
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
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2028149442) {
                if (hashCode != 958953680) {
                    if (hashCode == 1016211982 && str.equals(PurchaseTypes.Subscription3Month)) {
                        return getBinding().subscription3month;
                    }
                } else if (str.equals(PurchaseTypes.Subscription1Month)) {
                    return getBinding().subscription1month;
                }
            } else if (str.equals(PurchaseTypes.Subscription12Month)) {
                return getBinding().subscription12month;
            }
        }
        return null;
    }
}
