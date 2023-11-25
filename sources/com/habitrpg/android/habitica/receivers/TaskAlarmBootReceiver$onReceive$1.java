package com.habitrpg.android.habitica.receivers;

import ad.k0;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: TaskAlarmBootReceiver.kt */
@f(c = "com.habitrpg.android.habitica.receivers.TaskAlarmBootReceiver$onReceive$1", f = "TaskAlarmBootReceiver.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskAlarmBootReceiver$onReceive$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ TaskAlarmBootReceiver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskAlarmBootReceiver$onReceive$1(TaskAlarmBootReceiver taskAlarmBootReceiver, Continuation<? super TaskAlarmBootReceiver$onReceive$1> continuation) {
        super(2, continuation);
        this.this$0 = taskAlarmBootReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskAlarmBootReceiver$onReceive$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskAlarmBootReceiver$onReceive$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            TaskAlarmManager taskAlarmManager = this.this$0.getTaskAlarmManager();
            boolean z10 = this.this$0.getSharedPreferences().getBoolean("preventDailyReminder", false);
            this.label = 1;
            if (taskAlarmManager.scheduleAllSavedAlarms(z10, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
