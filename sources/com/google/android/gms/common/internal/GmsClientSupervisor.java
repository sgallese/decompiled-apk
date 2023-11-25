package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GmsClientSupervisor {
    @VisibleForTesting
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static zzs zzc = null;
    private static Executor zzd = null;
    private static boolean zze = false;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @KeepForSdk
    public static GmsClientSupervisor getInstance(Context context) {
        Looper mainLooper;
        synchronized (zzb) {
            if (zzc == null) {
                Context applicationContext = context.getApplicationContext();
                if (zze) {
                    mainLooper = getOrStartHandlerThread().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                zzc = new zzs(applicationContext, mainLooper, zzd);
            }
        }
        return zzc;
    }

    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(Executor executor) {
        synchronized (zzb) {
            zzs zzsVar = zzc;
            if (zzsVar != null) {
                zzsVar.zzi(executor);
            }
            zzd = executor;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            zzs zzsVar = zzc;
            if (zzsVar != null && !zze) {
                zzsVar.zzj(getOrStartHandlerThread().getLooper());
            }
            zze = true;
        }
    }

    @KeepForSdk
    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zzc(new zzo(componentName, 4225), serviceConnection, str, null);
    }

    @KeepForSdk
    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zza(new zzo(componentName, 4225), serviceConnection, str);
    }

    protected abstract void zza(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public final void zzb(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        zza(new zzo(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor);

    @KeepForSdk
    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return zzc(new zzo(componentName, 4225), serviceConnection, str, executor);
    }

    @KeepForSdk
    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        zza(new zzo(str, 4225, false), serviceConnection, str2);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return zzc(new zzo(str, 4225, false), serviceConnection, str2, null);
    }
}
