package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzir implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzip zzb;
    final /* synthetic */ zzip zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzix zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzir(zzix zzixVar, Bundle bundle, zzip zzipVar, zzip zzipVar2, long j10) {
        this.zze = zzixVar;
        this.zza = bundle;
        this.zzb = zzipVar;
        this.zzc = zzipVar2;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzix.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
