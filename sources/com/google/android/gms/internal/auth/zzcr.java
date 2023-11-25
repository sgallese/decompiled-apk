package com.google.android.gms.internal.auth;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzcr {
    private static final androidx.collection.a zza = new androidx.collection.a();

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            androidx.collection.a aVar = zza;
            Uri uri = (Uri) aVar.get("com.google.android.gms.auth_account");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                aVar.put("com.google.android.gms.auth_account", parse);
                return parse;
            }
            return uri;
        }
    }
}
