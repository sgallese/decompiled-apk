package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.interactors.CheckClassSelectionUseCase;
import com.habitrpg.android.habitica.interactors.DisplayItemDropUseCase;
import com.habitrpg.android.habitica.interactors.NotifyUserUseCase;

/* loaded from: classes4.dex */
public final class MainActivity_MembersInjector implements qa.a<MainActivity> {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<CheckClassSelectionUseCase> checkClassSelectionUseCaseProvider;
    private final cc.a<DisplayItemDropUseCase> displayItemDropUseCaseProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<NotifyUserUseCase> notifyUserUseCaseProvider;
    private final cc.a<ReviewManager> reviewManagerProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public MainActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ApiClient> aVar3, cc.a<SoundManager> aVar4, cc.a<CheckClassSelectionUseCase> aVar5, cc.a<DisplayItemDropUseCase> aVar6, cc.a<NotifyUserUseCase> aVar7, cc.a<TaskRepository> aVar8, cc.a<InventoryRepository> aVar9, cc.a<AppConfigManager> aVar10, cc.a<ReviewManager> aVar11) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.apiClientProvider = aVar3;
        this.soundManagerProvider = aVar4;
        this.checkClassSelectionUseCaseProvider = aVar5;
        this.displayItemDropUseCaseProvider = aVar6;
        this.notifyUserUseCaseProvider = aVar7;
        this.taskRepositoryProvider = aVar8;
        this.inventoryRepositoryProvider = aVar9;
        this.appConfigManagerProvider = aVar10;
        this.reviewManagerProvider = aVar11;
    }

    public static qa.a<MainActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ApiClient> aVar3, cc.a<SoundManager> aVar4, cc.a<CheckClassSelectionUseCase> aVar5, cc.a<DisplayItemDropUseCase> aVar6, cc.a<NotifyUserUseCase> aVar7, cc.a<TaskRepository> aVar8, cc.a<InventoryRepository> aVar9, cc.a<AppConfigManager> aVar10, cc.a<ReviewManager> aVar11) {
        return new MainActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    public static void injectApiClient(MainActivity mainActivity, ApiClient apiClient) {
        mainActivity.apiClient = apiClient;
    }

    public static void injectAppConfigManager(MainActivity mainActivity, AppConfigManager appConfigManager) {
        mainActivity.appConfigManager = appConfigManager;
    }

    public static void injectCheckClassSelectionUseCase(MainActivity mainActivity, CheckClassSelectionUseCase checkClassSelectionUseCase) {
        mainActivity.checkClassSelectionUseCase = checkClassSelectionUseCase;
    }

    public static void injectDisplayItemDropUseCase(MainActivity mainActivity, DisplayItemDropUseCase displayItemDropUseCase) {
        mainActivity.displayItemDropUseCase = displayItemDropUseCase;
    }

    public static void injectInventoryRepository(MainActivity mainActivity, InventoryRepository inventoryRepository) {
        mainActivity.inventoryRepository = inventoryRepository;
    }

    public static void injectNotifyUserUseCase(MainActivity mainActivity, NotifyUserUseCase notifyUserUseCase) {
        mainActivity.notifyUserUseCase = notifyUserUseCase;
    }

    public static void injectReviewManager(MainActivity mainActivity, ReviewManager reviewManager) {
        mainActivity.reviewManager = reviewManager;
    }

    public static void injectSoundManager(MainActivity mainActivity, SoundManager soundManager) {
        mainActivity.soundManager = soundManager;
    }

    public static void injectTaskRepository(MainActivity mainActivity, TaskRepository taskRepository) {
        mainActivity.taskRepository = taskRepository;
    }

    public void injectMembers(MainActivity mainActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(mainActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(mainActivity, this.userRepositoryProvider.get());
        injectApiClient(mainActivity, this.apiClientProvider.get());
        injectSoundManager(mainActivity, this.soundManagerProvider.get());
        injectCheckClassSelectionUseCase(mainActivity, this.checkClassSelectionUseCaseProvider.get());
        injectDisplayItemDropUseCase(mainActivity, this.displayItemDropUseCaseProvider.get());
        injectNotifyUserUseCase(mainActivity, this.notifyUserUseCaseProvider.get());
        injectTaskRepository(mainActivity, this.taskRepositoryProvider.get());
        injectInventoryRepository(mainActivity, this.inventoryRepositoryProvider.get());
        injectAppConfigManager(mainActivity, this.appConfigManagerProvider.get());
        injectReviewManager(mainActivity, this.reviewManagerProvider.get());
    }
}
