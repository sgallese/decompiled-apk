package com.habitrpg.android.habitica.widget;

import android.content.Context;
import android.content.Intent;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import qc.q;

/* compiled from: TodoListFactory.kt */
/* loaded from: classes4.dex */
public final class TodoListFactory extends TaskListFactory {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoListFactory(Context context, Intent intent, TaskRepository taskRepository, UserRepository userRepository) {
        super(context, intent, TaskType.TODO, R.layout.widget_todo_list_row, R.id.todo_text, taskRepository, userRepository);
        q.i(context, "context");
        q.i(intent, "intent");
        q.i(taskRepository, "taskRepository");
        q.i(userRepository, "userRepository");
    }
}
