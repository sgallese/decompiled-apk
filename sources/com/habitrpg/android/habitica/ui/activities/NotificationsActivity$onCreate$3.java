package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel;
import kotlin.coroutines.Continuation;

/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.NotificationsActivity$onCreate$3", f = "NotificationsActivity.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsActivity$onCreate$3 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ NotificationsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivity$onCreate$3(NotificationsActivity notificationsActivity, Continuation<? super NotificationsActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = notificationsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsActivity$onCreate$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((NotificationsActivity$onCreate$3) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            NotificationsViewModel viewModel = this.this$0.getViewModel();
            this.label = 1;
            if (viewModel.refreshNotifications(this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
