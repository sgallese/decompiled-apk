package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzht implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzii zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzht(zzii zziiVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.zzd = zziiVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzt.zzt().zzw(this.zza, null, this.zzb, this.zzc);
    }
}
