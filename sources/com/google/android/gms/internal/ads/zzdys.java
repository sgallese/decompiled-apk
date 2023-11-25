package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdys extends zzdyy {
    private zzbtv zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdys(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (!this.zzc) {
            this.zzc = true;
            try {
                try {
                    this.zzd.zzp().zze(this.zzh, new zzdyx(this));
                } catch (RemoteException unused) {
                    this.zza.zzd(new zzdxh(1));
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdsServiceProxyClientTask.onConnected");
                this.zza.zzd(th);
            }
        }
    }

    public final synchronized com.google.common.util.concurrent.a zza(zzbtv zzbtvVar, long j10) {
        if (this.zzb) {
            return zzfye.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbtvVar;
        zzb();
        com.google.common.util.concurrent.a zzo = zzfye.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyr
            @Override // java.lang.Runnable
            public final void run() {
                zzdys.this.zzc();
            }
        }, zzcan.zzf);
        return zzo;
    }
}
