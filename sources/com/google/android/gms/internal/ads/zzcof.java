package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcof implements zzcwl {
    private final zzfbi zza;
    private final zzfbr zzb;
    private final zzfig zzc;
    private final zzfik zzd;

    public zzcof(zzfbr zzfbrVar, zzfik zzfikVar, zzfig zzfigVar) {
        this.zzb = zzfbrVar;
        this.zzd = zzfikVar;
        this.zzc = zzfigVar;
        this.zza = zzfbrVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, this.zza.zza));
    }
}
