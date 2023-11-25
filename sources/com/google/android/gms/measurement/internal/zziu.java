package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zziu implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzix zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziu(zzix zzixVar, long j10) {
        this.zzb = zzixVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
