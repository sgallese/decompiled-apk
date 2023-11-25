package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k8.h;
import k8.r;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.1 */
@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<k8.c<?>> getComponents() {
        return Arrays.asList(k8.c.c(i8.a.class).b(r.j(com.google.firebase.e.class)).b(r.j(Context.class)).b(r.j(f9.d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // k8.h
            public final Object a(k8.e eVar) {
                i8.a h10;
                h10 = i8.b.h((com.google.firebase.e) eVar.a(com.google.firebase.e.class), (Context) eVar.a(Context.class), (f9.d) eVar.a(f9.d.class));
                return h10;
            }
        }).e().d(), ca.h.b("fire-analytics", "21.2.1"));
    }
}
