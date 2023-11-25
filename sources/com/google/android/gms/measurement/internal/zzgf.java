package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgf implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgf(zzgv zzgvVar, zzac zzacVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzacVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        zzlf zzlfVar3;
        zzlfVar = this.zzc.zza;
        zzlfVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzlfVar3 = this.zzc.zza;
            zzlfVar3.zzO(this.zza, this.zzb);
            return;
        }
        zzlfVar2 = this.zzc.zza;
        zzlfVar2.zzU(this.zza, this.zzb);
    }
}
