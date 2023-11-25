package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzao implements Runnable {
    final /* synthetic */ zzgy zza;
    final /* synthetic */ zzap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzap zzapVar, zzgy zzgyVar) {
        this.zzb = zzapVar;
        this.zza = zzgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzay();
        if (zzab.zza()) {
            this.zza.zzaB().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
