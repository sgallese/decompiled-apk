package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaac {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return zzb[i10] * UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i10 = bArr[2] & 7;
            int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
            return i11 + i11;
        }
        byte b10 = bArr[4];
        return zzf((b10 & 192) >> 6, b10 & 63);
    }

    public static zzam zzc(zzfb zzfbVar, String str, String str2, zzad zzadVar) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zzh(zzfbVar);
        int i10 = zzc[zzfaVar.zzd(2)];
        zzfaVar.zzl(8);
        int i11 = zze[zzfaVar.zzd(3)];
        if (zzfaVar.zzd(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzfaVar.zzd(5)] * 1000;
        zzfaVar.zze();
        zzfbVar.zzG(zzfaVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzH(str);
        zzakVar.zzS("audio/ac3");
        zzakVar.zzw(i11);
        zzakVar.zzT(i10);
        zzakVar.zzB(zzadVar);
        zzakVar.zzK(str2);
        zzakVar.zzv(i12);
        zzakVar.zzO(i12);
        return zzakVar.zzY();
    }

    public static zzam zzd(zzfb zzfbVar, String str, String str2, zzad zzadVar) {
        String str3;
        zzfa zzfaVar = new zzfa();
        zzfaVar.zzh(zzfbVar);
        int zzd2 = zzfaVar.zzd(13) * 1000;
        zzfaVar.zzl(3);
        int i10 = zzc[zzfaVar.zzd(2)];
        zzfaVar.zzl(10);
        int i11 = zze[zzfaVar.zzd(3)];
        if (zzfaVar.zzd(1) != 0) {
            i11++;
        }
        zzfaVar.zzl(3);
        int zzd3 = zzfaVar.zzd(4);
        zzfaVar.zzl(1);
        if (zzd3 > 0) {
            zzfaVar.zzl(6);
            if (zzfaVar.zzd(1) != 0) {
                i11 += 2;
            }
            zzfaVar.zzl(1);
        }
        if (zzfaVar.zza() > 7) {
            zzfaVar.zzl(7);
            if (zzfaVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzfaVar.zze();
                zzfbVar.zzG(zzfaVar.zzb());
                zzak zzakVar = new zzak();
                zzakVar.zzH(str);
                zzakVar.zzS(str3);
                zzakVar.zzw(i11);
                zzakVar.zzT(i10);
                zzakVar.zzB(zzadVar);
                zzakVar.zzK(str2);
                zzakVar.zzO(zzd2);
                return zzakVar.zzY();
            }
        }
        str3 = "audio/eac3";
        zzfaVar.zze();
        zzfbVar.zzG(zzfaVar.zzb());
        zzak zzakVar2 = new zzak();
        zzakVar2.zzH(str);
        zzakVar2.zzS(str3);
        zzakVar2.zzw(i11);
        zzakVar2.zzT(i10);
        zzakVar2.zzB(zzadVar);
        zzakVar2.zzK(str2);
        zzakVar2.zzO(zzd2);
        return zzakVar2.zzY();
    }

    public static zzaab zze(zzfa zzfaVar) {
        String str;
        int i10;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str3;
        int zzc2 = zzfaVar.zzc();
        zzfaVar.zzl(40);
        int zzd2 = zzfaVar.zzd(5);
        zzfaVar.zzj(zzc2);
        int i22 = -1;
        if (zzd2 > 10) {
            zzfaVar.zzl(16);
            int zzd3 = zzfaVar.zzd(2);
            if (zzd3 != 0) {
                if (zzd3 != 1) {
                    if (zzd3 == 2) {
                        i22 = 2;
                    }
                } else {
                    i22 = 1;
                }
            } else {
                i22 = 0;
            }
            zzfaVar.zzl(3);
            int zzd4 = zzfaVar.zzd(11) + 1;
            int zzd5 = zzfaVar.zzd(2);
            if (zzd5 == 3) {
                i18 = zzd[zzfaVar.zzd(2)];
                i17 = 3;
                i19 = 6;
            } else {
                int zzd6 = zzfaVar.zzd(2);
                int i23 = zzb[zzd6];
                i17 = zzd6;
                i18 = zzc[zzd5];
                i19 = i23;
            }
            int i24 = zzd4 + zzd4;
            int i25 = (i24 * i18) / (i19 * 32);
            int zzd7 = zzfaVar.zzd(3);
            boolean zzn = zzfaVar.zzn();
            int i26 = zze[zzd7] + (zzn ? 1 : 0);
            zzfaVar.zzl(10);
            if (zzfaVar.zzn()) {
                zzfaVar.zzl(8);
            }
            if (zzd7 == 0) {
                zzfaVar.zzl(5);
                if (zzfaVar.zzn()) {
                    zzfaVar.zzl(8);
                }
                i20 = 0;
                zzd7 = 0;
            } else {
                i20 = zzd7;
            }
            if (i22 == 1) {
                if (zzfaVar.zzn()) {
                    zzfaVar.zzl(16);
                }
                i21 = 1;
            } else {
                i21 = i22;
            }
            if (zzfaVar.zzn()) {
                if (i20 > 2) {
                    zzfaVar.zzl(2);
                }
                if ((i20 & 1) != 0 && i20 > 2) {
                    zzfaVar.zzl(6);
                }
                if ((i20 & 4) != 0) {
                    zzfaVar.zzl(6);
                }
                if (zzn && zzfaVar.zzn()) {
                    zzfaVar.zzl(5);
                }
                if (i21 == 0) {
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(6);
                    }
                    if (i20 == 0 && zzfaVar.zzn()) {
                        zzfaVar.zzl(6);
                    }
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(6);
                    }
                    int zzd8 = zzfaVar.zzd(2);
                    if (zzd8 == 1) {
                        zzfaVar.zzl(5);
                    } else if (zzd8 == 2) {
                        zzfaVar.zzl(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzfaVar.zzd(5);
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(5);
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(4);
                            }
                            if (zzfaVar.zzn()) {
                                if (zzfaVar.zzn()) {
                                    zzfaVar.zzl(4);
                                }
                                if (zzfaVar.zzn()) {
                                    zzfaVar.zzl(4);
                                }
                            }
                        }
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(5);
                            if (zzfaVar.zzn()) {
                                zzfaVar.zzl(7);
                                if (zzfaVar.zzn()) {
                                    zzfaVar.zzl(8);
                                }
                            }
                        }
                        zzfaVar.zzl((zzd9 + 2) * 8);
                        zzfaVar.zze();
                    }
                    if (i20 < 2) {
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(14);
                        }
                        if (zzd7 == 0 && zzfaVar.zzn()) {
                            zzfaVar.zzl(14);
                        }
                    }
                    if (zzfaVar.zzn()) {
                        if (i17 == 0) {
                            zzfaVar.zzl(5);
                            i21 = 0;
                            i17 = 0;
                        } else {
                            for (int i27 = 0; i27 < i19; i27++) {
                                if (zzfaVar.zzn()) {
                                    zzfaVar.zzl(5);
                                }
                            }
                        }
                    }
                    i21 = 0;
                }
            }
            if (zzfaVar.zzn()) {
                zzfaVar.zzl(5);
                if (i20 == 2) {
                    zzfaVar.zzl(4);
                    i20 = 2;
                }
                if (i20 >= 6) {
                    zzfaVar.zzl(2);
                }
                if (zzfaVar.zzn()) {
                    zzfaVar.zzl(8);
                }
                if (i20 == 0 && zzfaVar.zzn()) {
                    zzfaVar.zzl(8);
                }
                if (zzd5 < 3) {
                    zzfaVar.zzk();
                }
            }
            if (i21 == 0 && i17 != 3) {
                zzfaVar.zzk();
            }
            if (i21 == 2 && (i17 == 3 || zzfaVar.zzn())) {
                zzfaVar.zzl(6);
            }
            if (zzfaVar.zzn() && zzfaVar.zzd(6) == 1 && zzfaVar.zzd(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i15 = i22;
            i12 = i24;
            i13 = i18;
            i16 = i19 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
            i11 = i25;
            i14 = i26;
        } else {
            zzfaVar.zzl(32);
            int zzd10 = zzfaVar.zzd(2);
            if (zzd10 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            int zzd11 = zzfaVar.zzd(6);
            int i28 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzfaVar.zzl(8);
            int zzd12 = zzfaVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzfaVar.zzl(2);
            }
            if ((zzd12 & 4) != 0) {
                zzfaVar.zzl(2);
            }
            if (zzd12 == 2) {
                zzfaVar.zzl(2);
            }
            if (zzd10 < 3) {
                i10 = zzc[zzd10];
            } else {
                i10 = -1;
            }
            str2 = str;
            i11 = i28;
            i12 = zzf2;
            i13 = i10;
            i14 = zze[zzd12] + (zzfaVar.zzn() ? 1 : 0);
            i15 = -1;
            i16 = 1536;
        }
        return new zzaab(str2, i15, i14, i13, i12, i16, i11, null);
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && (i12 = i11 >> 1) < 19) {
            int i13 = zzc[i10];
            if (i13 == 44100) {
                int i14 = zzg[i12] + (i11 & 1);
                return i14 + i14;
            }
            int i15 = zzf[i12];
            if (i13 == 32000) {
                return i15 * 6;
            }
            return i15 * 4;
        }
        return -1;
    }
}
