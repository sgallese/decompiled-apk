package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.a;
import com.google.android.gms.ads.MobileAds;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzedl {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedl(Context context) {
        this.zza = context;
    }

    public final com.google.common.util.concurrent.a zza(boolean z10) {
        androidx.privacysandbox.ads.adservices.topics.a a10 = new a.C0151a().b(MobileAds.ERROR_DOMAIN).c(z10).a();
        r3.a a11 = r3.a.a(this.zza);
        if (a11 != null) {
            return a11.b(a10);
        }
        return zzfye.zzg(new IllegalStateException());
    }
}
