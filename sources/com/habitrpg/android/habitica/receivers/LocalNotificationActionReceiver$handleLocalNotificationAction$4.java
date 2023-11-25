package com.habitrpg.android.habitica.receivers;

import ad.k0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.user.User;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalNotificationActionReceiver.kt */
@f(c = "com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver$handleLocalNotificationAction$4", f = "LocalNotificationActionReceiver.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LocalNotificationActionReceiver$handleLocalNotificationAction$4 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ LocalNotificationActionReceiver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalNotificationActionReceiver$handleLocalNotificationAction$4(LocalNotificationActionReceiver localNotificationActionReceiver, Continuation<? super LocalNotificationActionReceiver$handleLocalNotificationAction$4> continuation) {
        super(2, continuation);
        this.this$0 = localNotificationActionReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new LocalNotificationActionReceiver$handleLocalNotificationAction$4(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((LocalNotificationActionReceiver$handleLocalNotificationAction$4) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        User user;
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
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            user = this.this$0.user;
            this.label = 1;
            if (SocialRepository.DefaultImpls.rejectQuest$default(socialRepository, user, null, this, 2, null) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
