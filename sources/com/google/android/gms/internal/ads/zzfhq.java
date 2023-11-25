package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfhq {
    public static void zza(com.google.common.util.concurrent.a aVar, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        zzg(aVar, zzfhrVar, zzfhgVar, false);
    }

    public static void zzb(com.google.common.util.concurrent.a aVar, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        zzg(aVar, zzfhrVar, zzfhgVar, true);
    }

    public static void zzc(com.google.common.util.concurrent.a aVar, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        if (!((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            return;
        }
        zzfye.zzr(zzfxv.zzu(aVar), new zzfhp(zzfhrVar, zzfhgVar), zzcan.zzf);
    }

    public static void zzd(com.google.common.util.concurrent.a aVar, zzfhg zzfhgVar) {
        if (!((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            return;
        }
        zzfye.zzr(zzfxv.zzu(aVar), new zzfhn(zzfhgVar), zzcan.zzf);
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzit), str);
    }

    public static int zzf(zzfca zzfcaVar) {
        int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfcaVar) - 1;
        if (zze != 0 && zze != 1) {
            return 23;
        }
        return 7;
    }

    private static void zzg(com.google.common.util.concurrent.a aVar, zzfhr zzfhrVar, zzfhg zzfhgVar, boolean z10) {
        if (!((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            return;
        }
        zzfye.zzr(zzfxv.zzu(aVar), new zzfho(zzfhrVar, zzfhgVar, z10), zzcan.zzf);
    }
}
