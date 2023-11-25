package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzhf implements zzen {
    final /* synthetic */ zzgd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhf(zzhg zzhgVar, zzgd zzgdVar) {
        this.zza = zzgdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzen
    public final boolean zza() {
        if (this.zza.zzL() && Log.isLoggable(this.zza.zzaA().zzr(), 3)) {
            return true;
        }
        return false;
    }
}
