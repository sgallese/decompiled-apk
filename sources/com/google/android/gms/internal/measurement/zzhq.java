package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzhq {
    private static final a zza = new a();

    public static synchronized Uri zza(String str) {
        synchronized (zzhq.class) {
            a aVar = zza;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                aVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
