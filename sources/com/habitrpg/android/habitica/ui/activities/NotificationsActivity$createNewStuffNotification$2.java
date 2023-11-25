package com.habitrpg.android.habitica.ui.activities;

import android.view.View;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.models.Notification;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.NotificationsActivity$createNewStuffNotification$2", f = "NotificationsActivity.kt", l = {238, 244}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsActivity$createNewStuffNotification$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super View>, Object> {
    final /* synthetic */ Notification $notification;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NotificationsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.NotificationsActivity$createNewStuffNotification$2$1", f = "NotificationsActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.NotificationsActivity$createNewStuffNotification$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super View>, Object> {
        final /* synthetic */ qc.f0<Notification> $baileyNotification;
        final /* synthetic */ CharSequence $text;
        int label;
        final /* synthetic */ NotificationsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationsActivity notificationsActivity, qc.f0<Notification> f0Var, CharSequence charSequence, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = notificationsActivity;
            this.$baileyNotification = f0Var;
            this.$text = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$baileyNotification, this.$text, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super View> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                return NotificationsActivity.createDismissableNotificationItem$default(this.this$0, this.$baileyNotification.f21676f, this.$text, kotlin.coroutines.jvm.internal.b.d(R.drawable.notifications_bailey), null, null, 24, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivity$createNewStuffNotification$2(Notification notification, NotificationsActivity notificationsActivity, Continuation<? super NotificationsActivity$createNewStuffNotification$2> continuation) {
        super(2, continuation);
        this.$notification = notification;
        this.this$0 = notificationsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsActivity$createNewStuffNotification$2(this.$notification, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super View> continuation) {
        return ((NotificationsActivity$createNewStuffNotification$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee A[PHI: r10
      0x00ee: PHI (r10v29 java.lang.Object) = (r10v13 java.lang.Object), (r10v0 java.lang.Object) binds: [B:36:0x00eb, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.habitrpg.common.habitica.models.Notification, T] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.NotificationsActivity$createNewStuffNotification$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
