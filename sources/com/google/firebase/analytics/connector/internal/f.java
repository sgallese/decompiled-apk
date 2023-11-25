package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i8.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.1 */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f11273a;

    /* renamed from: b  reason: collision with root package name */
    private final AppMeasurementSdk f11274b;

    /* renamed from: c  reason: collision with root package name */
    private final e f11275c;

    public f(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f11273a = bVar;
        this.f11274b = appMeasurementSdk;
        e eVar = new e(this);
        this.f11275c = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(eVar);
    }
}
