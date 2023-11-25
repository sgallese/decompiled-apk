package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$setGroupID$1", f = "GroupViewModel.kt", l = {95, 99}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$setGroupID$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $groupID;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$setGroupID$1(GroupViewModel groupViewModel, String str, Continuation<? super GroupViewModel$setGroupID$1> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$groupID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$setGroupID$1(this.this$0, this.$groupID, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$setGroupID$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r8.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r8.L$0
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r3 = (com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel) r3
            dc.n.b(r9)
            goto L84
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            dc.n.b(r9)
            goto L3c
        L26:
            dc.n.b(r9)
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r9 = r8.this$0
            com.habitrpg.android.habitica.helpers.NotificationsManager r9 = r9.getNotificationsManager()
            dd.g r9 = r9.getNotifications()
            r8.label = r3
            java.lang.Object r9 = dd.i.x(r9, r8)
            if (r9 != r0) goto L3c
            return r0
        L3c:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto La9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.String r1 = r8.$groupID
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L7d
            java.lang.Object r4 = r9.next()
            r5 = r4
            com.habitrpg.common.habitica.models.Notification r5 = (com.habitrpg.common.habitica.models.Notification) r5
            com.habitrpg.common.habitica.models.notifications.NotificationData r5 = r5.getData()
            boolean r6 = r5 instanceof com.habitrpg.common.habitica.models.notifications.NewChatMessageData
            r7 = 0
            if (r6 == 0) goto L66
            com.habitrpg.common.habitica.models.notifications.NewChatMessageData r5 = (com.habitrpg.common.habitica.models.notifications.NewChatMessageData) r5
            goto L67
        L66:
            r5 = r7
        L67:
            if (r5 == 0) goto L73
            com.habitrpg.common.habitica.models.notifications.NotificationGroup r5 = r5.getGroup()
            if (r5 == 0) goto L73
            java.lang.String r7 = r5.getId()
        L73:
            boolean r5 = qc.q.d(r7, r1)
            if (r5 == 0) goto L4d
            r3.add(r4)
            goto L4d
        L7d:
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r9 = r8.this$0
            java.util.Iterator r1 = r3.iterator()
            r3 = r9
        L84:
            r9 = r8
        L85:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto La6
            java.lang.Object r4 = r1.next()
            com.habitrpg.common.habitica.models.Notification r4 = (com.habitrpg.common.habitica.models.Notification) r4
            com.habitrpg.android.habitica.data.UserRepository r5 = r3.getUserRepository()
            java.lang.String r4 = r4.getId()
            r9.L$0 = r3
            r9.L$1 = r1
            r9.label = r2
            java.lang.Object r4 = r5.readNotification(r4, r9)
            if (r4 != r0) goto L85
            return r0
        La6:
            dc.w r9 = dc.w.f13270a
            return r9
        La9:
            dc.w r9 = dc.w.f13270a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$setGroupID$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
