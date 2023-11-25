package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.common.habitica.models.Notification;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.NotificationsActivity$onCreate$2", f = "NotificationsActivity.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsActivity$onCreate$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ NotificationsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivity$onCreate$2(NotificationsActivity notificationsActivity, Continuation<? super NotificationsActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = notificationsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsActivity$onCreate$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((NotificationsActivity$onCreate$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            dd.g<List<Notification>> notifications = this.this$0.getViewModel().getNotifications();
            final NotificationsActivity notificationsActivity = this.this$0;
            dd.h<? super List<Notification>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.NotificationsActivity$onCreate$2.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(List<Notification> list, Continuation<? super dc.w> continuation) {
                    NotificationsActivity.this.setNotifications(list);
                    NotificationsActivity.this.getViewModel().markNotificationsAsSeen(list);
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (notifications.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
