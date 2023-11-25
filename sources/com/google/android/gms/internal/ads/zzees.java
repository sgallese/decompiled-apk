package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzees implements zzedt {
    private final Context zza;
    private final zzcqz zzb;
    private final Executor zzc;

    public zzees(Context context, zzcqz zzcqzVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcqzVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, final zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf, zzehf {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
            zzboo zzc = ((zzfcw) zzedqVar.zzb).zzc();
            if (zzc != null) {
                try {
                    zza = (View) ObjectWrapper.unwrap(zzc.zze());
                    boolean zzf = zzc.zzf();
                    if (zza != null) {
                        if (zzf) {
                            try {
                                zza = (View) zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeer
                                    @Override // com.google.android.gms.internal.ads.zzfxl
                                    public final com.google.common.util.concurrent.a zza(Object obj) {
                                        return zzees.this.zzc(zza, zzfbeVar, obj);
                                    }
                                }, zzcan.zze).get();
                            } catch (InterruptedException | ExecutionException e10) {
                                throw new zzfcf(e10);
                            }
                        }
                    } else {
                        throw new zzfcf(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                } catch (RemoteException e11) {
                    throw new zzfcf(e11);
                }
            } else {
                zzcaa.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcf(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            zza = ((zzfcw) zzedqVar.zzb).zza();
        }
        zzcqz zzcqzVar = this.zzb;
        zzcst zzcstVar = new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza);
        final zzfcw zzfcwVar = (zzfcw) zzedqVar.zzb;
        zzcqd zza2 = zzcqzVar.zza(zzcstVar, new zzcqj(zza, null, new zzcsc() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // com.google.android.gms.internal.ads.zzcsc
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfcw.this.zzb();
            }
        }, (zzfbf) zzfbeVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzc);
        ((zzefj) zzedqVar.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        com.google.android.gms.ads.internal.client.zzq zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = zzfbrVar.zza.zza.zze;
        if (zzqVar.zzn) {
            zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
                zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb));
            } else {
                zza = zzfce.zza(this.zza, zzfbeVar.zzv);
            }
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
            ((zzfcw) zzedqVar.zzb).zzn(this.zza, zzqVar2, zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbeVar.zzt), (zzbol) zzedqVar.zzc);
        } else {
            ((zzfcw) zzedqVar.zzb).zzm(this.zza, zzqVar2, zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbeVar.zzt), (zzbol) zzedqVar.zzc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(View view, zzfbe zzfbeVar, Object obj) throws Exception {
        return zzfye.zzh(zzcrq.zza(this.zza, view, zzfbeVar));
    }
}
