package com.habitrpg.android.habitica.ui.viewmodels;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;

/* loaded from: classes4.dex */
public final class TasksViewModel_Factory implements cc.a {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<TagRepository> tagRepositoryProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public TasksViewModel_Factory(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<TaskRepository> aVar3, cc.a<TagRepository> aVar4, cc.a<AppConfigManager> aVar5, cc.a<SharedPreferences> aVar6) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
        this.taskRepositoryProvider = aVar3;
        this.tagRepositoryProvider = aVar4;
        this.appConfigManagerProvider = aVar5;
        this.sharedPreferencesProvider = aVar6;
    }

    public static TasksViewModel_Factory create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<TaskRepository> aVar3, cc.a<TagRepository> aVar4, cc.a<AppConfigManager> aVar5, cc.a<SharedPreferences> aVar6) {
        return new TasksViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static TasksViewModel newInstance(UserRepository userRepository, MainUserViewModel mainUserViewModel, TaskRepository taskRepository, TagRepository tagRepository, AppConfigManager appConfigManager, SharedPreferences sharedPreferences) {
        return new TasksViewModel(userRepository, mainUserViewModel, taskRepository, tagRepository, appConfigManager, sharedPreferences);
    }

    @Override // cc.a
    public TasksViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.taskRepositoryProvider.get(), this.tagRepositoryProvider.get(), this.appConfigManagerProvider.get(), this.sharedPreferencesProvider.get());
    }
}
