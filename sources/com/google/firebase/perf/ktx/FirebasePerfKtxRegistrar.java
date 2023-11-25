package com.google.firebase.perf.ktx;

import androidx.annotation.Keep;
import ca.h;
import com.google.firebase.components.ComponentRegistrar;
import ec.s;
import java.util.List;
import k8.c;

/* compiled from: Performance.kt */
@Keep
/* loaded from: classes3.dex */
public final class FirebasePerfKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        List<c<?>> d10;
        d10 = s.d(h.b("fire-perf-ktx", "20.3.1"));
        return d10;
    }
}
