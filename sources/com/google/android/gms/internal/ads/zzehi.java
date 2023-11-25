package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehi implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;

    public zzehi(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6, zzgzg zzgzgVar7, zzgzg zzgzgVar8, zzgzg zzgzgVar9, zzgzg zzgzgVar10, zzgzg zzgzgVar11) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
        this.zzf = zzgzgVar6;
        this.zzg = zzgzgVar7;
        this.zzh = zzgzgVar8;
        this.zzi = zzgzgVar9;
        this.zzj = zzgzgVar10;
        this.zzk = zzgzgVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzehh zzb() {
        Context zza = ((zzchj) this.zza).zza();
        zzfge zzfgeVar = (zzfge) this.zzb.zzb();
        zzehc zzehcVar = (zzehc) this.zzc.zzb();
        zzcwk zzcwkVar = (zzcwk) this.zzd.zzb();
        zzfig zzfigVar = (zzfig) this.zze.zzb();
        zzfik zzfikVar = (zzfik) this.zzf.zzb();
        zzcsh zzcshVar = (zzcsh) this.zzg.zzb();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzehh(zza, zzfgeVar, zzehcVar, zzcwkVar, zzfigVar, zzfikVar, zzcshVar, zzfyoVar, (ScheduledExecutorService) this.zzi.zzb(), (zzeds) this.zzj.zzb(), (zzfhr) this.zzk.zzb());
    }
}
