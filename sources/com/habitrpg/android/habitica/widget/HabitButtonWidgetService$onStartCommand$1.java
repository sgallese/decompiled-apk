package com.habitrpg.android.habitica.widget;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: HabitButtonWidgetService.kt */
@f(c = "com.habitrpg.android.habitica.widget.HabitButtonWidgetService$onStartCommand$1", f = "HabitButtonWidgetService.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HabitButtonWidgetService$onStartCommand$1 extends l implements p<k0, Continuation<? super w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HabitButtonWidgetService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitButtonWidgetService$onStartCommand$1(HabitButtonWidgetService habitButtonWidgetService, Continuation<? super HabitButtonWidgetService$onStartCommand$1> continuation) {
        super(2, continuation);
        this.this$0 = habitButtonWidgetService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new HabitButtonWidgetService$onStartCommand$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((HabitButtonWidgetService$onStartCommand$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0052 -> B:15:0x0057). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r6.L$0
            java.util.Iterator r1 = (java.util.Iterator) r1
            dc.n.b(r7)
            r3 = r1
            r1 = r0
            r0 = r6
            goto L57
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            dc.n.b(r7)
            com.habitrpg.android.habitica.widget.HabitButtonWidgetService r7 = r6.this$0
            java.util.Map r7 = com.habitrpg.android.habitica.widget.HabitButtonWidgetService.access$getTaskMapping$p(r7)
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
            r1 = r7
            r7 = r6
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            com.habitrpg.android.habitica.widget.HabitButtonWidgetService r4 = r7.this$0
            com.habitrpg.android.habitica.data.TaskRepository r4 = r4.getTaskRepository()
            dd.g r3 = r4.getUnmanagedTask(r3)
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r3 = dd.i.x(r3, r7)
            if (r3 != r0) goto L52
            return r0
        L52:
            r5 = r0
            r0 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L57:
            com.habitrpg.android.habitica.models.tasks.Task r7 = (com.habitrpg.android.habitica.models.tasks.Task) r7
            com.habitrpg.android.habitica.widget.HabitButtonWidgetService r4 = r0.this$0
            com.habitrpg.android.habitica.widget.HabitButtonWidgetService.access$updateData(r4, r7)
            r7 = r0
            r0 = r1
            r1 = r3
            goto L31
        L62:
            dc.w r7 = dc.w.f13270a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.widget.HabitButtonWidgetService$onStartCommand$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
