package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzexq implements zzeln {
    private final Context zza;
    private final Executor zzb;
    private final zzchd zzc;
    private final zzekx zzd;
    private final zzelb zze;
    private final ViewGroup zzf;
    private zzbcp zzg;
    private final zzcyx zzh;
    private final zzfhu zzi;
    private final zzdbe zzj;
    private final zzfby zzk;
    private com.google.common.util.concurrent.a zzl;

    public zzexq(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzchd zzchdVar, zzekx zzekxVar, zzelb zzelbVar, zzfby zzfbyVar, zzdbe zzdbeVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchdVar;
        this.zzd = zzekxVar;
        this.zze = zzelbVar;
        this.zzk = zzfbyVar;
        this.zzh = zzchdVar.zzf();
        this.zzi = zzchdVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdbeVar;
        zzfbyVar.zzr(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        com.google.common.util.concurrent.a aVar = this.zzl;
        if (aVar != null && !aVar.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzell zzellVar, zzelm zzelmVar) throws RemoteException {
        zzcqz zzh;
        zzfhr zzfhrVar;
        if (str == null) {
            zzcaa.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexm
                @Override // java.lang.Runnable
                public final void run() {
                    zzexq.this.zzm();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzk().zzn(true);
            }
            zzfby zzfbyVar = this.zzk;
            zzfbyVar.zzs(str);
            zzfbyVar.zzE(zzlVar);
            zzfca zzG = zzfbyVar.zzG();
            zzfhg zzb = zzfhf.zzb(this.zza, zzfhq.zzf(zzG), 3, zzlVar);
            if (((Boolean) zzbdp.zze.zze()).booleanValue() && this.zzk.zzg().zzk) {
                zzekx zzekxVar = this.zzd;
                if (zzekxVar != null) {
                    zzekxVar.zzbF(zzfdb.zzd(7, null, null));
                }
                return false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhO)).booleanValue()) {
                zzcqy zze = this.zzc.zze();
                zzcvq zzcvqVar = new zzcvq();
                zzcvqVar.zze(this.zza);
                zzcvqVar.zzi(zzG);
                zze.zzi(zzcvqVar.zzj());
                zzdbt zzdbtVar = new zzdbt();
                zzdbtVar.zzj(this.zzd, this.zzb);
                zzdbtVar.zzk(this.zzd, this.zzb);
                zze.zzf(zzdbtVar.zzn());
                zze.zze(new zzejg(this.zzg));
                zze.zzd(new zzdgh(zzdin.zza, null));
                zze.zzg(new zzcrw(this.zzh, this.zzj));
                zze.zzc(new zzcpz(this.zzf));
                zzh = zze.zzh();
            } else {
                zzcqy zze2 = this.zzc.zze();
                zzcvq zzcvqVar2 = new zzcvq();
                zzcvqVar2.zze(this.zza);
                zzcvqVar2.zzi(zzG);
                zze2.zzi(zzcvqVar2.zzj());
                zzdbt zzdbtVar2 = new zzdbt();
                zzdbtVar2.zzj(this.zzd, this.zzb);
                zzdbtVar2.zza(this.zzd, this.zzb);
                zzdbtVar2.zza(this.zze, this.zzb);
                zzdbtVar2.zzl(this.zzd, this.zzb);
                zzdbtVar2.zzd(this.zzd, this.zzb);
                zzdbtVar2.zze(this.zzd, this.zzb);
                zzdbtVar2.zzf(this.zzd, this.zzb);
                zzdbtVar2.zzb(this.zzd, this.zzb);
                zzdbtVar2.zzk(this.zzd, this.zzb);
                zzdbtVar2.zzi(this.zzd, this.zzb);
                zze2.zzf(zzdbtVar2.zzn());
                zze2.zze(new zzejg(this.zzg));
                zze2.zzd(new zzdgh(zzdin.zza, null));
                zze2.zzg(new zzcrw(this.zzh, this.zzj));
                zze2.zzc(new zzcpz(this.zzf));
                zzh = zze2.zzh();
            }
            zzcqz zzcqzVar = zzh;
            if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
                zzfhr zzj = zzcqzVar.zzj();
                zzj.zzh(3);
                zzj.zzb(zzlVar.zzp);
                zzfhrVar = zzj;
            } else {
                zzfhrVar = null;
            }
            zzctl zzd = zzcqzVar.zzd();
            com.google.common.util.concurrent.a zzi = zzd.zzi(zzd.zzj());
            this.zzl = zzi;
            zzfye.zzr(zzi, new zzexp(this, zzelmVar, zzfhrVar, zzb, zzcqzVar), this.zzb);
            return true;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfby zzi() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzd.zzbF(zzfdb.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final void zzp(zzcyy zzcyyVar) {
        this.zzh.zzo(zzcyyVar, this.zzb);
    }

    public final void zzq(zzbcp zzbcpVar) {
        this.zzg = zzbcpVar;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzT(view, view.getContext());
    }
}
