package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfwx extends AbstractExecutorService implements zzfyo {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzfzd.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (com.google.common.util.concurrent.a) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    public final com.google.common.util.concurrent.a zza(Runnable runnable) {
        return (com.google.common.util.concurrent.a) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    public final com.google.common.util.concurrent.a zzb(Callable callable) {
        return (com.google.common.util.concurrent.a) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new zzfzd(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.a) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (com.google.common.util.concurrent.a) super.submit(callable);
    }
}
