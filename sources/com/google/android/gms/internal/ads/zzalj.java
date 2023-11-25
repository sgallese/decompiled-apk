package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzalj extends Thread {
    private final BlockingQueue zza;
    private final zzali zzb;
    private final zzakz zzc;
    private volatile boolean zzd = false;
    private final zzalg zze;

    public zzalj(BlockingQueue blockingQueue, zzali zzaliVar, zzakz zzakzVar, zzalg zzalgVar) {
        this.zza = blockingQueue;
        this.zzb = zzaliVar;
        this.zzc = zzakzVar;
        this.zze = zzalgVar;
    }

    private void zzb() throws InterruptedException {
        zzalp zzalpVar = (zzalp) this.zza.take();
        SystemClock.elapsedRealtime();
        zzalpVar.zzt(3);
        try {
            zzalpVar.zzm("network-queue-take");
            zzalpVar.zzw();
            TrafficStats.setThreadStatsTag(zzalpVar.zzc());
            zzall zza = this.zzb.zza(zzalpVar);
            zzalpVar.zzm("network-http-complete");
            if (zza.zze && zzalpVar.zzv()) {
                zzalpVar.zzp("not-modified");
                zzalpVar.zzr();
                return;
            }
            zzalv zzh = zzalpVar.zzh(zza);
            zzalpVar.zzm("network-parse-complete");
            if (zzh.zzb != null) {
                this.zzc.zzd(zzalpVar.zzj(), zzh.zzb);
                zzalpVar.zzm("network-cache-written");
            }
            zzalpVar.zzq();
            this.zze.zzb(zzalpVar, zzh, null);
            zzalpVar.zzs(zzh);
        } catch (zzaly e10) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzalpVar, e10);
            zzalpVar.zzr();
        } catch (Exception e11) {
            zzamb.zzc(e11, "Unhandled exception %s", e11.toString());
            zzaly zzalyVar = new zzaly(e11);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzalpVar, zzalyVar);
            zzalpVar.zzr();
        } finally {
            zzalpVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzamb.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
