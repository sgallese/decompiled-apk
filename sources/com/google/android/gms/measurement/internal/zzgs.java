package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgs implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgs(zzgv zzgvVar, String str) {
        this.zzb = zzgvVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        zzlfVar = this.zzb.zza;
        zzlfVar.zzA();
        zzlfVar2 = this.zzb.zza;
        return zzlfVar2.zzi().zzu(this.zza);
    }
}
