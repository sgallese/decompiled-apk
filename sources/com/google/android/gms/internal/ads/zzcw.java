package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzcw {
    public static final zzcw zza = new zzcr();
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcq
    };

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return false;
        }
        zzcw zzcwVar = (zzcw) obj;
        if (zzcwVar.zzc() == zzc() && zzcwVar.zzb() == zzb()) {
            zzcv zzcvVar = new zzcv();
            zzct zzctVar = new zzct();
            zzcv zzcvVar2 = new zzcv();
            zzct zzctVar2 = new zzct();
            for (int i10 = 0; i10 < zzc(); i10++) {
                if (!zze(i10, zzcvVar, 0L).equals(zzcwVar.zze(i10, zzcvVar2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < zzb(); i11++) {
                if (!zzd(i11, zzctVar, true).equals(zzcwVar.zzd(i11, zzctVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzcwVar.zzg(true) && (zzh = zzh(true)) == zzcwVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzcwVar.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        zzcv zzcvVar = new zzcv();
        zzct zzctVar = new zzct();
        int zzc2 = zzc() + 217;
        for (int i10 = 0; i10 < zzc(); i10++) {
            zzc2 = (zzc2 * 31) + zze(i10, zzcvVar, 0L).hashCode();
        }
        int zzb2 = (zzc2 * 31) + zzb();
        for (int i11 = 0; i11 < zzb(); i11++) {
            zzb2 = (zzb2 * 31) + zzd(i11, zzctVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb2 = (zzb2 * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzct zzd(int i10, zzct zzctVar, boolean z10);

    public abstract zzcv zze(int i10, zzcv zzcvVar, long j10);

    public abstract Object zzf(int i10);

    public int zzg(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzct zzctVar, zzcv zzcvVar, int i11, boolean z10) {
        int i12 = zzd(i10, zzctVar, false).zzd;
        if (zze(i12, zzcvVar, 0L).zzq == i10) {
            int zzj = zzj(i12, i11, z10);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzcvVar, 0L).zzp;
        }
        return i10 + 1;
    }

    public int zzj(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == zzh(z10)) {
                        return zzg(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        } else if (i10 == zzh(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public int zzk(int i10, int i11, boolean z10) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzcv zzcvVar, zzct zzctVar, int i10, long j10) {
        Pair zzm = zzm(zzcvVar, zzctVar, i10, j10, 0L);
        zzm.getClass();
        return zzm;
    }

    public final Pair zzm(zzcv zzcvVar, zzct zzctVar, int i10, long j10, long j11) {
        zzdy.zza(i10, 0, zzc());
        zze(i10, zzcvVar, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = zzcvVar.zzn;
            j10 = 0;
        }
        int i11 = zzcvVar.zzp;
        zzd(i11, zzctVar, false);
        while (i11 < zzcvVar.zzq) {
            long j13 = zzctVar.zzf;
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j14 = zzd(i12, zzctVar, false).zzf;
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        zzd(i11, zzctVar, true);
        long j15 = zzctVar.zzf;
        long j16 = zzctVar.zze;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long max = Math.max(0L, j10);
        Object obj = zzctVar.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzct zzn(Object obj, zzct zzctVar) {
        return zzd(zza(obj), zzctVar, true);
    }

    public final boolean zzo() {
        if (zzc() == 0) {
            return true;
        }
        return false;
    }
}
