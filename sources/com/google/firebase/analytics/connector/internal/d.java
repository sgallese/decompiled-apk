package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i8.a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.1 */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    final Set f11268a;

    /* renamed from: b  reason: collision with root package name */
    private final a.b f11269b;

    /* renamed from: c  reason: collision with root package name */
    private final AppMeasurementSdk f11270c;

    /* renamed from: d  reason: collision with root package name */
    private final c f11271d;

    public d(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f11269b = bVar;
        this.f11270c = appMeasurementSdk;
        c cVar = new c(this);
        this.f11271d = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(cVar);
        this.f11268a = new HashSet();
    }
}
