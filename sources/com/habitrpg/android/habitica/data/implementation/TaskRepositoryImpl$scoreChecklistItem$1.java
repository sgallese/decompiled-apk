package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl", f = "TaskRepositoryImpl.kt", l = {229}, m = "scoreChecklistItem")
/* loaded from: classes4.dex */
public final class TaskRepositoryImpl$scoreChecklistItem$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TaskRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRepositoryImpl$scoreChecklistItem$1(TaskRepositoryImpl taskRepositoryImpl, Continuation<? super TaskRepositoryImpl$scoreChecklistItem$1> continuation) {
        super(continuation);
        this.this$0 = taskRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.scoreChecklistItem(null, null, this);
    }
}
