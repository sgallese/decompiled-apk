package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzciv extends zzety {
    private final zzetm zza;
    private final zzciz zzb;
    private final zzciv zzc = this;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;
    private final zzgzg zzl;
    private final zzgzg zzm;
    private final zzgzg zzn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzciv(zzciz zzcizVar, zzetm zzetmVar, zzciu zzciuVar) {
        zzgzg zzgzgVar;
        zzgzg zzgzgVar2;
        zzgzg zzgzgVar3;
        this.zzb = zzcizVar;
        this.zza = zzetmVar;
        zzgzgVar = zzcizVar.zzG;
        this.zzd = zzgys.zzc(new zzfhs(zzgzgVar));
        zzetu zzetuVar = new zzetu(zzetmVar);
        this.zze = zzetuVar;
        zzgzg zzc = zzgys.zzc(zzdqg.zza());
        this.zzf = zzc;
        zzgzg zzc2 = zzgys.zzc(zzdqe.zza());
        this.zzg = zzc2;
        zzgzg zzc3 = zzgys.zzc(zzdqi.zza());
        this.zzh = zzc3;
        zzgzg zzc4 = zzgys.zzc(zzdqk.zza());
        this.zzi = zzc4;
        zzgyw zzc5 = zzgyx.zzc(4);
        zzc5.zzb(zzffy.GMS_SIGNALS, zzc);
        zzc5.zzb(zzffy.BUILD_URL, zzc2);
        zzc5.zzb(zzffy.HTTP, zzc3);
        zzc5.zzb(zzffy.PRE_PROCESS, zzc4);
        zzgyx zzc6 = zzc5.zzc();
        this.zzj = zzc6;
        zzgzgVar2 = zzcizVar.zzg;
        zzgzg zzc7 = zzgys.zzc(new zzdql(zzetuVar, zzgzgVar2, zzfez.zza(), zzc6));
        this.zzk = zzc7;
        zzgzd zza = zzgze.zza(0, 1);
        zza.zza(zzc7);
        zzgze zzc8 = zza.zzc();
        this.zzl = zzc8;
        zzfgh zzfghVar = new zzfgh(zzc8);
        this.zzm = zzfghVar;
        zzfez zza2 = zzfez.zza();
        zzgzgVar3 = zzcizVar.zzm;
        this.zzn = zzgys.zzc(new zzfgg(zza2, zzgzgVar3, zzfghVar));
    }

    @Override // com.google.android.gms.internal.ads.zzety
    public final zzesm zza() {
        zzchg zzchgVar;
        zzgzg zzgzgVar;
        zzgzg zzgzgVar2;
        zzchg zzchgVar2;
        zzgzg zzgzgVar3;
        zzchg zzchgVar3;
        zzgzg zzgzgVar4;
        zzgzg zzgzgVar5;
        zzgzg zzgzgVar6;
        zzchg zzchgVar4;
        zzchg zzchgVar5;
        zzchg zzchgVar6;
        zzgzg zzgzgVar7;
        zzgzg zzgzgVar8;
        zzgzg zzgzgVar9;
        zzgzg zzgzgVar10;
        zzgzg zzgzgVar11;
        zzgzg zzgzgVar12;
        zzchgVar = this.zzb.zza;
        Context zza = zzchgVar.zza();
        zzgzb.zzb(zza);
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        zzbyx zzbyxVar = new zzbyx();
        zzgzb.zzb(zzfyoVar);
        zzeuw zzeuwVar = new zzeuw(zzbyxVar, zzfyoVar, zzetn.zza(this.zza));
        zzeqj zza2 = zzeql.zza();
        zzgzgVar = this.zzb.zzm;
        zzesj zza3 = zzevs.zza(zzeuwVar, zza2, (ScheduledExecutorService) zzgzgVar.zzb(), 0);
        zzbsg zzbsgVar = new zzbsg();
        zzgzgVar2 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzgzgVar2.zzb();
        zzchgVar2 = this.zzb.zza;
        Context zza4 = zzchgVar2.zza();
        zzgzb.zzb(zza4);
        zzevg zzevgVar = new zzevg(zzbsgVar, scheduledExecutorService, zza4);
        zzgzgVar3 = this.zzb.zzm;
        zzesj zzb = zzevs.zzb(zzevgVar, (ScheduledExecutorService) zzgzgVar3.zzb());
        zzbza zzbzaVar = new zzbza();
        zzchgVar3 = this.zzb.zza;
        Context zza5 = zzchgVar3.zza();
        zzgzb.zzb(zza5);
        zzgzgVar4 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzgzgVar4.zzb();
        zzgzb.zzb(zzfyoVar);
        zzete zza6 = zzetg.zza(zzbzaVar, zza5, scheduledExecutorService2, zzfyoVar, zzeto.zza(this.zza), zzetq.zza(this.zza), zzetr.zza(this.zza));
        zzgzgVar5 = this.zzb.zzm;
        zzesj zza7 = zzevt.zza(zza6, (ScheduledExecutorService) zzgzgVar5.zzb());
        zzgzb.zzb(zzfyoVar);
        zzewb zzewbVar = new zzewb(zzfyoVar);
        zzgzgVar6 = this.zzb.zzm;
        zzesj zzc = zzevs.zzc(zzewbVar, (ScheduledExecutorService) zzgzgVar6.zzb());
        zzevq zzevqVar = zzevq.zza;
        zzchgVar4 = this.zzb.zza;
        Context zza8 = zzchgVar4.zza();
        zzgzb.zzb(zza8);
        String zza9 = zzetn.zza(this.zza);
        zzgzb.zzb(zzfyoVar);
        zzeua zzeuaVar = new zzeua(null, zza8, zza9, zzfyoVar);
        zzawt zzawtVar = new zzawt();
        zzgzb.zzb(zzfyoVar);
        zzchgVar5 = this.zzb.zza;
        Context zza10 = zzchgVar5.zza();
        zzgzb.zzb(zza10);
        zzbbc zzbbcVar = new zzbbc();
        zzgzb.zzb(zzfyoVar);
        zzbza zzbzaVar2 = new zzbza();
        zzgzb.zzb(zzfyoVar);
        zzbza zzbzaVar3 = new zzbza();
        int zza11 = zzeto.zza(this.zza);
        zzchgVar6 = this.zzb.zza;
        Context zza12 = zzchgVar6.zza();
        zzgzb.zzb(zza12);
        zzgzgVar7 = this.zzb.zzah;
        zzbzj zzbzjVar = (zzbzj) zzgzgVar7.zzb();
        zzgzgVar8 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) zzgzgVar8.zzb();
        zzgzb.zzb(zzfyoVar);
        zzgzgVar9 = this.zzb.zzaJ;
        String zza13 = zzetn.zza(this.zza);
        zzawh zzawhVar = new zzawh();
        zzgzgVar10 = this.zzb.zzah;
        zzbzj zzbzjVar2 = (zzbzj) zzgzgVar10.zzb();
        zzgzgVar11 = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) zzgzgVar11.zzb();
        zzgzb.zzb(zzfyoVar);
        zzfui zzp = zzfui.zzp(zza3, zzb, zza7, zzc, zzevqVar, zzeuaVar, new zzeup(zzawtVar, zzfyoVar, zza10), new zzeva(zzbbcVar, zzfyoVar, zzetp.zza(this.zza)), new zzetk(zzbzaVar2, zzfyoVar, zzets.zza(this.zza), zzett.zza(this.zza), zzeto.zza(this.zza)), new zzeul(zzbzaVar3, zza11, zza12, zzbzjVar, scheduledExecutorService3, zzfyoVar, zzetn.zza(this.zza)), (zzesj) zzgzgVar9.zzb(), zzeuh.zza(zza13, zzawhVar, zzbzjVar2, scheduledExecutorService4, zzfyoVar));
        zzfhr zzfhrVar = (zzfhr) this.zzd.zzb();
        zzgzgVar12 = this.zzb.zzZ;
        return new zzesm(zza, zzfyoVar, zzp, zzfhrVar, (zzdrh) zzgzgVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzety
    public final zzfge zzb() {
        return (zzfge) this.zzn.zzb();
    }
}
