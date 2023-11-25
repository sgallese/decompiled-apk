package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzwm implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzwm(zzam zzamVar, int i10) {
        this.zza = 1 == (zzamVar.zze & 1);
        this.zzb = zzxd.zzn(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzwm zzwmVar) {
        return zzfts.zzj().zzd(this.zzb, zzwmVar.zzb).zzd(this.zza, zzwmVar.zza).zza();
    }
}
