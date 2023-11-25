package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(k8.e eVar) {
        return new FirebaseMessaging((com.google.firebase.e) eVar.a(com.google.firebase.e.class), (h9.a) eVar.a(h9.a.class), eVar.c(ca.i.class), eVar.c(g9.j.class), (j9.e) eVar.a(j9.e.class), (g6.g) eVar.a(g6.g.class), (f9.d) eVar.a(f9.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<k8.c<?>> getComponents() {
        return Arrays.asList(k8.c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(k8.r.j(com.google.firebase.e.class)).b(k8.r.h(h9.a.class)).b(k8.r.i(ca.i.class)).b(k8.r.i(g9.j.class)).b(k8.r.h(g6.g.class)).b(k8.r.j(j9.e.class)).b(k8.r.j(f9.d.class)).f(new k8.h() { // from class: com.google.firebase.messaging.y
            @Override // k8.h
            public final Object a(k8.e eVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).c().d(), ca.h.b(LIBRARY_NAME, "23.1.2"));
    }
}
