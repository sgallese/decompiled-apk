package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeak implements zzczd, zzcxw, zzcwl {
    private final zzfgn zza;
    private final zzfgo zzb;
    private final zzbzn zzc;

    public zzeak(zzfgn zzfgnVar, zzfgo zzfgoVar, zzbzn zzbznVar) {
        this.zza = zzfgnVar;
        this.zzb = zzfgoVar;
        this.zzc = zzbznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgn zzfgnVar = this.zza;
        zzfgnVar.zza("action", "ftl");
        zzfgnVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfgnVar.zza("ed", zzeVar.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
        this.zza.zzi(zzbunVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbrVar) {
        this.zza.zzh(zzfbrVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzfgo zzfgoVar = this.zzb;
        zzfgn zzfgnVar = this.zza;
        zzfgnVar.zza("action", "loaded");
        zzfgoVar.zzb(zzfgnVar);
    }
}
