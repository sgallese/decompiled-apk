package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjg implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjg(zzjx zzjxVar, zzq zzqVar, Bundle bundle) {
        this.zzc = zzjxVar;
        this.zza = zzqVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjx zzjxVar = this.zzc;
        zzejVar = zzjxVar.zzb;
        if (zzejVar == null) {
            zzjxVar.zzt.zzaA().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e10) {
            this.zzc.zzt.zzaA().zzd().zzb("Failed to send default event parameters to service", e10);
        }
    }
}
