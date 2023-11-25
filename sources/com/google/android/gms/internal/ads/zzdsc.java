package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdsc implements zzgyt {
    private final zzdru zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdsc(zzdru zzdruVar, zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzdruVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdse zzdseVar = (zzdse) this.zzb.zzb();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        Set zzh = zzdru.zzh(zzdseVar, zzfyoVar);
        zzgzb.zzb(zzh);
        return zzh;
    }
}
