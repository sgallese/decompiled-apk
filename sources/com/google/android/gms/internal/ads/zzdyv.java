package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdyv extends zzdyy {
    private zzbtr zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyv(Context context, ScheduledExecutorService scheduledExecutorService) {
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
                    this.zzd.zzp().zzf(this.zzh, new zzdyx(this));
                } catch (RemoteException unused) {
                    this.zza.zzd(new zzdxh(1));
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdsServiceSignalClientTask.onConnected");
                this.zza.zzd(th);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyy, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        zzcaa.zze(format);
        this.zza.zzd(new zzdxh(1, format));
    }

    public final synchronized com.google.common.util.concurrent.a zza(zzbtr zzbtrVar, long j10) {
        if (this.zzb) {
            return zzfye.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbtrVar;
        zzb();
        com.google.common.util.concurrent.a zzo = zzfye.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyu
            @Override // java.lang.Runnable
            public final void run() {
                zzdyv.this.zzc();
            }
        }, zzcan.zzf);
        return zzo;
    }
}
