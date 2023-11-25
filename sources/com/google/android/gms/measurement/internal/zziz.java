package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zziz implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzjx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziz(zzjx zzjxVar, AtomicReference atomicReference, zzq zzqVar, boolean z10) {
        this.zzd = zzjxVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
        this.zzc = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjx zzjxVar;
        zzej zzejVar;
        synchronized (this.zza) {
            try {
                try {
                    zzjxVar = this.zzd;
                    zzejVar = zzjxVar.zzb;
                } catch (RemoteException e10) {
                    this.zzd.zzt.zzaA().zzd().zzb("Failed to get all user properties; remote exception", e10);
                    atomicReference = this.zza;
                }
                if (zzejVar == null) {
                    zzjxVar.zzt.zzaA().zzd().zza("Failed to get all user properties; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzejVar.zze(this.zzb, this.zzc));
                this.zzd.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
