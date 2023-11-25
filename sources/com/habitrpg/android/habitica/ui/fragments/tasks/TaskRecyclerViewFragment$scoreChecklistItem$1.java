package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$scoreChecklistItem$1", f = "TaskRecyclerViewFragment.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$scoreChecklistItem$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ChecklistItem $item;
    final /* synthetic */ Task $task;
    int label;
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$scoreChecklistItem$1(TaskRecyclerViewFragment taskRecyclerViewFragment, Task task, ChecklistItem checklistItem, Continuation<? super TaskRecyclerViewFragment$scoreChecklistItem$1> continuation) {
        super(2, continuation);
        this.this$0 = taskRecyclerViewFragment;
        this.$task = task;
        this.$item = checklistItem;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskRecyclerViewFragment$scoreChecklistItem$1(this.this$0, this.$task, this.$item, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskRecyclerViewFragment$scoreChecklistItem$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            String id2 = this.$task.getId();
            String str = "";
            if (id2 == null) {
                id2 = "";
            }
            String id3 = this.$item.getId();
            if (id3 != null) {
                str = id3;
            }
            this.label = 1;
            if (taskRepository.scoreChecklistItem(id2, str, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
