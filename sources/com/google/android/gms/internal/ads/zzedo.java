package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzedo implements zzedn {
    public final zzedn zza;
    private final zzfqw zzb;

    public zzedo(zzedn zzednVar, zzfqw zzfqwVar) {
        this.zza = zzednVar;
        this.zzb = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        return zzfye.zzm(this.zza.zza(zzfbrVar, zzfbeVar), this.zzb, zzcan.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        return this.zza.zzb(zzfbrVar, zzfbeVar);
    }
}
