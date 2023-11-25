package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcuw implements zzczd {
    private final Context zza;
    private final zzfca zzb;
    private final zzcag zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdtj zze;
    private final zzfhu zzf;

    public zzcuw(Context context, zzfca zzfcaVar, zzcag zzcagVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdtj zzdtjVar, zzfhu zzfhuVar) {
        this.zza = context;
        this.zzb = zzfcaVar;
        this.zzc = zzcagVar;
        this.zzd = zzgVar;
        this.zze = zzdtjVar;
        this.zzf = zzfhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbrVar) {
    }
}
