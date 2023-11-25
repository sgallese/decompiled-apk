package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfye extends zzfyg {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfyd zza(Iterable iterable) {
        return new zzfyd(false, zzfud.zzj(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfyd zzb(Iterable iterable) {
        int i10 = zzfud.zzd;
        iterable.getClass();
        return new zzfyd(true, zzfud.zzj(iterable), null);
    }

    @SafeVarargs
    public static zzfyd zzc(com.google.common.util.concurrent.a... aVarArr) {
        return new zzfyd(true, zzfud.zzk(aVarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.common.util.concurrent.a zzd(Iterable iterable) {
        return new zzfxm(zzfud.zzj(iterable), true);
    }

    public static com.google.common.util.concurrent.a zze(com.google.common.util.concurrent.a aVar, Class cls, zzfqw zzfqwVar, Executor executor) {
        zzfwp zzfwpVar = new zzfwp(aVar, cls, zzfqwVar);
        aVar.addListener(zzfwpVar, zzfyu.zzc(executor, zzfwpVar));
        return zzfwpVar;
    }

    public static com.google.common.util.concurrent.a zzf(com.google.common.util.concurrent.a aVar, Class cls, zzfxl zzfxlVar, Executor executor) {
        zzfwo zzfwoVar = new zzfwo(aVar, cls, zzfxlVar);
        aVar.addListener(zzfwoVar, zzfyu.zzc(executor, zzfwoVar));
        return zzfwoVar;
    }

    public static com.google.common.util.concurrent.a zzg(Throwable th) {
        th.getClass();
        return new zzfyh(th);
    }

    public static com.google.common.util.concurrent.a zzh(Object obj) {
        if (obj == null) {
            return zzfyi.zza;
        }
        return new zzfyi(obj);
    }

    public static com.google.common.util.concurrent.a zzi() {
        return zzfyi.zza;
    }

    public static com.google.common.util.concurrent.a zzj(Callable callable, Executor executor) {
        zzfzd zzfzdVar = new zzfzd(callable);
        executor.execute(zzfzdVar);
        return zzfzdVar;
    }

    public static com.google.common.util.concurrent.a zzk(zzfxk zzfxkVar, Executor executor) {
        zzfzd zzfzdVar = new zzfzd(zzfxkVar);
        executor.execute(zzfzdVar);
        return zzfzdVar;
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.a zzl(com.google.common.util.concurrent.a... aVarArr) {
        return new zzfxm(zzfud.zzk(aVarArr), false);
    }

    public static com.google.common.util.concurrent.a zzm(com.google.common.util.concurrent.a aVar, zzfqw zzfqwVar, Executor executor) {
        zzfwz zzfwzVar = new zzfwz(aVar, zzfqwVar);
        aVar.addListener(zzfwzVar, zzfyu.zzc(executor, zzfwzVar));
        return zzfwzVar;
    }

    public static com.google.common.util.concurrent.a zzn(com.google.common.util.concurrent.a aVar, zzfxl zzfxlVar, Executor executor) {
        int i10 = zzfxa.zzc;
        executor.getClass();
        zzfwy zzfwyVar = new zzfwy(aVar, zzfxlVar);
        aVar.addListener(zzfwyVar, zzfyu.zzc(executor, zzfwyVar));
        return zzfwyVar;
    }

    public static com.google.common.util.concurrent.a zzo(com.google.common.util.concurrent.a aVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (aVar.isDone()) {
            return aVar;
        }
        return zzfza.zzf(aVar, j10, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzfzf.zza(future);
        }
        throw new IllegalStateException(zzfrx.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzfzf.zza(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new zzfxt((Error) cause);
            }
            throw new zzfze(cause);
        }
    }

    public static void zzr(com.google.common.util.concurrent.a aVar, zzfya zzfyaVar, Executor executor) {
        zzfyaVar.getClass();
        aVar.addListener(new zzfyb(aVar, zzfyaVar), executor);
    }
}
