package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzajs {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfb zzb = new zzfb();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajs(int i10) {
    }

    private final int zze(zzabc zzabcVar) {
        zzfb zzfbVar = this.zzb;
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        zzfbVar.zzE(bArr, 0);
        this.zzc = true;
        zzabcVar.zzj();
        return 0;
    }

    public final int zza(zzabc zzabcVar, zzabx zzabxVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzabcVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzabcVar.zzd();
            int min = (int) Math.min(112800L, zzd);
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
            int zzd2 = zzfbVar.zzd();
            int i11 = zzd2 - 188;
            while (true) {
                if (i11 < zzc) {
                    break;
                }
                byte[] zzI = zzfbVar.zzI();
                int i12 = -4;
                int i13 = 0;
                while (true) {
                    if (i12 > 4) {
                        break;
                    }
                    int i14 = (i12 * 188) + i11;
                    if (i14 >= zzc && i14 < zzd2 && zzI[i14] == 71) {
                        i13++;
                        if (i13 == 5) {
                            long zzb = zzakc.zzb(zzfbVar, i11, i10);
                            if (zzb != -9223372036854775807L) {
                                j10 = zzb;
                                break;
                            }
                        }
                    } else {
                        i13 = 0;
                    }
                    i12++;
                }
                i11--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzabcVar);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(112800L, zzabcVar.zzd());
            if (zzabcVar.zzf() != 0) {
                zzabxVar.zza = 0L;
                return 1;
            }
            this.zzb.zzD(min2);
            zzabcVar.zzj();
            ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, min2, false);
            zzfb zzfbVar2 = this.zzb;
            int zzc2 = zzfbVar2.zzc();
            int zzd3 = zzfbVar2.zzd();
            while (true) {
                if (zzc2 >= zzd3) {
                    break;
                }
                if (zzfbVar2.zzI()[zzc2] == 71) {
                    long zzb2 = zzakc.zzb(zzfbVar2, zzc2, i10);
                    if (zzb2 != -9223372036854775807L) {
                        j10 = zzb2;
                        break;
                    }
                }
                zzc2++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        } else {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zze(zzabcVar);
                return 0;
            }
            long zzb3 = this.zza.zzb(this.zzg) - this.zza.zzb(j12);
            this.zzh = zzb3;
            if (zzb3 < 0) {
                zzes.zzf("TsDurationReader", "Invalid duration: " + zzb3 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzabcVar);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfi zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
