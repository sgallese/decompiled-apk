package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import ic.d;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$dismissAllNotifications$1", f = "NotificationsViewModel.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsViewModel$dismissAllNotifications$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ HashMap<String, List<String>> $notificationIds;
    int label;
    final /* synthetic */ NotificationsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$dismissAllNotifications$1(NotificationsViewModel notificationsViewModel, HashMap<String, List<String>> hashMap, Continuation<? super NotificationsViewModel$dismissAllNotifications$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationsViewModel;
        this.$notificationIds = hashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsViewModel$dismissAllNotifications$1(this.this$0, this.$notificationIds, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((NotificationsViewModel$dismissAllNotifications$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            HashMap<String, List<String>> hashMap = this.$notificationIds;
            this.label = 1;
            if (userRepository.readNotifications(hashMap, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
