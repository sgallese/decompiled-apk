package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfyp implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfws zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyp(Executor executor, zzfws zzfwsVar) {
        this.zza = executor;
        this.zzb = zzfwsVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzd(e10);
        }
    }
}
