package com.habitrpg.android.habitica.widget;

import ad.a1;
import ad.i;
import ad.l0;
import ad.s2;
import ad.y;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import java.util.ArrayList;
import java.util.List;
import qc.q;

/* compiled from: TaskListFactory.kt */
/* loaded from: classes4.dex */
public abstract class TaskListFactory implements RemoteViewsService.RemoteViewsFactory {
    public static final int $stable = 8;
    private final Context context;
    private final y job;
    private final int listItemResId;
    private final int listItemTextResId;
    private boolean reloadData;
    private List<? extends Task> taskList;
    private final TaskRepository taskRepository;
    private final TaskType taskType;
    private final UserRepository userRepository;
    private final int widgetId;

    public TaskListFactory(Context context, Intent intent, TaskType taskType, int i10, int i11, TaskRepository taskRepository, UserRepository userRepository) {
        q.i(context, "context");
        q.i(intent, "intent");
        q.i(taskType, "taskType");
        q.i(taskRepository, "taskRepository");
        q.i(userRepository, "userRepository");
        this.context = context;
        this.taskType = taskType;
        this.listItemResId = i10;
        this.listItemTextResId = i11;
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
        this.job = s2.b(null, 1, null);
        this.widgetId = intent.getIntExtra("appWidgetId", 0);
        this.taskList = new ArrayList();
        this.reloadData = false;
    }

    private final void loadData() {
        i.d(l0.a(a1.c().plus(this.job)), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TaskListFactory$loadData$1(this, null), 2, null);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        return this.taskList.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i10) {
        int i11;
        if (this.taskList.size() > i10) {
            String id2 = this.taskList.get(i10).getId();
            if (id2 != null) {
                i11 = id2.hashCode();
            } else {
                i11 = 0;
            }
            return i11;
        }
        return i10;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        return new RemoteViews(this.context.getPackageName(), this.listItemResId);
    }

    public final TaskRepository getTaskRepository() {
        return this.taskRepository;
    }

    public final UserRepository getUserRepository() {
        return this.userRepository;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getViewAt(int i10) {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), this.listItemResId);
        if (this.taskList.size() > i10) {
            Task task = this.taskList.get(i10);
            remoteViews.setTextViewText(this.listItemTextResId, new SpannableStringBuilder(MarkdownParser.INSTANCE.parseMarkdown(task.getText())));
            remoteViews.setInt(R.id.checkbox_background, "setBackgroundResource", task.getLightTaskColor());
            Intent intent = new Intent();
            intent.putExtra("com.habitrpg.android.habitica.TASK_ID_ITEM", task.getId());
            remoteViews.setOnClickFillInIntent(R.id.checkbox_background, intent);
        }
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        loadData();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        if (this.reloadData) {
            loadData();
        }
        this.reloadData = true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }
}
