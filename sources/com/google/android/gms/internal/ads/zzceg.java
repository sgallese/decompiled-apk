package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzceg implements zzko {
    private final zzxu zzb = new zzxu(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final /* synthetic */ void zze(zzcw zzcwVar, zzbw zzbwVar, zzln[] zzlnVarArr, zzvs zzvsVar, zzxf[] zzxfVarArr) {
        int i10;
        int i11 = 0;
        this.zzg = 0;
        while (true) {
            int length = zzlnVarArr.length;
            if (i11 < 2) {
                if (zzxfVarArr[i11] != null) {
                    int i12 = this.zzg;
                    if (zzlnVarArr[i11].zzb() != 1) {
                        i10 = 131072000;
                    } else {
                        i10 = 13107200;
                    }
                    this.zzg = i12 + i10;
                }
                i11++;
            } else {
                this.zzb.zzf(this.zzg);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(long j10, long j11, float f10) {
        char c10;
        boolean z10 = true;
        if (j11 > this.zzd) {
            c10 = 0;
        } else if (j11 < this.zzc) {
            c10 = 2;
        } else {
            c10 = 1;
        }
        int zza = this.zzb.zza();
        int i10 = this.zzg;
        if (c10 != 2 && (c10 != 1 || !this.zzh || zza >= i10)) {
            z10 = false;
        }
        this.zzh = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final /* synthetic */ boolean zzh(zzcw zzcwVar, zzbw zzbwVar, long j10, float f10, boolean z10, long j11) {
        long j12;
        if (z10) {
            j12 = this.zzf;
        } else {
            j12 = this.zze;
        }
        if (j12 > 0 && j10 < j12) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final zzxu zzi() {
        return this.zzb;
    }

    final void zzj(boolean z10) {
        this.zzg = 0;
        this.zzh = false;
        if (z10) {
            this.zzb.zze();
        }
    }

    public final synchronized void zzk(int i10) {
        this.zze = i10 * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zzf = i10 * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzd = i10 * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzc = i10 * 1000;
    }
}
