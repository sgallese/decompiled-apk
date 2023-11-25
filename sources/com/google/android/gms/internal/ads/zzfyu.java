package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfyu {
    public static zzfyo zza(ExecutorService executorService) {
        zzfyo zzfyqVar;
        if (executorService instanceof zzfyo) {
            return (zzfyo) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfyqVar = new zzfyt((ScheduledExecutorService) executorService);
        } else {
            zzfyqVar = new zzfyq(executorService);
        }
        return zzfyqVar;
    }

    public static Executor zzb() {
        return zzfxs.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zzc(Executor executor, zzfws zzfwsVar) {
        executor.getClass();
        if (executor == zzfxs.INSTANCE) {
            return executor;
        }
        return new zzfyp(executor, zzfwsVar);
    }
}
