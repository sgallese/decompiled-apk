package com.habitrpg.android.habitica.ui.activities;

import androidx.lifecycle.LiveData;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.viewmodels.BaseViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* compiled from: TaskSummaryActivity.kt */
/* loaded from: classes4.dex */
public final class TaskSummaryViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final SocialRepository socialRepository;
    private final LiveData<Task> task;
    private final String taskID;
    private final TaskRepository taskRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskSummaryViewModel(androidx.lifecycle.n0 n0Var, UserRepository userRepository, MainUserViewModel mainUserViewModel, TaskRepository taskRepository, SocialRepository socialRepository) {
        super(userRepository, mainUserViewModel);
        qc.q.i(n0Var, "savedStateHandle");
        qc.q.i(userRepository, "userRepository");
        qc.q.i(mainUserViewModel, "userViewModel");
        qc.q.i(taskRepository, "taskRepository");
        qc.q.i(socialRepository, "socialRepository");
        this.taskRepository = taskRepository;
        this.socialRepository = socialRepository;
        String str = (String) n0Var.f(TaskFormActivity.TASK_ID_KEY);
        str = str == null ? "" : str;
        this.taskID = str;
        this.task = androidx.lifecycle.m.c(taskRepository.getTask(str), null, 0L, 3, null);
    }

    public final dd.g<Member> getMember(String str) {
        return this.socialRepository.getMember(str);
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    public final LiveData<Task> getTask() {
        return this.task;
    }

    public final String getTaskID() {
        return this.taskID;
    }

    public final TaskRepository getTaskRepository() {
        return this.taskRepository;
    }
}
