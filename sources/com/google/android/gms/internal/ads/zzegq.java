package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzegq extends zzegs {
    private final zzchd zza;
    private final zzdgh zzb;
    private final zzcvq zzc;
    private final zzdbv zzd;
    private final zzehc zze;
    private final zzeds zzf;

    public zzegq(zzchd zzchdVar, zzdgh zzdghVar, zzcvq zzcvqVar, zzdbv zzdbvVar, zzehc zzehcVar, zzeds zzedsVar) {
        this.zza = zzchdVar;
        this.zzb = zzdghVar;
        this.zzc = zzcvqVar;
        this.zzd = zzdbvVar;
        this.zze = zzehcVar;
        this.zzf = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    protected final com.google.common.util.concurrent.a zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar) {
        zzcvq zzcvqVar = this.zzc;
        zzcvqVar.zzi(zzfcaVar);
        zzcvqVar.zzf(bundle);
        zzcvqVar.zzg(new zzcvk(zzfbrVar, zzfbeVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzdgl zzh = this.zza.zzh();
        zzh.zzf(this.zzc.zzj());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcpz(null));
        zzctl zza = zzh.zzg().zza();
        return zza.zzi(zza.zzj());
    }
}
