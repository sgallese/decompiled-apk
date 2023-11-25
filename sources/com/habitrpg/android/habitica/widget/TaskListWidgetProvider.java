package com.habitrpg.android.habitica.widget;

import ad.i;
import ad.l0;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import qc.h;
import qc.q;

/* compiled from: TaskListWidgetProvider.kt */
/* loaded from: classes4.dex */
public abstract class TaskListWidgetProvider extends Hilt_TaskListWidgetProvider {
    public static final String DAILY_ACTION = "com.habitrpg.android.habitica.DAILY_ACTION";
    public static final String TASK_ID_ITEM = "com.habitrpg.android.habitica.TASK_ID_ITEM";
    public TaskRepository taskRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TaskListWidgetProvider.kt */
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

    protected abstract Class<?> getProviderClass();

    protected abstract Class<?> getServiceClass();

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        q.z("taskRepository");
        return null;
    }

    protected abstract int getTitleResId();

    @Override // com.habitrpg.android.habitica.widget.BaseWidgetProvider
    public int layoutResourceId() {
        return R.layout.widget_task_list;
    }

    @Override // com.habitrpg.android.habitica.widget.Hilt_TaskListWidgetProvider, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        q.i(context, "context");
        q.i(intent, "intent");
        if (q.d(intent.getAction(), DAILY_ACTION)) {
            int intExtra = intent.getIntExtra("appWidgetId", 0);
            String stringExtra = intent.getStringExtra("com.habitrpg.android.habitica.TASK_ID_ITEM");
            if (stringExtra != null) {
                i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TaskListWidgetProvider$onReceive$1(this, stringExtra, context, intExtra, null), 2, null);
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
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, getProviderClass()));
        q.f(appWidgetIds);
        for (int i10 : appWidgetIds) {
            Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i10);
            q.f(appWidgetOptions);
            appWidgetManager.partiallyUpdateAppWidget(i10, sizeRemoteViews(context, appWidgetOptions, i10));
        }
        for (int i11 : iArr) {
            Intent intent = new Intent(context, getServiceClass());
            intent.putExtra("appWidgetId", i11);
            intent.setData(Uri.parse(intent.toUri(1)));
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.widget_task_list);
            remoteViews.setRemoteAdapter(R.id.list_view, intent);
            remoteViews.setEmptyView(R.id.list_view, R.id.emptyView);
            remoteViews.setTextViewText(R.id.widget_title, context.getString(getTitleResId()));
            remoteViews.setOnClickPendingIntent(R.id.widget_title, PendingIntent.getActivity(context, 0, new Intent(context.getApplicationContext(), MainActivity.class), PendingIntentExtensionsKt.withImmutableFlag(134217728)));
            Intent intent2 = new Intent(context, getProviderClass());
            intent2.setAction(DAILY_ACTION);
            intent2.putExtra("appWidgetId", i11);
            intent.setData(Uri.parse(intent.toUri(1)));
            remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getBroadcast(context, 0, intent2, PendingIntentExtensionsKt.withMutableFlag(134217728)));
            appWidgetManager.updateAppWidget(i11, remoteViews);
            AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i11, R.id.list_view);
        }
        super.onUpdate(context, appWidgetManager, iArr);
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }
}
