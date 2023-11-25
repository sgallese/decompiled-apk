package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfqb extends zzfpy {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfpy zzb;
    final /* synthetic */ zzfqi zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqb(zzfqi zzfqiVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfpy zzfpyVar) {
        super(taskCompletionSource);
        this.zzc = zzfqiVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzfpyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        zzfpx zzfpxVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            zzfqi.zzn(this.zzc, this.zza);
            atomicInteger = this.zzc.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzfpxVar = this.zzc.zzc;
                zzfpxVar.zzc("Already connected to the service.", new Object[0]);
            }
            zzfqi.zzp(this.zzc, this.zzb);
        }
    }
}
