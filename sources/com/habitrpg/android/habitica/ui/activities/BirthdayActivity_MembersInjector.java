package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class BirthdayActivity_MembersInjector implements qa.a<BirthdayActivity> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<PurchaseHandler> purchaseHandlerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public BirthdayActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<PurchaseHandler> aVar4, cc.a<InventoryRepository> aVar5, cc.a<AppConfigManager> aVar6) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.userViewModelProvider = aVar3;
        this.purchaseHandlerProvider = aVar4;
        this.inventoryRepositoryProvider = aVar5;
        this.configManagerProvider = aVar6;
    }

    public static qa.a<BirthdayActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<PurchaseHandler> aVar4, cc.a<InventoryRepository> aVar5, cc.a<AppConfigManager> aVar6) {
        return new BirthdayActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectConfigManager(BirthdayActivity birthdayActivity, AppConfigManager appConfigManager) {
        birthdayActivity.configManager = appConfigManager;
    }

    public static void injectInventoryRepository(BirthdayActivity birthdayActivity, InventoryRepository inventoryRepository) {
        birthdayActivity.inventoryRepository = inventoryRepository;
    }

    public static void injectPurchaseHandler(BirthdayActivity birthdayActivity, PurchaseHandler purchaseHandler) {
        birthdayActivity.purchaseHandler = purchaseHandler;
    }

    public static void injectUserViewModel(BirthdayActivity birthdayActivity, MainUserViewModel mainUserViewModel) {
        birthdayActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(BirthdayActivity birthdayActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(birthdayActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(birthdayActivity, this.userRepositoryProvider.get());
        injectUserViewModel(birthdayActivity, this.userViewModelProvider.get());
        injectPurchaseHandler(birthdayActivity, this.purchaseHandlerProvider.get());
        injectInventoryRepository(birthdayActivity, this.inventoryRepositoryProvider.get());
        injectConfigManager(birthdayActivity, this.configManagerProvider.get());
    }
}
