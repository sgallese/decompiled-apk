package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzagf implements zzage {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzagf(long[] jArr, long[] jArr2, long j10, long j11) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzagf zza(long j10, long j11, zzabu zzabuVar, zzfb zzfbVar) {
        int i10;
        int zzl;
        zzfbVar.zzH(10);
        int zzf = zzfbVar.zzf();
        if (zzf <= 0) {
            return null;
        }
        int i11 = zzabuVar.zzd;
        if (i11 >= 32000) {
            i10 = 1152;
        } else {
            i10 = 576;
        }
        long zzq = zzfk.zzq(zzf, i10 * 1000000, i11);
        int zzp = zzfbVar.zzp();
        int zzp2 = zzfbVar.zzp();
        int zzp3 = zzfbVar.zzp();
        zzfbVar.zzH(2);
        long j12 = j11 + zzabuVar.zzc;
        long[] jArr = new long[zzp];
        long[] jArr2 = new long[zzp];
        int i12 = 0;
        long j13 = j11;
        while (i12 < zzp) {
            int i13 = zzp2;
            long j14 = j12;
            jArr[i12] = (i12 * zzq) / zzp;
            jArr2[i12] = Math.max(j13, j14);
            if (zzp3 != 1) {
                if (zzp3 != 2) {
                    if (zzp3 != 3) {
                        if (zzp3 != 4) {
                            return null;
                        }
                        zzl = zzfbVar.zzo();
                    } else {
                        zzl = zzfbVar.zzn();
                    }
                } else {
                    zzl = zzfbVar.zzp();
                }
            } else {
                zzl = zzfbVar.zzl();
            }
            j13 += zzl * i13;
            i12++;
            j12 = j14;
            zzp2 = i13;
            zzp = zzp;
        }
        if (j10 != -1 && j10 != j13) {
            zzes.zzf("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new zzagf(jArr, jArr2, zzq, j13);
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzc(long j10) {
        return this.zza[zzfk.zzc(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        int zzc = zzfk.zzc(this.zza, j10, true, true);
        zzacb zzacbVar = new zzacb(this.zza[zzc], this.zzb[zzc]);
        if (zzacbVar.zzb < j10) {
            long[] jArr = this.zza;
            if (zzc != jArr.length - 1) {
                int i10 = zzc + 1;
                return new zzaby(zzacbVar, new zzacb(jArr[i10], this.zzb[i10]));
            }
        }
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
