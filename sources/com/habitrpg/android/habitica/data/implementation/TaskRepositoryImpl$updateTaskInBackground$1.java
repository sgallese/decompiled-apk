package com.habitrpg.android.habitica.data.implementation;

import ad.k0;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.n;
import dc.w;
import ic.d;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: TaskRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTaskInBackground$1", f = "TaskRepositoryImpl.kt", l = {339, 340}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskRepositoryImpl$updateTaskInBackground$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Map<String, List<String>> $assignChanges;
    final /* synthetic */ Task $task;
    int label;
    final /* synthetic */ TaskRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskRepositoryImpl$updateTaskInBackground$1(TaskRepositoryImpl taskRepositoryImpl, Task task, Map<String, ? extends List<String>> map, Continuation<? super TaskRepositoryImpl$updateTaskInBackground$1> continuation) {
        super(2, continuation);
        this.this$0 = taskRepositoryImpl;
        this.$task = task;
        this.$assignChanges = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskRepositoryImpl$updateTaskInBackground$1(this.this$0, this.$task, this.$assignChanges, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskRepositoryImpl$updateTaskInBackground$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Object handleAssignmentChanges;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            TaskRepositoryImpl taskRepositoryImpl = this.this$0;
            Task task = this.$task;
            this.label = 1;
            obj = TaskRepository.DefaultImpls.updateTask$default(taskRepositoryImpl, task, false, this, 2, null);
            if (obj == d10) {
                return d10;
            }
        }
        Task task2 = (Task) obj;
        if (task2 == null) {
            return w.f13270a;
        }
        TaskRepositoryImpl taskRepositoryImpl2 = this.this$0;
        Map<String, List<String>> map = this.$assignChanges;
        this.label = 2;
        handleAssignmentChanges = taskRepositoryImpl2.handleAssignmentChanges(task2, map, this);
        if (handleAssignmentChanges == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
