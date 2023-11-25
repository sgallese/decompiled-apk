package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import android.content.SharedPreferences;
import android.text.format.DateUtils;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import dc.n;
import dc.w;
import ic.d;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TasksViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$scoreTask$1", f = "TasksViewModel.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TasksViewModel$scoreTask$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ TaskDirection $direction;
    final /* synthetic */ p<TaskScoringResult, Integer, w> $onResult;
    final /* synthetic */ Task $task;
    int label;
    final /* synthetic */ TasksViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TasksViewModel.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$scoreTask$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements pc.l<TaskScoringResult, w> {
        final /* synthetic */ p<TaskScoringResult, Integer, w> $onResult;
        final /* synthetic */ Task $task;
        final /* synthetic */ TasksViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super TaskScoringResult, ? super Integer, w> pVar, Task task, TasksViewModel tasksViewModel) {
            super(1);
            this.$onResult = pVar;
            this.$task = task;
            this.this$0 = tasksViewModel;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(TaskScoringResult taskScoringResult) {
            invoke2(taskScoringResult);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(TaskScoringResult taskScoringResult) {
            q.i(taskScoringResult, "result");
            this.$onResult.invoke(taskScoringResult, Integer.valueOf((int) this.$task.getValue()));
            if (DateUtils.isToday(this.this$0.getSharedPreferences().getLong("last_task_reporting", 0L))) {
                return;
            }
            Analytics.sendEvent$default(Analytics.INSTANCE, "task scored", EventCategory.BEHAVIOUR, HitType.EVENT, null, null, 24, null);
            SharedPreferences.Editor edit = this.this$0.getSharedPreferences().edit();
            edit.putLong("last_task_reporting", new Date().getTime());
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TasksViewModel$scoreTask$1(TasksViewModel tasksViewModel, Task task, TaskDirection taskDirection, p<? super TaskScoringResult, ? super Integer, w> pVar, Continuation<? super TasksViewModel$scoreTask$1> continuation) {
        super(2, continuation);
        this.this$0 = tasksViewModel;
        this.$task = task;
        this.$direction = taskDirection;
        this.$onResult = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TasksViewModel$scoreTask$1(this.this$0, this.$task, this.$direction, this.$onResult, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TasksViewModel$scoreTask$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        boolean z10;
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
            String id2 = this.$task.getId();
            if (id2 == null) {
                id2 = "";
            }
            String str = id2;
            if (this.$direction == TaskDirection.UP) {
                z10 = true;
            } else {
                z10 = false;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onResult, this.$task, this.this$0);
            this.label = 1;
            if (taskRepository.taskChecked((User) null, str, z10, false, (pc.l<? super TaskScoringResult, w>) anonymousClass1, (Continuation<? super TaskScoringResult>) this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
