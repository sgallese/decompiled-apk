package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class ArmoireActivity_MembersInjector implements qa.a<ArmoireActivity> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<ReviewManager> reviewManagerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public ArmoireActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5, cc.a<ReviewManager> aVar6) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.inventoryRepositoryProvider = aVar3;
        this.appConfigManagerProvider = aVar4;
        this.userViewModelProvider = aVar5;
        this.reviewManagerProvider = aVar6;
    }

    public static qa.a<ArmoireActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5, cc.a<ReviewManager> aVar6) {
        return new ArmoireActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectAppConfigManager(ArmoireActivity armoireActivity, AppConfigManager appConfigManager) {
        armoireActivity.appConfigManager = appConfigManager;
    }

    public static void injectInventoryRepository(ArmoireActivity armoireActivity, InventoryRepository inventoryRepository) {
        armoireActivity.inventoryRepository = inventoryRepository;
    }

    public static void injectReviewManager(ArmoireActivity armoireActivity, ReviewManager reviewManager) {
        armoireActivity.reviewManager = reviewManager;
    }

    public static void injectUserViewModel(ArmoireActivity armoireActivity, MainUserViewModel mainUserViewModel) {
        armoireActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(ArmoireActivity armoireActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(armoireActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(armoireActivity, this.userRepositoryProvider.get());
        injectInventoryRepository(armoireActivity, this.inventoryRepositoryProvider.get());
        injectAppConfigManager(armoireActivity, this.appConfigManagerProvider.get());
        injectUserViewModel(armoireActivity, this.userViewModelProvider.get());
        injectReviewManager(armoireActivity, this.reviewManagerProvider.get());
    }
}
