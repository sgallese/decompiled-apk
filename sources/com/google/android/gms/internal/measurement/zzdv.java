package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.1 */
/* loaded from: classes3.dex */
final class zzdv extends zzch {
    private final com.google.android.gms.measurement.internal.zzhd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdv(com.google.android.gms.measurement.internal.zzhd zzhdVar) {
        this.zza = zzhdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.interceptEvent(str, str2, bundle, j10);
    }
}
