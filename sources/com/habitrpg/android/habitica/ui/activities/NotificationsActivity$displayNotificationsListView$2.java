package com.habitrpg.android.habitica.ui.activities;

import android.view.View;
import com.habitrpg.common.habitica.models.Notification;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.NotificationsActivity$displayNotificationsListView$2", f = "NotificationsActivity.kt", l = {145, 151}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsActivity$displayNotificationsListView$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ List<Notification> $notifications;
    final /* synthetic */ ArrayList<View> $viewList;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ NotificationsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivity$displayNotificationsListView$2(List<Notification> list, NotificationsActivity notificationsActivity, ArrayList<View> arrayList, Continuation<? super NotificationsActivity$displayNotificationsListView$2> continuation) {
        super(2, continuation);
        this.$notifications = list;
        this.this$0 = notificationsActivity;
        this.$viewList = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsActivity$displayNotificationsListView$2(this.$notifications, this.this$0, this.$viewList, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((NotificationsActivity$displayNotificationsListView$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0095 -> B:54:0x0174). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c3 -> B:24:0x00c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0141 -> B:46:0x0149). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.NotificationsActivity$displayNotificationsListView$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
