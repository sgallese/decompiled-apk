package com.habitrpg.android.habitica.receivers;

import ad.k0;
import android.content.Context;
import androidx.core.app.r;
import com.habitrpg.android.habitica.data.SocialRepository;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalNotificationActionReceiver.kt */
@f(c = "com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver$handleLocalNotificationAction$7$1$1", f = "LocalNotificationActionReceiver.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LocalNotificationActionReceiver$handleLocalNotificationAction$7$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $it;
    final /* synthetic */ String $message;
    int label;
    final /* synthetic */ LocalNotificationActionReceiver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalNotificationActionReceiver$handleLocalNotificationAction$7$1$1(LocalNotificationActionReceiver localNotificationActionReceiver, String str, String str2, Continuation<? super LocalNotificationActionReceiver$handleLocalNotificationAction$7$1$1> continuation) {
        super(2, continuation);
        this.this$0 = localNotificationActionReceiver;
        this.$it = str;
        this.$message = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new LocalNotificationActionReceiver$handleLocalNotificationAction$7$1$1(this.this$0, this.$it, this.$message, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((LocalNotificationActionReceiver$handleLocalNotificationAction$7$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Context context;
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
            String str = this.$it;
            String str2 = this.$message;
            this.label = 1;
            if (socialRepository.postGroupChat(str, str2, this) == d10) {
                return d10;
            }
        }
        context = this.this$0.context;
        if (context != null) {
            r.d(context).b(this.$it.hashCode());
        }
        return w.f13270a;
    }
}
