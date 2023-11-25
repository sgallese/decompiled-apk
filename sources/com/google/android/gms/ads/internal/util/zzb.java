package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcan;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public com.google.common.util.concurrent.a zzb() {
        return zzcan.zza.zza(this.zza);
    }
}
