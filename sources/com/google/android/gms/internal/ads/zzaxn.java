package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzaxn implements zzgru {
    static final zzgru zza = new zzaxn();

    private zzaxn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final boolean zza(int i10) {
        zzaxo zzaxoVar;
        zzaxo zzaxoVar2 = zzaxo.AD_INITIATER_UNSPECIFIED;
        switch (i10) {
            case 0:
                zzaxoVar = zzaxo.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                zzaxoVar = zzaxo.BANNER;
                break;
            case 2:
                zzaxoVar = zzaxo.DFP_BANNER;
                break;
            case 3:
                zzaxoVar = zzaxo.INTERSTITIAL;
                break;
            case 4:
                zzaxoVar = zzaxo.DFP_INTERSTITIAL;
                break;
            case 5:
                zzaxoVar = zzaxo.NATIVE_EXPRESS;
                break;
            case 6:
                zzaxoVar = zzaxo.AD_LOADER;
                break;
            case 7:
                zzaxoVar = zzaxo.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                zzaxoVar = zzaxo.BANNER_SEARCH_ADS;
                break;
            case 9:
                zzaxoVar = zzaxo.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                zzaxoVar = zzaxo.APP_OPEN;
                break;
            case 11:
                zzaxoVar = zzaxo.REWARDED_INTERSTITIAL;
                break;
            default:
                zzaxoVar = null;
                break;
        }
        if (zzaxoVar != null) {
            return true;
        }
        return false;
    }
}
