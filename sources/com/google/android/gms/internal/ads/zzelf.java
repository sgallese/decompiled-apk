package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzelf extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzq zza;
    private final Context zzb;
    private final zzezh zzc;
    private final String zzd;
    private final zzcag zze;
    private final zzekx zzf;
    private final zzfah zzg;
    private final zzaqx zzh;
    private final zzdrh zzi;
    private zzdep zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaD)).booleanValue();

    public zzelf(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzezh zzezhVar, zzekx zzekxVar, zzfah zzfahVar, zzcag zzcagVar, zzaqx zzaqxVar, zzdrh zzdrhVar) {
        this.zza = zzqVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzezhVar;
        this.zzf = zzekxVar;
        this.zzg = zzfahVar;
        this.zze = zzcagVar;
        this.zzh = zzaqxVar;
        this.zzi = zzdrhVar;
    }

    private final synchronized boolean zze() {
        zzdep zzdepVar = this.zzj;
        if (zzdepVar != null) {
            if (!zzdepVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdep zzdepVar = this.zzj;
        if (zzdepVar != null) {
            zzdepVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.zzn(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbcp zzbcpVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbcpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e10) {
            zzcaa.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzf.zzl(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvj zzbvjVar) {
        this.zzg.zzm(zzbvjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            zzcaa.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzp(zzfdb.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            zzcaa.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzp(zzfdb.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004e, B:17:0x0052, B:19:0x005b, B:22:0x0065, B:26:0x006d, B:12:0x003d), top: B:32:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbcw r0 = com.google.android.gms.internal.ads.zzbdi.zzi     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbbj r0 = com.google.android.gms.internal.ads.zzbbr.zzkc     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbp r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.zzcag r2 = r5.zze     // Catch: java.lang.Throwable -> L8c
            int r2 = r2.zzc     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbj r3 = com.google.android.gms.internal.ads.zzbbr.zzkd     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbp r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8c
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L8c
        L42:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L8c
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzE(r0)     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            if (r0 == 0) goto L65
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L65
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcaa.zzg(r6)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzekx r6 = r5.zzf     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L63
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdb.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L8c
            r6.zzbF(r0)     // Catch: java.lang.Throwable -> L8c
        L63:
            monitor-exit(r5)
            return r1
        L65:
            boolean r0 = r5.zze()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6d
            monitor-exit(r5)
            return r1
        L6d:
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzfcv.zza(r0, r1)     // Catch: java.lang.Throwable -> L8c
            r5.zzj = r2     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzezh r0 = r5.zzc     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzeza r2 = new com.google.android.gms.internal.ads.zzeza     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.client.zzq r3 = r5.zza     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzele r3 = new com.google.android.gms.internal.ads.zzele     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r0.zzb(r6, r1, r2, r3)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r5)
            return r6
        L8c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelf.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgF)).booleanValue()) {
            return null;
        }
        zzdep zzdepVar = this.zzj;
        if (zzdepVar == null) {
            return null;
        }
        return zzdepVar.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zzdep zzdepVar = this.zzj;
        if (zzdepVar != null && zzdepVar.zzl() != null) {
            return zzdepVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        zzdep zzdepVar = this.zzj;
        if (zzdepVar != null && zzdepVar.zzl() != null) {
            return zzdepVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdep zzdepVar = this.zzj;
        if (zzdepVar != null) {
            zzdepVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.zzk(zzbkVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdep zzdepVar = this.zzj;
        if (zzdepVar != null) {
            zzdepVar.zzm().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzawb zzawbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsl zzbslVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbso zzbsoVar, String str) {
    }
}
