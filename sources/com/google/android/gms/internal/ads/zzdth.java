package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdth implements zzfya {
    final /* synthetic */ zzdtj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdth(zzdtj zzdtjVar) {
        this.zza = zzdtjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        long j10;
        zzcas zzcasVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdtj zzdtjVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j10 = this.zza.zzd;
            zzdtjVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j10));
            zzcasVar = this.zza.zze;
            zzcasVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j10;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdtj zzdtjVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j10 = this.zza.zzd;
            zzdtjVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j10));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtg
                @Override // java.lang.Runnable
                public final void run() {
                    zzdth zzdthVar = zzdth.this;
                    zzdtj.zzj(zzdthVar.zza, str);
                }
            });
        }
    }
}
