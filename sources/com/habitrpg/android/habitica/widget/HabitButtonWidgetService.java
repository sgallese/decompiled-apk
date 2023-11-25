package com.habitrpg.android.habitica.widget;

import ad.i;
import ad.l0;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.text.SpannableStringBuilder;
import android.widget.RemoteViews;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import qc.q;

/* compiled from: HabitButtonWidgetService.kt */
/* loaded from: classes4.dex */
public final class HabitButtonWidgetService extends Hilt_HabitButtonWidgetService {
    public static final int $stable = 8;
    private int[] allWidgetIds;
    private AppWidgetManager appWidgetManager;
    public Context context;
    public SharedPreferences sharedPreferences;
    private Map<String, Integer> taskMapping = new LinkedHashMap();
    public TaskRepository taskRepository;

    private final PendingIntent getPendingIntent(String str, String str2, int i10) {
        Intent intent = new Intent(getContext(), HabitButtonWidgetProvider.class);
        intent.setAction(HabitButtonWidgetProvider.HABIT_ACTION);
        intent.putExtra("appWidgetId", i10);
        intent.putExtra("com.habitrpg.android.habitica.TASK_ID_ITEM", str);
        intent.putExtra(HabitButtonWidgetProvider.TASK_DIRECTION, str2);
        PendingIntent broadcast = PendingIntent.getBroadcast(getContext(), i10 + str2.hashCode(), intent, PendingIntentExtensionsKt.withImmutableFlag(134217728));
        q.h(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    private final String getTaskId(int i10) {
        String string = getSharedPreferences().getString("habit_button_widget_" + i10, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    private final void makeTaskMapping() {
        this.taskMapping = new HashMap();
        int[] iArr = this.allWidgetIds;
        q.f(iArr);
        for (int i10 : iArr) {
            String taskId = getTaskId(i10);
            if (!q.d(taskId, "")) {
                this.taskMapping.put(taskId, Integer.valueOf(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateData(Task task) {
        AppWidgetManager appWidgetManager;
        RemoteViews remoteViews = new RemoteViews(getPackageName(), (int) R.layout.widget_habit_button);
        if (task != null && task.isValid()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MarkdownParser.INSTANCE.parseMarkdown(task.getText()));
            remoteViews.setTextViewText(R.id.habit_title, spannableStringBuilder.subSequence(0, Math.min(spannableStringBuilder.length(), 70)).toString());
            Boolean up = task.getUp();
            Boolean bool = Boolean.TRUE;
            if (!q.d(up, bool)) {
                remoteViews.setViewVisibility(R.id.btnPlusWrapper, 8);
                remoteViews.setOnClickPendingIntent(R.id.btnPlusWrapper, null);
            } else {
                remoteViews.setViewVisibility(R.id.btnPlusWrapper, 0);
                remoteViews.setInt(R.id.btnPlus, "setBackgroundColor", a.c(getContext(), task.getLightTaskColor()));
                String id2 = task.getId();
                String text = TaskDirection.UP.getText();
                Integer num = this.taskMapping.get(task.getId());
                q.f(num);
                remoteViews.setOnClickPendingIntent(R.id.btnPlusWrapper, getPendingIntent(id2, text, num.intValue()));
            }
            if (!q.d(task.getDown(), bool)) {
                remoteViews.setViewVisibility(R.id.btnMinusWrapper, 8);
                remoteViews.setOnClickPendingIntent(R.id.btnMinusWrapper, null);
            } else {
                remoteViews.setViewVisibility(R.id.btnMinusWrapper, 0);
                remoteViews.setInt(R.id.btnMinus, "setBackgroundColor", a.c(getContext(), task.getMediumTaskColor()));
                String id3 = task.getId();
                String text2 = TaskDirection.DOWN.getText();
                Integer num2 = this.taskMapping.get(task.getId());
                q.f(num2);
                remoteViews.setOnClickPendingIntent(R.id.btnMinusWrapper, getPendingIntent(id3, text2, num2.intValue()));
            }
            if (this.taskMapping.get(task.getId()) != null && (appWidgetManager = this.appWidgetManager) != null) {
                Integer num3 = this.taskMapping.get(task.getId());
                q.f(num3);
                appWidgetManager.updateAppWidget(num3.intValue(), remoteViews);
            }
        }
    }

    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        q.z("context");
        return null;
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

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        q.i(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        int[] iArr;
        q.i(intent, "intent");
        this.appWidgetManager = AppWidgetManager.getInstance(this);
        ComponentName componentName = new ComponentName(this, HabitButtonWidgetProvider.class);
        AppWidgetManager appWidgetManager = this.appWidgetManager;
        if (appWidgetManager != null) {
            iArr = appWidgetManager.getAppWidgetIds(componentName);
        } else {
            iArr = null;
        }
        this.allWidgetIds = iArr;
        makeTaskMapping();
        i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new HabitButtonWidgetService$onStartCommand$1(this, null), 2, null);
        stopSelf();
        return 1;
    }

    public final void setContext(Context context) {
        q.i(context, "<set-?>");
        this.context = context;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        q.i(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }
}
