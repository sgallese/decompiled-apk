package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.recyclerview.widget.RecyclerView;
import okhttp3.HttpUrl;

/* compiled from: Utils.java */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f11903a;

    public static void a(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static boolean b(Context context) {
        Boolean bool = f11903a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f11903a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            v9.a.e().a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        return (int) j10;
    }

    public static String d(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse != null) {
            return parse.newBuilder().username("").password("").query(null).fragment(null).toString();
        }
        return str;
    }

    public static String e(String str, int i10) {
        int lastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) == '/') {
            return str.substring(0, i10);
        }
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            return str.substring(0, i10);
        }
        if (parse.encodedPath().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, i10 - 1)) >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return str.substring(0, i10);
    }
}
