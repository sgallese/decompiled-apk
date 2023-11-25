package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdwy extends zzdws {
    private String zzg;
    private int zzh = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwy(Context context) {
        this.zzf = new zzbtn(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    try {
                        int i10 = this.zzh;
                        if (i10 == 2) {
                            this.zzf.zzp().zze(this.zze, new zzdwr(this));
                        } else if (i10 == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzdwr(this));
                        } else {
                            this.zza.zzd(new zzdxh(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdxh(1));
                    }
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzdxh(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdws, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcaa.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdxh(1));
    }

    public final com.google.common.util.concurrent.a zzb(zzbun zzbunVar) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                return zzfye.zzg(new zzdxh(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbunVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwy.this.zza();
                    }
                }, zzcan.zzf);
                return this.zza;
            }
        }
    }

    public final com.google.common.util.concurrent.a zzc(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                return zzfye.zzg(new zzdxh(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdww
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwy.this.zza();
                    }
                }, zzcan.zzf);
                return this.zza;
            }
        }
    }
}
