package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbqs implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbqu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqs(zzbqu zzbquVar) {
        this.zza = zzbquVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        zzcaa.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzcaa.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzcaa.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        MediationInterstitialListener mediationInterstitialListener;
        zzcaa.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbqu zzbquVar = this.zza;
        mediationInterstitialListener = zzbquVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbquVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i10) {
        MediationInterstitialListener mediationInterstitialListener;
        zzcaa.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbqu zzbquVar = this.zza;
        mediationInterstitialListener = zzbquVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbquVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }
}
