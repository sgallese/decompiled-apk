package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavt extends zzawa {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzavt(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final void zzd(zzavy zzavyVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzavu(zzavyVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final void zzb(int i10) {
    }
}
