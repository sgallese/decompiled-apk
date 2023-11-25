package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdxf implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdxf(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzdxe zzb() {
        Map zzd = ((zzgza) this.zza).zzd();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzdxe(zzd, zzfyoVar, ((zzczc) this.zzc).zzb());
    }
}
