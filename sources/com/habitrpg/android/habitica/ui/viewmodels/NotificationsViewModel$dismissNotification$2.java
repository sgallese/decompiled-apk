package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.common.habitica.models.Notification;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$dismissNotification$2", f = "NotificationsViewModel.kt", l = {196}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsViewModel$dismissNotification$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Notification $notification;
    int label;
    final /* synthetic */ NotificationsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$dismissNotification$2(NotificationsViewModel notificationsViewModel, Notification notification, Continuation<? super NotificationsViewModel$dismissNotification$2> continuation) {
        super(2, continuation);
        this.this$0 = notificationsViewModel;
        this.$notification = notification;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsViewModel$dismissNotification$2(this.this$0, this.$notification, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((NotificationsViewModel$dismissNotification$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            UserRepository userRepository = this.this$0.getUserRepository();
            String id2 = this.$notification.getId();
            this.label = 1;
            if (userRepository.readNotification(id2, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
