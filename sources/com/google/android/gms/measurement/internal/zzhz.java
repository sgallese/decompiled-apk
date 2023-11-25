package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzhz implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzii zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhz(zzii zziiVar, AtomicReference atomicReference) {
        this.zzb = zziiVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(Long.valueOf(this.zzb.zzt.zzf().zzi(this.zzb.zzt.zzh().zzl(), zzeg.zzM)));
            } finally {
                this.zza.notify();
            }
        }
    }
}
