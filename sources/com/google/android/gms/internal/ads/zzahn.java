package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzahn implements zzaht {
    private final zzabo zza;
    private final zzabn zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzahn(zzabo zzaboVar, zzabn zzabnVar) {
        this.zza = zzaboVar;
        this.zzb = zzabnVar;
    }

    public final void zza(long j10) {
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final long zzd(zzabc zzabcVar) {
        long j10 = this.zzd;
        if (j10 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j10 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final zzaca zze() {
        boolean z10;
        if (this.zzc != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        return new zzabm(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzg(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfk.zzc(jArr, j10, true, true)];
    }
}
