package com.habitrpg.android.habitica.widget;

import ad.k0;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
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
import qc.q;

/* compiled from: HabitButtonWidgetProvider.kt */
@f(c = "com.habitrpg.android.habitica.widget.HabitButtonWidgetProvider$onReceive$1", f = "HabitButtonWidgetProvider.kt", l = {71, 72}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HabitButtonWidgetProvider$onReceive$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $direction;
    final /* synthetic */ int[] $ids;
    final /* synthetic */ AppWidgetManager $mgr;
    final /* synthetic */ String $taskId;
    int label;
    final /* synthetic */ HabitButtonWidgetProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitButtonWidgetProvider$onReceive$1(HabitButtonWidgetProvider habitButtonWidgetProvider, String str, String str2, Context context, AppWidgetManager appWidgetManager, int[] iArr, Continuation<? super HabitButtonWidgetProvider$onReceive$1> continuation) {
        super(2, continuation);
        this.this$0 = habitButtonWidgetProvider;
        this.$taskId = str;
        this.$direction = str2;
        this.$context = context;
        this.$mgr = appWidgetManager;
        this.$ids = iArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new HabitButtonWidgetProvider$onReceive$1(this.this$0, this.$taskId, this.$direction, this.$context, this.$mgr, this.$ids, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((HabitButtonWidgetProvider$onReceive$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
                    HabitButtonWidgetProvider habitButtonWidgetProvider = this.this$0;
                    Context context = this.$context;
                    AppWidgetManager appWidgetManager = this.$mgr;
                    q.h(appWidgetManager, "$mgr");
                    habitButtonWidgetProvider.onUpdate(context, appWidgetManager, this.$ids);
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
        boolean d11 = q.d(TaskDirection.UP.getText(), this.$direction);
        this.label = 2;
        obj = taskRepository.taskChecked((User) obj, str, d11, false, (pc.l<? super TaskScoringResult, w>) null, (Continuation<? super TaskScoringResult>) this);
        if (obj == d10) {
            return d10;
        }
        this.this$0.showToastForTaskDirection(this.$context, (TaskScoringResult) obj);
        HabitButtonWidgetProvider habitButtonWidgetProvider2 = this.this$0;
        Context context2 = this.$context;
        AppWidgetManager appWidgetManager2 = this.$mgr;
        q.h(appWidgetManager2, "$mgr");
        habitButtonWidgetProvider2.onUpdate(context2, appWidgetManager2, this.$ids);
        return w.f13270a;
    }
}
