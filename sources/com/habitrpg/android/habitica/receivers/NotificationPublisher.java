package com.habitrpg.android.habitica.receivers;

import ad.l0;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.m;
import androidx.core.app.r;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import qc.b0;
import qc.h;
import qc.q;

/* compiled from: NotificationPublisher.kt */
/* loaded from: classes4.dex */
public final class NotificationPublisher extends Hilt_NotificationPublisher {
    private Context context;
    public SharedPreferences sharedPreferences;
    public TaskRepository taskRepository;
    public UserRepository userRepository;
    private boolean wasInjected;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static String NOTIFICATION_ID = "notification-id";
    private static String CHECK_DAILIES = "check-dailies";

    /* compiled from: NotificationPublisher.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final String getCHECK_DAILIES() {
            return NotificationPublisher.CHECK_DAILIES;
        }

        public final String getNOTIFICATION_ID() {
            return NotificationPublisher.NOTIFICATION_ID;
        }

        public final void setCHECK_DAILIES(String str) {
            q.i(str, "<set-?>");
            NotificationPublisher.CHECK_DAILIES = str;
        }

        public final void setNOTIFICATION_ID(String str) {
            q.i(str, "<set-?>");
            NotificationPublisher.NOTIFICATION_ID = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Notification buildNotification(boolean z10, Date date) {
        boolean z11;
        Context context = this.context;
        if (context == null) {
            return null;
        }
        m.e eVar = new m.e(context, "default");
        eVar.m(context.getString(R.string.reminder_title));
        String randomDailyTip = getRandomDailyTip();
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            boolean z12 = true;
            if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6) - 1) {
                z12 = false;
            }
            if (z11) {
                eVar.m(context.getString(R.string.same_day_reminder_title));
                randomDailyTip = context.getString(R.string.same_day_reminder_text);
                q.h(randomDailyTip, "getString(...)");
            } else if (z12) {
                eVar.m(context.getString(R.string.next_day_reminder_title));
                randomDailyTip = context.getString(R.string.next_day_reminder_text);
                q.h(randomDailyTip, "getString(...)");
            }
        }
        if (z10) {
            eVar.l(context.getString(R.string.week_reminder_title));
            randomDailyTip = context.getString(R.string.week_reminder_text);
            q.h(randomDailyTip, "getString(...)");
        }
        eVar.z(new m.c().h(randomDailyTip));
        eVar.x(R.drawable.ic_gryphon_white);
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("notificationIdentifier", "daily_reminder");
        intent.setFlags(603979776);
        eVar.k(PendingIntent.getActivity(context, 0, intent, PendingIntentExtensionsKt.withImmutableFlag(0)));
        eVar.j(a.c(context, R.color.brand_300));
        Notification c10 = eVar.c();
        q.h(c10, "build(...)");
        c10.defaults |= 4;
        c10.flags |= 17;
        return c10;
    }

    static /* synthetic */ Notification buildNotification$default(NotificationPublisher notificationPublisher, boolean z10, Date date, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            date = null;
        }
        return notificationPublisher.buildNotification(z10, date);
    }

    private final String getRandomDailyTip() {
        Context context = this.context;
        if (context == null) {
            return "";
        }
        switch (new Random().nextInt(10)) {
            case 0:
                String string = context.getString(R.string.daily_tip_0);
                q.h(string, "getString(...)");
                return string;
            case 1:
                String string2 = context.getString(R.string.daily_tip_1);
                q.h(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = context.getString(R.string.daily_tip_2);
                q.h(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = context.getString(R.string.daily_tip_3);
                q.h(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = context.getString(R.string.daily_tip_4);
                q.h(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = context.getString(R.string.daily_tip_5);
                q.h(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = context.getString(R.string.daily_tip_6);
                q.h(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = context.getString(R.string.daily_tip_7);
                q.h(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = context.getString(R.string.daily_tip_8);
                q.h(string9, "getString(...)");
                return string9;
            case 9:
                String string10 = context.getString(R.string.daily_tip_9);
                q.h(string10, "getString(...)");
                return string10;
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notify(Intent intent, Notification notification) {
        r rVar;
        Context context = this.context;
        if (context != null) {
            rVar = r.d(context);
        } else {
            rVar = null;
        }
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        if (notification != null && rVar != null) {
            rVar.f(intExtra, notification);
        }
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        q.z("sharedPreferences");
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

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.receivers.Hilt_NotificationPublisher, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        q.i(context, "context");
        q.i(intent, "intent");
        this.context = context;
        if (!this.wasInjected) {
            this.wasInjected = true;
        }
        b0 b0Var = new b0();
        if (getSharedPreferences().getLong("lastAppLaunch", new Date().getTime()) < new Date().getTime() - 604800000) {
            b0Var.f21657f = true;
            SharedPreferences.Editor edit = getSharedPreferences().edit();
            edit.putBoolean("preventDailyReminder", true);
            edit.apply();
        } else {
            TaskAlarmManager.Companion.scheduleDailyReminder(context);
        }
        if (intent.getBooleanExtra(CHECK_DAILIES, false)) {
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new NotificationPublisher$onReceive$2(this, intent, b0Var, null), 1, null);
        } else {
            notify(intent, buildNotification$default(this, b0Var.f21657f, null, 2, null));
        }
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        q.i(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }
}
