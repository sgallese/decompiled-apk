package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfao implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzfaq zzd;
    final /* synthetic */ zzfar zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfao(zzfar zzfarVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzfaq zzfaqVar) {
        this.zze = zzfarVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzfaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzeyv zzeyvVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfah zzfahVar;
        zzdnu zzk;
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        Executor executor;
        zzeyvVar = this.zze.zze;
        zzdnv zzdnvVar = (zzdnv) zzeyvVar.zzd();
        if (zzdnvVar == null) {
            zza = zzfdb.zzb(th, null);
        } else {
            zza = zzdnvVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdnvVar == null) {
                zzfahVar = this.zze.zzd;
                zzfahVar.zzbF(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zzh().zzb().zzc().zzh();
            } else {
                zzdnvVar.zza().zzbF(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfan
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfah zzfahVar2;
                        zzfao zzfaoVar = zzfao.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzfahVar2 = zzfaoVar.zze.zzd;
                        zzfahVar2.zzbF(zzeVar);
                    }
                });
            }
            zzfcv.zzb(zza.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhuVar = this.zze.zzg;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zza(zza);
                zzfhgVar.zzg(th);
                zzfhgVar.zzf(false);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzc(zza);
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzg(th);
                zzfhgVar2.zzf(false);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfah zzfahVar;
        Executor executor;
        final zzfah zzfahVar2;
        zzfah zzfahVar3;
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        zzdnq zzdnqVar = (zzdnq) obj;
        synchronized (this.zze) {
            zzdan zzn = zzdnqVar.zzn();
            zzfahVar = this.zze.zzd;
            zzn.zzd(zzfahVar);
            this.zza.zzb(zzdnqVar);
            zzfar zzfarVar = this.zze;
            executor = zzfarVar.zzb;
            zzfahVar2 = zzfarVar.zzd;
            zzfahVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // java.lang.Runnable
                public final void run() {
                    zzfah.this.zzr();
                }
            });
            zzfahVar3 = this.zze.zzd;
            zzfahVar3.onAdMetadataChanged();
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhuVar = this.zze.zzg;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzdnqVar.zzp().zzb);
                zzfhgVar.zzd(zzdnqVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzdnqVar.zzp().zzb);
                zzfhrVar.zze(zzdnqVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
