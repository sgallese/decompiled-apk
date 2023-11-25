package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeun implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;

    public zzeun(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6, zzgzg zzgzgVar7) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
        this.zzf = zzgzgVar6;
        this.zzg = zzgzgVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbza zzbzaVar = new zzbza();
        int intValue = ((zzevl) this.zzb).zzb().intValue();
        Context zza = ((zzchj) this.zzc).zza();
        zzbzj zzbzjVar = (zzbzj) this.zzd.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zze.zzb();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzeul(zzbzaVar, intValue, zza, zzbzjVar, scheduledExecutorService, zzfyoVar, ((zzevk) this.zzg).zza());
    }
}
