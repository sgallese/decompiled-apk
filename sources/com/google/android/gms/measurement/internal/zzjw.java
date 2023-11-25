package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzjw implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzjx zza;
    private volatile boolean zzb;
    private volatile zzep zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjw(zzjx zzjxVar) {
        this.zza = zzjxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzt.zzaB().zzp(new zzjt(this, (zzej) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzet zzl = this.zza.zzt.zzl();
        if (zzl != null) {
            zzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzt.zzaB().zzp(new zzjv(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzt.zzaA().zzc().zza("Service connection suspended");
        this.zza.zzt.zzaB().zzp(new zzju(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjw zzjwVar;
        zzej zzehVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzt.zzaA().zzd().zza("Service connected with null binder");
                return;
            }
            zzej zzejVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof zzej) {
                        zzehVar = (zzej) queryLocalInterface;
                    } else {
                        zzehVar = new zzeh(iBinder);
                    }
                    zzejVar = zzehVar;
                    this.zza.zzt.zzaA().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzt.zzaA().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzt.zzaA().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if (zzejVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzaw = this.zza.zzt.zzaw();
                    zzjwVar = this.zza.zza;
                    connectionTracker.unbindService(zzaw, zzjwVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzt.zzaB().zzp(new zzjr(this, zzejVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzt.zzaA().zzc().zza("Service disconnected");
        this.zza.zzt.zzaB().zzp(new zzjs(this, componentName));
    }

    public final void zzb(Intent intent) {
        zzjw zzjwVar;
        this.zza.zzg();
        Context zzaw = this.zza.zzt.zzaw();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzt.zzaA().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzt.zzaA().zzj().zza("Using local app measurement service");
            this.zzb = true;
            zzjwVar = this.zza.zza;
            connectionTracker.bindService(zzaw, intent, zzjwVar, 129);
        }
    }

    public final void zzc() {
        this.zza.zzg();
        Context zzaw = this.zza.zzt.zzaw();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzt.zzaA().zzj().zza("Connection attempt already in progress");
            } else if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzt.zzaA().zzj().zza("Already awaiting connection attempt");
            } else {
                this.zzc = new zzep(zzaw, Looper.getMainLooper(), this, this);
                this.zza.zzt.zzaA().zzj().zza("Connecting to remote service");
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            }
        }
    }

    public final void zzd() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}
