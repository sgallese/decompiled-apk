package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    public static String getCookieUrl(String str, Boolean bool) {
        String str2;
        Preconditions.checkNotEmpty(str);
        if (true != zza(bool)) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        return str2 + "://" + str;
    }

    public static String getCookieValue(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l10) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
        }
        if (zza(bool)) {
            sb2.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb2.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb2.append(";Domain=");
            sb2.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb2.append(";Path=");
            sb2.append(str4);
        }
        if (l10 != null && l10.longValue() > 0) {
            sb2.append(";Max-Age=");
            sb2.append(l10);
        }
        if (!TextUtils.isEmpty(null)) {
            sb2.append(";Priority=null");
        }
        if (!TextUtils.isEmpty(null)) {
            sb2.append(";SameSite=null");
        }
        if (zza(null)) {
            sb2.append(";SameParty");
        }
        return sb2.toString();
    }

    private static boolean zza(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
