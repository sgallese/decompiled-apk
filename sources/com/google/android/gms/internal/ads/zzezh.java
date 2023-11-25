package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzezh implements zzeln {
    private final Context zza;
    private final Executor zzb;
    private final zzchd zzc;
    private final zzekx zzd;
    private final zzfah zze;
    private zzbcp zzf;
    private final zzfhu zzg;
    private final zzfby zzh;
    private com.google.common.util.concurrent.a zzi;

    public zzezh(Context context, Executor executor, zzchd zzchdVar, zzekx zzekxVar, zzfah zzfahVar, zzfby zzfbyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchdVar;
        this.zzd = zzekxVar;
        this.zzh = zzfbyVar;
        this.zze = zzfahVar;
        this.zzg = zzchdVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        com.google.common.util.concurrent.a aVar = this.zzi;
        if (aVar != null && !aVar.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzell zzellVar, zzelm zzelmVar) {
        zzdfq zzh;
        zzfhr zzfhrVar;
        if (str == null) {
            zzcaa.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezb
                @Override // java.lang.Runnable
                public final void run() {
                    zzezh.this.zzh();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzk().zzn(true);
            }
            com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzeza) zzellVar).zza;
            zzfby zzfbyVar = this.zzh;
            zzfbyVar.zzs(str);
            zzfbyVar.zzr(zzqVar);
            zzfbyVar.zzE(zzlVar);
            zzfca zzG = zzfbyVar.zzG();
            zzfhg zzb = zzfhf.zzb(this.zza, zzfhq.zzf(zzG), 4, zzlVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhQ)).booleanValue()) {
                zzdfp zzg = this.zzc.zzg();
                zzcvq zzcvqVar = new zzcvq();
                zzcvqVar.zze(this.zza);
                zzcvqVar.zzi(zzG);
                zzg.zze(zzcvqVar.zzj());
                zzdbt zzdbtVar = new zzdbt();
                zzdbtVar.zzj(this.zzd, this.zzb);
                zzdbtVar.zzk(this.zzd, this.zzb);
                zzg.zzd(zzdbtVar.zzn());
                zzg.zzc(new zzejg(this.zzf));
                zzh = zzg.zzh();
            } else {
                zzdbt zzdbtVar2 = new zzdbt();
                zzfah zzfahVar = this.zze;
                if (zzfahVar != null) {
                    zzdbtVar2.zze(zzfahVar, this.zzb);
                    zzdbtVar2.zzf(this.zze, this.zzb);
                    zzdbtVar2.zzb(this.zze, this.zzb);
                }
                zzdfp zzg2 = this.zzc.zzg();
                zzcvq zzcvqVar2 = new zzcvq();
                zzcvqVar2.zze(this.zza);
                zzcvqVar2.zzi(zzG);
                zzg2.zze(zzcvqVar2.zzj());
                zzdbtVar2.zzj(this.zzd, this.zzb);
                zzdbtVar2.zze(this.zzd, this.zzb);
                zzdbtVar2.zzf(this.zzd, this.zzb);
                zzdbtVar2.zzb(this.zzd, this.zzb);
                zzdbtVar2.zza(this.zzd, this.zzb);
                zzdbtVar2.zzl(this.zzd, this.zzb);
                zzdbtVar2.zzk(this.zzd, this.zzb);
                zzdbtVar2.zzi(this.zzd, this.zzb);
                zzdbtVar2.zzc(this.zzd, this.zzb);
                zzg2.zzd(zzdbtVar2.zzn());
                zzg2.zzc(new zzejg(this.zzf));
                zzh = zzg2.zzh();
            }
            zzdfq zzdfqVar = zzh;
            if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
                zzfhr zzf = zzdfqVar.zzf();
                zzf.zzh(4);
                zzf.zzb(zzlVar.zzp);
                zzfhrVar = zzf;
            } else {
                zzfhrVar = null;
            }
            zzctl zza = zzdfqVar.zza();
            com.google.common.util.concurrent.a zzi = zza.zzi(zza.zzj());
            this.zzi = zzi;
            zzfye.zzr(zzi, new zzezg(this, zzelmVar, zzfhrVar, zzb, zzdfqVar), this.zzb);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zzbF(zzfdb.zzd(6, null, null));
    }

    public final void zzi(zzbcp zzbcpVar) {
        this.zzf = zzbcpVar;
    }
}
