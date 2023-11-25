package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
final class zzjr implements Runnable {
    final /* synthetic */ zzej zza;
    final /* synthetic */ zzjw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjr(zzjw zzjwVar, zzej zzejVar) {
        this.zzb = zzjwVar;
        this.zza = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzt.zzaA().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
