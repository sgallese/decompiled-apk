package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzchp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzchp(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdtl zzdtlVar = (zzdtl) this.zza.zzb();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbA)).booleanValue()) {
            emptySet = Collections.singleton(new zzddo(zzdtlVar, zzfyoVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgzb.zzb(emptySet);
        return emptySet;
    }
}
