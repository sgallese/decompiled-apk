package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbxi implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzbxi(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzbxh zzb() {
        return new zzbxh((Clock) this.zza.zzb(), (zzbxf) this.zzb.zzb());
    }
}
