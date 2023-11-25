package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbrr extends zzbgj {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbrr(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbgt zzbgtVar) {
        this.zza.onNativeAdLoaded(new zzbrk(zzbgtVar));
    }
}
