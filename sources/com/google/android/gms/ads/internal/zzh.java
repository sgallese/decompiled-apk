package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzflc;
import com.google.android.gms.internal.ads.zzfmf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzh implements zzfmf {
    final /* synthetic */ zzi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final void zza(int i10, long j10) {
        zzflc zzflcVar;
        zzflcVar = this.zza.zzi;
        zzflcVar.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final void zzb(int i10, long j10, String str) {
        zzflc zzflcVar;
        zzflcVar = this.zza.zzi;
        zzflcVar.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
