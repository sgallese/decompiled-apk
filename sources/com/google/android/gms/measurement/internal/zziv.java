package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zziv implements Runnable {
    final /* synthetic */ zzip zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzix zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziv(zzix zzixVar, zzip zzipVar, long j10) {
        this.zzc = zzixVar;
        this.zza = zzipVar;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zzix zzixVar = this.zzc;
        zzixVar.zza = null;
        zzixVar.zzt.zzt().zzG(null);
    }
}
