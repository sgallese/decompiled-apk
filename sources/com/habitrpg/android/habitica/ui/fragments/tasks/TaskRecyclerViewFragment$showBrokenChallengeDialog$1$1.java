package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.i;
import ad.k0;
import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1", f = "TaskRecyclerViewFragment.kt", l = {394}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Context $it;
    final /* synthetic */ Task $task;
    int label;
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskRecyclerViewFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements p<HabiticaAlertDialog, Integer, w> {
        final /* synthetic */ Task $task;
        final /* synthetic */ TaskRecyclerViewFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskRecyclerViewFragment.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1$1$1", f = "TaskRecyclerViewFragment.kt", l = {411, 412}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02951 extends l implements p<k0, Continuation<? super w>, Object> {
            final /* synthetic */ Task $task;
            int label;
            final /* synthetic */ TaskRecyclerViewFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02951(TaskRecyclerViewFragment taskRecyclerViewFragment, Task task, Continuation<? super C02951> continuation) {
                super(2, continuation);
                this.this$0 = taskRecyclerViewFragment;
                this.$task = task;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C02951(this.this$0, this.$task, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((C02951) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            n.b(obj);
                            return w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                } else {
                    n.b(obj);
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
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Task task, TaskRecyclerViewFragment taskRecyclerViewFragment) {
            super(2);
            this.$task = task;
            this.this$0 = taskRecyclerViewFragment;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            if (this.$task.isValid()) {
                i.d(androidx.lifecycle.w.a(this.this$0), null, null, new C02951(this.this$0, this.$task, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskRecyclerViewFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends r implements p<HabiticaAlertDialog, Integer, w> {
        final /* synthetic */ Task $task;
        final /* synthetic */ TaskRecyclerViewFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskRecyclerViewFragment.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1$2$1", f = "TaskRecyclerViewFragment.kt", l = {422, 423}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1$2$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
            final /* synthetic */ Task $task;
            int label;
            final /* synthetic */ TaskRecyclerViewFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaskRecyclerViewFragment taskRecyclerViewFragment, Task task, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = taskRecyclerViewFragment;
                this.$task = task;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$task, continuation);
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
                    if (i10 != 1) {
                        if (i10 == 2) {
                            n.b(obj);
                            return w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                } else {
                    n.b(obj);
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
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Task task, TaskRecyclerViewFragment taskRecyclerViewFragment) {
            super(2);
            this.$task = task;
            this.this$0 = taskRecyclerViewFragment;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            if (this.$task.isValid()) {
                i.d(androidx.lifecycle.w.a(this.this$0), null, null, new AnonymousClass1(this.this$0, this.$task, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1(TaskRecyclerViewFragment taskRecyclerViewFragment, Task task, Context context, Continuation<? super TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1> continuation) {
        super(2, continuation);
        this.this$0 = taskRecyclerViewFragment;
        this.$task = task;
        this.$it = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1(this.this$0, this.$task, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<List<Task>> tasksForChallenge = this.this$0.getTaskRepository().getTasksForChallenge(this.$task.getChallengeID());
            this.label = 1;
            obj = dd.i.x(tasksForChallenge, this);
            if (obj == d10) {
                return d10;
            }
        }
        List list = (List) obj;
        if (list == null) {
            return w.f13270a;
        }
        int size = list.size();
        Context context = this.$it;
        q.h(context, "$it");
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(R.string.broken_challenge);
        habiticaAlertDialog.setMessage(this.$it.getString(R.string.broken_challenge_description, kotlin.coroutines.jvm.internal.b.d(size)));
        String string = this.$it.getString(R.string.keep_x_tasks, kotlin.coroutines.jvm.internal.b.d(size));
        q.h(string, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (p) new AnonymousClass1(this.$task, this.this$0), 12, (Object) null);
        String string2 = this.$it.getString(R.string.delete_x_tasks, kotlin.coroutines.jvm.internal.b.d(size));
        q.h(string2, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string2, false, true, false, (p) new AnonymousClass2(this.$task, this.this$0), 8, (Object) null);
        habiticaAlertDialog.setExtraCloseButtonVisibility(0);
        habiticaAlertDialog.show();
        return w.f13270a;
    }
}
