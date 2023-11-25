package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfar implements zzeln {
    private final Context zza;
    private final Executor zzb;
    private final zzchd zzc;
    private final zzfah zzd;
    private final zzeyv zze;
    private final zzfbs zzf;
    private final zzfhu zzg;
    private final zzfby zzh;
    private com.google.common.util.concurrent.a zzi;

    public zzfar(Context context, Executor executor, zzchd zzchdVar, zzeyv zzeyvVar, zzfah zzfahVar, zzfby zzfbyVar, zzfbs zzfbsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchdVar;
        this.zze = zzeyvVar;
        this.zzd = zzfahVar;
        this.zzh = zzfbyVar;
        this.zzf = zzfbsVar;
        this.zzg = zzchdVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdnu zzk(zzeyt zzeytVar) {
        zzdnu zzi = this.zzc.zzi();
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(this.zza);
        zzcvqVar.zzi(((zzfaq) zzeytVar).zza);
        zzcvqVar.zzh(this.zzf);
        zzi.zzd(zzcvqVar.zzj());
        zzi.zzc(new zzdbt().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzell zzellVar, zzelm zzelmVar) throws RemoteException {
        zzfhr zzfhrVar;
        zzbvk zzbvkVar = new zzbvk(zzlVar, str);
        if (zzbvkVar.zzb == null) {
            zzcaa.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfak
                @Override // java.lang.Runnable
                public final void run() {
                    zzfar.this.zzi();
                }
            });
            return false;
        }
        com.google.common.util.concurrent.a aVar = this.zzi;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        zzfap zzfapVar = null;
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzeyv zzeyvVar = this.zze;
            if (zzeyvVar.zzd() != null) {
                zzfhr zzh = ((zzdnv) zzeyvVar.zzd()).zzh();
                zzh.zzh(5);
                zzh.zzb(zzbvkVar.zza.zzp);
                zzfhrVar = zzh;
                zzfcv.zza(this.zza, zzbvkVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzbvkVar.zza.zzf) {
                    this.zzc.zzk().zzn(true);
                }
                zzfby zzfbyVar = this.zzh;
                zzfbyVar.zzs(zzbvkVar.zzb);
                zzfbyVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzfbyVar.zzE(zzbvkVar.zza);
                zzfca zzG = zzfbyVar.zzG();
                zzfhg zzb = zzfhf.zzb(this.zza, zzfhq.zzf(zzG), 5, zzbvkVar.zza);
                zzfaq zzfaqVar = new zzfaq(zzfapVar);
                zzfaqVar.zza = zzG;
                com.google.common.util.concurrent.a zzc = this.zze.zzc(new zzeyw(zzfaqVar, null), new zzeyu() { // from class: com.google.android.gms.internal.ads.zzfal
                    @Override // com.google.android.gms.internal.ads.zzeyu
                    public final zzcvo zza(zzeyt zzeytVar) {
                        zzdnu zzk;
                        zzk = zzfar.this.zzk(zzeytVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc;
                zzfye.zzr(zzc, new zzfao(this, zzelmVar, zzfhrVar, zzb, zzfaqVar), this.zzb);
                return true;
            }
        }
        zzfhrVar = null;
        zzfcv.zza(this.zza, zzbvkVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
            this.zzc.zzk().zzn(true);
        }
        zzfby zzfbyVar2 = this.zzh;
        zzfbyVar2.zzs(zzbvkVar.zzb);
        zzfbyVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
        zzfbyVar2.zzE(zzbvkVar.zza);
        zzfca zzG2 = zzfbyVar2.zzG();
        zzfhg zzb2 = zzfhf.zzb(this.zza, zzfhq.zzf(zzG2), 5, zzbvkVar.zza);
        zzfaq zzfaqVar2 = new zzfaq(zzfapVar);
        zzfaqVar2.zza = zzG2;
        com.google.common.util.concurrent.a zzc2 = this.zze.zzc(new zzeyw(zzfaqVar2, null), new zzeyu() { // from class: com.google.android.gms.internal.ads.zzfal
            @Override // com.google.android.gms.internal.ads.zzeyu
            public final zzcvo zza(zzeyt zzeytVar) {
                zzdnu zzk;
                zzk = zzfar.this.zzk(zzeytVar);
                return zzk;
            }
        }, null);
        this.zzi = zzc2;
        zzfye.zzr(zzc2, new zzfao(this, zzelmVar, zzfhrVar, zzb2, zzfaqVar2), this.zzb);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zzbF(zzfdb.zzd(6, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i10) {
        this.zzh.zzo().zza(i10);
    }
}
