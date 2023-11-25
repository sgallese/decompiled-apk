package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
final class b extends AdListener implements AppEventListener, zza {

    /* renamed from: f  reason: collision with root package name */
    final AbstractAdViewAdapter f9287f;

    /* renamed from: m  reason: collision with root package name */
    final MediationBannerListener f9288m;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f9287f = abstractAdViewAdapter;
        this.f9288m = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f9288m.onAdClicked(this.f9287f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f9288m.onAdClosed(this.f9287f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f9288m.onAdFailedToLoad(this.f9287f, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f9288m.onAdLoaded(this.f9287f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f9288m.onAdOpened(this.f9287f);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f9288m.zzd(this.f9287f, str, str2);
    }
}
