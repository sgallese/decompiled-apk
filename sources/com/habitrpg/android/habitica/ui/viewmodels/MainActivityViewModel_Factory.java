package com.habitrpg.android.habitica.ui.viewmodels;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.api.MaintenanceApiService;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.common.habitica.api.HostConfig;

/* loaded from: classes4.dex */
public final class MainActivityViewModel_Factory implements cc.a {
    private final cc.a<ContentRepository> contentRepositoryProvider;
    private final cc.a<HostConfig> hostConfigProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<MaintenanceApiService> maintenanceServiceProvider;
    private final cc.a<PushNotificationManager> pushNotificationManagerProvider;
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<TaskAlarmManager> taskAlarmManagerProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public MainActivityViewModel_Factory(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<HostConfig> aVar3, cc.a<PushNotificationManager> aVar4, cc.a<SharedPreferences> aVar5, cc.a<ContentRepository> aVar6, cc.a<TaskRepository> aVar7, cc.a<InventoryRepository> aVar8, cc.a<TaskAlarmManager> aVar9, cc.a<MaintenanceApiService> aVar10) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
        this.hostConfigProvider = aVar3;
        this.pushNotificationManagerProvider = aVar4;
        this.sharedPreferencesProvider = aVar5;
        this.contentRepositoryProvider = aVar6;
        this.taskRepositoryProvider = aVar7;
        this.inventoryRepositoryProvider = aVar8;
        this.taskAlarmManagerProvider = aVar9;
        this.maintenanceServiceProvider = aVar10;
    }

    public static MainActivityViewModel_Factory create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<HostConfig> aVar3, cc.a<PushNotificationManager> aVar4, cc.a<SharedPreferences> aVar5, cc.a<ContentRepository> aVar6, cc.a<TaskRepository> aVar7, cc.a<InventoryRepository> aVar8, cc.a<TaskAlarmManager> aVar9, cc.a<MaintenanceApiService> aVar10) {
        return new MainActivityViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static MainActivityViewModel newInstance(UserRepository userRepository, MainUserViewModel mainUserViewModel, HostConfig hostConfig, PushNotificationManager pushNotificationManager, SharedPreferences sharedPreferences, ContentRepository contentRepository, TaskRepository taskRepository, InventoryRepository inventoryRepository, TaskAlarmManager taskAlarmManager, MaintenanceApiService maintenanceApiService) {
        return new MainActivityViewModel(userRepository, mainUserViewModel, hostConfig, pushNotificationManager, sharedPreferences, contentRepository, taskRepository, inventoryRepository, taskAlarmManager, maintenanceApiService);
    }

    @Override // cc.a
    public MainActivityViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.hostConfigProvider.get(), this.pushNotificationManagerProvider.get(), this.sharedPreferencesProvider.get(), this.contentRepositoryProvider.get(), this.taskRepositoryProvider.get(), this.inventoryRepositoryProvider.get(), this.taskAlarmManagerProvider.get(), this.maintenanceServiceProvider.get());
    }
}
