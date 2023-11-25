package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import dd.g;
import java.util.Collection;
import java.util.List;

/* compiled from: TaskLocalRepository.kt */
/* loaded from: classes4.dex */
public interface TaskLocalRepository extends BaseLocalRepository {
    void deleteTask(String str);

    g<List<Task>> getErroredTasks(String str);

    g<Task> getTask(String str);

    g<Task> getTaskAtPosition(String str, int i10);

    g<Task> getTaskCopy(String str);

    g<List<Task>> getTasks(TaskType taskType, String str, String[] strArr);

    g<List<Task>> getTasks(String str);

    g<List<Task>> getTasksForChallenge(String str, String str2);

    g<User> getUser(String str);

    void markTaskCompleted(String str, boolean z10);

    void saveCompletedTodos(String str, Collection<Task> collection);

    void saveTasks(String str, TasksOrder tasksOrder, TaskList taskList);

    void swapTaskPosition(int i10, int i11);

    TaskList updateIsdue(TaskList taskList);

    void updateTaskPositions(List<String> list);
}
