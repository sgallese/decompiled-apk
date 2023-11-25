package com.habitrpg.android.habitica.ui.activities;

import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.Node;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.LoginActivity$handleAuthResponse$1", f = "LoginActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginActivity$handleAuthResponse$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ CapabilityClient $capabilityClient;
    final /* synthetic */ MessageClient $messageClient;
    final /* synthetic */ UserAuthResponse $response;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$handleAuthResponse$1(CapabilityClient capabilityClient, MessageClient messageClient, UserAuthResponse userAuthResponse, Continuation<? super LoginActivity$handleAuthResponse$1> continuation) {
        super(2, continuation);
        this.$capabilityClient = capabilityClient;
        this.$messageClient = messageClient;
        this.$response = userAuthResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new LoginActivity$handleAuthResponse$1(this.$capabilityClient, this.$messageClient, this.$response, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((LoginActivity$handleAuthResponse$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ic.d.d();
        if (this.label == 0) {
            dc.n.b(obj);
            try {
                Set<Node> nodes = ((CapabilityInfo) Tasks.await(this.$capabilityClient.getCapability("receive_message", 1))).getNodes();
                qc.q.h(nodes, "getNodes(...)");
                MessageClient messageClient = this.$messageClient;
                UserAuthResponse userAuthResponse = this.$response;
                Iterator<T> it = nodes.iterator();
                while (it.hasNext()) {
                    String id2 = ((Node) it.next()).getId();
                    byte[] bytes = (userAuthResponse.getId() + ":" + userAuthResponse.getApiToken()).getBytes(yc.d.f26303b);
                    qc.q.h(bytes, "this as java.lang.String).getBytes(charset)");
                    Tasks.await(messageClient.sendMessage(id2, "/auth", bytes));
                }
            } catch (Exception unused) {
            }
            return dc.w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
