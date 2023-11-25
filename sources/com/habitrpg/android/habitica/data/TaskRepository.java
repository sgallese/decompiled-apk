package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.responses.BulkTaskScoringData;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import dc.w;
import dd.g;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import pc.l;

/* compiled from: TaskRepository.kt */
/* loaded from: classes4.dex */
public interface TaskRepository extends BaseRepository {

    /* compiled from: TaskRepository.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object createTask$default(TaskRepository taskRepository, Task task, boolean z10, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return taskRepository.createTask(task, z10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTask");
        }

        public static /* synthetic */ g getTasks$default(TaskRepository taskRepository, TaskType taskType, String str, String[] strArr, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                return taskRepository.getTasks(taskType, str, strArr);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTasks");
        }

        public static /* synthetic */ Object retrieveCompletedTodos$default(TaskRepository taskRepository, String str, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return taskRepository.retrieveCompletedTodos(str, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveCompletedTodos");
        }

        public static /* synthetic */ Object updateTask$default(TaskRepository taskRepository, Task task, boolean z10, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return taskRepository.updateTask(task, z10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateTask");
        }
    }

    Object bulkScoreTasks(List<? extends Map<String, String>> list, Continuation<? super BulkTaskScoringData> continuation);

    Object createTask(Task task, boolean z10, Continuation<? super Task> continuation);

    void createTaskInBackground(Task task, Map<String, ? extends List<String>> map);

    Object createTasks(List<? extends Task> list, Continuation<? super List<? extends Task>> continuation);

    Object deleteTask(String str, Continuation<? super Void> continuation);

    g<Task> getTask(String str);

    g<List<Task>> getTaskCopies();

    List<Task> getTaskCopies(List<? extends Task> list);

    g<Task> getTaskCopy(String str);

    g<List<Task>> getTasks(TaskType taskType, String str, String[] strArr);

    g<List<Task>> getTasksForChallenge(String str);

    g<Task> getUnmanagedTask(String str);

    void markTaskCompleted(String str, boolean z10);

    Object markTaskNeedsWork(Task task, String str, Continuation<? super w> continuation);

    <T extends BaseMainObject> void modify(T t10, l<? super T, w> lVar);

    Object retrieveCompletedTodos(String str, Continuation<? super TaskList> continuation);

    Object retrieveDailiesFromDate(Date date, Continuation<? super TaskList> continuation);

    Object retrieveTasks(String str, TasksOrder tasksOrder, Date date, Continuation<? super TaskList> continuation);

    Object retrieveTasks(String str, TasksOrder tasksOrder, Continuation<? super TaskList> continuation);

    void saveTask(Task task);

    void saveTasks(String str, TasksOrder tasksOrder, TaskList taskList);

    Object scoreChecklistItem(String str, String str2, Continuation<? super Task> continuation);

    void swapTaskPosition(int i10, int i11);

    Object syncErroredTasks(Continuation<? super List<? extends Task>> continuation);

    Object taskChecked(User user, Task task, boolean z10, boolean z11, l<? super TaskScoringResult, w> lVar, Continuation<? super TaskScoringResult> continuation);

    Object taskChecked(User user, String str, boolean z10, boolean z11, l<? super TaskScoringResult, w> lVar, Continuation<? super TaskScoringResult> continuation);

    Object unlinkAllTasks(String str, String str2, Continuation<? super Void> continuation);

    Object updateTask(Task task, boolean z10, Continuation<? super Task> continuation);

    void updateTaskInBackground(Task task, Map<String, ? extends List<String>> map);

    Object updateTaskPosition(TaskType taskType, String str, int i10, Continuation<? super List<String>> continuation);
}
