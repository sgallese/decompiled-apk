package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzza extends HandlerThread implements Handler.Callback {
    private zzee zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzzc zze;

    public zzza() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z10;
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    zzee zzeeVar = this.zza;
                    zzeeVar.getClass();
                    zzeeVar.zzc();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i11 = message.arg1;
                zzee zzeeVar2 = this.zza;
                zzeeVar2.getClass();
                zzeeVar2.zzb(i11);
                SurfaceTexture zza = this.zza.zza();
                if (i11 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.zze = new zzzc(this, zza, z10, null);
                synchronized (this) {
                    notify();
                }
            } catch (zzeg e10) {
                zzes.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.zzd = new IllegalStateException(e10);
                synchronized (this) {
                    notify();
                }
            } catch (Error e11) {
                zzes.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.zzc = e11;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e12) {
                zzes.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                this.zzd = e12;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzzc zza(int i10) {
        boolean z10;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzee(this.zzb, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzzc zzzcVar = this.zze;
                zzzcVar.getClass();
                return zzzcVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
