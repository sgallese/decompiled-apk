package com.habitrpg.android.habitica.receivers;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import qa.a;

/* loaded from: classes4.dex */
public final class TaskReceiver_MembersInjector implements a<TaskReceiver> {
    private final cc.a<TaskAlarmManager> taskAlarmManagerProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;

    public TaskReceiver_MembersInjector(cc.a<TaskAlarmManager> aVar, cc.a<TaskRepository> aVar2) {
        this.taskAlarmManagerProvider = aVar;
        this.taskRepositoryProvider = aVar2;
    }

    public static a<TaskReceiver> create(cc.a<TaskAlarmManager> aVar, cc.a<TaskRepository> aVar2) {
        return new TaskReceiver_MembersInjector(aVar, aVar2);
    }

    public static void injectTaskAlarmManager(TaskReceiver taskReceiver, TaskAlarmManager taskAlarmManager) {
        taskReceiver.taskAlarmManager = taskAlarmManager;
    }

    public static void injectTaskRepository(TaskReceiver taskReceiver, TaskRepository taskRepository) {
        taskReceiver.taskRepository = taskRepository;
    }

    public void injectMembers(TaskReceiver taskReceiver) {
        injectTaskAlarmManager(taskReceiver, this.taskAlarmManagerProvider.get());
        injectTaskRepository(taskReceiver, this.taskRepositoryProvider.get());
    }
}
