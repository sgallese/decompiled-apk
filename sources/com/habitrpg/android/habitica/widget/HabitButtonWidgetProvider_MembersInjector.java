package com.habitrpg.android.habitica.widget;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import qa.a;

/* loaded from: classes4.dex */
public final class HabitButtonWidgetProvider_MembersInjector implements a<HabitButtonWidgetProvider> {
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public HabitButtonWidgetProvider_MembersInjector(cc.a<UserRepository> aVar, cc.a<TaskRepository> aVar2) {
        this.userRepositoryProvider = aVar;
        this.taskRepositoryProvider = aVar2;
    }

    public static a<HabitButtonWidgetProvider> create(cc.a<UserRepository> aVar, cc.a<TaskRepository> aVar2) {
        return new HabitButtonWidgetProvider_MembersInjector(aVar, aVar2);
    }

    public static void injectTaskRepository(HabitButtonWidgetProvider habitButtonWidgetProvider, TaskRepository taskRepository) {
        habitButtonWidgetProvider.taskRepository = taskRepository;
    }

    public void injectMembers(HabitButtonWidgetProvider habitButtonWidgetProvider) {
        BaseWidgetProvider_MembersInjector.injectUserRepository(habitButtonWidgetProvider, this.userRepositoryProvider.get());
        injectTaskRepository(habitButtonWidgetProvider, this.taskRepositoryProvider.get());
    }
}
