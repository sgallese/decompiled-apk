package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzgv zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgu(zzgv zzgvVar, String str, String str2, String str3, long j10) {
        this.zze = zzgvVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        String str = this.zza;
        if (str == null) {
            zzlfVar2 = this.zze.zza;
            zzlfVar2.zzR(this.zzb, null);
            return;
        }
        zzip zzipVar = new zzip(this.zzc, str, this.zzd);
        zzlfVar = this.zze.zza;
        zzlfVar.zzR(this.zzb, zzipVar);
    }
}
