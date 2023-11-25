package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzja implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzli zzc;
    final /* synthetic */ zzjx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzja(zzjx zzjxVar, zzq zzqVar, boolean z10, zzli zzliVar) {
        this.zzd = zzjxVar;
        this.zza = zzqVar;
        this.zzb = z10;
        this.zzc = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzli zzliVar;
        zzjx zzjxVar = this.zzd;
        zzejVar = zzjxVar.zzb;
        if (zzejVar == null) {
            zzjxVar.zzt.zzaA().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjx zzjxVar2 = this.zzd;
        if (this.zzb) {
            zzliVar = null;
        } else {
            zzliVar = this.zzc;
        }
        zzjxVar2.zzD(zzejVar, zzliVar, this.zza);
        this.zzd.zzQ();
    }
}
