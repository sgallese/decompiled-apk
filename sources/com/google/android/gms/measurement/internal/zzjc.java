package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjc implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzjx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjc(zzjx zzjxVar, AtomicReference atomicReference, zzq zzqVar) {
        this.zzc = zzjxVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzej zzejVar;
        synchronized (this.zza) {
            try {
                try {
                } catch (RemoteException e10) {
                    this.zzc.zzt.zzaA().zzd().zzb("Failed to get app instance id", e10);
                    atomicReference = this.zza;
                }
                if (!this.zzc.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    this.zzc.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzt.zzq().zzO(null);
                    this.zzc.zzt.zzm().zze.zzb(null);
                    this.zza.set(null);
                    return;
                }
                zzjx zzjxVar = this.zzc;
                zzejVar = zzjxVar.zzb;
                if (zzejVar == null) {
                    zzjxVar.zzt.zzaA().zzd().zza("Failed to get app instance id");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzejVar.zzd(this.zzb));
                String str = (String) this.zza.get();
                if (str != null) {
                    this.zzc.zzt.zzq().zzO(str);
                    this.zzc.zzt.zzm().zze.zzb(str);
                }
                this.zzc.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
