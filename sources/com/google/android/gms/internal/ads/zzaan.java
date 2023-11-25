package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzaan {
    protected final zzaah zza;
    protected final zzaam zzb;
    protected zzaaj zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaan(zzaak zzaakVar, zzaam zzaamVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzaamVar;
        this.zzd = i10;
        this.zza = new zzaah(zzaakVar, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int zzf(zzabc zzabcVar, long j10, zzabx zzabxVar) {
        if (j10 == zzabcVar.zzf()) {
            return 0;
        }
        zzabxVar.zza = j10;
        return 1;
    }

    protected static final boolean zzg(zzabc zzabcVar, long j10) throws IOException {
        long zzf = j10 - zzabcVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzaar) zzabcVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        while (true) {
            zzaaj zzaajVar = this.zzc;
            zzdy.zzb(zzaajVar);
            j10 = zzaajVar.zzf;
            j11 = zzaajVar.zzg;
            long j21 = j11 - j10;
            j12 = zzaajVar.zzh;
            if (j21 <= this.zzd) {
                zzc(false, j10);
                return zzf(zzabcVar, j10, zzabxVar);
            } else if (!zzg(zzabcVar, j12)) {
                return zzf(zzabcVar, j12, zzabxVar);
            } else {
                zzabcVar.zzj();
                zzaam zzaamVar = this.zzb;
                j13 = zzaajVar.zzb;
                zzaal zza = zzaamVar.zza(zzabcVar, j13);
                i10 = zza.zzb;
                if (i10 != -3) {
                    if (i10 == -2) {
                        j19 = zza.zzc;
                        j20 = zza.zzd;
                        zzaaj.zzh(zzaajVar, j19, j20);
                    } else if (i10 != -1) {
                        j14 = zza.zzd;
                        zzg(zzabcVar, j14);
                        j15 = zza.zzd;
                        zzc(true, j15);
                        j16 = zza.zzd;
                        return zzf(zzabcVar, j16, zzabxVar);
                    } else {
                        j17 = zza.zzc;
                        j18 = zza.zzd;
                        zzaaj.zzg(zzaajVar, j17, j18);
                    }
                } else {
                    zzc(false, j12);
                    return zzf(zzabcVar, j12, zzabxVar);
                }
            }
        }
    }

    public final zzaca zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        zzaaj zzaajVar = this.zzc;
        if (zzaajVar != null) {
            j15 = zzaajVar.zza;
            if (j15 == j10) {
                return;
            }
        }
        long zzf = this.zza.zzf(j10);
        zzaah zzaahVar = this.zza;
        j11 = zzaahVar.zzc;
        j12 = zzaahVar.zzd;
        j13 = zzaahVar.zze;
        j14 = zzaahVar.zzf;
        this.zzc = new zzaaj(j10, zzf, 0L, j11, j12, j13, j14);
    }

    public final boolean zze() {
        if (this.zzc != null) {
            return true;
        }
        return false;
    }
}
