package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzacf {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzace zzaceVar, zzacd zzacdVar) {
        if (this.zzc > 0) {
            zzaceVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzacdVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzace zzaceVar, long j10, int i10, int i11, int i12, zzacd zzacdVar) {
        if (this.zzg <= i11 + i12) {
            if (!this.zzb) {
                return;
            }
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zza(zzaceVar, zzacdVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void zzd(zzabc zzabcVar) throws IOException {
        if (this.zzb) {
            return;
        }
        zzabcVar.zzh(this.zza, 0, 10);
        zzabcVar.zzj();
        byte[] bArr = this.zza;
        int i10 = zzaac.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
