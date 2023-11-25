package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzeoi {
    public final com.google.common.util.concurrent.a zza;
    private final long zzb;
    private final Clock zzc;

    public zzeoi(com.google.common.util.concurrent.a aVar, long j10, Clock clock) {
        this.zza = aVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j10;
    }

    public final boolean zza() {
        if (this.zzb < this.zzc.elapsedRealtime()) {
            return true;
        }
        return false;
    }
}
