package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehk implements zzgyt {
    private final zzehj zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzehk(zzehj zzehjVar, zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4) {
        this.zza = zzehjVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
        this.zzd = zzgzgVar3;
        this.zze = zzgzgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzehe) this.zzc).zzb(), (zzeds) this.zzd.zzb(), (zzfik) this.zze.zzb());
    }
}
