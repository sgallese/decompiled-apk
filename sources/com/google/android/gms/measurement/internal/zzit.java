package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzit implements Runnable {
    final /* synthetic */ zzix zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzit(zzix zzixVar) {
        this.zza = zzixVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzip zzipVar;
        zzix zzixVar = this.zza;
        zzipVar = zzixVar.zzh;
        zzixVar.zza = zzipVar;
    }
}
