package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjm implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaw zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjx zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjm(zzjx zzjxVar, boolean z10, zzq zzqVar, boolean z11, zzaw zzawVar, String str) {
        this.zze = zzjxVar;
        this.zza = zzqVar;
        this.zzb = z11;
        this.zzc = zzawVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzaw zzawVar;
        zzjx zzjxVar = this.zze;
        zzejVar = zzjxVar.zzb;
        if (zzejVar == null) {
            zzjxVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjx zzjxVar2 = this.zze;
        if (this.zzb) {
            zzawVar = null;
        } else {
            zzawVar = this.zzc;
        }
        zzjxVar2.zzD(zzejVar, zzawVar, this.zza);
        this.zze.zzQ();
    }
}
