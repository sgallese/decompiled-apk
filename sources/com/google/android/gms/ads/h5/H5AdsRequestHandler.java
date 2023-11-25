package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbjw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {
    private final zzbjw zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbjw(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbjw.zzc(str);
    }
}
