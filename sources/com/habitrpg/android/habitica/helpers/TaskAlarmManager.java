package com.habitrpg.android.habitica.helpers;

import ad.i;
import ad.l0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.preference.k;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.receivers.NotificationPublisher;
import com.habitrpg.android.habitica.receivers.TaskReceiver;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.shared.habitica.HLogger;
import com.habitrpg.shared.habitica.LogLevel;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import ec.b0;
import ec.t;
import io.realm.x0;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import qc.q;
import yc.j;

/* compiled from: TaskAlarmManager.kt */
/* loaded from: classes4.dex */
public final class TaskAlarmManager {
    public static final String TASK_ID_INTENT_KEY = "TASK_ID";
    public static final String TASK_NAME_INTENT_KEY = "TASK_NAME";
    private final AlarmManager am;
    private AuthenticationHandler authenticationHandler;
    private Context context;
    private TaskRepository taskRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TaskAlarmManager.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setAlarm(Context context, long j10, PendingIntent pendingIntent) {
            AlarmManager alarmManager;
            boolean z10;
            HLogger.Companion.log(LogLevel.INFO, "TaskAlarmManager", "Scheduling for " + j10);
            Object systemService = context.getSystemService("alarm");
            if (systemService instanceof AlarmManager) {
                alarmManager = (AlarmManager) systemService;
            } else {
                alarmManager = null;
            }
            AlarmManager alarmManager2 = alarmManager;
            if (pendingIntent == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (alarmManager2 != null) {
                    try {
                        alarmManager2.setAndAllowWhileIdle(0, j10, pendingIntent);
                    } catch (Exception e10) {
                        if (e10 instanceof IllegalStateException) {
                            z10 = true;
                        } else {
                            z10 = e10 instanceof SecurityException;
                        }
                        if (z10) {
                            alarmManager2.setWindow(0, j10, 60000L, pendingIntent);
                            return;
                        }
                        throw e10;
                    }
                }
            } else if (alarmManager2 != null) {
                alarmManager2.setWindow(0, j10, 60000L, pendingIntent);
            }
        }

        public final void removeDailyReminder(Context context) {
            Object obj;
            Intent intent = new Intent(context, NotificationPublisher.class);
            AlarmManager alarmManager = null;
            if (context != null) {
                obj = context.getSystemService("alarm");
            } else {
                obj = null;
            }
            if (obj instanceof AlarmManager) {
                alarmManager = (AlarmManager) obj;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, PendingIntentExtensionsKt.withImmutableFlag(0));
            if (alarmManager != null) {
                alarmManager.cancel(broadcast);
            }
        }

        public final void scheduleDailyReminder(Context context) {
            String string;
            List<String> i10;
            List i11;
            String[] strArr;
            AlarmManager alarmManager;
            boolean z10;
            if (context == null) {
                return;
            }
            SharedPreferences b10 = k.b(context);
            if (b10.getBoolean("use_reminder", false) && (string = b10.getString("reminder_time", "19:00")) != null && (i10 = new j(":").i(string, 0)) != null) {
                if (!i10.isEmpty()) {
                    ListIterator<String> listIterator = i10.listIterator(i10.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            i11 = b0.y0(i10, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                i11 = t.i();
                if (i11 != null && (strArr = (String[]) i11.toArray(new String[0])) != null) {
                    int parseInt = Integer.parseInt(strArr[0]);
                    int parseInt2 = Integer.parseInt(strArr[1]);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, parseInt);
                    calendar.set(12, parseInt2);
                    calendar.set(13, 0);
                    if (calendar.getTimeInMillis() < new Date().getTime()) {
                        calendar.set(6, calendar.get(6) + 1);
                    }
                    long timeInMillis = calendar.getTimeInMillis();
                    Intent intent = new Intent(context, NotificationPublisher.class);
                    NotificationPublisher.Companion companion = NotificationPublisher.Companion;
                    intent.putExtra(companion.getNOTIFICATION_ID(), 1);
                    intent.putExtra(companion.getCHECK_DAILIES(), false);
                    Object systemService = context.getSystemService("alarm");
                    if (systemService instanceof AlarmManager) {
                        alarmManager = (AlarmManager) systemService;
                    } else {
                        alarmManager = null;
                    }
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, PendingIntentExtensionsKt.withImmutableFlag(536870912));
                    if (broadcast != null) {
                        broadcast.cancel();
                        if (alarmManager != null) {
                            alarmManager.cancel(broadcast);
                        }
                    }
                    setAlarm(context, timeInMillis, PendingIntent.getBroadcast(context, 0, intent, PendingIntentExtensionsKt.withImmutableFlag(134217728)));
                }
            }
        }
    }

    public TaskAlarmManager(Context context, TaskRepository taskRepository, AuthenticationHandler authenticationHandler) {
        AlarmManager alarmManager;
        q.i(context, "context");
        q.i(taskRepository, "taskRepository");
        q.i(authenticationHandler, "authenticationHandler");
        this.context = context;
        this.taskRepository = taskRepository;
        this.authenticationHandler = authenticationHandler;
        Object systemService = context.getSystemService("alarm");
        if (systemService instanceof AlarmManager) {
            alarmManager = (AlarmManager) systemService;
        } else {
            alarmManager = null;
        }
        this.am = alarmManager;
    }

    private final void removeAlarmForRemindersItem(RemindersItem remindersItem) {
        int i10;
        AlarmManager alarmManager;
        Intent intent = new Intent(this.context, TaskReceiver.class);
        intent.setAction(remindersItem.getId());
        String id2 = remindersItem.getId();
        if (id2 != null) {
            i10 = id2.hashCode();
        } else {
            i10 = 0;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, i10, intent, PendingIntentExtensionsKt.withImmutableFlag(134217728));
        Object systemService = this.context.getSystemService("alarm");
        if (systemService instanceof AlarmManager) {
            alarmManager = (AlarmManager) systemService;
        } else {
            alarmManager = null;
        }
        broadcast.cancel();
        if (alarmManager != null) {
            alarmManager.cancel(broadcast);
        }
    }

