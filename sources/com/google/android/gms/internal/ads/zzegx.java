package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzegx extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzejg zzc;
    private final zzdbv zzd;
    private final zzehc zze;
    private final zzeds zzf;

    public zzegx(zzchd zzchdVar, zzcvq zzcvqVar, zzejg zzejgVar, zzdbv zzdbvVar, zzehc zzehcVar, zzeds zzedsVar) {
        this.zza = zzchdVar;
        this.zzb = zzcvqVar;
        this.zzc = zzejgVar;
        this.zzd = zzdbvVar;
        this.zze = zzehcVar;
        this.zzf = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    protected final com.google.common.util.concurrent.a zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar) {
        zzcvq zzcvqVar = this.zzb;
        zzcvqVar.zzi(zzfcaVar);
        zzcvqVar.zzf(bundle);
        zzcvqVar.zzg(new zzcvk(zzfbrVar, zzfbeVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzdfp zzg = this.zza.zzg();
        zzg.zze(this.zzb.zzj());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzctl zza = zzg.zzf().zza();
        return zza.zzi(zza.zzj());
    }
}
