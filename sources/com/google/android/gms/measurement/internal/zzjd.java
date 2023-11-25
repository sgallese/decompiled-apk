package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjd implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    final /* synthetic */ zzjx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjd(zzjx zzjxVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjxVar;
        this.zza = zzqVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        zzej zzejVar;
        String str = null;
        try {
            try {
                if (!this.zzc.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    this.zzc.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzt.zzq().zzO(null);
                    this.zzc.zzt.zzm().zze.zzb(null);
                    zzgdVar = this.zzc.zzt;
                } else {
                    zzjx zzjxVar = this.zzc;
                    zzejVar = zzjxVar.zzb;
                    if (zzejVar == null) {
                        zzjxVar.zzt.zzaA().zzd().zza("Failed to get app instance id");
                        zzgdVar = this.zzc.zzt;
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        str = zzejVar.zzd(this.zza);
                        if (str != null) {
                            this.zzc.zzt.zzq().zzO(str);
                            this.zzc.zzt.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                        zzgdVar = this.zzc.zzt;
                    }
                }
            } catch (RemoteException e10) {
                this.zzc.zzt.zzaA().zzd().zzb("Failed to get app instance id", e10);
                zzgdVar = this.zzc.zzt;
            }
            zzgdVar.zzv().zzW(this.zzb, str);
        } catch (Throwable th) {
            this.zzc.zzt.zzv().zzW(this.zzb, null);
            throw th;
        }
    }
}
