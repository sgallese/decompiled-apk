package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdmx {
    private final zzcwg zza;
    private final zzcxp zzb;
    private final zzcyc zzc;
    private final zzcyo zzd;
    private final zzdbc zze;
    private final zzfbe zzf;
    private final zzfbi zzg;

    public zzdmx(zzcwg zzcwgVar, zzcxp zzcxpVar, zzcyc zzcycVar, zzcyo zzcyoVar, zzdbc zzdbcVar, zzfbe zzfbeVar, zzfbi zzfbiVar) {
        this.zza = zzcwgVar;
        this.zzb = zzcxpVar;
        this.zzc = zzcycVar;
        this.zzd = zzcyoVar;
        this.zze = zzdbcVar;
        this.zzf = zzfbeVar;
        this.zzg = zzfbiVar;
    }

    public final void zza(zzdnb zzdnbVar) {
        zzdmo zzdmoVar;
        zzdmoVar = zzdnbVar.zza;
        zzcwg zzcwgVar = this.zza;
        zzcyc zzcycVar = this.zzc;
        zzcyo zzcyoVar = this.zzd;
        zzdbc zzdbcVar = this.zze;
        final zzcxp zzcxpVar = this.zzb;
        zzcxpVar.getClass();
        zzdmoVar.zzh(zzcwgVar, zzcycVar, zzcyoVar, zzdbcVar, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdmw
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcxp.this.zzb();
            }
        });
        zzdnbVar.zze(this.zzf, this.zzg);
    }
}
