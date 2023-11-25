package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzha;
import i8.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.1 */
/* loaded from: classes3.dex */
public final class c implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f11267a;

    public c(d dVar) {
        this.f11267a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhe
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (!this.f11267a.f11268a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        int i10 = b.f11266g;
        String zza = zzha.zza(str2);
        if (zza != null) {
            str2 = zza;
        }
        bundle2.putString("events", str2);
        bVar = this.f11267a.f11269b;
        bVar.a(2, bundle2);
    }
}
