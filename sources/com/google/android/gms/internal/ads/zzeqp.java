package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeqp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzeqp(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzeqn(zzfyoVar, ((zzchj) this.zzb).zza(), (Set) this.zzc.zzb());
    }
}
