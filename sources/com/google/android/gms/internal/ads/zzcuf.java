package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcuf implements zzgyt {
    private final zzcue zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzcuf(zzcue zzcueVar, zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzcueVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzbxb) this.zzc.zzb(), null);
    }
}
