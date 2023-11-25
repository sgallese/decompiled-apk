package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdyt implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdyt(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzdys zzb() {
        return new zzdys(((zzchj) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
