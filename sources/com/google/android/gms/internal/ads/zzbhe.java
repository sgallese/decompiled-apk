package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbhe extends zzbgj {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbhe(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbgt zzbgtVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbgu(zzbgtVar));
    }
}
