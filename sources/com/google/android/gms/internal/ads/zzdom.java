package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdom {
    private final zzcfu zza;
    private final Context zzb;
    private final zzaqx zzc;
    private final zzbct zzd;
    private final zzcag zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzaxe zzg;
    private final zzcyx zzh;
    private final zzecs zzi;

    public zzdom(zzcfu zzcfuVar, Context context, zzaqx zzaqxVar, zzbct zzbctVar, zzcag zzcagVar, com.google.android.gms.ads.internal.zza zzaVar, zzaxe zzaxeVar, zzcyx zzcyxVar, zzecs zzecsVar) {
        this.zza = zzcfuVar;
        this.zzb = context;
        this.zzc = zzaqxVar;
        this.zzd = zzbctVar;
        this.zze = zzcagVar;
        this.zzf = zzaVar;
        this.zzg = zzaxeVar;
        this.zzh = zzcyxVar;
        this.zzi = zzecsVar;
    }

    public final zzcfi zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbe zzfbeVar, zzfbi zzfbiVar) throws zzcft {
        return zzcfu.zza(this.zzb, zzcgx.zzc(zzqVar), zzqVar.zza, false, false, this.zzc, this.zzd, this.zze, null, new zzdob(this), this.zzf, this.zzg, zzfbeVar, zzfbiVar, this.zzi);
    }
}
