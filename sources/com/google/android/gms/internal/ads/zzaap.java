package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaap implements zzaca {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaap(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
            return;
        }
        this.zzf = 0L;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.zza + ", sizes=" + Arrays.toString(this.zzb) + ", offsets=" + Arrays.toString(this.zzc) + ", timeUs=" + Arrays.toString(this.zze) + ", durationsUs=" + Arrays.toString(this.zzd) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        int zzc = zzfk.zzc(this.zze, j10, true, true);
        zzacb zzacbVar = new zzacb(this.zze[zzc], this.zzc[zzc]);
        if (zzacbVar.zzb < j10 && zzc != this.zza - 1) {
            int i10 = zzc + 1;
            return new zzaby(zzacbVar, new zzacb(this.zze[i10], this.zzc[i10]));
        }
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
