package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzabm implements zzaca {
    private final zzabo zza;
    private final long zzb;

    public zzabm(zzabo zzaboVar, long j10) {
        this.zza = zzaboVar;
        this.zzb = j10;
    }

    private final zzacb zza(long j10, long j11) {
        return new zzacb((j10 * 1000000) / this.zza.zze, this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        long j11;
        zzdy.zzb(this.zza.zzk);
        zzabo zzaboVar = this.zza;
        zzabn zzabnVar = zzaboVar.zzk;
        long[] jArr = zzabnVar.zza;
        long[] jArr2 = zzabnVar.zzb;
        int zzc = zzfk.zzc(jArr, zzaboVar.zzb(j10), true, false);
        long j12 = 0;
        if (zzc == -1) {
            j11 = 0;
        } else {
            j11 = jArr[zzc];
        }
        if (zzc != -1) {
            j12 = jArr2[zzc];
        }
        zzacb zza = zza(j11, j12);
        if (zza.zzb != j10 && zzc != jArr.length - 1) {
            int i10 = zzc + 1;
            return new zzaby(zza, zza(jArr[i10], jArr2[i10]));
        }
        return new zzaby(zza, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
