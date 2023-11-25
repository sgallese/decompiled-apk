package com.habitrpg.android.habitica.ui.activities;

import ad.s2;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.databinding.WidgetConfigureHabitButtonBinding;
import com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter;
import com.habitrpg.android.habitica.widget.HabitButtonWidgetProvider;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;

/* compiled from: HabitButtonWidgetActivity.kt */
/* loaded from: classes4.dex */
public final class HabitButtonWidgetActivity extends Hilt_HabitButtonWidgetActivity {
    public static final int $stable = 8;
    private SkillTasksRecyclerViewAdapter adapter;
    private WidgetConfigureHabitButtonBinding binding;
    private final ad.y job = s2.b(null, 1, null);
    public TaskRepository taskRepository;
    private int widgetId;

    private final void finishWithSelection(String str) {
        storeSelectedTaskId(str);
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.widgetId);
        setResult(-1, intent);
        finish();
        Intent intent2 = new Intent("android.appwidget.action.APPWIDGET_UPDATE", null, this, HabitButtonWidgetProvider.class);
        intent2.putExtra("appWidgetIds", new int[]{this.widgetId});
        sendBroadcast(intent2);
    }

    private final void storeSelectedTaskId(String str) {
        SharedPreferences b10 = androidx.preference.k.b(this);
        qc.q.h(b10, "getDefaultSharedPreferences(...)");
        SharedPreferences.Editor edit = b10.edit();
        edit.putString("habit_button_widget_" + this.widgetId, str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void taskSelected(String str) {
        finishWithSelection(str);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        WidgetConfigureHabitButtonBinding inflate = WidgetConfigureHabitButtonBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        RecyclerView root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.widget_configure_habit_button);
    }

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        qc.q.z("taskRepository");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        LinearLayoutManager linearLayoutManager;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.widgetId = extras.getInt("appWidgetId", 0);
        }
        if (this.widgetId == 0) {
            finish();
        }
        WidgetConfigureHabitButtonBinding widgetConfigureHabitButtonBinding = this.binding;
        if (widgetConfigureHabitButtonBinding == null) {
            qc.q.z("binding");
            widgetConfigureHabitButtonBinding = null;
        }
        RecyclerView.p layoutManager = widgetConfigureHabitButtonBinding.recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
            WidgetConfigureHabitButtonBinding widgetConfigureHabitButtonBinding2 = this.binding;
            if (widgetConfigureHabitButtonBinding2 == null) {
                qc.q.z("binding");
                widgetConfigureHabitButtonBinding2 = null;
            }
            widgetConfigureHabitButtonBinding2.recyclerView.setLayoutManager(linearLayoutManager2);
        }
        SkillTasksRecyclerViewAdapter skillTasksRecyclerViewAdapter = new SkillTasksRecyclerViewAdapter();
        this.adapter = skillTasksRecyclerViewAdapter;
        skillTasksRecyclerViewAdapter.setOnTaskSelection(new HabitButtonWidgetActivity$onCreate$1(this));
        WidgetConfigureHabitButtonBinding widgetConfigureHabitButtonBinding3 = this.binding;
        if (widgetConfigureHabitButtonBinding3 == null) {
            qc.q.z("binding");
            widgetConfigureHabitButtonBinding3 = null;
        }
        widgetConfigureHabitButtonBinding3.recyclerView.setAdapter(this.adapter);
        ad.i.d(ad.l0.a(ad.a1.c().plus(this.job)), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new HabitButtonWidgetActivity$onCreate$2(this, null), 2, null);
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        qc.q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }
}
