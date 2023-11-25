package com.habitrpg.android.habitica.widget;

import ad.k0;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import dc.n;
import dc.w;
import dd.g;
import dd.i;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: TaskListWidgetProvider.kt */
@f(c = "com.habitrpg.android.habitica.widget.TaskListWidgetProvider$onReceive$1", f = "TaskListWidgetProvider.kt", l = {44, 45}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskListWidgetProvider$onReceive$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ int $appWidgetId;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $taskId;
    int label;
    final /* synthetic */ TaskListWidgetProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskListWidgetProvider$onReceive$1(TaskListWidgetProvider taskListWidgetProvider, String str, Context context, int i10, Continuation<? super TaskListWidgetProvider$onReceive$1> continuation) {
        super(2, continuation);
        this.this$0 = taskListWidgetProvider;
        this.$taskId = str;
        this.$context = context;
        this.$appWidgetId = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskListWidgetProvider$onReceive$1(this.this$0, this.$taskId, this.$context, this.$appWidgetId, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskListWidgetProvider$onReceive$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    this.this$0.showToastForTaskDirection(this.$context, (TaskScoringResult) obj);
                    AppWidgetManager.getInstance(this.$context).notifyAppWidgetViewDataChanged(this.$appWidgetId, R.id.list_view);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            g<User> user = this.this$0.getUserRepository().getUser();
            this.label = 1;
            obj = i.x(user, this);
            if (obj == d10) {
                return d10;
            }
        }
        TaskRepository taskRepository = this.this$0.getTaskRepository();
        String str = this.$taskId;
        this.label = 2;
        obj = taskRepository.taskChecked((User) obj, str, true, false, (pc.l<? super TaskScoringResult, w>) null, (Continuation<? super TaskScoringResult>) this);
        if (obj == d10) {
            return d10;
        }
        this.this$0.showToastForTaskDirection(this.$context, (TaskScoringResult) obj);
        AppWidgetManager.getInstance(this.$context).notifyAppWidgetViewDataChanged(this.$appWidgetId, R.id.list_view);
        return w.f13270a;
    }
}
