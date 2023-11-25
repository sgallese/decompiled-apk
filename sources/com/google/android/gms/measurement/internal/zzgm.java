package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgm implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgm(zzgv zzgvVar, zzq zzqVar) {
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
        zzlfVar2.zzd(zzqVar);
    }
}
