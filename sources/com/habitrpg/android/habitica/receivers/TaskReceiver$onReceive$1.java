package com.habitrpg.android.habitica.receivers;

import ad.k0;
import android.content.Context;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.n;
import dc.w;
import dd.g;
import dd.i;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: TaskReceiver.kt */
@f(c = "com.habitrpg.android.habitica.receivers.TaskReceiver$onReceive$1", f = "TaskReceiver.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskReceiver$onReceive$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $taskId;
    int label;
    final /* synthetic */ TaskReceiver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskReceiver$onReceive$1(TaskReceiver taskReceiver, String str, Context context, Continuation<? super TaskReceiver$onReceive$1> continuation) {
        super(2, continuation);
        this.this$0 = taskReceiver;
        this.$taskId = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskReceiver$onReceive$1(this.this$0, this.$taskId, this.$context, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskReceiver$onReceive$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            String str = this.$taskId;
            if (str == null) {
                str = "";
            }
            g<Task> task = taskRepository.getTask(str);
            this.label = 1;
            obj = i.x(task, this);
            if (obj == d10) {
                return d10;
            }
        }
        Task task2 = (Task) obj;
        if (task2 == null) {
            return w.f13270a;
        }
        if (!task2.isUpdatedToday() || !task2.getCompleted()) {
            this.this$0.createNotification(this.$context, task2);
            return w.f13270a;
        }
        return w.f13270a;
    }
}
