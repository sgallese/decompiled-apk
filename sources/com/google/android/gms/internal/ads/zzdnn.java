package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdnn implements zzbjh {
    private final zzcxp zza;
    private final zzbvp zzb;
    private final String zzc;
    private final String zzd;

    public zzdnn(zzcxp zzcxpVar, zzfbe zzfbeVar) {
        this.zza = zzcxpVar;
        this.zzb = zzfbeVar.zzm;
        this.zzc = zzfbeVar.zzk;
        this.zzd = zzfbeVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    public final void zza(zzbvp zzbvpVar) {
        int i10;
        String str;
        zzbvp zzbvpVar2 = this.zzb;
        if (zzbvpVar2 != null) {
            zzbvpVar = zzbvpVar2;
        }
        if (zzbvpVar != null) {
            str = zzbvpVar.zza;
            i10 = zzbvpVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zzd(new zzbva(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    public final void zzc() {
        this.zza.zzf();
    }
}
