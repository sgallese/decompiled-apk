package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgr implements Runnable {
    final /* synthetic */ zzli zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgr(zzgv zzgvVar, zzli zzliVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzliVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        zzlf zzlfVar3;
        zzlfVar = this.zzc.zza;
        zzlfVar.zzA();
        if (this.zza.zza() == null) {
            zzlfVar3 = this.zzc.zza;
            zzlfVar3.zzP(this.zza.zzb, this.zzb);
            return;
        }
        zzlfVar2 = this.zzc.zza;
        zzlfVar2.zzW(this.zza, this.zzb);
    }
}
