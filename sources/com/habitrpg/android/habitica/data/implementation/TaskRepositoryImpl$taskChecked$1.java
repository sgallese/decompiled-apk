package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import pc.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl", f = "TaskRepositoryImpl.kt", l = {99, 101}, m = "taskChecked")
/* loaded from: classes4.dex */
public final class TaskRepositoryImpl$taskChecked$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TaskRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRepositoryImpl$taskChecked$1(TaskRepositoryImpl taskRepositoryImpl, Continuation<? super TaskRepositoryImpl$taskChecked$1> continuation) {
        super(continuation);
        this.this$0 = taskRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.taskChecked((User) null, (Task) null, false, false, (l<? super TaskScoringResult, w>) null, (Continuation<? super TaskScoringResult>) this);
    }
}
