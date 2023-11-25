package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzji implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzji(zzjx zzjxVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjxVar;
        this.zza = zzawVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        zzej zzejVar;
        byte[] bArr = null;
        try {
            try {
                zzjx zzjxVar = this.zzd;
                zzejVar = zzjxVar.zzb;
                if (zzejVar == null) {
                    zzjxVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzgdVar = this.zzd.zzt;
                } else {
                    bArr = zzejVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzgdVar = this.zzd.zzt;
                }
            } catch (RemoteException e10) {
                this.zzd.zzt.zzaA().zzd().zzb("Failed to send event to the service to bundle", e10);
                zzgdVar = this.zzd.zzt;
            }
            zzgdVar.zzv().zzT(this.zzc, bArr);
        } catch (Throwable th) {
            this.zzd.zzt.zzv().zzT(this.zzc, bArr);
            throw th;
        }
    }
}
