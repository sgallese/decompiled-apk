package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzexp implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzcqz zzd;
    final /* synthetic */ zzexq zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexp(zzexq zzexqVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzcqz zzcqzVar) {
        this.zze = zzexqVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzcqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzcyx zzcyxVar;
        zzdbe zzdbeVar;
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzbF(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhO)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzekx zzekxVar;
                        zzexp zzexpVar = zzexp.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzekxVar = zzexpVar.zze.zzd;
                        zzekxVar.zzbF(zzeVar);
                    }
                });
            }
            zzexq zzexqVar = this.zze;
            zzcyxVar = zzexqVar.zzh;
            zzdbeVar = zzexqVar.zzj;
            zzcyxVar.zzd(zzdbeVar.zzc());
            zzfcv.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhuVar = this.zze.zzi;
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzcyx zzcyxVar;
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        Executor executor;
        final zzekx zzekxVar;
        zzekx zzekxVar2;
        zzelb zzelbVar;
        zzcqc zzcqcVar = (zzcqc) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcqcVar.zzc() != null) {
                ViewParent parent = zzcqcVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (zzcqcVar.zzl() != null) {
                        str = zzcqcVar.zzl().zzg();
                    }
                    zzcaa.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcqcVar.zzc());
                }
            }
            zzbbj zzbbjVar = zzbbr.zzhO;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue()) {
                zzdan zzn = zzcqcVar.zzn();
                zzekxVar2 = this.zze.zzd;
                zzn.zza(zzekxVar2);
                zzelbVar = this.zze.zze;
                zzn.zzc(zzelbVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcqcVar.zzc());
            this.zza.zzb(zzcqcVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue()) {
                zzexq zzexqVar = this.zze;
                executor = zzexqVar.zzb;
                zzekxVar = zzexqVar.zzd;
                zzekxVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzekx.this.zzr();
                    }
                });
            }
            zzcyxVar = this.zze.zzh;
            zzcyxVar.zzd(zzcqcVar.zza());
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhuVar = this.zze.zzi;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzcqcVar.zzp().zzb);
                zzfhgVar.zzd(zzcqcVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzcqcVar.zzp().zzb);
                zzfhrVar.zze(zzcqcVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
