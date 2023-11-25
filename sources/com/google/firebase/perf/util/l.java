package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* compiled from: URLAllowlist.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f11901a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        v9.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f11901a == null) {
            f11901a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f11901a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
