package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public enum zzaxo implements zzgrs {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);

    private static final zzgrt zzm = new zzgrt() { // from class: com.google.android.gms.internal.ads.zzaxm
    };
    private final int zzo;

    zzaxo(int i10) {
        this.zzo = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzo);
    }

    public final int zza() {
        return this.zzo;
    }
}
