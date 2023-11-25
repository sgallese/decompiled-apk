package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcir extends zzetw {
    private final zzevc zza;
    private final zzciz zzb;
    private final zzcir zzc = this;
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
    public /* synthetic */ zzcir(zzciz zzcizVar, zzevc zzevcVar, zzciq zzciqVar) {
        zzgzg zzgzgVar;
        zzgzg zzgzgVar2;
        zzgzg zzgzgVar3;
        this.zzb = zzcizVar;
        this.zza = zzevcVar;
        zzeve zzeveVar = new zzeve(zzevcVar);
        this.zzd = zzeveVar;
        zzgzg zzc = zzgys.zzc(zzdqg.zza());
        this.zze = zzc;
        zzgzg zzc2 = zzgys.zzc(zzdqe.zza());
        this.zzf = zzc2;
        zzgzg zzc3 = zzgys.zzc(zzdqi.zza());
        this.zzg = zzc3;
        zzgzg zzc4 = zzgys.zzc(zzdqk.zza());
        this.zzh = zzc4;
        zzgyw zzc5 = zzgyx.zzc(4);
        zzc5.zzb(zzffy.GMS_SIGNALS, zzc);
        zzc5.zzb(zzffy.BUILD_URL, zzc2);
        zzc5.zzb(zzffy.HTTP, zzc3);
        zzc5.zzb(zzffy.PRE_PROCESS, zzc4);
        zzgyx zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzgzgVar = zzcizVar.zzg;
        zzgzg zzc7 = zzgys.zzc(new zzdql(zzeveVar, zzgzgVar, zzfez.zza(), zzc6));
        this.zzj = zzc7;
        zzgzd zza = zzgze.zza(0, 1);
        zza.zza(zzc7);
        zzgze zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzfgh zzfghVar = new zzfgh(zzc8);
        this.zzl = zzfghVar;
        zzfez zza2 = zzfez.zza();
        zzgzgVar2 = zzcizVar.zzm;
        this.zzm = zzgys.zzc(new zzfgg(zza2, zzgzgVar2, zzfghVar));
        zzgzgVar3 = zzcizVar.zzG;
        this.zzn = zzgys.zzc(new zzfhs(zzgzgVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final zzesm zza() {
        zzchg zzchgVar;
        zzgzg zzgzgVar;
        zzgzg zzgzgVar2;
        zzchgVar = this.zzb.zza;
        Context zza = zzchgVar.zza();
        zzgzb.zzb(zza);
        zzbyx zzbyxVar = new zzbyx();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        zzeuw zzeuwVar = new zzeuw(zzbyxVar, zzfyoVar, zzevd.zza(this.zza));
        zzgzb.zzb(zzfyoVar);
        zzgzgVar = this.zzb.zzm;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzgzgVar.zzb();
        zzfhr zzfhrVar = (zzfhr) this.zzn.zzb();
        zzgzgVar2 = this.zzb.zzZ;
        zzdrh zzdrhVar = (zzdrh) zzgzgVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzeqr(zzeuwVar, 0L, scheduledExecutorService));
        return new zzesm(zza, zzfyoVar, hashSet, zzfhrVar, zzdrhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final zzfge zzb() {
        return (zzfge) this.zzm.zzb();
    }
}
