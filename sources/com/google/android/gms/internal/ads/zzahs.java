package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzahs {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfb zzg = new zzfb(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzabc zzabcVar, boolean z10) throws IOException {
        zza();
        this.zzg.zzD(27);
        if (zzabf.zzc(zzabcVar, this.zzg.zzI(), 0, 27, z10) && this.zzg.zzt() == 1332176723) {
            if (this.zzg.zzl() != 0) {
                if (z10) {
                    return false;
                }
                throw zzcd.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzl();
            this.zzb = this.zzg.zzq();
            this.zzg.zzr();
            this.zzg.zzr();
            this.zzg.zzr();
            int zzl = this.zzg.zzl();
            this.zzc = zzl;
            this.zzd = zzl + 27;
            this.zzg.zzD(zzl);
            if (zzabf.zzc(zzabcVar, this.zzg.zzI(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    this.zzf[i10] = this.zzg.zzl();
                    this.zze += this.zzf[i10];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzabc zzabcVar, long j10) throws IOException {
        boolean z10;
        if (zzabcVar.zzf() == zzabcVar.zze()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzd(z10);
        this.zzg.zzD(4);
        while (true) {
            if ((j10 == -1 || zzabcVar.zzf() + 4 < j10) && zzabf.zzc(zzabcVar, this.zzg.zzI(), 0, 4, true)) {
                this.zzg.zzG(0);
                if (this.zzg.zzt() != 1332176723) {
                    ((zzaar) zzabcVar).zzo(1, false);
                } else {
                    zzabcVar.zzj();
                    return true;
                }
            }
        }
        do {
            if (j10 != -1 && zzabcVar.zzf() >= j10) {
                break;
            }
        } while (zzabcVar.zzc(1) != -1);
        return false;
    }
}
