package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TasksViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel", f = "TasksViewModel.kt", l = {343}, m = "canAddTasks")
/* loaded from: classes4.dex */
public final class TasksViewModel$canAddTasks$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TasksViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksViewModel$canAddTasks$1(TasksViewModel tasksViewModel, Continuation<? super TasksViewModel$canAddTasks$1> continuation) {
        super(continuation);
        this.this$0 = tasksViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.canAddTasks(this);
    }
}
