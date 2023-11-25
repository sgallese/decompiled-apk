package com.habitrpg.android.habitica.ui.fragments.tasks;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment_MembersInjector implements qa.a<TaskRecyclerViewFragment> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public TaskRecyclerViewFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<TaskRepository> aVar4, cc.a<SoundManager> aVar5, cc.a<AppConfigManager> aVar6, cc.a<SharedPreferences> aVar7, cc.a<NotificationsManager> aVar8) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.inventoryRepositoryProvider = aVar3;
        this.taskRepositoryProvider = aVar4;
        this.soundManagerProvider = aVar5;
        this.configManagerProvider = aVar6;
        this.sharedPreferencesProvider = aVar7;
        this.notificationsManagerProvider = aVar8;
    }

    public static qa.a<TaskRecyclerViewFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<TaskRepository> aVar4, cc.a<SoundManager> aVar5, cc.a<AppConfigManager> aVar6, cc.a<SharedPreferences> aVar7, cc.a<NotificationsManager> aVar8) {
        return new TaskRecyclerViewFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static void injectConfigManager(TaskRecyclerViewFragment taskRecyclerViewFragment, AppConfigManager appConfigManager) {
        taskRecyclerViewFragment.configManager = appConfigManager;
    }

    public static void injectInventoryRepository(TaskRecyclerViewFragment taskRecyclerViewFragment, InventoryRepository inventoryRepository) {
        taskRecyclerViewFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectNotificationsManager(TaskRecyclerViewFragment taskRecyclerViewFragment, NotificationsManager notificationsManager) {
        taskRecyclerViewFragment.notificationsManager = notificationsManager;
    }

    public static void injectSharedPreferences(TaskRecyclerViewFragment taskRecyclerViewFragment, SharedPreferences sharedPreferences) {
        taskRecyclerViewFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectSoundManager(TaskRecyclerViewFragment taskRecyclerViewFragment, SoundManager soundManager) {
        taskRecyclerViewFragment.soundManager = soundManager;
    }

    public static void injectTaskRepository(TaskRecyclerViewFragment taskRecyclerViewFragment, TaskRepository taskRepository) {
        taskRecyclerViewFragment.taskRepository = taskRepository;
    }

    public static void injectUserRepository(TaskRecyclerViewFragment taskRecyclerViewFragment, UserRepository userRepository) {
        taskRecyclerViewFragment.userRepository = userRepository;
    }

    public void injectMembers(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(taskRecyclerViewFragment, this.tutorialRepositoryProvider.get());
        injectUserRepository(taskRecyclerViewFragment, this.userRepositoryProvider.get());
        injectInventoryRepository(taskRecyclerViewFragment, this.inventoryRepositoryProvider.get());
        injectTaskRepository(taskRecyclerViewFragment, this.taskRepositoryProvider.get());
        injectSoundManager(taskRecyclerViewFragment, this.soundManagerProvider.get());
        injectConfigManager(taskRecyclerViewFragment, this.configManagerProvider.get());
        injectSharedPreferences(taskRecyclerViewFragment, this.sharedPreferencesProvider.get());
        injectNotificationsManager(taskRecyclerViewFragment, this.notificationsManagerProvider.get());
    }
}
