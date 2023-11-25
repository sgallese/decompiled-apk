package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcaq;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        int i10 = zzbzz.zza;
        if (((Boolean) zzbdg.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 && !zzbzz.zzl()) {
                    com.google.common.util.concurrent.a zzb = new zzc(context).zzb();
                    zzcaa.zzi("Updating ad debug logging enablement.");
                    zzcaq.zza(zzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e10) {
                zzcaa.zzk("Fail to determine debug setting.", e10);
            }
        }
    }
}
