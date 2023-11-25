package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzcgk;
import com.google.android.gms.internal.ads.zzecs;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public class zzaa {
    private zzaa() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    public static zzaa zzo(int i10) {
        if (i10 >= 30) {
            return new zzy();
        }
        if (i10 >= 28) {
            return new zzx();
        }
        if (i10 >= 26) {
            return new zzv();
        }
        if (i10 >= 24) {
            return new zzu();
        }
        if (i10 >= 21) {
            return new zzt();
        }
        return new zzaa();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzC()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcaa.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzcfp zzd(zzcfi zzcfiVar, zzaxe zzaxeVar, boolean z10, zzecs zzecsVar) {
        return new zzcgk(zzcfiVar, zzaxeVar, z10, zzecsVar);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int zzk(AudioManager audioManager) {
        return 0;
    }

    public int zzn(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void zzl(Activity activity) {
    }

    public void zzh(Context context, String str, String str2) {
    }
}
