package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzalb extends Thread {
    private static final boolean zza = zzamb.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzakz zzd;
    private volatile boolean zze = false;
    private final zzamc zzf;
    private final zzalg zzg;

    public zzalb(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzakz zzakzVar, zzalg zzalgVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzakzVar;
        this.zzg = zzalgVar;
        this.zzf = new zzamc(this, blockingQueue2, zzalgVar);
    }

    private void zzc() throws InterruptedException {
        zzalp zzalpVar = (zzalp) this.zzb.take();
        zzalpVar.zzm("cache-queue-take");
        zzalpVar.zzt(1);
        try {
            zzalpVar.zzw();
            zzaky zza2 = this.zzd.zza(zzalpVar.zzj());
            if (zza2 == null) {
                zzalpVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzalpVar)) {
                    this.zzc.put(zzalpVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzalpVar.zzm("cache-hit-expired");
                zzalpVar.zze(zza2);
                if (!this.zzf.zzc(zzalpVar)) {
                    this.zzc.put(zzalpVar);
                }
                return;
            }
            zzalpVar.zzm("cache-hit");
            zzalv zzh = zzalpVar.zzh(new zzall(zza2.zza, zza2.zzg));
            zzalpVar.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzalpVar.zzm("cache-parsing-failed");
                this.zzd.zzc(zzalpVar.zzj(), true);
                zzalpVar.zze(null);
                if (!this.zzf.zzc(zzalpVar)) {
                    this.zzc.put(zzalpVar);
                }
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzalpVar.zzm("cache-hit-refresh-needed");
                zzalpVar.zze(zza2);
                zzh.zzd = true;
                if (!this.zzf.zzc(zzalpVar)) {
                    this.zzg.zzb(zzalpVar, zzh, new zzala(this, zzalpVar));
                } else {
                    this.zzg.zzb(zzalpVar, zzh, null);
                }
            } else {
                this.zzg.zzb(zzalpVar, zzh, null);
            }
        } finally {
            zzalpVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzamb.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzamb.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
