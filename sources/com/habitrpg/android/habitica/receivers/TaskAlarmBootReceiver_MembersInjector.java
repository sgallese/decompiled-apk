package com.habitrpg.android.habitica.receivers;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import qa.a;

/* loaded from: classes4.dex */
public final class TaskAlarmBootReceiver_MembersInjector implements a<TaskAlarmBootReceiver> {
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<TaskAlarmManager> taskAlarmManagerProvider;

    public TaskAlarmBootReceiver_MembersInjector(cc.a<TaskAlarmManager> aVar, cc.a<SharedPreferences> aVar2) {
        this.taskAlarmManagerProvider = aVar;
        this.sharedPreferencesProvider = aVar2;
    }

    public static a<TaskAlarmBootReceiver> create(cc.a<TaskAlarmManager> aVar, cc.a<SharedPreferences> aVar2) {
        return new TaskAlarmBootReceiver_MembersInjector(aVar, aVar2);
    }

    public static void injectSharedPreferences(TaskAlarmBootReceiver taskAlarmBootReceiver, SharedPreferences sharedPreferences) {
        taskAlarmBootReceiver.sharedPreferences = sharedPreferences;
    }

    public static void injectTaskAlarmManager(TaskAlarmBootReceiver taskAlarmBootReceiver, TaskAlarmManager taskAlarmManager) {
        taskAlarmBootReceiver.taskAlarmManager = taskAlarmManager;
    }

    public void injectMembers(TaskAlarmBootReceiver taskAlarmBootReceiver) {
        injectTaskAlarmManager(taskAlarmBootReceiver, this.taskAlarmManagerProvider.get());
        injectSharedPreferences(taskAlarmBootReceiver, this.sharedPreferencesProvider.get());
    }
}
