package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class SetupActivity_MembersInjector implements qa.a<SetupActivity> {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public SetupActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ApiClient> aVar3, cc.a<InventoryRepository> aVar4, cc.a<TaskRepository> aVar5) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.apiClientProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
        this.taskRepositoryProvider = aVar5;
    }

    public static qa.a<SetupActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ApiClient> aVar3, cc.a<InventoryRepository> aVar4, cc.a<TaskRepository> aVar5) {
        return new SetupActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectApiClient(SetupActivity setupActivity, ApiClient apiClient) {
        setupActivity.apiClient = apiClient;
    }

    public static void injectInventoryRepository(SetupActivity setupActivity, InventoryRepository inventoryRepository) {
        setupActivity.inventoryRepository = inventoryRepository;
    }

    public static void injectTaskRepository(SetupActivity setupActivity, TaskRepository taskRepository) {
        setupActivity.taskRepository = taskRepository;
    }

    public void injectMembers(SetupActivity setupActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(setupActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(setupActivity, this.userRepositoryProvider.get());
        injectApiClient(setupActivity, this.apiClientProvider.get());
        injectInventoryRepository(setupActivity, this.inventoryRepositoryProvider.get());
        injectTaskRepository(setupActivity, this.taskRepositoryProvider.get());
    }
}
