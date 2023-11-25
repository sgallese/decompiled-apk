package com.habitrpg.android.habitica.helpers.notifications;

import ad.k0;
import com.habitrpg.android.habitica.data.ApiClient;
import dc.n;
import dc.w;
import ic.d;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PushNotificationManager.kt */
@f(c = "com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager$addRefreshToken$1", f = "PushNotificationManager.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PushNotificationManager$addRefreshToken$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ HashMap<String, String> $pushDeviceData;
    int label;
    final /* synthetic */ PushNotificationManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationManager$addRefreshToken$1(PushNotificationManager pushNotificationManager, HashMap<String, String> hashMap, Continuation<? super PushNotificationManager$addRefreshToken$1> continuation) {
        super(2, continuation);
        this.this$0 = pushNotificationManager;
        this.$pushDeviceData = hashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PushNotificationManager$addRefreshToken$1(this.this$0, this.$pushDeviceData, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PushNotificationManager$addRefreshToken$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            ApiClient apiClient = this.this$0.getApiClient();
            HashMap<String, String> hashMap = this.$pushDeviceData;
            this.label = 1;
            if (apiClient.addPushDevice(hashMap, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
