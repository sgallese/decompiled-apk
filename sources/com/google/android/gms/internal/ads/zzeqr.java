package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeqr implements zzesj {
    private final zzesj zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeqr(zzesj zzesjVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzesjVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        com.google.common.util.concurrent.a zzb = this.zza.zzb();
        long j10 = this.zzb;
        if (j10 > 0) {
            zzb = zzfye.zzo(zzb, j10, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfye.zzf(zzb, Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                Throwable th = (Throwable) obj;
                return zzfye.zzh(null);
            }
        }, zzcan.zzf);
    }
}
