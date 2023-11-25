package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzepa implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzepa(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzchj) this.zza).zza();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzeoz(zza, zzfyoVar);
    }
}
