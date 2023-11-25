package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
final class zzjv implements Runnable {
    final /* synthetic */ zzjw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjv(zzjw zzjwVar) {
        this.zza = zzjwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzP();
    }
}
