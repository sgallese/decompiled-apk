package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzduy extends com.google.android.gms.ads.internal.client.zzdi {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdum zzd;
    private final zzfyo zze;
    private final zzduz zzf;
    private zzdue zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduy(Context context, WeakReference weakReference, zzdum zzdumVar, zzduz zzduzVar, zzfyo zzfyoVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdumVar;
        this.zze = zzfyoVar;
        this.zzf = zzduzVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        if (context == null) {
            return this.zzb;
        }
        return context;
    }

    private static AdRequest zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdn zzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (obj instanceof NativeAd) {
                responseInfo = ((NativeAd) obj).getResponseInfo();
            }
            return "";
        }
        if (responseInfo == null || (zzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc.zzh();
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzfye.zzr(this.zzg.zzb(str), new zzduw(this, str2), this.zze);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzfye.zzr(this.zzg.zzb(str), new zzdux(this, str2), this.zze);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            Object obj = this.zza.get(str);
            if (obj != null) {
                this.zza.remove(str);
            }
            if (obj instanceof AdView) {
                zzduz.zza(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                zzduz.zzb(context, viewGroup, (NativeAd) obj);
            }
        }
    }

    public final void zzf(zzdue zzdueVar) {
        this.zzg = zzdueVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c10;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 5) {
                                return;
                            }
                            RewardedInterstitialAd.load(zzj(), str, zzk(), new zzduu(this, str, str3));
                            return;
                        }
                        RewardedAd.load(zzj(), str, zzk(), new zzdut(this, str, str3));
                        return;
                    }
                    AdLoader.Builder builder = new AdLoader.Builder(zzj(), str);
                    builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdup
                        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                        public final void onNativeAdLoaded(NativeAd nativeAd) {
                            zzduy.this.zzg(str, nativeAd, str3);
                        }
                    });
                    builder.withAdListener(new zzduv(this, str3));
                    builder.build().loadAd(zzk());
                    return;
                }
                InterstitialAd.load(zzj(), str, zzk(), new zzdus(this, str, str3));
                return;
            }
            AdView adView = new AdView(zzj());
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new zzdur(this, str, adView, str3));
            adView.loadAd(zzk());
            return;
        }
        AppOpenAd.load(zzj(), str, zzk(), 1, new zzduq(this, str, str3));
    }

    public final synchronized void zzi(String str, String str2) {
        Activity zzg = this.zzd.zzg();
        if (zzg == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj == null) {
            return;
        }
        zzbbj zzbbjVar = zzbbr.zziY;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
            this.zza.remove(str);
        }
        zzn(zzl(obj), str2);
        if (obj instanceof AppOpenAd) {
            ((AppOpenAd) obj).show(zzg);
        } else if (obj instanceof InterstitialAd) {
            ((InterstitialAd) obj).show(zzg);
        } else if (obj instanceof RewardedAd) {
            ((RewardedAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdun
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (obj instanceof RewardedInterstitialAd) {
            ((RewardedInterstitialAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzduo
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
            Intent intent = new Intent();
            Context zzj = zzj();
            intent.setClassName(zzj, OutOfContextTestingActivity.CLASS_NAME);
            intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(zzj, intent);
        }
    }
}
