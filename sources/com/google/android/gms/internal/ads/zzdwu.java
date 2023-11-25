package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdwu extends zzdws {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwu(Context context) {
        this.zzf = new zzbtn(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdwr(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdxh(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzdxh(1));
                }
            }
        }
    }

    public final com.google.common.util.concurrent.a zzb(zzbun zzbunVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbunVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwt
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwu.this.zza();
                }
            }, zzcan.zzf);
            return this.zza;
        }
    }
}
