package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@TargetApi(24)
/* loaded from: classes.dex */
public class zzu extends zzt {
    static final boolean zzf(int i10, int i11, int i12) {
        if (Math.abs(i10 - i11) <= i12) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        int i10;
        boolean isInMultiWindowMode;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeG)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeI)).booleanValue()) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        int zzx = zzbzt.zzx(activity, configuration.screenHeightDp);
        int zzx2 = zzbzt.zzx(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzq = zzs.zzq(windowManager);
        int i11 = zzq.heightPixels;
        int i12 = zzq.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i10 = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i10 = 0;
        }
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeE)).intValue();
        if (zzf(i11, zzx + i10, round) && zzf(i12, zzx2, round)) {
            return false;
        }
        return true;
    }
}
