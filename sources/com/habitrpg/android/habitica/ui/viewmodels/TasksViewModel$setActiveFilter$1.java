package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.data.TaskRepository;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TasksViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$setActiveFilter$1", f = "TasksViewModel.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TasksViewModel$setActiveFilter$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ TasksViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksViewModel$setActiveFilter$1(TasksViewModel tasksViewModel, Continuation<? super TasksViewModel$setActiveFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = tasksViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TasksViewModel$setActiveFilter$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TasksViewModel$setActiveFilter$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            TaskRepository taskRepository = this.this$0.getTaskRepository();
            this.label = 1;
            if (TaskRepository.DefaultImpls.retrieveCompletedTodos$default(taskRepository, null, this, 1, null) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
