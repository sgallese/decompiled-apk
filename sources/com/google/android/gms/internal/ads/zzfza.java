package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfza extends zzfxu {
    private com.google.common.util.concurrent.a zza;
    private ScheduledFuture zzb;

    private zzfza(com.google.common.util.concurrent.a aVar) {
        aVar.getClass();
        this.zza = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.common.util.concurrent.a zzf(com.google.common.util.concurrent.a aVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfza zzfzaVar = new zzfza(aVar);
        zzfyx zzfyxVar = new zzfyx(zzfzaVar);
        zzfzaVar.zzb = scheduledExecutorService.schedule(zzfyxVar, j10, timeUnit);
        aVar.addListener(zzfyxVar, zzfxs.INSTANCE);
        return zzfzaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfws
    public final String zza() {
        com.google.common.util.concurrent.a aVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (aVar != null) {
            String str = "inputFuture=[" + aVar.toString() + "]";
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
