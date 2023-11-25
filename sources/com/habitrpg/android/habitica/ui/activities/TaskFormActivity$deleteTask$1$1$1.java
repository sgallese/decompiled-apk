package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.TaskRepository;
import kotlin.coroutines.Continuation;

/* compiled from: TaskFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$deleteTask$1$1$1", f = "TaskFormActivity.kt", l = {834}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskFormActivity$deleteTask$1$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$deleteTask$1$1$1(TaskFormActivity taskFormActivity, String str, Continuation<? super TaskFormActivity$deleteTask$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = taskFormActivity;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new TaskFormActivity$deleteTask$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((TaskFormActivity$deleteTask$1$1$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            TaskRepository taskRepository = this.this$0.getTaskRepository();
            String str = this.$it;
            this.label = 1;
            if (taskRepository.deleteTask(str, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
