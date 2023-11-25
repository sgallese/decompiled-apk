package com.habitrpg.android.habitica.receivers;

import ad.i;
import ad.l0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.shared.habitica.HLogger;
import com.habitrpg.shared.habitica.LogLevel;
import qc.q;

/* compiled from: TaskAlarmBootReceiver.kt */
/* loaded from: classes4.dex */
public final class TaskAlarmBootReceiver extends Hilt_TaskAlarmBootReceiver {
    public static final int $stable = 8;
    public SharedPreferences sharedPreferences;
    public TaskAlarmManager taskAlarmManager;

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        q.z("sharedPreferences");
        return null;
    }

    public final TaskAlarmManager getTaskAlarmManager() {
        TaskAlarmManager taskAlarmManager = this.taskAlarmManager;
        if (taskAlarmManager != null) {
            return taskAlarmManager;
        }
        q.z("taskAlarmManager");
        return null;
    }

    @Override // com.habitrpg.android.habitica.receivers.Hilt_TaskAlarmBootReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        q.i(context, "context");
        q.i(intent, "intent");
        if (q.d(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TaskAlarmBootReceiver$onReceive$1(this, null), 2, null);
            HLogger.Companion.log(LogLevel.INFO, "javaClass", "onReceive");
        }
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        q.i(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setTaskAlarmManager(TaskAlarmManager taskAlarmManager) {
        q.i(taskAlarmManager, "<set-?>");
        this.taskAlarmManager = taskAlarmManager;
    }
}
