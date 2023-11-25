package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.api.MaintenanceApiService;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class MaintenanceActivity_MembersInjector implements qa.a<MaintenanceActivity> {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<MaintenanceApiService> maintenanceServiceProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public MaintenanceActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MaintenanceApiService> aVar3, cc.a<ApiClient> aVar4) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.maintenanceServiceProvider = aVar3;
        this.apiClientProvider = aVar4;
    }

    public static qa.a<MaintenanceActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MaintenanceApiService> aVar3, cc.a<ApiClient> aVar4) {
        return new MaintenanceActivity_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectApiClient(MaintenanceActivity maintenanceActivity, ApiClient apiClient) {
        maintenanceActivity.apiClient = apiClient;
    }

    public static void injectMaintenanceService(MaintenanceActivity maintenanceActivity, MaintenanceApiService maintenanceApiService) {
        maintenanceActivity.maintenanceService = maintenanceApiService;
    }

    public void injectMembers(MaintenanceActivity maintenanceActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(maintenanceActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(maintenanceActivity, this.userRepositoryProvider.get());
        injectMaintenanceService(maintenanceActivity, this.maintenanceServiceProvider.get());
        injectApiClient(maintenanceActivity, this.apiClientProvider.get());
    }
}
