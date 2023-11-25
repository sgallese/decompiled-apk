package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.tasks.Task;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetupActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SetupActivity$nextClicked$2$1", f = "SetupActivity.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SetupActivity$nextClicked$2$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ List<Task> $it;
    int label;
    final /* synthetic */ SetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SetupActivity$nextClicked$2$1(SetupActivity setupActivity, List<? extends Task> list, Continuation<? super SetupActivity$nextClicked$2$1> continuation) {
        super(2, continuation);
        this.this$0 = setupActivity;
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new SetupActivity$nextClicked$2$1(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((SetupActivity$nextClicked$2$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            TaskRepository taskRepository = this.this$0.getTaskRepository();
            List<Task> list = this.$it;
            this.label = 1;
            if (taskRepository.createTasks(list, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
