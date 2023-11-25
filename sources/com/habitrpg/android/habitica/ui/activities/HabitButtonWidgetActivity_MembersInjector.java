package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class HabitButtonWidgetActivity_MembersInjector implements qa.a<HabitButtonWidgetActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public HabitButtonWidgetActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<TaskRepository> aVar3) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.taskRepositoryProvider = aVar3;
    }

    public static qa.a<HabitButtonWidgetActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<TaskRepository> aVar3) {
        return new HabitButtonWidgetActivity_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectTaskRepository(HabitButtonWidgetActivity habitButtonWidgetActivity, TaskRepository taskRepository) {
        habitButtonWidgetActivity.taskRepository = taskRepository;
    }

    public void injectMembers(HabitButtonWidgetActivity habitButtonWidgetActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(habitButtonWidgetActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(habitButtonWidgetActivity, this.userRepositoryProvider.get());
        injectTaskRepository(habitButtonWidgetActivity, this.taskRepositoryProvider.get());
    }
}
