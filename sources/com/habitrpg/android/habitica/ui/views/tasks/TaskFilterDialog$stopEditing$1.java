package com.habitrpg.android.habitica.ui.views.tasks;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFilterDialog.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog$stopEditing$1", f = "TaskFilterDialog.kt", l = {223, 227, 231}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskFilterDialog$stopEditing$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ TaskFilterDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFilterDialog$stopEditing$1(TaskFilterDialog taskFilterDialog, Continuation<? super TaskFilterDialog$stopEditing$1> continuation) {
        super(2, continuation);
        this.this$0 = taskFilterDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskFilterDialog$stopEditing$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskFilterDialog$stopEditing$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098 A[LOOP:1: B:23:0x0092->B:25:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1 A[LOOP:0: B:30:0x00cf->B:31:0x00d1, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r8.label
            java.lang.String r2 = "<get-values>(...)"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            dc.n.b(r9)
            goto Lc6
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            dc.n.b(r9)
            goto L8a
        L24:
            dc.n.b(r9)
            goto L47
        L28:
            dc.n.b(r9)
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r9 = r8.this$0
            com.habitrpg.android.habitica.data.TagRepository r9 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getRepository$p(r9)
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r1 = r8.this$0
            java.util.HashMap r1 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getEditedTags$p(r1)
            java.util.Collection r1 = r1.values()
            qc.q.h(r1, r2)
            r8.label = r5
            java.lang.Object r9 = r9.updateTags(r1, r8)
            if (r9 != r0) goto L47
            return r0
        L47:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r1 = r8.this$0
            java.util.Iterator r9 = r9.iterator()
        L4f:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r9.next()
            com.habitrpg.android.habitica.models.Tag r5 = (com.habitrpg.android.habitica.models.Tag) r5
            java.util.HashMap r6 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getEditedTags$p(r1)
            java.lang.String r7 = r5.getId()
            r6.remove(r7)
            java.util.List r6 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getTags$p(r1)
            r6.remove(r5)
            goto L4f
        L6e:
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r9 = r8.this$0
            com.habitrpg.android.habitica.data.TagRepository r9 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getRepository$p(r9)
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r1 = r8.this$0
            java.util.HashMap r1 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getCreatedTags$p(r1)
            java.util.Collection r1 = r1.values()
            qc.q.h(r1, r2)
            r8.label = r4
            java.lang.Object r9 = r9.createTags(r1, r8)
            if (r9 != r0) goto L8a
            return r0
        L8a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r1 = r8.this$0
            java.util.Iterator r9 = r9.iterator()
        L92:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r9.next()
            com.habitrpg.android.habitica.models.Tag r2 = (com.habitrpg.android.habitica.models.Tag) r2
            java.util.HashMap r4 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getCreatedTags$p(r1)
            java.lang.String r5 = r2.getId()
            r4.remove(r5)
            java.util.List r4 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getTags$p(r1)
            r4.remove(r2)
            goto L92
        Lb1:
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r9 = r8.this$0
            com.habitrpg.android.habitica.data.TagRepository r9 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getRepository$p(r9)
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r1 = r8.this$0
            java.util.ArrayList r1 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getDeletedTags$p(r1)
            r8.label = r3
            java.lang.Object r9 = r9.deleteTags(r1, r8)
            if (r9 != r0) goto Lc6
            return r0
        Lc6:
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.size()
            com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog r0 = r8.this$0
            r1 = 0
        Lcf:
            if (r1 >= r9) goto Ldb
            java.util.ArrayList r2 = com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog.access$getDeletedTags$p(r0)
            r2.clear()
            int r1 = r1 + 1
            goto Lcf
        Ldb:
            dc.w r9 = dc.w.f13270a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog$stopEditing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
