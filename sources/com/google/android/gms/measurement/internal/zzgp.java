package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgp implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgp(zzgv zzgvVar, zzaw zzawVar, String str) {
        this.zzc = zzgvVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        zzlfVar = this.zzc.zza;
        zzlfVar.zzA();
        zzlfVar2 = this.zzc.zza;
        zzlfVar2.zzF(this.zza, this.zzb);
    }
}
