package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzdt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzds zzdsVar) throws zzfa {
        int zzj = zzj(bArr, i10, zzdsVar);
        int i11 = zzdsVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zzdsVar.zzc = zzee.zzb;
                    return zzj;
                }
                zzdsVar.zzc = zzee.zzk(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzfa.zzf();
        }
        throw zzfa.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzgh zzghVar, byte[] bArr, int i10, int i11, int i12, zzds zzdsVar) throws IOException {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object zzd = zzfzVar.zzd();
        int zzb = zzfzVar.zzb(zzd, bArr, i10, i11, i12, zzdsVar);
        zzfzVar.zze(zzd);
        zzdsVar.zzc = zzd;
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(zzgh zzghVar, byte[] bArr, int i10, int i11, zzds zzdsVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzdsVar);
            i13 = zzdsVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object zzd = zzghVar.zzd();
            int i15 = i13 + i14;
            zzghVar.zzg(zzd, bArr, i14, i15, zzdsVar);
            zzghVar.zze(zzd);
            zzdsVar.zzc = zzd;
            return i15;
        }
        throw zzfa.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzgh zzghVar, int i10, byte[] bArr, int i11, int i12, zzey zzeyVar, zzds zzdsVar) throws IOException {
        int zzd = zzd(zzghVar, bArr, i11, i12, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzdsVar);
            if (i10 != zzdsVar.zza) {
                break;
            }
            zzd = zzd(zzghVar, bArr, zzj, i12, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzey zzeyVar, zzds zzdsVar) throws IOException {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i10, zzdsVar);
        int i11 = zzdsVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzfa.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i10, zzds zzdsVar) throws zzfa {
        int zzj = zzj(bArr, i10, zzdsVar);
        int i11 = zzdsVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzdsVar.zzc = "";
                return zzj;
            }
            zzdsVar.zzc = new String(bArr, zzj, i11, zzez.zzb);
            return zzj + i11;
        }
        throw zzfa.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzds zzdsVar) throws zzfa {
        int zzj = zzj(bArr, i10, zzdsVar);
        int i11 = zzdsVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzdsVar.zzc = "";
                return zzj;
            }
            zzdsVar.zzc = zzhm.zzb(bArr, zzj, i11);
            return zzj + i11;
        }
        throw zzfa.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzgz zzgzVar, zzds zzdsVar) throws zzfa {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zzgzVar.zzf(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw zzfa.zza();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zzgz zzc = zzgz.zzc();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzj = zzj(bArr, i11, zzdsVar);
                            int i16 = zzdsVar.zza;
                            if (i16 == i14) {
                                i15 = i16;
                                i11 = zzj;
                                break;
                            }
                            i15 = i16;
                            i11 = zzi(i16, bArr, zzj, i12, zzc, zzdsVar);
                        }
                        if (i11 <= i12 && i15 == i14) {
                            zzgzVar.zzf(i10, zzc);
                            return i11;
                        }
                        throw zzfa.zzd();
                    }
                    int zzj2 = zzj(bArr, i11, zzdsVar);
                    int i17 = zzdsVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzj2) {
                            if (i17 == 0) {
                                zzgzVar.zzf(i10, zzee.zzb);
                            } else {
                                zzgzVar.zzf(i10, zzee.zzk(bArr, zzj2, i17));
                            }
                            return zzj2 + i17;
                        }
                        throw zzfa.zzf();
                    }
                    throw zzfa.zzc();
                }
                zzgzVar.zzf(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            }
            int zzm = zzm(bArr, i11, zzdsVar);
            zzgzVar.zzf(i10, Long.valueOf(zzdsVar.zzb));
            return zzm;
        }
        throw zzfa.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i10, zzds zzdsVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzdsVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zzdsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, byte[] bArr, int i11, zzds zzdsVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzdsVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzdsVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzdsVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzdsVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzdsVar.zza = i20;
                return i21;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i11, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzdsVar);
            if (i10 != zzdsVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i10, zzds zzdsVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzdsVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzdsVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
