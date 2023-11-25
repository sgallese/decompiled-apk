package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzacu {
    protected final zzace zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzacu(int i10, int i11, long j10, int i12, zzace zzaceVar) {
        int i13;
        int i14;
        i11 = i11 != 1 ? 2 : i11;
        this.zzd = j10;
        this.zze = i12;
        this.zza = zzaceVar;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        this.zzb = zzi(i10, i13);
        if (i11 == 2) {
            i14 = zzi(i10, 1650720768);
        } else {
            i14 = -1;
        }
        this.zzc = i14;
        this.zzk = new long[512];
        this.zzl = new int[512];
    }

    private static int zzi(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private final long zzj(int i10) {
        return (this.zzd * i10) / this.zze;
    }

    private final zzacb zzk(int i10) {
        return new zzacb(this.zzl[i10] * zzj(1), this.zzk[i10]);
    }

    public final zzaby zza(long j10) {
        int zzj = (int) (j10 / zzj(1));
        int zzb = zzfk.zzb(this.zzl, zzj, true, true);
        if (this.zzl[zzb] == zzj) {
            zzacb zzk = zzk(zzb);
            return new zzaby(zzk, zzk);
        }
        zzacb zzk2 = zzk(zzb);
        int i10 = zzb + 1;
        if (i10 < this.zzk.length) {
            return new zzaby(zzk2, zzk(i10));
        }
        return new zzaby(zzk2, zzk2);
    }

    public final void zzb(long j10) {
        if (this.zzj == this.zzl.length) {
            long[] jArr = this.zzk;
            this.zzk = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.zzl;
            this.zzl = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.zzk;
        int i10 = this.zzj;
        jArr2[i10] = j10;
        this.zzl[i10] = this.zzi;
        this.zzj = i10 + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        this.zzi++;
    }

    public final void zze(int i10) {
        this.zzf = i10;
        this.zzg = i10;
    }

    public final void zzf(long j10) {
        if (this.zzj == 0) {
            this.zzh = 0;
            return;
        }
        this.zzh = this.zzl[zzfk.zzc(this.zzk, j10, true, true)];
    }

    public final boolean zzg(int i10) {
        if (this.zzb != i10 && this.zzc != i10) {
            return false;
        }
        return true;
    }

    public final boolean zzh(zzabc zzabcVar) throws IOException {
        boolean z10;
        int i10;
        int i11 = this.zzg;
        int zze = i11 - this.zza.zze(zzabcVar, i11, false);
        this.zzg = zze;
        if (zze == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.zzf > 0) {
                zzace zzaceVar = this.zza;
                long zzj = zzj(this.zzh);
                int binarySearch = Arrays.binarySearch(this.zzl, this.zzh);
                int i12 = this.zzf;
                if (binarySearch >= 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                zzaceVar.zzs(zzj, i10, i12, 0, null);
            }
            this.zzh++;
        }
        return z10;
    }
}
