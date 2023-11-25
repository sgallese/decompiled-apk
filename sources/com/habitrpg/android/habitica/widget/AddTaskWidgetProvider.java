package com.habitrpg.android.habitica.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.preference.k;
import com.habitrpg.android.habitica.R;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import qc.q;

/* compiled from: AddTaskWidgetProvider.kt */
/* loaded from: classes4.dex */
public final class AddTaskWidgetProvider extends Hilt_AddTaskWidgetProvider {
    public static final int $stable = 0;

    /* compiled from: AddTaskWidgetProvider.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.HABIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskType.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final TaskType getSelectedTaskType(int i10) {
        SharedPreferences sharedPreferences;
        Context context = getContext();
        String str = null;
        if (context != null) {
            sharedPreferences = k.b(context);
        } else {
            sharedPreferences = null;
        }
        TaskType.Companion companion = TaskType.Companion;
        if (sharedPreferences != null) {
            str = sharedPreferences.getString("add_task_widget_" + i10, TaskType.HABIT.getValue());
        }
        TaskType from = companion.from(str);
        if (from == null) {
            return TaskType.HABIT;
        }
        return from;
    }

    @Override // com.habitrpg.android.habitica.widget.BaseWidgetProvider
    public RemoteViews configureRemoteViews(RemoteViews remoteViews, int i10, int i11, int i12) {
        Resources resources;
        String str;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        q.i(remoteViews, "remoteViews");
        int i13 = WhenMappings.$EnumSwitchMapping$0[getSelectedTaskType(i10).ordinal()];
        String str2 = null;
        int i14 = R.drawable.widget_add_habit_background;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        str = "";
                        remoteViews.setTextViewText(R.id.add_task_text, str);
                        remoteViews.setInt(R.id.add_task_icon, "setBackgroundResource", i14);
                        return remoteViews;
                    }
                    Context context = getContext();
                    if (context != null && (resources4 = context.getResources()) != null) {
                        str2 = resources4.getString(R.string.add_reward);
                    }
                    i14 = R.drawable.widget_add_reward_background;
                } else {
                    Context context2 = getContext();
                    if (context2 != null && (resources3 = context2.getResources()) != null) {
                        str2 = resources3.getString(R.string.add_todo);
                    }
                    i14 = R.drawable.widget_add_todo_background;
                }
            } else {
                Context context3 = getContext();
                if (context3 != null && (resources2 = context3.getResources()) != null) {
                    str2 = resources2.getString(R.string.add_daily);
                }
                i14 = R.drawable.widget_add_daily_background;
            }
        } else {
            Context context4 = getContext();
            if (context4 != null && (resources = context4.getResources()) != null) {
                str2 = resources.getString(R.string.add_habit);
            }
        }
        str = str2;
        remoteViews.setTextViewText(R.id.add_task_text, str);
        remoteViews.setInt(R.id.add_task_icon, "setBackgroundResource", i14);
        return remoteViews;
    }

    @Override // com.habitrpg.android.habitica.widget.BaseWidgetProvider
    public int layoutResourceId() {
        return R.layout.widget_add_task;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        q.i(context, "context");
        q.i(appWidgetManager, "appWidgetManager");
        q.i(iArr, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, iArr);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, AddTaskWidgetProvider.class));
        q.f(appWidgetIds);
        for (int i10 : appWidgetIds) {
            Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i10);
            q.f(appWidgetOptions);
            appWidgetManager.partiallyUpdateAppWidget(i10, sizeRemoteViews(context, appWidgetOptions, i10));
        }
    }
}
