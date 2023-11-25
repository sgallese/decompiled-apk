package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfi {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzfi(long j10) {
        zzf(0L);
    }

    public final synchronized long zza(long j10) {
        if (!zzg()) {
            long j11 = this.zza;
            if (j11 == 9223372036854775806L) {
                Long l10 = (Long) this.zzd.get();
                l10.getClass();
                j11 = l10.longValue();
            }
            this.zzb = j11 - j10;
            notifyAll();
        }
        this.zzc = j10;
        return j10 + this.zzb;
    }

    public final synchronized long zzb(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = (((-1) + j13) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return zza((j10 * 1000000) / 90000);
    }

    public final synchronized long zzc() {
        long j10 = this.zza;
        if (j10 != Long.MAX_VALUE && j10 != 9223372036854775806L) {
            return j10;
        }
        return -9223372036854775807L;
    }

    public final synchronized long zzd() {
        long zzc;
        long j10 = this.zzc;
        if (j10 != -9223372036854775807L) {
            zzc = j10 + this.zzb;
        } else {
            zzc = zzc();
        }
        return zzc;
    }

    public final synchronized long zze() {
        return this.zzb;
    }

    public final synchronized void zzf(long j10) {
        long j11;
        this.zza = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.zzb = j11;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized boolean zzg() {
        if (this.zzb != -9223372036854775807L) {
            return true;
        }
        return false;
    }
}
