package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter;
import dc.n;
import dc.w;
import dd.h;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$updateTaskSubscription$1", f = "TaskRecyclerViewFragment.kt", l = {382}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$updateTaskSubscription$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String[] $additionalGroupIDs;
    final /* synthetic */ String $ownerID;
    int label;
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$updateTaskSubscription$1(TaskRecyclerViewFragment taskRecyclerViewFragment, String str, String[] strArr, Continuation<? super TaskRecyclerViewFragment$updateTaskSubscription$1> continuation) {
        super(2, continuation);
        this.this$0 = taskRecyclerViewFragment;
        this.$ownerID = str;
        this.$additionalGroupIDs = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskRecyclerViewFragment$updateTaskSubscription$1(this.this$0, this.$ownerID, this.$additionalGroupIDs, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskRecyclerViewFragment$updateTaskSubscription$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<List<Task>> tasks = this.this$0.getTaskRepository().getTasks(this.this$0.getTaskType$Habitica_2311256681_prodRelease(), this.$ownerID, this.$additionalGroupIDs);
            final TaskRecyclerViewFragment taskRecyclerViewFragment = this.this$0;
            h<? super List<Task>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$updateTaskSubscription$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Task> list, Continuation<? super w> continuation) {
                    TaskRecyclerViewAdapter recyclerAdapter = TaskRecyclerViewFragment.this.getRecyclerAdapter();
                    if (recyclerAdapter != null) {
                        recyclerAdapter.updateUnfilteredData(list);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (tasks.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
