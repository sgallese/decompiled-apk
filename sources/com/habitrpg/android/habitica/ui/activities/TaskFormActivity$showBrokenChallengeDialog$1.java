package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showBrokenChallengeDialog$1", f = "TaskFormActivity.kt", l = {908}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskFormActivity$showBrokenChallengeDialog$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ Task $task;
    int label;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showBrokenChallengeDialog$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
        final /* synthetic */ Task $task;
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskFormActivity.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showBrokenChallengeDialog$1$1$1", f = "TaskFormActivity.kt", l = {924, 925}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showBrokenChallengeDialog$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02761 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
            final /* synthetic */ Task $task;
            int label;
            final /* synthetic */ TaskFormActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02761(TaskFormActivity taskFormActivity, Task task, Continuation<? super C02761> continuation) {
                super(2, continuation);
                this.this$0 = taskFormActivity;
                this.$task = task;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C02761(this.this$0, this.$task, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C02761) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            dc.n.b(obj);
                            return dc.w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dc.n.b(obj);
                } else {
                    dc.n.b(obj);
                    TaskRepository taskRepository = this.this$0.getTaskRepository();
                    String challengeID = this.$task.getChallengeID();
                    this.label = 1;
                    if (taskRepository.unlinkAllTasks(challengeID, "keep-all", this) == d10) {
                        return d10;
                    }
                }
                UserRepository userRepository = this.this$0.getUserRepository();
                this.label = 2;
                if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, true, false, this, 4, null) == d10) {
                    return d10;
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TaskFormActivity taskFormActivity, Task task) {
            super(2);
            this.this$0 = taskFormActivity;
            this.$task = task;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            ad.i.d(androidx.lifecycle.w.a(this.this$0), ad.a1.c(), null, new C02761(this.this$0, this.$task, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showBrokenChallengeDialog$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
        final /* synthetic */ Task $task;
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskFormActivity.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showBrokenChallengeDialog$1$2$1", f = "TaskFormActivity.kt", l = {934, 935}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showBrokenChallengeDialog$1$2$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
            final /* synthetic */ Task $task;
            int label;
            final /* synthetic */ TaskFormActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaskFormActivity taskFormActivity, Task task, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = taskFormActivity;
                this.$task = task;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$task, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            dc.n.b(obj);
                            return dc.w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dc.n.b(obj);
                } else {
                    dc.n.b(obj);
                    TaskRepository taskRepository = this.this$0.getTaskRepository();
                    String challengeID = this.$task.getChallengeID();
                    this.label = 1;
                    if (taskRepository.unlinkAllTasks(challengeID, "remove-all", this) == d10) {
                        return d10;
                    }
                }
                UserRepository userRepository = this.this$0.getUserRepository();
                this.label = 2;
                if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, true, false, this, 4, null) == d10) {
                    return d10;
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TaskFormActivity taskFormActivity, Task task) {
            super(2);
            this.this$0 = taskFormActivity;
            this.$task = task;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            ad.i.d(androidx.lifecycle.w.a(this.this$0), ad.a1.c(), null, new AnonymousClass1(this.this$0, this.$task, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$showBrokenChallengeDialog$1(TaskFormActivity taskFormActivity, Task task, Continuation<? super TaskFormActivity$showBrokenChallengeDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = taskFormActivity;
        this.$task = task;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new TaskFormActivity$showBrokenChallengeDialog$1(this.this$0, this.$task, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((TaskFormActivity$showBrokenChallengeDialog$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            dd.g<List<Task>> tasksForChallenge = this.this$0.getTaskRepository().getTasksForChallenge(this.$task.getChallengeID());
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
        habiticaAlertDialog.setTitle(R.string.broken_challenge);
        habiticaAlertDialog.setMessage(this.this$0.getString(R.string.broken_challenge_description, kotlin.coroutines.jvm.internal.b.d(size)));
        String string = this.this$0.getString(R.string.keep_x_tasks, kotlin.coroutines.jvm.internal.b.d(size));
        qc.q.h(string, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (pc.p) new AnonymousClass1(this.this$0, this.$task), 12, (Object) null);
        String string2 = this.this$0.getString(R.string.delete_x_tasks, kotlin.coroutines.jvm.internal.b.d(size));
        qc.q.h(string2, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string2, false, true, false, (pc.p) new AnonymousClass2(this.this$0, this.$task), 8, (Object) null);
        habiticaAlertDialog.setExtraCloseButtonVisibility(0);
        habiticaAlertDialog.show();
        return dc.w.f13270a;
    }
}
