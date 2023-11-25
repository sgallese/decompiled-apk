package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaik implements zzaio {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfa zzc = new zzfa(new byte[7], 7);
    private final zzfb zzd = new zzfb(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzace zzg;
    private zzace zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzace zzu;
    private long zzv;

    public zzaik(boolean z10, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z10;
        this.zze = str;
    }

    public static boolean zzf(int i10) {
        if ((i10 & 65526) == 65520) {
            return true;
        }
        return false;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzace zzaceVar, long j10, int i10, int i11) {
        this.zzi = 4;
        this.zzj = i10;
        this.zzu = zzaceVar;
        this.zzv = j10;
        this.zzs = i11;
    }

    private final boolean zzk(zzfb zzfbVar, byte[] bArr, int i10) {
        int min = Math.min(zzfbVar.zza(), i10 - this.zzj);
        zzfbVar.zzC(bArr, this.zzj, min);
        int i11 = this.zzj + min;
        this.zzj = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzfb zzfbVar, byte[] bArr, int i10) {
        if (zzfbVar.zza() < i10) {
            return false;
        }
        zzfbVar.zzC(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) throws zzcd {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        this.zzg.getClass();
        int i14 = zzfk.zza;
        while (zzfbVar.zza() > 0) {
            int i15 = this.zzi;
            int i16 = 13;
            int i17 = 2;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            int min = Math.min(zzfbVar.zza(), this.zzs - this.zzj);
                            this.zzu.zzq(zzfbVar, min);
                            int i18 = this.zzj + min;
                            this.zzj = i18;
                            int i19 = this.zzs;
                            if (i18 == i19) {
                                long j10 = this.zzt;
                                if (j10 != -9223372036854775807L) {
                                    this.zzu.zzs(j10, 1, i19, 0, null);
                                    this.zzt += this.zzv;
                                }
                                zzh();
                            }
                        } else {
                            if (true != this.zzl) {
                                i10 = 5;
                            } else {
                                i10 = 7;
                            }
                            if (zzk(zzfbVar, this.zzc.zza, i10)) {
                                this.zzc.zzj(0);
                                if (!this.zzq) {
                                    int zzd = this.zzc.zzd(2) + 1;
                                    if (zzd != 2) {
                                        zzes.zzf("AdtsReader", "Detected audio object type: " + zzd + ", but assuming AAC LC.");
                                    }
                                    this.zzc.zzl(5);
                                    int zzd2 = this.zzc.zzd(3);
                                    int i20 = this.zzo;
                                    byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((zzd2 << 3) & 120) | ((i20 << 7) & 128))};
                                    zzzy zza2 = zzzz.zza(bArr);
                                    zzak zzakVar = new zzak();
                                    zzakVar.zzH(this.zzf);
                                    zzakVar.zzS("audio/mp4a-latm");
                                    zzakVar.zzx(zza2.zzc);
                                    zzakVar.zzw(zza2.zzb);
                                    zzakVar.zzT(zza2.zza);
                                    zzakVar.zzI(Collections.singletonList(bArr));
                                    zzakVar.zzK(this.zze);
                                    zzam zzY = zzakVar.zzY();
                                    this.zzr = 1024000000 / zzY.zzA;
                                    this.zzg.zzk(zzY);
                                    this.zzq = true;
                                } else {
                                    this.zzc.zzl(10);
                                }
                                this.zzc.zzl(4);
                                int zzd3 = this.zzc.zzd(13) - 7;
                                if (this.zzl) {
                                    zzd3 -= 2;
                                }
                                zzj(this.zzg, this.zzr, 0, zzd3);
                            }
                        }
                    } else if (zzk(zzfbVar, this.zzd.zzI(), 10)) {
                        this.zzh.zzq(this.zzd, 10);
                        this.zzd.zzG(6);
                        zzj(this.zzh, 0L, 10, 10 + this.zzd.zzk());
                    }
                } else if (zzfbVar.zza() != 0) {
                    zzfa zzfaVar = this.zzc;
                    zzfaVar.zza[0] = zzfbVar.zzI()[zzfbVar.zzc()];
                    zzfaVar.zzj(2);
                    int zzd4 = this.zzc.zzd(4);
                    int i21 = this.zzo;
                    if (i21 != -1 && zzd4 != i21) {
                        zzg();
                    } else {
                        if (!this.zzm) {
                            this.zzm = true;
                            this.zzn = this.zzp;
                            this.zzo = zzd4;
                        }
                        zzi();
                    }
                }
            } else {
                byte[] zzI = zzfbVar.zzI();
                int zzc = zzfbVar.zzc();
                int zzd5 = zzfbVar.zzd();
                while (true) {
                    if (zzc < zzd5) {
                        i11 = zzc + 1;
                        i12 = zzI[zzc] & 255;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i12)) {
                            if (!this.zzm) {
                                int i22 = i11 - 2;
                                zzfbVar.zzG(i22 + 1);
                                if (zzm(zzfbVar, this.zzc.zza, 1)) {
                                    this.zzc.zzj(4);
                                    int zzd6 = this.zzc.zzd(1);
                                    int i23 = this.zzn;
                                    if (i23 == -1 || zzd6 == i23) {
                                        if (this.zzo != -1) {
                                            if (!zzm(zzfbVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzj(i17);
                                            if (this.zzc.zzd(4) == this.zzo) {
                                                zzfbVar.zzG(i22 + 2);
                                            }
                                        }
                                        if (!zzm(zzfbVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzj(14);
                                        int zzd7 = this.zzc.zzd(i16);
                                        if (zzd7 >= 7) {
                                            byte[] zzI2 = zzfbVar.zzI();
                                            int zzd8 = zzfbVar.zzd();
                                            int i24 = i22 + zzd7;
                                            if (i24 < zzd8) {
                                                byte b10 = zzI2[i24];
                                                if (b10 == -1) {
                                                    int i25 = i24 + 1;
                                                    if (i25 == zzd8) {
                                                        break;
                                                    }
                                                    byte b11 = zzI2[i25];
                                                    if (zzl((byte) -1, b11) && ((b11 & 8) >> 3) == zzd6) {
                                                        break;
                                                    }
                                                } else if (b10 == 73) {
                                                    int i26 = i24 + 1;
                                                    if (i26 == zzd8) {
                                                        break;
                                                    } else if (zzI2[i26] == 68) {
                                                        int i27 = i24 + 2;
                                                        if (i27 == zzd8) {
                                                            break;
                                                        } else if (zzI2[i27] == 51) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i28 = this.zzk;
                        int i29 = i28 | i12;
                        if (i29 != 329) {
                            if (i29 != 511) {
                                if (i29 != 836) {
                                    if (i29 != 1075) {
                                        if (i28 != 256) {
                                            this.zzk = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                            zzc = i11 - 1;
                                            i16 = 13;
                                            i17 = 2;
                                        } else {
                                            zzc = i11;
                                            i16 = 13;
                                            i17 = 2;
                                        }
                                    } else {
                                        this.zzi = 2;
                                        this.zzj = 3;
                                        this.zzs = 0;
                                        this.zzd.zzG(0);
                                        zzfbVar.zzG(i11);
                                        break;
                                    }
                                } else {
                                    i13 = UserVerificationMethods.USER_VERIFY_ALL;
                                }
                            } else {
                                i13 = 512;
                            }
                        } else {
                            i13 = 768;
                        }
                        this.zzk = i13;
                        zzc = i11;
                        i16 = 13;
                        i17 = 2;
                    } else {
                        zzfbVar.zzG(zzc);
                        break;
                    }
                }
                this.zzp = (i12 & 8) >> 3;
                if (1 != ((i12 & 1) ^ 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.zzl = z10;
                if (!this.zzm) {
                    this.zzi = 1;
                    this.zzj = 0;
                } else {
                    zzi();
                }
                zzfbVar.zzG(i11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzf = zzakaVar.zzb();
        zzace zzv = zzabeVar.zzv(zzakaVar.zza(), 1);
        this.zzg = zzv;
        this.zzu = zzv;
        if (this.zzb) {
            zzakaVar.zzc();
            zzace zzv2 = zzabeVar.zzv(zzakaVar.zza(), 5);
            this.zzh = zzv2;
            zzak zzakVar = new zzak();
            zzakVar.zzH(zzakaVar.zzb());
            zzakVar.zzS("application/id3");
            zzv2.zzk(zzakVar.zzY());
            return;
        }
        this.zzh = new zzaba();
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzt = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
    }
}
