package com.habitrpg.android.habitica.widget;

import ad.i;
import ad.l0;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import qc.h;
import qc.q;

/* compiled from: HabitButtonWidgetProvider.kt */
/* loaded from: classes4.dex */
public final class HabitButtonWidgetProvider extends Hilt_HabitButtonWidgetProvider {
    public static final String HABIT_ACTION = "com.habitrpg.android.habitica.HABIT_ACTION";
    public static final String TASK_DIRECTION = "com.habitrpg.android.habitica.TASK_DIRECTION";
    public static final String TASK_ID = "com.habitrpg.android.habitica.TASK_ID_ITEM";
    public TaskRepository taskRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HabitButtonWidgetProvider.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    @Override // com.habitrpg.android.habitica.widget.BaseWidgetProvider
    public RemoteViews configureRemoteViews(RemoteViews remoteViews, int i10, int i11, int i12) {
        q.i(remoteViews, "remoteViews");
        return remoteViews;
    }

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        q.z("taskRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.widget.BaseWidgetProvider
    public int layoutResourceId() {
        return R.layout.widget_habit_button;
    }

    @Override // com.habitrpg.android.habitica.widget.Hilt_HabitButtonWidgetProvider, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        q.i(context, "context");
        q.i(intent, "intent");
        if (q.d(intent.getAction(), HABIT_ACTION)) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            int intExtra = intent.getIntExtra("appWidgetId", 0);
            String stringExtra = intent.getStringExtra("com.habitrpg.android.habitica.TASK_ID_ITEM");
            String stringExtra2 = intent.getStringExtra(TASK_DIRECTION);
            int[] iArr = {intExtra};
            if (stringExtra != null) {
                i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new HabitButtonWidgetProvider$onReceive$1(this, stringExtra, stringExtra2, context, appWidgetManager, iArr, null), 2, null);
            }
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        q.i(context, "context");
        q.i(appWidgetManager, "appWidgetManager");
        q.i(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, HabitButtonWidgetProvider.class));
        q.f(appWidgetIds);
        for (int i10 : appWidgetIds) {
            Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i10);
            q.f(appWidgetOptions);
            appWidgetManager.partiallyUpdateAppWidget(i10, sizeRemoteViews(context, appWidgetOptions, i10));
        }
        Intent intent = new Intent(context.getApplicationContext(), HabitButtonWidgetService.class);
        intent.putExtra("appWidgetIds", appWidgetIds);
        try {
            context.startService(intent);
        } catch (IllegalStateException unused) {
        }
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }
}
