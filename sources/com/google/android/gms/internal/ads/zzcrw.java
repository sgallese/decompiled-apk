package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcrw {
    private final zzcyx zza;
    private final zzdbe zzb;

    public zzcrw(zzcyx zzcyxVar, zzdbe zzdbeVar) {
        this.zza = zzcyxVar;
        this.zzb = zzdbeVar;
    }

    public final zzcyx zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdbe zzb() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzddo zzc() {
        zzdbe zzdbeVar = this.zzb;
        if (zzdbeVar != null) {
            return new zzddo(zzdbeVar, zzcan.zzf);
        }
        return new zzddo(new zzcrv(this), zzcan.zzf);
    }
}
