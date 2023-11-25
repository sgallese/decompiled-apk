package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzewj implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzewl zzd;
    final /* synthetic */ zzewm zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewj(zzewm zzewmVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzewl zzewlVar) {
        this.zze = zzewmVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzewlVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcvp] */
    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzeyv zzeyvVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzexc zzexcVar;
        zzcvo zzm;
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        Executor executor;
        zzeyvVar = this.zze.zze;
        zzcpm zzcpmVar = (zzcpm) zzeyvVar.zzd();
        if (zzcpmVar == null) {
            zza = zzfdb.zzb(th, null);
        } else {
            zza = zzcpmVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcpmVar == null) {
                zzexcVar = this.zze.zzd;
                zzexcVar.zzbF(zza);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzh();
            } else {
                zzcpmVar.zzc().zzbF(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzexc zzexcVar2;
                            zzewj zzewjVar = zzewj.this;
                            com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                            zzexcVar2 = zzewjVar.zze.zzd;
                            zzexcVar2.zzbF(zzeVar);
                        }
                    });
                }
            }
            zzfcv.zzb(zza.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhuVar = this.zze.zzh;
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
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        zzexc zzexcVar;
        zzcse zzcseVar = (zzcse) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
                zzdan zzn = zzcseVar.zzn();
                zzexcVar = this.zze.zzd;
                zzn.zzb(zzexcVar);
            }
            this.zza.zzb(zzcseVar);
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhuVar = this.zze.zzh;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzcseVar.zzp().zzb);
                zzfhgVar.zzd(zzcseVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzcseVar.zzp().zzb);
                zzfhrVar.zze(zzcseVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
