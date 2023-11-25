package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfxq extends zzfyn {
    private final Executor zza;
    final /* synthetic */ zzfxr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxq(zzfxr zzfxrVar, Executor executor) {
        this.zzb = zzfxrVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzfyn
    final void zzd(Throwable th) {
        this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final boolean zzg() {
        return this.zzb.isDone();
    }
}
