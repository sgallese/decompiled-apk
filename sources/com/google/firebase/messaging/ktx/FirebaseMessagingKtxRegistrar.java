package com.google.firebase.messaging.ktx;

import ca.h;
import com.google.firebase.components.ComponentRegistrar;
import ec.s;
import java.util.List;
import k8.c;

/* compiled from: Messaging.kt */
/* loaded from: classes3.dex */
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        List<c<?>> d10;
        d10 = s.d(h.b("fire-fcm-ktx", "23.1.2"));
        return d10;
    }
}
