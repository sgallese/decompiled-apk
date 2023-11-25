package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzexz implements zzfeh {
    private final zzeyv zza;

    public zzexz(zzeyv zzeyvVar) {
        this.zza = zzeyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final com.google.common.util.concurrent.a zza(zzfei zzfeiVar) {
        zzeya zzeyaVar = (zzeya) zzfeiVar;
        return ((zzexw) this.zza).zzb(zzeyaVar.zzb, zzeyaVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final void zzb(zzfdw zzfdwVar) {
        zzfdwVar.zza = ((zzexw) this.zza).zza();
    }
}
