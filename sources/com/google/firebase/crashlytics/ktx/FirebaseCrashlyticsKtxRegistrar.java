package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import ca.h;
import com.google.firebase.components.ComponentRegistrar;
import ec.s;
import java.util.List;
import k8.c;

/* compiled from: FirebaseCrashlytics.kt */
@Keep
/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        List<c<?>> d10;
        d10 = s.d(h.b("fire-cls-ktx", "18.3.6"));
        return d10;
    }
}
