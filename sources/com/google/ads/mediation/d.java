package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
final class d extends FullScreenContentCallback {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f9291a;

    /* renamed from: b  reason: collision with root package name */
    final MediationInterstitialListener f9292b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f9291a = abstractAdViewAdapter;
        this.f9292b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f9292b.onAdClosed(this.f9291a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f9292b.onAdOpened(this.f9291a);
    }
}
