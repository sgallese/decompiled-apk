package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzelu implements zzeln {
    private final zzfby zza;
    private final zzchd zzb;
    private final Context zzc;
    private final zzelk zzd;
    private final zzfhu zze;
    private zzcss zzf;

    public zzelu(zzchd zzchdVar, Context context, zzelk zzelkVar, zzfby zzfbyVar) {
        this.zzb = zzchdVar;
        this.zzc = context;
        this.zzd = zzelkVar;
        this.zza = zzfbyVar;
        this.zze = zzchdVar.zzz();
        zzfbyVar.zzu(zzelkVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        zzcss zzcssVar = this.zzf;
        if (zzcssVar != null && zzcssVar.zzf()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzell zzellVar, zzelm zzelmVar) throws RemoteException {
        zzfhr zzfhrVar;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzE(this.zzc) && zzlVar.zzs == null) {
            zzcaa.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelp
                @Override // java.lang.Runnable
                public final void run() {
                    zzelu.this.zzf();
                }
            });
            return false;
        } else if (str == null) {
            zzcaa.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelq
                @Override // java.lang.Runnable
                public final void run() {
                    zzelu.this.zzg();
                }
            });
            return false;
        } else {
            zzfcv.zza(this.zzc, zzlVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzlVar.zzf) {
                this.zzb.zzk().zzn(true);
            }
            int i10 = ((zzelo) zzellVar).zza;
            zzfby zzfbyVar = this.zza;
            zzfbyVar.zzE(zzlVar);
            zzfbyVar.zzz(i10);
            zzfca zzG = zzfbyVar.zzG();
            zzfhg zzb = zzfhf.zzb(this.zzc, zzfhq.zzf(zzG), 8, zzlVar);
            com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzG.zzn;
            if (zzcbVar != null) {
                this.zzd.zzd().zzm(zzcbVar);
            }
            zzdgl zzh = this.zzb.zzh();
            zzcvq zzcvqVar = new zzcvq();
            zzcvqVar.zze(this.zzc);
            zzcvqVar.zzi(zzG);
            zzh.zzf(zzcvqVar.zzj());
            zzdbt zzdbtVar = new zzdbt();
            zzdbtVar.zzk(this.zzd.zzd(), this.zzb.zzB());
            zzh.zze(zzdbtVar.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcpz(null));
            zzdgm zzg = zzh.zzg();
            if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
                zzfhr zzf = zzg.zzf();
                zzf.zzh(8);
                zzf.zzb(zzlVar.zzp);
                zzfhrVar = zzf;
            } else {
                zzfhrVar = null;
            }
            this.zzb.zzx().zzc(1);
            zzfyo zzfyoVar = zzcan.zza;
            zzgzb.zzb(zzfyoVar);
            ScheduledExecutorService zzC = this.zzb.zzC();
            zzctl zza = zzg.zza();
            zzcss zzcssVar = new zzcss(zzfyoVar, zzC, zza.zzi(zza.zzj()));
            this.zzf = zzcssVar;
            zzcssVar.zze(new zzelt(this, zzelmVar, zzfhrVar, zzb, zzg));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzbF(zzfdb.zzd(4, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzbF(zzfdb.zzd(6, null, null));
    }
}
