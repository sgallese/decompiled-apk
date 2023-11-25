package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdsl {
    private final zzbjp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsl(zzbjp zzbjpVar) {
        this.zza = zzbjpVar;
    }

    private final void zzs(zzdsk zzdskVar) throws RemoteException {
        String zza = zzdsk.zza(zzdskVar);
        zzcaa.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdsk("initialize", null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onAdClicked";
        this.zza.zzb(zzdsk.zza(zzdskVar));
    }

    public final void zzc(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onAdClosed";
        zzs(zzdskVar);
    }

    public final void zzd(long j10, int i10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onAdFailedToLoad";
        zzdskVar.zzd = Integer.valueOf(i10);
        zzs(zzdskVar);
    }

    public final void zze(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onAdLoaded";
        zzs(zzdskVar);
    }

    public final void zzf(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdskVar);
    }

    public final void zzg(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onAdOpened";
        zzs(zzdskVar);
    }

    public final void zzh(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("creation", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "nativeObjectCreated";
        zzs(zzdskVar);
    }

    public final void zzi(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("creation", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "nativeObjectNotCreated";
        zzs(zzdskVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onAdClicked";
        zzs(zzdskVar);
    }

    public final void zzk(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onRewardedAdClosed";
        zzs(zzdskVar);
    }

    public final void zzl(long j10, zzbvt zzbvtVar) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onUserEarnedReward";
        zzdskVar.zze = zzbvtVar.zzf();
        zzdskVar.zzf = Integer.valueOf(zzbvtVar.zze());
        zzs(zzdskVar);
    }

    public final void zzm(long j10, int i10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onRewardedAdFailedToLoad";
        zzdskVar.zzd = Integer.valueOf(i10);
        zzs(zzdskVar);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onRewardedAdFailedToShow";
        zzdskVar.zzd = Integer.valueOf(i10);
        zzs(zzdskVar);
    }

    public final void zzo(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onAdImpression";
        zzs(zzdskVar);
    }

    public final void zzp(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onRewardedAdLoaded";
        zzs(zzdskVar);
    }

    public final void zzq(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdskVar);
    }

    public final void zzr(long j10) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j10);
        zzdskVar.zzc = "onRewardedAdOpened";
        zzs(zzdskVar);
    }
}
