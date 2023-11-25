package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.habitrpg.android.habitica.databinding.WidgetConfigureAddTaskBinding;
import com.habitrpg.android.habitica.widget.AddTaskWidgetProvider;
import com.habitrpg.shared.habitica.models.tasks.TaskType;

/* compiled from: AddTaskWidgetActivity.kt */
/* loaded from: classes4.dex */
public final class AddTaskWidgetActivity extends Hilt_AddTaskWidgetActivity {
    public static final int $stable = 8;
    private WidgetConfigureAddTaskBinding binding;
    private int widgetId;

    private final void addDailySelected() {
        finishWithSelection(TaskType.DAILY);
    }

    private final void addHabitSelected() {
        finishWithSelection(TaskType.HABIT);
    }

    private final void addRewardSelected() {
        finishWithSelection(TaskType.REWARD);
    }

    private final void addToDoSelected() {
        finishWithSelection(TaskType.TODO);
    }

    private final void finishWithSelection(TaskType taskType) {
        storeSelectedTaskType(taskType);
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.widgetId);
        setResult(-1, intent);
        finish();
        Intent intent2 = new Intent("android.appwidget.action.APPWIDGET_UPDATE", null, this, AddTaskWidgetProvider.class);
        intent2.putExtra("appWidgetIds", new int[]{this.widgetId});
        sendBroadcast(intent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(AddTaskWidgetActivity addTaskWidgetActivity, View view) {
        qc.q.i(addTaskWidgetActivity, "this$0");
        addTaskWidgetActivity.addHabitSelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(AddTaskWidgetActivity addTaskWidgetActivity, View view) {
        qc.q.i(addTaskWidgetActivity, "this$0");
        addTaskWidgetActivity.addDailySelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(AddTaskWidgetActivity addTaskWidgetActivity, View view) {
        qc.q.i(addTaskWidgetActivity, "this$0");
        addTaskWidgetActivity.addToDoSelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(AddTaskWidgetActivity addTaskWidgetActivity, View view) {
        qc.q.i(addTaskWidgetActivity, "this$0");
        addTaskWidgetActivity.addRewardSelected();
    }

    private final void storeSelectedTaskType(TaskType taskType) {
        SharedPreferences b10 = androidx.preference.k.b(this);
        qc.q.h(b10, "getDefaultSharedPreferences(...)");
        SharedPreferences.Editor edit = b10.edit();
        edit.putString("add_task_widget_" + this.widgetId, taskType.getValue());
        edit.apply();
    }

    @Override // androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        WidgetConfigureAddTaskBinding inflate = WidgetConfigureAddTaskBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        WidgetConfigureAddTaskBinding widgetConfigureAddTaskBinding = null;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.widgetId = extras.getInt("appWidgetId", 0);
        }
        if (this.widgetId == 0) {
            finish();
        }
        WidgetConfigureAddTaskBinding widgetConfigureAddTaskBinding2 = this.binding;
        if (widgetConfigureAddTaskBinding2 == null) {
            qc.q.z("binding");
            widgetConfigureAddTaskBinding2 = null;
        }
        widgetConfigureAddTaskBinding2.addHabitButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddTaskWidgetActivity.onCreate$lambda$0(AddTaskWidgetActivity.this, view);
            }
        });
        WidgetConfigureAddTaskBinding widgetConfigureAddTaskBinding3 = this.binding;
        if (widgetConfigureAddTaskBinding3 == null) {
            qc.q.z("binding");
            widgetConfigureAddTaskBinding3 = null;
        }
        widgetConfigureAddTaskBinding3.addDailyButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddTaskWidgetActivity.onCreate$lambda$1(AddTaskWidgetActivity.this, view);
            }
        });
        WidgetConfigureAddTaskBinding widgetConfigureAddTaskBinding4 = this.binding;
        if (widgetConfigureAddTaskBinding4 == null) {
            qc.q.z("binding");
            widgetConfigureAddTaskBinding4 = null;
        }
        widgetConfigureAddTaskBinding4.addTodoButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddTaskWidgetActivity.onCreate$lambda$2(AddTaskWidgetActivity.this, view);
            }
        });
        WidgetConfigureAddTaskBinding widgetConfigureAddTaskBinding5 = this.binding;
        if (widgetConfigureAddTaskBinding5 == null) {
            qc.q.z("binding");
        } else {
            widgetConfigureAddTaskBinding = widgetConfigureAddTaskBinding5;
        }
        widgetConfigureAddTaskBinding.addRewardButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddTaskWidgetActivity.onCreate$lambda$3(AddTaskWidgetActivity.this, view);
            }
        });
    }
}
