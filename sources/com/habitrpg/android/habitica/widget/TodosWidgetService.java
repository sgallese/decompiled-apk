package com.habitrpg.android.habitica.widget;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import qc.q;

/* compiled from: TodosWidgetService.kt */
/* loaded from: classes4.dex */
public final class TodosWidgetService extends Hilt_TodosWidgetService {
    public static final int $stable = 8;
    public TaskRepository taskRepository;
    public UserRepository userRepository;

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

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        q.i(intent, "intent");
        Context applicationContext = getApplicationContext();
        q.h(applicationContext, "getApplicationContext(...)");
        return new TodoListFactory(applicationContext, intent, getTaskRepository(), getUserRepository());
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
