package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeuh implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzeuh(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
    }

    public static zzeuf zza(String str, zzawh zzawhVar, zzbzj zzbzjVar, ScheduledExecutorService scheduledExecutorService, zzfyo zzfyoVar) {
        return new zzeuf(str, zzawhVar, zzbzjVar, scheduledExecutorService, zzfyoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        String zza = ((zzevk) this.zza).zza();
        zzawh zzawhVar = new zzawh();
        zzbzj zzbzjVar = (zzbzj) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzeuf(zza, zzawhVar, zzbzjVar, scheduledExecutorService, zzfyoVar);
    }
}
