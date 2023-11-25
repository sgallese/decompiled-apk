package com.habitrpg.android.habitica.widget;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import qa.a;

/* loaded from: classes4.dex */
public final class TaskListWidgetProvider_MembersInjector implements a<TaskListWidgetProvider> {
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public TaskListWidgetProvider_MembersInjector(cc.a<UserRepository> aVar, cc.a<TaskRepository> aVar2) {
        this.userRepositoryProvider = aVar;
        this.taskRepositoryProvider = aVar2;
    }

    public static a<TaskListWidgetProvider> create(cc.a<UserRepository> aVar, cc.a<TaskRepository> aVar2) {
        return new TaskListWidgetProvider_MembersInjector(aVar, aVar2);
    }

    public static void injectTaskRepository(TaskListWidgetProvider taskListWidgetProvider, TaskRepository taskRepository) {
        taskListWidgetProvider.taskRepository = taskRepository;
    }

    public void injectMembers(TaskListWidgetProvider taskListWidgetProvider) {
        BaseWidgetProvider_MembersInjector.injectUserRepository(taskListWidgetProvider, this.userRepositoryProvider.get());
        injectTaskRepository(taskListWidgetProvider, this.taskRepositoryProvider.get());
    }
}
