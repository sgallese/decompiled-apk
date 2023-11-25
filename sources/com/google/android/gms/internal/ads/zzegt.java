package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzegt extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzdbv zzc;
    private final zzehc zzd;
    private final zzeds zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegt(zzchd zzchdVar, zzcvq zzcvqVar, zzdbv zzdbvVar, zzehc zzehcVar, zzeds zzedsVar) {
        this.zza = zzchdVar;
        this.zzb = zzcvqVar;
        this.zzc = zzdbvVar;
        this.zzd = zzehcVar;
        this.zze = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    protected final com.google.common.util.concurrent.a zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar) {
        zzcvq zzcvqVar = this.zzb;
        zzcvqVar.zzi(zzfcaVar);
        zzcvqVar.zzf(bundle);
        zzcvqVar.zzg(new zzcvk(zzfbrVar, zzfbeVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcpp zzd = this.zza.zzd();
        zzd.zzd(this.zzb.zzj());
        zzd.zzc(this.zzc);
        zzctl zzb = zzd.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
