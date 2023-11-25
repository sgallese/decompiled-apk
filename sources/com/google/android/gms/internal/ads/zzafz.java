package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzafz implements zzage {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzafz(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzfk.zzp(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzafz zza(long j10, zzaew zzaewVar, long j11) {
        int length = zzaewVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += zzaewVar.zzb + zzaewVar.zzd[i12];
            j12 += zzaewVar.zzc + zzaewVar.zze[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzafz(jArr, jArr2, j11);
    }

    private static Pair zzd(long j10, long[] jArr, long[] jArr2) {
        double d10;
        int zzc = zzfk.zzc(jArr, j10, true, true);
        long j11 = jArr[zzc];
        long j12 = jArr2[zzc];
        int i10 = zzc + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        long j14 = jArr2[i10];
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d10 * (j14 - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzc(long j10) {
        return zzfk.zzp(((Long) zzd(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        Pair zzd = zzd(zzfk.zzr(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzacb zzacbVar = new zzacb(zzfk.zzp(((Long) zzd.first).longValue()), ((Long) zzd.second).longValue());
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
