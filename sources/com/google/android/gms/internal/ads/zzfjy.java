package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfjy {
    private static UiModeManager zza;

    public static zzfiv zza() {
        int currentModeType = zza.getCurrentModeType();
        if (currentModeType != 1) {
            if (currentModeType != 4) {
                return zzfiv.OTHER;
            }
            return zzfiv.CTV;
        }
        return zzfiv.MOBILE;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
