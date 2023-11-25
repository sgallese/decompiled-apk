package com.habitrpg.android.habitica.ui.activities;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class DeathActivity_MembersInjector implements qa.a<DeathActivity> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public DeathActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5, cc.a<SharedPreferences> aVar6) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.inventoryRepositoryProvider = aVar3;
        this.appConfigManagerProvider = aVar4;
        this.userViewModelProvider = aVar5;
        this.sharedPreferencesProvider = aVar6;
    }

    public static qa.a<DeathActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5, cc.a<SharedPreferences> aVar6) {
        return new DeathActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectAppConfigManager(DeathActivity deathActivity, AppConfigManager appConfigManager) {
        deathActivity.appConfigManager = appConfigManager;
    }

    public static void injectInventoryRepository(DeathActivity deathActivity, InventoryRepository inventoryRepository) {
        deathActivity.inventoryRepository = inventoryRepository;
    }

    public static void injectSharedPreferences(DeathActivity deathActivity, SharedPreferences sharedPreferences) {
        deathActivity.sharedPreferences = sharedPreferences;
    }

    public static void injectUserViewModel(DeathActivity deathActivity, MainUserViewModel mainUserViewModel) {
        deathActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(DeathActivity deathActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(deathActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(deathActivity, this.userRepositoryProvider.get());
        injectInventoryRepository(deathActivity, this.inventoryRepositoryProvider.get());
        injectAppConfigManager(deathActivity, this.appConfigManagerProvider.get());
        injectUserViewModel(deathActivity, this.userViewModelProvider.get());
        injectSharedPreferences(deathActivity, this.sharedPreferencesProvider.get());
    }
}
