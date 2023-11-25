package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdwq extends zzdws {
    public zzdwq(Context context) {
        this.zzf = new zzbtn(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzdwr(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdxh(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdRequestClientTask.onConnected");
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
}
