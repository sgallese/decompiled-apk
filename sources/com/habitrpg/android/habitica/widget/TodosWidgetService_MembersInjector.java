package com.habitrpg.android.habitica.widget;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import qa.a;

/* loaded from: classes4.dex */
public final class TodosWidgetService_MembersInjector implements a<TodosWidgetService> {
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public TodosWidgetService_MembersInjector(cc.a<TaskRepository> aVar, cc.a<UserRepository> aVar2) {
        this.taskRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
    }

    public static a<TodosWidgetService> create(cc.a<TaskRepository> aVar, cc.a<UserRepository> aVar2) {
        return new TodosWidgetService_MembersInjector(aVar, aVar2);
    }

    public static void injectTaskRepository(TodosWidgetService todosWidgetService, TaskRepository taskRepository) {
        todosWidgetService.taskRepository = taskRepository;
    }

    public static void injectUserRepository(TodosWidgetService todosWidgetService, UserRepository userRepository) {
        todosWidgetService.userRepository = userRepository;
    }

    public void injectMembers(TodosWidgetService todosWidgetService) {
        injectTaskRepository(todosWidgetService, this.taskRepositoryProvider.get());
        injectUserRepository(todosWidgetService, this.userRepositoryProvider.get());
    }
}
