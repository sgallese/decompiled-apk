package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzajj {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfb zzb = new zzfb();

    public static long zzc(zzfb zzfbVar) {
        int zzc = zzfbVar.zzc();
        if (zzfbVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfbVar.zzC(bArr, 0, 9);
        zzfbVar.zzG(zzc);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((255 & bArr[3]) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzabc zzabcVar) {
        zzfb zzfbVar = this.zzb;
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        zzfbVar.zzE(bArr, 0);
        this.zzc = true;
        zzabcVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzabcVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j11 = zzd - min;
            if (zzabcVar.zzf() != j11) {
                zzabxVar.zza = j11;
                return 1;
            }
            this.zzb.zzD(min);
            zzabcVar.zzj();
            ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, min, false);
            zzfb zzfbVar = this.zzb;
            int zzc = zzfbVar.zzc();
            int zzd2 = zzfbVar.zzd() - 4;
            while (true) {
                if (zzd2 < zzc) {
                    break;
                }
                if (zzg(zzfbVar.zzI(), zzd2) == 442) {
                    zzfbVar.zzG(zzd2 + 4);
                    long zzc2 = zzc(zzfbVar);
                    if (zzc2 != -9223372036854775807L) {
                        j10 = zzc2;
                        break;
                    }
                }
                zzd2--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzabcVar);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(20000L, zzabcVar.zzd());
            if (zzabcVar.zzf() != 0) {
                zzabxVar.zza = 0L;
                return 1;
            }
            this.zzb.zzD(min2);
            zzabcVar.zzj();
            ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, min2, false);
            zzfb zzfbVar2 = this.zzb;
            int zzc3 = zzfbVar2.zzc();
            int zzd3 = zzfbVar2.zzd();
            while (true) {
                if (zzc3 >= zzd3 - 3) {
                    break;
                }
                if (zzg(zzfbVar2.zzI(), zzc3) == 442) {
                    zzfbVar2.zzG(zzc3 + 4);
                    long zzc4 = zzc(zzfbVar2);
                    if (zzc4 != -9223372036854775807L) {
                        j10 = zzc4;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        } else {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzabcVar);
                return 0;
            }
            long zzb = this.zza.zzb(this.zzg) - this.zza.zzb(j12);
            this.zzh = zzb;
            if (zzb < 0) {
                zzes.zzf("PsDurationReader", "Invalid duration: " + zzb + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzabcVar);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfi zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
