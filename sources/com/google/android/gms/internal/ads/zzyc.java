package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes3.dex */
public final class zzyc extends Handler implements Runnable {
    final /* synthetic */ zzyh zza;
    private final zzyd zzb;
    private final long zzc;
    private zzxz zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzyc(zzyh zzyhVar, Looper looper, zzyd zzydVar, zzxz zzxzVar, int i10, long j10) {
        super(looper);
        this.zza = zzyhVar;
        this.zzb = zzydVar;
        this.zzd = zzxzVar;
        this.zzc = j10;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzyc zzycVar;
        this.zze = null;
        zzyh zzyhVar = this.zza;
        executorService = zzyhVar.zze;
        zzycVar = zzyhVar.zzf;
        zzycVar.getClass();
        executorService.execute(zzycVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10;
        int i11;
        int i12;
        long j10;
        long min;
        if (this.zzi) {
            return;
        }
        int i13 = message.what;
        if (i13 == 0) {
            zzd();
        } else if (i13 != 3) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.zzc;
            zzxz zzxzVar = this.zzd;
            zzxzVar.getClass();
            if (this.zzh) {
                zzxzVar.zzI(this.zzb, elapsedRealtime, j11, false);
                return;
            }
            int i14 = message.what;
            if (i14 != 1) {
                if (i14 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.zze = iOException;
                    int i15 = this.zzf + 1;
                    this.zzf = i15;
                    zzyb zzt = zzxzVar.zzt(this.zzb, elapsedRealtime, j11, iOException, i15);
                    i10 = zzt.zza;
                    if (i10 != 3) {
                        i11 = zzt.zza;
                        if (i11 != 2) {
                            i12 = zzt.zza;
                            if (i12 == 1) {
                                this.zzf = 1;
                            }
                            j10 = zzt.zzb;
                            if (j10 != -9223372036854775807L) {
                                min = zzt.zzb;
                            } else {
                                min = Math.min((this.zzf - 1) * 1000, 5000);
                            }
                            zzc(min);
                            return;
                        }
                        return;
                    }
                    this.zza.zzg = this.zze;
                    return;
                }
                return;
            }
            try {
                zzxzVar.zzJ(this.zzb, elapsedRealtime, j11);
            } catch (RuntimeException e10) {
                zzes.zzd("LoadTask", "Unexpected exception handling load completed", e10);
                this.zza.zzg = new zzyg(e10);
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                String str = "load:" + this.zzb.getClass().getSimpleName();
                int i10 = zzfk.zza;
                Trace.beginSection(str);
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(1);
            }
        } catch (IOException e10) {
            if (!this.zzi) {
                obtainMessage(2, e10).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.zzi) {
                zzes.zzd("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        } catch (Exception e12) {
            if (!this.zzi) {
                zzes.zzd("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(2, new zzyg(e12)).sendToTarget();
            }
        } catch (OutOfMemoryError e13) {
            if (!this.zzi) {
                zzes.zzd("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(2, new zzyg(e13)).sendToTarget();
            }
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzxz zzxzVar = this.zzd;
            zzxzVar.getClass();
            zzxzVar.zzI(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzyc zzycVar;
        boolean z10;
        zzycVar = this.zza.zzf;
        if (zzycVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        this.zza.zzf = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            zzd();
        }
    }
}
