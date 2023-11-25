package com.habitrpg.android.habitica.widget;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskListFactory.kt */
@f(c = "com.habitrpg.android.habitica.widget.TaskListFactory$loadData$1", f = "TaskListFactory.kt", l = {43, 44}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskListFactory$loadData$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ TaskListFactory this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskListFactory$loadData$1(TaskListFactory taskListFactory, Continuation<? super TaskListFactory$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = taskListFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskListFactory$loadData$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskListFactory$loadData$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            dc.n.b(r8)
            goto L73
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            dc.n.b(r8)
            goto L35
        L1f:
            dc.n.b(r8)
            com.habitrpg.android.habitica.widget.TaskListFactory r8 = r7.this$0
            com.habitrpg.android.habitica.data.UserRepository r8 = r8.getUserRepository()
            dd.g r8 = r8.getUser()
            r7.label = r3
            java.lang.Object r8 = dd.i.x(r8, r7)
            if (r8 != r0) goto L35
            return r0
        L35:
            com.habitrpg.android.habitica.models.user.User r8 = (com.habitrpg.android.habitica.models.user.User) r8
            r1 = 0
            if (r8 == 0) goto L55
            com.habitrpg.android.habitica.models.user.Preferences r8 = r8.getPreferences()
            if (r8 == 0) goto L55
            com.habitrpg.android.habitica.models.user.UserTaskPreferences r8 = r8.getTasks()
            if (r8 == 0) goto L55
            io.realm.x0 r8 = r8.getMirrorGroupTasks()
            if (r8 == 0) goto L55
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r8 = r8.toArray(r5)
            java.lang.String[] r8 = (java.lang.String[]) r8
            goto L56
        L55:
            r8 = r1
        L56:
            com.habitrpg.android.habitica.widget.TaskListFactory r5 = r7.this$0
            com.habitrpg.android.habitica.data.TaskRepository r5 = r5.getTaskRepository()
            com.habitrpg.android.habitica.widget.TaskListFactory r6 = r7.this$0
            com.habitrpg.shared.habitica.models.tasks.TaskType r6 = com.habitrpg.android.habitica.widget.TaskListFactory.access$getTaskType$p(r6)
            if (r8 != 0) goto L66
            java.lang.String[] r8 = new java.lang.String[r4]
        L66:
            dd.g r8 = r5.getTasks(r6, r1, r8)
            r7.label = r2
            java.lang.Object r8 = dd.i.x(r8, r7)
            if (r8 != r0) goto L73
            return r0
        L73:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto Ld7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L82:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r8.next()
            r2 = r1
            com.habitrpg.android.habitica.models.tasks.Task r2 = (com.habitrpg.android.habitica.models.tasks.Task) r2
            com.habitrpg.shared.habitica.models.tasks.TaskType r5 = r2.getType()
            com.habitrpg.shared.habitica.models.tasks.TaskType r6 = com.habitrpg.shared.habitica.models.tasks.TaskType.TODO
            if (r5 != r6) goto L9d
            boolean r5 = r2.getCompleted()
            if (r5 == 0) goto La3
        L9d:
            boolean r2 = r2.isDisplayedActive()
            if (r2 == 0) goto La5
        La3:
            r2 = 1
            goto La6
        La5:
            r2 = 0
        La6:
            if (r2 == 0) goto L82
            r0.add(r1)
            goto L82
        Lac:
            com.habitrpg.android.habitica.widget.TaskListFactory r8 = r7.this$0
            com.habitrpg.android.habitica.data.TaskRepository r1 = r8.getTaskRepository()
            java.util.List r0 = r1.getTaskCopies(r0)
            com.habitrpg.android.habitica.widget.TaskListFactory.access$setTaskList$p(r8, r0)
            com.habitrpg.android.habitica.widget.TaskListFactory r8 = r7.this$0
            com.habitrpg.android.habitica.widget.TaskListFactory.access$setReloadData$p(r8, r4)
            com.habitrpg.android.habitica.widget.TaskListFactory r8 = r7.this$0
            android.content.Context r8 = r8.getContext()
            android.appwidget.AppWidgetManager r8 = android.appwidget.AppWidgetManager.getInstance(r8)
            com.habitrpg.android.habitica.widget.TaskListFactory r0 = r7.this$0
            int r0 = com.habitrpg.android.habitica.widget.TaskListFactory.access$getWidgetId$p(r0)
            r1 = 2131296992(0x7f0902e0, float:1.8211916E38)
            r8.notifyAppWidgetViewDataChanged(r0, r1)
            dc.w r8 = dc.w.f13270a
            return r8
        Ld7:
            dc.w r8 = dc.w.f13270a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.widget.TaskListFactory$loadData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
