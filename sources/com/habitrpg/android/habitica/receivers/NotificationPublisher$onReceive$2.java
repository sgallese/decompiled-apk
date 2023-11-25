package com.habitrpg.android.habitica.receivers;

import ad.k0;
import android.content.Intent;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.b0;

/* compiled from: NotificationPublisher.kt */
@f(c = "com.habitrpg.android.habitica.receivers.NotificationPublisher$onReceive$2", f = "NotificationPublisher.kt", l = {62, 63}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationPublisher$onReceive$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ b0 $wasInactive;
    Object L$0;
    int label;
    final /* synthetic */ NotificationPublisher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPublisher$onReceive$2(NotificationPublisher notificationPublisher, Intent intent, b0 b0Var, Continuation<? super NotificationPublisher$onReceive$2> continuation) {
        super(2, continuation);
        this.this$0 = notificationPublisher;
        this.$intent = intent;
        this.$wasInactive = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new NotificationPublisher$onReceive$2(this.this$0, this.$intent, this.$wasInactive, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((NotificationPublisher$onReceive$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[EDGE_INSN: B:38:0x0076->B:26:0x0076 BREAK  A[LOOP:0: B:21:0x0063->B:39:?], SYNTHETIC] */
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
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            java.lang.Object r0 = r7.L$0
            java.util.List r0 = (java.util.List) r0
            dc.n.b(r8)
            goto L57
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            dc.n.b(r8)
            goto L3e
        L24:
            dc.n.b(r8)
            com.habitrpg.android.habitica.receivers.NotificationPublisher r8 = r7.this$0
            com.habitrpg.android.habitica.data.TaskRepository r8 = r8.getTaskRepository()
            com.habitrpg.shared.habitica.models.tasks.TaskType r1 = com.habitrpg.shared.habitica.models.tasks.TaskType.DAILY
            java.lang.String[] r6 = new java.lang.String[r2]
            dd.g r8 = r8.getTasks(r1, r3, r6)
            r7.label = r5
            java.lang.Object r8 = dd.i.x(r8, r7)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            java.util.List r8 = (java.util.List) r8
            com.habitrpg.android.habitica.receivers.NotificationPublisher r1 = r7.this$0
            com.habitrpg.android.habitica.data.UserRepository r1 = r1.getUserRepository()
            dd.g r1 = r1.getUser()
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r1 = dd.i.x(r1, r7)
            if (r1 != r0) goto L55
            return r0
        L55:
            r0 = r8
            r8 = r1
        L57:
            com.habitrpg.android.habitica.models.user.User r8 = (com.habitrpg.android.habitica.models.user.User) r8
            if (r0 != 0) goto L5f
            java.util.List r0 = ec.r.i()
        L5f:
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            com.habitrpg.android.habitica.models.tasks.Task r1 = (com.habitrpg.android.habitica.models.tasks.Task) r1
            boolean r1 = r1.checkIfDue()
            if (r1 == 0) goto L63
            r2 = 1
        L76:
            if (r2 == 0) goto L99
            com.habitrpg.android.habitica.receivers.NotificationPublisher r0 = r7.this$0
            android.content.Intent r1 = r7.$intent
            qc.b0 r2 = r7.$wasInactive
            boolean r2 = r2.f21657f
            if (r8 == 0) goto L92
            com.habitrpg.android.habitica.models.user.Authentication r8 = r8.getAuthentication()
            if (r8 == 0) goto L92
            com.habitrpg.android.habitica.models.user.AuthenticationTimestamps r8 = r8.getTimestamps()
            if (r8 == 0) goto L92
            java.util.Date r3 = r8.getCreatedAt()
        L92:
            android.app.Notification r8 = com.habitrpg.android.habitica.receivers.NotificationPublisher.access$buildNotification(r0, r2, r3)
            com.habitrpg.android.habitica.receivers.NotificationPublisher.access$notify(r0, r1, r8)
        L99:
            dc.w r8 = dc.w.f13270a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.receivers.NotificationPublisher$onReceive$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
