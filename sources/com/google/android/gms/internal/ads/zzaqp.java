package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaqp implements Runnable {
    final /* synthetic */ zzaqq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqp(zzaqq zzaqqVar) {
        this.zza = zzaqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        zzflc zzflcVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z10 = this.zza.zzp;
            if (!z10) {
                this.zza.zzp = true;
                try {
                    zzaqq.zzj(this.zza);
                } catch (Exception e10) {
                    zzflcVar = this.zza.zzh;
                    zzflcVar.zzc(2023, -1L, e10);
                }
                obj2 = this.zza.zzo;
                synchronized (obj2) {
                    this.zza.zzp = false;
                }
            }
        }
    }
}
