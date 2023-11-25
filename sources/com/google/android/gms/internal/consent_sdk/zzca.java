package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class zzca {
    public static zzby zza(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            str2 = String.valueOf(context.getPackageName()).concat("_preferences");
            str3 = split[0];
        } else {
            if (length == 2) {
                str2 = split[0];
                str3 = split[1];
            }
            return null;
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return new zzby(str2, str3);
        }
        return null;
    }

    public static void zzb(Context context, Set<String> set) {
        String str;
        SharedPreferences.Editor zzd;
        zzbz zzbzVar = new zzbz(context);
        for (String str2 : set) {
            zzby zza = zza(context, str2);
            if (zza != null) {
                zzd = zzbzVar.zzd(zza.zza);
                zzd.remove(zza.zzb);
            } else {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str = "clearKeys: unable to process key: ".concat(valueOf);
                } else {
                    str = new String("clearKeys: unable to process key: ");
                }
                Log.d("UserMessagingPlatform", str);
            }
        }
        zzbzVar.zzb();
    }
}
