package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzawm {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzawi(this);
    private final Object zzc = new Object();
    private zzawp zzd;
    private Context zze;
    private zzaws zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzh(zzawm zzawmVar) {
        synchronized (zzawmVar.zzc) {
            zzawp zzawpVar = zzawmVar.zzd;
            if (zzawpVar == null) {
                return;
            }
            if (zzawpVar.isConnected() || zzawmVar.zzd.isConnecting()) {
                zzawmVar.zzd.disconnect();
            }
            zzawmVar.zzd = null;
            zzawmVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzawp zzd = zzd(new zzawk(this), new zzawl(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzawq zzawqVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzawqVar);
                } catch (RemoteException e10) {
                    zzcaa.zzh("Unable to call into cache service.", e10);
                }
            }
            return -2L;
        }
    }

    public final zzawn zzb(zzawq zzawqVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzawn();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzawqVar);
                }
                return this.zzf.zzf(zzawqVar);
            } catch (RemoteException e10) {
                zzcaa.zzh("Unable to call into cache service.", e10);
                return new zzawn();
            }
        }
    }

    protected final synchronized zzawp zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzawp(this.zze, com.google.android.gms.ads.internal.zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzea)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdZ)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new zzawj(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeb)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcan.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzec)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
