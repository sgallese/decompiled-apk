package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcvu implements zzgyt {
    private final zzcvs zza;
    private final zzgzg zzb;

    public zzcvu(zzcvs zzcvsVar, zzgzg zzgzgVar) {
        this.zza = zzcvsVar;
        this.zzb = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = this.zza.zza(((zzchj) this.zzb).zza());
        zzgzb.zzb(zza);
        return zza;
    }
}
