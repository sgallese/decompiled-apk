package com.habitrpg.android.habitica.interactors;

import ad.k0;
import android.app.Activity;
import com.habitrpg.android.habitica.ui.views.dialogs.WonChallengeDialog;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.common.habitica.models.notifications.ChallengeWonData;
import com.habitrpg.common.habitica.models.notifications.NotificationData;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShowNotificationInteractor.kt */
@f(c = "com.habitrpg.android.habitica.interactors.ShowNotificationInteractor$showWonChallengeDialog$1", f = "ShowNotificationInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShowNotificationInteractor$showWonChallengeDialog$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Notification $notification;
    int label;
    final /* synthetic */ ShowNotificationInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowNotificationInteractor$showWonChallengeDialog$1(ShowNotificationInteractor showNotificationInteractor, Notification notification, Continuation<? super ShowNotificationInteractor$showWonChallengeDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = showNotificationInteractor;
        this.$notification = notification;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShowNotificationInteractor$showWonChallengeDialog$1(this.this$0, this.$notification, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShowNotificationInteractor$showWonChallengeDialog$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        ChallengeWonData challengeWonData;
        d.d();
        if (this.label == 0) {
            n.b(obj);
            activity = this.this$0.activity;
            WonChallengeDialog wonChallengeDialog = new WonChallengeDialog(activity);
            NotificationData data = this.$notification.getData();
            if (data instanceof ChallengeWonData) {
                challengeWonData = (ChallengeWonData) data;
            } else {
                challengeWonData = null;
            }
            wonChallengeDialog.configure(challengeWonData);
            wonChallengeDialog.enqueue();
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
