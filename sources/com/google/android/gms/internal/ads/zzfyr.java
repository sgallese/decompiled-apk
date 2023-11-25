package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfyr extends zzfxy implements ScheduledFuture {
    private final ScheduledFuture zza;

    public zzfyr(com.google.common.util.concurrent.a aVar, ScheduledFuture scheduledFuture) {
        super(aVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean cancel = zzb().cancel(z10);
        if (cancel) {
            this.zza.cancel(z10);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
