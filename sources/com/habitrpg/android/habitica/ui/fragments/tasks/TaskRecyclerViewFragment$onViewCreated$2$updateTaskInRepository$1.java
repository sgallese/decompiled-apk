package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$2$updateTaskInRepository$1", f = "TaskRecyclerViewFragment.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$onViewCreated$2$updateTaskInRepository$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ d0 $newPosition;
    final /* synthetic */ String $validTaskId;
    int label;
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$onViewCreated$2$updateTaskInRepository$1(TaskRecyclerViewFragment taskRecyclerViewFragment, String str, d0 d0Var, Continuation<? super TaskRecyclerViewFragment$onViewCreated$2$updateTaskInRepository$1> continuation) {
        super(2, continuation);
        this.this$0 = taskRecyclerViewFragment;
        this.$validTaskId = str;
        this.$newPosition = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskRecyclerViewFragment$onViewCreated$2$updateTaskInRepository$1(this.this$0, this.$validTaskId, this.$newPosition, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskRecyclerViewFragment$onViewCreated$2$updateTaskInRepository$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
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
            TaskType taskType$Habitica_2311256681_prodRelease = this.this$0.getTaskType$Habitica_2311256681_prodRelease();
            String str = this.$validTaskId;
            int i11 = this.$newPosition.f21667f;
            this.label = 1;
            if (taskRepository.updateTaskPosition(taskType$Habitica_2311256681_prodRelease, str, i11, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
