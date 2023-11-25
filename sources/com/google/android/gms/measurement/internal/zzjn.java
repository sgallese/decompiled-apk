package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;
    final /* synthetic */ zzac zzd;
    final /* synthetic */ zzjx zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(zzjx zzjxVar, boolean z10, zzq zzqVar, boolean z11, zzac zzacVar, zzac zzacVar2) {
        this.zze = zzjxVar;
        this.zza = zzqVar;
        this.zzb = z11;
        this.zzc = zzacVar;
        this.zzd = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzac zzacVar;
        zzjx zzjxVar = this.zze;
        zzejVar = zzjxVar.zzb;
        if (zzejVar == null) {
            zzjxVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjx zzjxVar2 = this.zze;
        if (this.zzb) {
            zzacVar = null;
        } else {
            zzacVar = this.zzc;
        }
        zzjxVar2.zzD(zzejVar, zzacVar, this.zza);
        this.zze.zzQ();
    }
}
