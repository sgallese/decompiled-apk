package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjf implements Runnable {
    final /* synthetic */ zzip zza;
    final /* synthetic */ zzjx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjf(zzjx zzjxVar, zzip zzipVar) {
        this.zzb = zzjxVar;
        this.zza = zzipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjx zzjxVar = this.zzb;
        zzejVar = zzjxVar.zzb;
        if (zzejVar == null) {
            zzjxVar.zzt.zzaA().zzd().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzip zzipVar = this.zza;
            if (zzipVar == null) {
                zzejVar.zzq(0L, null, null, zzjxVar.zzt.zzaw().getPackageName());
            } else {
                zzejVar.zzq(zzipVar.zzc, zzipVar.zza, zzipVar.zzb, zzjxVar.zzt.zzaw().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send current screen to the service", e10);
        }
    }
}
