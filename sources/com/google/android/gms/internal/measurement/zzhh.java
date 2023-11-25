package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzhh {
    private final g zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(g gVar) {
        this.zza = gVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        g gVar = (g) this.zza.get(uri.toString());
        if (gVar == null) {
            return null;
        }
        return (String) gVar.get("".concat(str3));
    }
}
