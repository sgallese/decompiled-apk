package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showChallengeDeleteTask$1", f = "TaskFormActivity.kt", l = {860}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskFormActivity$showChallengeDeleteTask$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showChallengeDeleteTask$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TaskFormActivity taskFormActivity) {
            super(2);
            this.this$0 = taskFormActivity;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            Challenge challenge;
            qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            challenge = this.this$0.challenge;
            if (challenge != null) {
                TaskFormActivity taskFormActivity = this.this$0;
                ad.i.d(androidx.lifecycle.w.a(taskFormActivity), ad.a1.c(), null, new TaskFormActivity$showChallengeDeleteTask$1$1$1$1(taskFormActivity, challenge, null), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showChallengeDeleteTask$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TaskFormActivity taskFormActivity) {
            super(2);
            this.this$0 = taskFormActivity;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            Challenge challenge;
            qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            challenge = this.this$0.challenge;
            if (challenge != null) {
                TaskFormActivity taskFormActivity = this.this$0;
                ad.i.d(androidx.lifecycle.w.a(taskFormActivity), ad.a1.c(), null, new TaskFormActivity$showChallengeDeleteTask$1$2$1$1(taskFormActivity, challenge, null), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$showChallengeDeleteTask$1(TaskFormActivity taskFormActivity, Continuation<? super TaskFormActivity$showChallengeDeleteTask$1> continuation) {
        super(2, continuation);
        this.this$0 = taskFormActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new TaskFormActivity$showChallengeDeleteTask$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((TaskFormActivity$showChallengeDeleteTask$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Task task;
        String str;
        Challenge challenge;
        String str2;
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
            task = this.this$0.task;
            if (task != null) {
                str = task.getChallengeID();
            } else {
                str = null;
            }
            dd.g<List<Task>> tasksForChallenge = taskRepository.getTasksForChallenge(str);
            this.label = 1;
            obj = dd.i.x(tasksForChallenge, this);
            if (obj == d10) {
                return d10;
            }
        }
        List list = (List) obj;
        if (list == null) {
            return dc.w.f13270a;
        }
        int size = list.size();
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this.this$0);
        habiticaAlertDialog.setTitle(this.this$0.getString(R.string.delete_challenge_task_title));
        TaskFormActivity taskFormActivity = this.this$0;
        Object[] objArr = new Object[2];
        objArr[0] = kotlin.coroutines.jvm.internal.b.d(size);
        challenge = this.this$0.challenge;
        if (challenge == null || (str2 = challenge.getName()) == null) {
            str2 = "";
        }
        objArr[1] = str2;
        habiticaAlertDialog.setMessage(taskFormActivity.getString(R.string.delete_challenge_task_description, objArr));
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.leave_delete_task, true, true, false, (pc.p) new AnonymousClass1(this.this$0), 8, (Object) null);
        String string = this.this$0.getString(R.string.leave_delete_x_tasks, kotlin.coroutines.jvm.internal.b.d(size));
        qc.q.h(string, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, false, true, false, (pc.p) new AnonymousClass2(this.this$0), 8, (Object) null);
        habiticaAlertDialog.setExtraCloseButtonVisibility(0);
        habiticaAlertDialog.show();
        return dc.w.f13270a;
    }
}
