package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.tasks.Task;
import kotlin.coroutines.Continuation;

/* compiled from: TaskFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$8", f = "TaskFormActivity.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$8 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $taskId;
    int label;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$8(TaskFormActivity taskFormActivity, String str, Continuation<? super TaskFormActivity$onCreate$8> continuation) {
        super(2, continuation);
        this.this$0 = taskFormActivity;
        this.$taskId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new TaskFormActivity$onCreate$8(this.this$0, this.$taskId, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((TaskFormActivity$onCreate$8) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            dd.g<Task> unmanagedTask = this.this$0.getTaskRepository().getUnmanagedTask(this.$taskId);
            this.label = 1;
            obj = dd.i.x(unmanagedTask, this);
            if (obj == d10) {
                return d10;
            }
        }
        Task task = (Task) obj;
        if (task == null) {
            return dc.w.f13270a;
        }
        if (task.isValid()) {
            this.this$0.task = task;
            this.this$0.initialTaskInstance = task;
            this.this$0.fillForm(task);
            String challengeID = task.getChallengeID();
            if (challengeID != null) {
                TaskFormActivity taskFormActivity = this.this$0;
                ad.i.d(androidx.lifecycle.w.a(taskFormActivity), ad.a1.c(), null, new TaskFormActivity$onCreate$8$1$1(taskFormActivity, challengeID, null), 2, null);
            }
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }
}
