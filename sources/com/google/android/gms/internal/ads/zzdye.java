package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdye implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdye(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzdyd zzb() {
        zzfyo zzfyoVar = zzcan.zzb;
        zzgzb.zzb(zzfyoVar);
        zzfyo zzfyoVar2 = zzcan.zza;
        zzgzb.zzb(zzfyoVar2);
        return new zzdyd(zzfyoVar, zzfyoVar2, ((zzdyw) this.zzc).zzb());
    }
}
