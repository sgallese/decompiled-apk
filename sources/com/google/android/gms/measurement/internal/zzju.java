package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
final class zzju implements Runnable {
    final /* synthetic */ zzjw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzju(zzjw zzjwVar) {
        this.zza = zzjwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjx zzjxVar = this.zza.zza;
        Context zzaw = zzjxVar.zzt.zzaw();
        this.zza.zza.zzt.zzay();
        zzjx.zzo(zzjxVar, new ComponentName(zzaw, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
