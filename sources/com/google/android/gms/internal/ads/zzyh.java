package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzyh {
    public static final zzyb zza;
    public static final zzyb zzb;
    public static final zzyb zzc;
    public static final zzyb zzd;
    private final ExecutorService zze = zzfk.zzB("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzyc zzf;
    private IOException zzg;

    static {
        long j10 = -9223372036854775807L;
        zzya zzyaVar = null;
        zza = new zzyb(0, j10, zzyaVar);
        zzb = new zzyb(1, j10, zzyaVar);
        zzc = new zzyb(2, j10, zzyaVar);
        zzd = new zzyb(3, j10, zzyaVar);
    }

    public zzyh(String str) {
    }

    public static zzyb zzb(boolean z10, long j10) {
        return new zzyb(z10 ? 1 : 0, j10, null);
    }

    public final long zza(zzyd zzydVar, zzxz zzxzVar, int i10) {
        Looper myLooper = Looper.myLooper();
        zzdy.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzyc(this, myLooper, zzydVar, zzxzVar, i10, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzyc zzycVar = this.zzf;
        zzdy.zzb(zzycVar);
        zzycVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i10) throws IOException {
        IOException iOException = this.zzg;
        if (iOException == null) {
            zzyc zzycVar = this.zzf;
            if (zzycVar != null) {
                zzycVar.zzb(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(zzye zzyeVar) {
        zzyc zzycVar = this.zzf;
        if (zzycVar != null) {
            zzycVar.zza(true);
        }
        this.zze.execute(new zzyf(zzyeVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        if (this.zzg != null) {
            return true;
        }
        return false;
    }

    public final boolean zzl() {
        if (this.zzf != null) {
            return true;
        }
        return false;
    }
}
