package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdjh implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdjh(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjg(((zzdhg) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
