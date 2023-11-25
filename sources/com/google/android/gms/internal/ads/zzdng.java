package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdng {
    private final zzcwg zza;
    private final zzcxp zzb;
    private final zzcyc zzc;
    private final zzcyo zzd;
    private final zzdbc zze;
    private final zzddu zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdng(zzcwg zzcwgVar, zzcxp zzcxpVar, zzcyc zzcycVar, zzcyo zzcyoVar, zzdbc zzdbcVar, zzddu zzdduVar) {
        this.zza = zzcwgVar;
        this.zzb = zzcxpVar;
        this.zzc = zzcycVar;
        this.zzd = zzcyoVar;
        this.zze = zzdbcVar;
        this.zzf = zzdduVar;
    }

    public final void zza(zzdnh zzdnhVar) {
        zzdne zzdneVar;
        zzdneVar = zzdnhVar.zza;
        zzcwg zzcwgVar = this.zza;
        zzcyc zzcycVar = this.zzc;
        zzcyo zzcyoVar = this.zzd;
        zzdbc zzdbcVar = this.zze;
        final zzcxp zzcxpVar = this.zzb;
        zzcxpVar.getClass();
        zzdneVar.zzi(zzcwgVar, zzcycVar, zzcyoVar, zzdbcVar, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdnf
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcxp.this.zzb();
            }
        }, this.zzf);
    }
}
