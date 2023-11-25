package com.habitrpg.android.habitica.receivers;

import ad.i;
import ad.l0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.m;
import androidx.core.app.r;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.shared.habitica.HLogger;
import com.habitrpg.shared.habitica.LogLevel;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import qc.q;

/* compiled from: TaskReceiver.kt */
/* loaded from: classes4.dex */
public final class TaskReceiver extends Hilt_TaskReceiver {
    public static final int $stable = 8;
    public TaskAlarmManager taskAlarmManager;
    public TaskRepository taskRepository;

    /* JADX INFO: Access modifiers changed from: private */
    public final void createNotification(Context context, Task task) {
        int i10;
        int i11;
        Intent intent = new Intent(context, MainActivity.class);
        HLogger.Companion.log(LogLevel.INFO, "javaClass", "Create Notification");
        intent.putExtra("notificationIdentifier", "task_reminder");
        int i12 = 0;
        m.e k10 = new m.e(context, "default").x(R.drawable.ic_gryphon_white).j(a.c(context, R.color.brand_300)).m(task.getText()).z(new m.c().h(task.getNotes())).v(2).y(RingtoneManager.getDefaultUri(2)).g(true).k(PendingIntent.getActivity(context, (int) System.currentTimeMillis(), intent, PendingIntentExtensionsKt.withImmutableFlag(0)));
        q.h(k10, "setContentIntent(...)");
        if (Build.VERSION.SDK_INT >= 23) {
            k10 = k10.h("reminder");
            q.h(k10, "setCategory(...)");
        }
        if (task.getType() == TaskType.DAILY || task.getType() == TaskType.TODO) {
            Intent intent2 = new Intent(context, LocalNotificationActionReceiver.class);
            intent2.setAction(context.getString(R.string.complete_task_action));
            intent2.putExtra("taskID", task.getId());
            String id2 = task.getId();
            if (id2 != null) {
                i10 = id2.hashCode();
            } else {
                i10 = 0;
            }
            intent2.putExtra("NOTIFICATION_ID", i10);
            String id3 = task.getId();
            if (id3 != null) {
                i11 = id3.hashCode();
            } else {
                i11 = 0;
            }
            k10.a(0, context.getString(R.string.complete), PendingIntent.getBroadcast(context, i11, intent2, PendingIntentExtensionsKt.withImmutableFlag(134217728)));
        }
        r d10 = r.d(context);
        q.h(d10, "from(...)");
        String id4 = task.getId();
        if (id4 != null) {
            i12 = id4.hashCode();
        }
        d10.f(i12, k10.c());
    }

    public final TaskAlarmManager getTaskAlarmManager() {
        TaskAlarmManager taskAlarmManager = this.taskAlarmManager;
        if (taskAlarmManager != null) {
            return taskAlarmManager;
        }
        q.z("taskAlarmManager");
        return null;
    }

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        q.z("taskRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.receivers.Hilt_TaskReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        q.i(context, "context");
        q.i(intent, "intent");
        HLogger.Companion.log(LogLevel.INFO, "javaClass", "onReceive");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString(TaskAlarmManager.TASK_ID_INTENT_KEY);
            if (string != null) {
                getTaskAlarmManager().addAlarmForTaskId(string);
            }
            i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TaskReceiver$onReceive$1(this, string, context, null), 2, null);
        }
    }

    public final void setTaskAlarmManager(TaskAlarmManager taskAlarmManager) {
        q.i(taskAlarmManager, "<set-?>");
        this.taskAlarmManager = taskAlarmManager;
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }
}
