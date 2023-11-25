package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzih implements zzko {
    private final zzxu zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private int zzh;
    private boolean zzi;

    public zzih() {
        zzxu zzxuVar = new zzxu(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzxuVar;
        this.zzc = zzfk.zzp(50000L);
        this.zzd = zzfk.zzp(50000L);
        this.zze = zzfk.zzp(2500L);
        this.zzf = zzfk.zzp(5000L);
        this.zzh = 13107200;
        this.zzg = zzfk.zzp(0L);
    }

    private static void zzj(int i10, int i11, String str, String str2) {
        boolean z10;
        String str3 = str + " cannot be less than " + str2;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zze(z10, str3);
    }

    private final void zzk(boolean z10) {
        this.zzh = 13107200;
        this.zzi = false;
        if (z10) {
            this.zzb.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zze(zzcw zzcwVar, zzbw zzbwVar, zzln[] zzlnVarArr, zzvs zzvsVar, zzxf[] zzxfVarArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = zzlnVarArr.length;
            int i12 = 13107200;
            if (i10 < 2) {
                if (zzxfVarArr[i10] != null) {
                    if (zzlnVarArr[i10].zzb() != 1) {
                        i12 = 131072000;
                    }
                    i11 += i12;
                }
                i10++;
            } else {
                int max = Math.max(13107200, i11);
                this.zzh = max;
                this.zzb.zzf(max);
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
        int zza = this.zzb.zza();
        int i10 = this.zzh;
        long j12 = this.zzc;
        if (f10 > 1.0f) {
            j12 = Math.min(zzfk.zzn(j12, f10), this.zzd);
        }
        boolean z10 = false;
        if (j11 < Math.max(j12, 500000L)) {
            if (zza < i10) {
                z10 = true;
            }
            this.zzi = z10;
            if (!z10 && j11 < 500000) {
                zzes.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.zzd || zza >= i10) {
            this.zzi = false;
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzh(zzcw zzcwVar, zzbw zzbwVar, long j10, float f10, boolean z10, long j11) {
        long j12;
        long zzo = zzfk.zzo(j10, f10);
        if (z10) {
            j12 = this.zzf;
        } else {
            j12 = this.zze;
        }
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        if (j12 > 0 && zzo < j12 && this.zzb.zza() < this.zzh) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final zzxu zzi() {
        return this.zzb;
    }
}
