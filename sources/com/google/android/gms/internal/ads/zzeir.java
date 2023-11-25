package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzeir implements zzcxr {
    boolean zza = false;
    final /* synthetic */ zzedq zzb;
    final /* synthetic */ zzcas zzc;
    final /* synthetic */ zzeis zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeir(zzeis zzeisVar, zzedq zzedqVar, zzcas zzcasVar) {
        this.zzd = zzeisVar;
        this.zzb = zzedqVar;
        this.zzc = zzcasVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfn)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzedr(i10, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final synchronized void zza(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i10, zzeis.zze(this.zzb.zza, i10), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final synchronized void zzc(int i10, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzeis.zze(this.zzb.zza, i10);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i10, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