    private final void removeAlarmsForTask(Task task) {
        x0<RemindersItem> reminders = task.getReminders();
        if (reminders != null) {
            Iterator<RemindersItem> it = reminders.iterator();
            while (it.hasNext()) {
                RemindersItem next = it.next();
                q.f(next);
                removeAlarmForRemindersItem(next);
            }
        }
    }

    private final void setAlarmForRemindersItem(Task task, RemindersItem remindersItem) {
        Instant instant;
        Instant instant2;
        boolean z10;
        Object c02;
        ZonedDateTime withZoneSameLocal = ZonedDateTime.now().withZoneSameLocal(ZoneId.systemDefault());
        Date date = null;
        if (withZoneSameLocal != null) {
            instant = withZoneSameLocal.toInstant();
        } else {
            instant = null;
        }
        if (remindersItem != null) {
            instant2 = remindersItem.getLocalZonedDateTimeInstant();
        } else {
            instant2 = null;
        }
        if (remindersItem != null) {
            boolean z11 = true;
            int i10 = 0;
            if (task.getType() == TaskType.DAILY) {
                if (instant2 != null && instant2.isBefore(instant)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    x0<Date> nextDue = task.getNextDue();
                    if (nextDue != null) {
                        c02 = b0.c0(nextDue);
                        date = (Date) c02;
                    }
                    if (date != null) {
                        return;
                    }
                }
            }
            if (task.getType() == TaskType.TODO) {
                if (instant2 == null || !instant2.isBefore(instant)) {
                    z11 = false;
                }
                if (z11) {
                    return;
                }
            }
            if (instant2 != null) {
                Intent intent = new Intent(this.context, TaskReceiver.class);
                intent.setAction(remindersItem.getId());
                intent.putExtra(TASK_NAME_INTENT_KEY, task.getText());
                intent.putExtra(TASK_ID_INTENT_KEY, task.getId());
                String id2 = remindersItem.getId();
                if (id2 != null) {
                    i10 = id2.hashCode();
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(this.context, i10, intent, PendingIntentExtensionsKt.withImmutableFlag(536870912));
                if (broadcast != null) {
                    broadcast.cancel();
                    AlarmManager alarmManager = this.am;
                    if (alarmManager != null) {
                        alarmManager.cancel(broadcast);
                    }
                }
                Companion.setAlarm(this.context, instant2.toEpochMilli(), PendingIntent.getBroadcast(this.context, i10, intent, PendingIntentExtensionsKt.withImmutableFlag(268435456)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAlarmsForTask(Task task) {
        x0<RemindersItem> reminders = task.getReminders();
        if (reminders != null) {
            Iterator<RemindersItem> it = reminders.iterator();
            while (it.hasNext()) {
                RemindersItem next = it.next();
                if (task.getType() == TaskType.DAILY) {
                    next = setTimeForDailyReminder(next, task);
                }
                setAlarmForRemindersItem(task, next);
            }
        }
    }

    private final RemindersItem setTimeForDailyReminder(RemindersItem remindersItem, Task task) {
        String str;
        ZonedDateTime withZoneSameLocal;
        ZonedDateTime nextReminderOccurrence = task.getNextReminderOccurrence(remindersItem, this.context);
        if (remindersItem != null) {
            if (nextReminderOccurrence != null && (withZoneSameLocal = nextReminderOccurrence.withZoneSameLocal(ZoneId.systemDefault())) != null) {
                str = withZoneSameLocal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            } else {
                str = null;
            }
            remindersItem.setTime(str);
        }
        return remindersItem;
    }

    public final void addAlarmForTaskId(String str) {
        q.i(str, TaskFormActivity.TASK_ID_KEY);
        i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TaskAlarmManager$addAlarmForTaskId$1(this, str, null), 2, null);
    }

    public final void scheduleAlarmsForTask(Task task) {
        q.i(task, "task");
        setAlarmsForTask(task);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scheduleAllSavedAlarms(boolean r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.helpers.TaskAlarmManager$scheduleAllSavedAlarms$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.helpers.TaskAlarmManager$scheduleAllSavedAlarms$1 r0 = (com.habitrpg.android.habitica.helpers.TaskAlarmManager$scheduleAllSavedAlarms$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.helpers.TaskAlarmManager$scheduleAllSavedAlarms$1 r0 = new com.habitrpg.android.habitica.helpers.TaskAlarmManager$scheduleAllSavedAlarms$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r5 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.helpers.TaskAlarmManager r0 = (com.habitrpg.android.habitica.helpers.TaskAlarmManager) r0
            dc.n.b(r6)
            goto L4e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.TaskRepository r6 = r4.taskRepository
            dd.g r6 = r6.getTaskCopies()
            r0.L$0 = r4
            r0.Z$0 = r5
            r0.label = r3
            java.lang.Object r6 = dd.i.x(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L68
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L58:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r6.next()
            com.habitrpg.android.habitica.models.tasks.Task r1 = (com.habitrpg.android.habitica.models.tasks.Task) r1
            r0.setAlarmsForTask(r1)
            goto L58
        L68:
            if (r5 != 0) goto L71
            com.habitrpg.android.habitica.helpers.TaskAlarmManager$Companion r5 = com.habitrpg.android.habitica.helpers.TaskAlarmManager.Companion
            android.content.Context r6 = r0.context
            r5.scheduleDailyReminder(r6)
        L71:
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.TaskAlarmManager.scheduleAllSavedAlarms(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
