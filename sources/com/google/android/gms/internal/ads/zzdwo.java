package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdwo implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;

    public zzdwo(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6, zzgzg zzgzgVar7, zzgzg zzgzgVar8) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
        this.zzf = zzgzgVar6;
        this.zzg = zzgzgVar7;
        this.zzh = zzgzgVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzdwn zzb() {
        zzchd zzchdVar = (zzchd) this.zza.zzb();
        Context zza = ((zzchj) this.zzb).zza();
        zzcag zza2 = ((zzchv) this.zzc).zza();
        zzfca zza3 = ((zzcvz) this.zzd).zza();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzdwn(zzchdVar, zza, zza2, zza3, zzfyoVar, (String) this.zzf.zzb(), (zzfhr) this.zzg.zzb(), (zzdrc) this.zzh.zzb());
    }
}
