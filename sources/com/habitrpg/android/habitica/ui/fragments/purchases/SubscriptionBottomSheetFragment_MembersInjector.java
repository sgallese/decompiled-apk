package com.habitrpg.android.habitica.ui.fragments.purchases;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;

/* loaded from: classes4.dex */
public final class SubscriptionBottomSheetFragment_MembersInjector implements qa.a<SubscriptionBottomSheetFragment> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<PurchaseHandler> purchaseHandlerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public SubscriptionBottomSheetFragment_MembersInjector(cc.a<UserRepository> aVar, cc.a<AppConfigManager> aVar2, cc.a<InventoryRepository> aVar3, cc.a<PurchaseHandler> aVar4) {
        this.userRepositoryProvider = aVar;
        this.appConfigManagerProvider = aVar2;
        this.inventoryRepositoryProvider = aVar3;
        this.purchaseHandlerProvider = aVar4;
    }

    public static qa.a<SubscriptionBottomSheetFragment> create(cc.a<UserRepository> aVar, cc.a<AppConfigManager> aVar2, cc.a<InventoryRepository> aVar3, cc.a<PurchaseHandler> aVar4) {
        return new SubscriptionBottomSheetFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectAppConfigManager(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, AppConfigManager appConfigManager) {
        subscriptionBottomSheetFragment.appConfigManager = appConfigManager;
    }

    public static void injectInventoryRepository(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, InventoryRepository inventoryRepository) {
        subscriptionBottomSheetFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectPurchaseHandler(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, PurchaseHandler purchaseHandler) {
        subscriptionBottomSheetFragment.purchaseHandler = purchaseHandler;
    }

    public static void injectUserRepository(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, UserRepository userRepository) {
        subscriptionBottomSheetFragment.userRepository = userRepository;
    }

    public void injectMembers(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment) {
        injectUserRepository(subscriptionBottomSheetFragment, this.userRepositoryProvider.get());
        injectAppConfigManager(subscriptionBottomSheetFragment, this.appConfigManagerProvider.get());
        injectInventoryRepository(subscriptionBottomSheetFragment, this.inventoryRepositoryProvider.get());
        injectPurchaseHandler(subscriptionBottomSheetFragment, this.purchaseHandlerProvider.get());
    }
}
