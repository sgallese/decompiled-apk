package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgg implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgg(zzgv zzgvVar, zzac zzacVar) {
        this.zzb = zzgvVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        zzlf zzlfVar3;
        zzlfVar = this.zzb.zza;
        zzlfVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzlfVar3 = this.zzb.zza;
            zzlfVar3.zzN(this.zza);
            return;
        }
        zzlfVar2 = this.zzb.zza;
        zzlfVar2.zzT(this.zza);
    }
}
