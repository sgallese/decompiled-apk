package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzlj {
    private final zzli zza;
    private final zzlh zzb;
    private final zzdz zzc;
    private final zzcw zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzlj(zzlh zzlhVar, zzli zzliVar, zzcw zzcwVar, int i10, zzdz zzdzVar, Looper looper) {
        this.zzb = zzlhVar;
        this.zza = zzliVar;
        this.zzd = zzcwVar;
        this.zzg = looper;
        this.zzc = zzdzVar;
        this.zzh = i10;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzli zzc() {
        return this.zza;
    }

    public final zzlj zzd() {
        zzdy.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlj zze(Object obj) {
        zzdy.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzlj zzf(int i10) {
        zzdy.zzf(!this.zzi);
        this.zze = i10;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z10) {
        this.zzj = z10 | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        zzdy.zzf(this.zzi);
        if (this.zzg.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (!this.zzk) {
            if (j10 > 0) {
                wait(j10);
                j10 = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
