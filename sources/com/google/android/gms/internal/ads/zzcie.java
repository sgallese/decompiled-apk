package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcie implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzcie(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzbuy zzb() {
        Context zza = ((zzchj) this.zza).zza();
        zzfhu zzfhuVar = (zzfhu) this.zzb.zzb();
        zzbni zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcag.zza(), zzfhuVar);
        zzbnc zzbncVar = zzbnf.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbncVar, zzbncVar);
        return new zzbux(zza, com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcag.zza(), zzfhuVar).zza("google.afma.sdkConstants.getSdkConstants", zzbncVar, zzbncVar));
    }
}
