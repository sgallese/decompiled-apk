package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfcv {
    public static void zza(Context context, boolean z10) {
        if (z10) {
            zzcaa.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        zzcaa.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzbzt.zzy(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i10, Throwable th, String str) {
        zzcaa.zzi("Ad failed to load : " + i10);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i10 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, str);
    }
}
