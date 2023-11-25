package com.google.firebase.remoteconfig.ktx;

import androidx.annotation.Keep;
import ca.h;
import com.google.firebase.components.ComponentRegistrar;
import ec.s;
import java.util.List;
import k8.c;

/* compiled from: RemoteConfig.kt */
@Keep
/* loaded from: classes3.dex */
public final class FirebaseRemoteConfigKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        List<c<?>> d10;
        d10 = s.d(h.b("fire-cfg-ktx", "21.3.0"));
        return d10;
    }
}
