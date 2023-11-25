package com.habitrpg.android.habitica.ui.activities;

import android.widget.LinearLayout;
import com.habitrpg.android.habitica.databinding.ActivityNotificationsBinding;
import com.habitrpg.android.habitica.extensions.ViewExtKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.NotificationsActivity$updateNotificationsAndRefresh$3", f = "NotificationsActivity.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsActivity$updateNotificationsAndRefresh$3 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ NotificationsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivity$updateNotificationsAndRefresh$3(NotificationsActivity notificationsActivity, Continuation<? super NotificationsActivity$updateNotificationsAndRefresh$3> continuation) {
        super(2, continuation);
        this.this$0 = notificationsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsActivity$updateNotificationsAndRefresh$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((NotificationsActivity$updateNotificationsAndRefresh$3) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ActivityNotificationsBinding activityNotificationsBinding;
        ActivityNotificationsBinding activityNotificationsBinding2;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            this.label = 1;
            if (ad.u0.a(250L, this) == d10) {
                return d10;
            }
        }
        activityNotificationsBinding = this.this$0.binding;
        ActivityNotificationsBinding activityNotificationsBinding3 = null;
        if (activityNotificationsBinding == null) {
            qc.q.z("binding");
            activityNotificationsBinding = null;
        }
        if (activityNotificationsBinding.notificationItems.getVisibility() != 0) {
            activityNotificationsBinding2 = this.this$0.binding;
            if (activityNotificationsBinding2 == null) {
                qc.q.z("binding");
            } else {
                activityNotificationsBinding3 = activityNotificationsBinding2;
            }
            LinearLayout linearLayout = activityNotificationsBinding3.notificationItems;
            qc.q.h(linearLayout, "notificationItems");
            ViewExtKt.fadeInAnimation(linearLayout, 200L);
        }
        return dc.w.f13270a;
    }
}
