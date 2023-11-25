package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzagg implements zzage {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzagg(long j10, int i10, long j11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = j12;
        this.zze = j12 != -1 ? j10 + j12 : -1L;
    }

    public static zzagg zza(long j10, long j11, zzabu zzabuVar, zzfb zzfbVar) {
        int zzo;
        int i10 = zzabuVar.zzg;
        int i11 = zzabuVar.zzd;
        int zzf = zzfbVar.zzf();
        if ((zzf & 1) == 1 && (zzo = zzfbVar.zzo()) != 0) {
            int i12 = zzf & 6;
            long zzq = zzfk.zzq(zzo, i10 * 1000000, i11);
            if (i12 != 6) {
                return new zzagg(j11, zzabuVar.zzc, zzq, -1L, null);
            }
            long zzt = zzfbVar.zzt();
            long[] jArr = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr[i13] = zzfbVar.zzl();
            }
            if (j10 != -1) {
                long j12 = j11 + zzt;
                if (j10 != j12) {
                    zzes.zzf("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
                }
            }
            return new zzagg(j11, zzabuVar.zzc, zzq, zzt, jArr);
        }
        return null;
    }

    private final long zzd(int i10) {
        return (this.zzc * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzc(long j10) {
        long j11;
        double d10;
        long j12 = j10 - this.zza;
        if (zzh() && j12 > this.zzb) {
            long[] jArr = this.zzf;
            zzdy.zzb(jArr);
            double d11 = (j12 * 256.0d) / this.zzd;
            int zzc = zzfk.zzc(jArr, (long) d11, true, true);
            long zzd = zzd(zzc);
            long j13 = jArr[zzc];
            int i10 = zzc + 1;
            long zzd2 = zzd(i10);
            if (zzc == 99) {
                j11 = 256;
            } else {
                j11 = jArr[i10];
            }
            if (j13 == j11) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j13) / (j11 - j13);
            }
            return zzd + Math.round(d10 * (zzd2 - zzd));
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        double d10;
        if (!zzh()) {
            zzacb zzacbVar = new zzacb(0L, this.zza + this.zzb);
            return new zzaby(zzacbVar, zzacbVar);
        }
        long max = Math.max(0L, Math.min(j10, this.zzc));
        double d11 = (max * 100.0d) / this.zzc;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = this.zzf;
                zzdy.zzb(jArr);
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - i10) * (d10 - d13));
            }
        }
        zzacb zzacbVar2 = new zzacb(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d12 / 256.0d) * this.zzd), this.zzd - 1)));
        return new zzaby(zzacbVar2, zzacbVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        if (this.zzf != null) {
            return true;
        }
        return false;
    }
}
