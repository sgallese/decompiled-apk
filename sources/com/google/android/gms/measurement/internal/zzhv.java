package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzhv implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzii zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhv(zzii zziiVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.zze = zziiVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzt.zzt().zzz(this.zza, null, this.zzb, this.zzc, this.zzd);
    }
}
