package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbwp extends zzbwc {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbwq zzb;

    public zzbwp(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbwq zzbwqVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg() {
        zzbwq zzbwqVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzbwqVar = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzbwqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze(int i10) {
    }
}
