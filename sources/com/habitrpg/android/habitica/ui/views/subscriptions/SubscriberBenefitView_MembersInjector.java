package com.habitrpg.android.habitica.ui.views.subscriptions;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;

/* loaded from: classes4.dex */
public final class SubscriberBenefitView_MembersInjector implements qa.a<SubscriberBenefitView> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;

    public SubscriberBenefitView_MembersInjector(cc.a<AppConfigManager> aVar, cc.a<InventoryRepository> aVar2) {
        this.configManagerProvider = aVar;
        this.inventoryRepositoryProvider = aVar2;
    }

    public static qa.a<SubscriberBenefitView> create(cc.a<AppConfigManager> aVar, cc.a<InventoryRepository> aVar2) {
        return new SubscriberBenefitView_MembersInjector(aVar, aVar2);
    }

    public static void injectConfigManager(SubscriberBenefitView subscriberBenefitView, AppConfigManager appConfigManager) {
        subscriberBenefitView.configManager = appConfigManager;
    }

    public static void injectInventoryRepository(SubscriberBenefitView subscriberBenefitView, InventoryRepository inventoryRepository) {
        subscriberBenefitView.inventoryRepository = inventoryRepository;
    }

    public void injectMembers(SubscriberBenefitView subscriberBenefitView) {
        injectConfigManager(subscriberBenefitView, this.configManagerProvider.get());
        injectInventoryRepository(subscriberBenefitView, this.inventoryRepositoryProvider.get());
    }
}
