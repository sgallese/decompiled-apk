package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class SkillTasksActivity_MembersInjector implements qa.a<SkillTasksActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public SkillTasksActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<TaskRepository> aVar3) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.taskRepositoryProvider = aVar3;
    }

    public static qa.a<SkillTasksActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<TaskRepository> aVar3) {
        return new SkillTasksActivity_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectTaskRepository(SkillTasksActivity skillTasksActivity, TaskRepository taskRepository) {
        skillTasksActivity.taskRepository = taskRepository;
    }

    public void injectMembers(SkillTasksActivity skillTasksActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(skillTasksActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(skillTasksActivity, this.userRepositoryProvider.get());
        injectTaskRepository(skillTasksActivity, this.taskRepositoryProvider.get());
    }
}
