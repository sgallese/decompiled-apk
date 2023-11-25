package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgn(zzgv zzgvVar, zzq zzqVar) {
        this.zzb = zzgvVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        zzlfVar = this.zzb.zza;
        zzlfVar.zzA();
        zzlfVar2 = this.zzb.zza;
        zzq zzqVar = this.zza;
        zzlfVar2.zzaB().zzg();
        zzlfVar2.zzB();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzai zzb = zzai.zzb(zzqVar.zzv);
        zzai zzh = zzlfVar2.zzh(zzqVar.zza);
        zzlfVar2.zzaA().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzb);
        zzlfVar2.zzV(zzqVar.zza, zzb);
        if (zzb.zzk(zzh)) {
            zzlfVar2.zzQ(zzqVar);
        }
    }
}
