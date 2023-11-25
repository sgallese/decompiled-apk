package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.a1;
import ad.i2;
import ad.k0;
import android.os.Bundle;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$openTaskForm$1", f = "TaskRecyclerViewFragment.kt", l = {578, 583}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$openTaskForm$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Task $task;
    int label;
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskRecyclerViewFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$openTaskForm$1$1", f = "TaskRecyclerViewFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$openTaskForm$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10, Bundle bundle, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$id = i10;
            this.$bundle = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$id, this.$bundle, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                MainNavigationController.INSTANCE.navigate(this.$id, this.$bundle);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$openTaskForm$1(TaskRecyclerViewFragment taskRecyclerViewFragment, Task task, Bundle bundle, Continuation<? super TaskRecyclerViewFragment$openTaskForm$1> continuation) {
        super(2, continuation);
        this.this$0 = taskRecyclerViewFragment;
        this.$task = task;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskRecyclerViewFragment$openTaskForm$1(this.this$0, this.$task, this.$bundle, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskRecyclerViewFragment$openTaskForm$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        int i10;
        d10 = ic.d.d();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    n.b(obj);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            TasksViewModel viewModel = this.this$0.getViewModel();
            Task task = this.$task;
            this.label = 1;
            obj = viewModel.canEditTask(task, this);
            if (obj == d10) {
                return d10;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            i10 = R.id.taskFormActivity;
        } else {
            i10 = R.id.taskSummaryActivity;
        }
        i2 c10 = a1.c();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i10, this.$bundle, null);
        this.label = 2;
        if (ad.g.g(c10, anonymousClass1, this) == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
