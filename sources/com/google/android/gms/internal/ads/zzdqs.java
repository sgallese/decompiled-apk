package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdqs implements zzczd, zzcxw, zzcwl {
    private final zzdrc zza;
    private final zzdrm zzb;

    public zzdqs(zzdrc zzdrcVar, zzdrm zzdrmVar) {
        this.zza = zzdrcVar;
        this.zzb = zzdrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zzeVar.zza));
        this.zza.zza().put("ed", zzeVar.zzc);
        this.zzb.zze(this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
        this.zza.zzc(zzbunVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbrVar) {
        this.zza.zzb(zzfbrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zze(this.zza.zza());
    }
}
