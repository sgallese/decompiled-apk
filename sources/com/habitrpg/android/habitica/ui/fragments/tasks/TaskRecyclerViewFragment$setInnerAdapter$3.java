package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$setInnerAdapter$3 extends r implements l<String, w> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskRecyclerViewFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$setInnerAdapter$3$1", f = "TaskRecyclerViewFragment.kt", l = {143}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$setInnerAdapter$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        int label;
        final /* synthetic */ TaskRecyclerViewFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TaskRecyclerViewFragment taskRecyclerViewFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = taskRecyclerViewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
                this.label = 1;
                if (taskRepository.syncErroredTasks(this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$setInnerAdapter$3(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(1);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, "it");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, null), 1, null);
    }
}
