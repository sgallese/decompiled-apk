package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgj implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgv zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgj(zzgv zzgvVar, String str, String str2, String str3) {
        this.zzd = zzgvVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        zzlfVar = this.zzd.zza;
        zzlfVar.zzA();
        zzlfVar2 = this.zzd.zza;
        return zzlfVar2.zzi().zzs(this.zza, this.zzb, this.zzc);
    }
}
