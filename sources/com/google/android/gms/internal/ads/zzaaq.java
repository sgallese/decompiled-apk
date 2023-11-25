package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzaaq implements zzaca {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzaaq(long j10, long j11, int i10, int i11, boolean z10) {
        long zzb;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1L;
            zzb = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            zzb = zzb(j10, j11, i10);
        }
        this.zzf = zzb;
    }

    private static long zzb(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public final long zza(long j10) {
        return zzb(j10, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        long j11 = this.zzd;
        if (j11 != -1) {
            long j12 = this.zzc;
            long j13 = (((this.zze * j10) / 8000000) / j12) * j12;
            if (j11 != -1) {
                j13 = Math.min(j13, j11 - j12);
            }
            long max = this.zzb + Math.max(j13, 0L);
            long zza = zza(max);
            zzacb zzacbVar = new zzacb(zza, max);
            if (this.zzd != -1 && zza < j10) {
                long j14 = max + this.zzc;
                if (j14 < this.zza) {
                    return new zzaby(zzacbVar, new zzacb(zza(j14), j14));
                }
            }
            return new zzaby(zzacbVar, zzacbVar);
        }
        zzacb zzacbVar2 = new zzacb(0L, this.zzb);
        return new zzaby(zzacbVar2, zzacbVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        if (this.zzd == -1) {
            return false;
        }
        return true;
    }
}
