package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjl implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjl(zzjx zzjxVar, zzq zzqVar) {
        this.zzb = zzjxVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjx zzjxVar = this.zzb;
        zzejVar = zzjxVar.zzb;
        if (zzejVar == null) {
            zzjxVar.zzt.zzaA().zzd().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send consent settings to the service", e10);
        }
    }
}
