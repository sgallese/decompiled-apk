package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfzd extends zzfxu implements RunnableFuture {
    private volatile zzfyn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzd(zzfxk zzfxkVar) {
        this.zza = new zzfzb(this, zzfxkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfzd zze(Runnable runnable, Object obj) {
        return new zzfzd(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfyn zzfynVar = this.zza;
        if (zzfynVar != null) {
            zzfynVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final String zza() {
        zzfyn zzfynVar = this.zza;
        if (zzfynVar != null) {
            return "task=[" + zzfynVar.toString() + "]";
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        zzfyn zzfynVar;
        if (zzt() && (zzfynVar = this.zza) != null) {
            zzfynVar.zzh();
        }
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzd(Callable callable) {
        this.zza = new zzfzc(this, callable);
    }
}
