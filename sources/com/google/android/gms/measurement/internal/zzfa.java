package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzfa implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfa(zzfb zzfbVar, boolean z10) {
        this.zzb = zzfbVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlf zzlfVar;
        zzlfVar = this.zzb.zzb;
        zzlfVar.zzJ(this.zza);
    }
}
