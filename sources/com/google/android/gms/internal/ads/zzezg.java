package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzezg implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzdfq zzd;
    final /* synthetic */ zzezh zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezg(zzezh zzezhVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzdfq zzdfqVar) {
        this.zze = zzezhVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzdfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzbF(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhQ)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzekx zzekxVar;
                        zzezg zzezgVar = zzezg.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzekxVar = zzezgVar.zze.zzd;
                        zzekxVar.zzbF(zzeVar);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfah zzfahVar;
                        zzezg zzezgVar = zzezg.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzfahVar = zzezgVar.zze.zze;
                        zzfahVar.zzbF(zzeVar);
                    }
                });
            }
            zzfcv.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
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
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        Executor executor;
        Executor executor2;
        zzekx zzekxVar;
        zzfah zzfahVar;
        zzdep zzdepVar = (zzdep) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbbj zzbbjVar = zzbbr.zzhQ;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue()) {
                zzdan zzn = zzdepVar.zzn();
                zzekxVar = this.zze.zzd;
                zzn.zza(zzekxVar);
                zzfahVar = this.zze.zze;
                zzn.zzd(zzfahVar);
            }
            this.zza.zzb(zzdepVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzekx zzekxVar2;
                        zzekxVar2 = zzezg.this.zze.zzd;
                        zzekxVar2.zzr();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfah zzfahVar2;
                        zzfahVar2 = zzezg.this.zze.zze;
                        zzfahVar2.zzr();
                    }
                });
            }
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhuVar = this.zze.zzg;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzdepVar.zzp().zzb);
                zzfhgVar.zzd(zzdepVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzdepVar.zzp().zzb);
                zzfhrVar.zze(zzdepVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
