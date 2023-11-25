package com.habitrpg.android.habitica.ui.fragments.purchases;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class SubscriptionFragment_MembersInjector implements qa.a<SubscriptionFragment> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<PurchaseHandler> purchaseHandlerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public SubscriptionFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<AppConfigManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<PurchaseHandler> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.appConfigManagerProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
        this.purchaseHandlerProvider = aVar5;
    }

    public static qa.a<SubscriptionFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<AppConfigManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<PurchaseHandler> aVar5) {
        return new SubscriptionFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectAppConfigManager(SubscriptionFragment subscriptionFragment, AppConfigManager appConfigManager) {
        subscriptionFragment.appConfigManager = appConfigManager;
    }

    public static void injectInventoryRepository(SubscriptionFragment subscriptionFragment, InventoryRepository inventoryRepository) {
        subscriptionFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectPurchaseHandler(SubscriptionFragment subscriptionFragment, PurchaseHandler purchaseHandler) {
        subscriptionFragment.purchaseHandler = purchaseHandler;
    }

    public static void injectUserRepository(SubscriptionFragment subscriptionFragment, UserRepository userRepository) {
        subscriptionFragment.userRepository = userRepository;
    }

    public void injectMembers(SubscriptionFragment subscriptionFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(subscriptionFragment, this.tutorialRepositoryProvider.get());
        injectUserRepository(subscriptionFragment, this.userRepositoryProvider.get());
        injectAppConfigManager(subscriptionFragment, this.appConfigManagerProvider.get());
        injectInventoryRepository(subscriptionFragment, this.inventoryRepositoryProvider.get());
        injectPurchaseHandler(subscriptionFragment, this.purchaseHandlerProvider.get());
    }
}
