package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzedj {
    private q3.a zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedj(Context context) {
        this.zzb = context;
    }

    public final com.google.common.util.concurrent.a zza() {
        q3.a a10 = q3.a.a(this.zzb);
        this.zza = a10;
        if (a10 == null) {
            return zzfye.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
        }
        return a10.b();
    }

    public final com.google.common.util.concurrent.a zzb(Uri uri, InputEvent inputEvent) {
        q3.a aVar = this.zza;
        aVar.getClass();
        return aVar.c(uri, inputEvent);
    }
}
