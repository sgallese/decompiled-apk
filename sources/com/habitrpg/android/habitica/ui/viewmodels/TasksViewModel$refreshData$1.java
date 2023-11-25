package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TasksViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$refreshData$1", f = "TasksViewModel.kt", l = {83, 88, 91}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TasksViewModel$refreshData$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ pc.a<w> $onComplete;
    int label;
    final /* synthetic */ TasksViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksViewModel$refreshData$1(TasksViewModel tasksViewModel, pc.a<w> aVar, Continuation<? super TasksViewModel$refreshData$1> continuation) {
        super(2, continuation);
        this.this$0 = tasksViewModel;
        this.$onComplete = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TasksViewModel$refreshData$1(this.this$0, this.$onComplete, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TasksViewModel$refreshData$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            dc.n.b(r13)
            goto L85
        L1e:
            dc.n.b(r13)
            goto L42
        L22:
            dc.n.b(r13)
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r13 = r12.this$0
            boolean r13 = r13.isPersonalBoard()
            if (r13 == 0) goto L66
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r13 = r12.this$0
            com.habitrpg.android.habitica.data.UserRepository r5 = r13.getUserRepository()
            r6 = 1
            r7 = 1
            r8 = 0
            r10 = 4
            r11 = 0
            r12.label = r4
            r9 = r12
            java.lang.Object r13 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L42
            return r0
        L42:
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r13 = r12.this$0
            java.util.HashMap r13 = com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel.access$getActiveFilters$p(r13)
            com.habitrpg.shared.habitica.models.tasks.TaskType r1 = com.habitrpg.shared.habitica.models.tasks.TaskType.TODO
            java.lang.Object r13 = r13.get(r1)
            java.lang.String r1 = "completed"
            boolean r13 = qc.q.d(r13, r1)
            if (r13 == 0) goto L85
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r13 = r12.this$0
            com.habitrpg.android.habitica.data.TaskRepository r13 = r13.getTaskRepository()
            r12.label = r3
            r1 = 0
            java.lang.Object r13 = com.habitrpg.android.habitica.data.TaskRepository.DefaultImpls.retrieveCompletedTodos$default(r13, r1, r12, r4, r1)
            if (r13 != r0) goto L85
            return r0
        L66:
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r13 = r12.this$0
            com.habitrpg.android.habitica.data.UserRepository r13 = r13.getUserRepository()
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r1 = r12.this$0
            androidx.lifecycle.f0 r1 = r1.getOwnerID()
            java.lang.Object r1 = r1.f()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L7c
            java.lang.String r1 = ""
        L7c:
            r12.label = r2
            java.lang.Object r13 = r13.retrieveTeamPlan(r1, r12)
            if (r13 != r0) goto L85
            return r0
        L85:
            pc.a<dc.w> r13 = r12.$onComplete
            r13.invoke()
            dc.w r13 = dc.w.f13270a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$refreshData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
