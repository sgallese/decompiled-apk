package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i8.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.1 */
/* loaded from: classes3.dex */
public final class e implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f11272a;

    public e(f fVar) {
        this.f11272a = fVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhe
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (str != null && b.c(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            bVar = this.f11272a.f11273a;
            bVar.a(3, bundle2);
        }
    }
}
