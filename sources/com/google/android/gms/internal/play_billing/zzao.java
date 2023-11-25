package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzao {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzan zzanVar) throws zzci {
        int zzj = zzj(bArr, i10, zzanVar);
        int i11 = zzanVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zzanVar.zzc = zzba.zzb;
                    return zzj;
                }
                zzanVar.zzc = zzba.zzl(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzci.zzg();
        }
        throw zzci.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzdp zzdpVar, byte[] bArr, int i10, int i11, int i12, zzan zzanVar) throws IOException {
        Object zze = zzdpVar.zze();
        int zzn = zzn(zze, zzdpVar, bArr, i10, i11, i12, zzanVar);
        zzdpVar.zzf(zze);
        zzanVar.zzc = zze;
        return zzn;
    }

    static int zzd(zzdp zzdpVar, byte[] bArr, int i10, int i11, zzan zzanVar) throws IOException {
        Object zze = zzdpVar.zze();
        int zzo = zzo(zze, zzdpVar, bArr, i10, i11, zzanVar);
        zzdpVar.zzf(zze);
        zzanVar.zzc = zze;
        return zzo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzdp zzdpVar, int i10, byte[] bArr, int i11, int i12, zzcf zzcfVar, zzan zzanVar) throws IOException {
        int zzd = zzd(zzdpVar, bArr, i11, i12, zzanVar);
        zzcfVar.add(zzanVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzanVar);
            if (i10 != zzanVar.zza) {
                break;
            }
            zzd = zzd(zzdpVar, bArr, zzj, i12, zzanVar);
            zzcfVar.add(zzanVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzcf zzcfVar, zzan zzanVar) throws IOException {
        zzcc zzccVar = (zzcc) zzcfVar;
        int zzj = zzj(bArr, i10, zzanVar);
        int i11 = zzanVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzanVar);
            zzccVar.zzf(zzanVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzci.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i10, zzan zzanVar) throws zzci {
        int zzj = zzj(bArr, i10, zzanVar);
        int i11 = zzanVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzanVar.zzc = "";
                return zzj;
            }
            zzanVar.zzc = new String(bArr, zzj, i11, zzcg.zzb);
            return zzj + i11;
        }
        throw zzci.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzan zzanVar) throws zzci {
        int zzj = zzj(bArr, i10, zzanVar);
        int i11 = zzanVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzanVar.zzc = "";
                return zzj;
            }
            int i12 = zzev.zza;
            int length = bArr.length;
            if ((((length - zzj) - i11) | zzj | i11) >= 0) {
                int i13 = zzj + i11;
                char[] cArr = new char[i11];
                int i14 = 0;
                while (zzj < i13) {
                    byte b10 = bArr[zzj];
                    if (!zzer.zzd(b10)) {
                        break;
                    }
                    zzj++;
                    cArr[i14] = (char) b10;
                    i14++;
                }
                while (zzj < i13) {
                    int i15 = zzj + 1;
                    byte b11 = bArr[zzj];
                    if (zzer.zzd(b11)) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) b11;
                        zzj = i15;
                        while (true) {
                            i14 = i16;
                            if (zzj < i13) {
                                byte b12 = bArr[zzj];
                                if (zzer.zzd(b12)) {
                                    zzj++;
                                    i16 = i14 + 1;
                                    cArr[i14] = (char) b12;
                                }
                            }
                        }
                    } else if (b11 < -32) {
                        if (i15 < i13) {
                            zzer.zzc(b11, bArr[i15], cArr, i14);
                            zzj = i15 + 1;
                            i14++;
                        } else {
                            throw zzci.zzc();
                        }
                    } else if (b11 < -16) {
                        if (i15 < i13 - 1) {
                            int i17 = i15 + 1;
                            zzer.zzb(b11, bArr[i15], bArr[i17], cArr, i14);
                            zzj = i17 + 1;
                            i14++;
                        } else {
                            throw zzci.zzc();
                        }
                    } else if (i15 < i13 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = bArr[i15];
                        int i19 = i18 + 1;
                        zzer.zza(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                        i14 += 2;
                        zzj = i19 + 1;
                    } else {
                        throw zzci.zzc();
                    }
                }
                zzanVar.zzc = new String(cArr, 0, i14);
                return i13;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i11)));
        }
        throw zzci.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzeh zzehVar, zzan zzanVar) throws zzci {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zzehVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw zzci.zzb();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zzeh zzf = zzeh.zzf();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzj = zzj(bArr, i11, zzanVar);
                            int i16 = zzanVar.zza;
                            i15 = i16;
                            if (i16 != i14) {
                                int zzi = zzi(i15, bArr, zzj, i12, zzf, zzanVar);
                                i15 = i16;
                                i11 = zzi;
                            } else {
                                i11 = zzj;
                                break;
                            }
                        }
                        if (i11 <= i12 && i15 == i14) {
                            zzehVar.zzj(i10, zzf);
                            return i11;
                        }
                        throw zzci.zze();
                    }
                    int zzj2 = zzj(bArr, i11, zzanVar);
                    int i17 = zzanVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzj2) {
                            if (i17 == 0) {
                                zzehVar.zzj(i10, zzba.zzb);
                            } else {
                                zzehVar.zzj(i10, zzba.zzl(bArr, zzj2, i17));
                            }
                            return zzj2 + i17;
                        }
                        throw zzci.zzg();
                    }
                    throw zzci.zzd();
                }
                zzehVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
                return i11 + 8;
            }
            int zzm = zzm(bArr, i11, zzanVar);
            zzehVar.zzj(i10, Long.valueOf(zzanVar.zzb));
            return zzm;
        }
        throw zzci.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i10, zzan zzanVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzanVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zzanVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, byte[] bArr, int i11, zzan zzanVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzanVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzanVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzanVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzanVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzanVar.zza = i20;
                return i21;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzcf zzcfVar, zzan zzanVar) {
        zzcc zzccVar = (zzcc) zzcfVar;
        int zzj = zzj(bArr, i11, zzanVar);
        zzccVar.zzf(zzanVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzanVar);
            if (i10 != zzanVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzanVar);
            zzccVar.zzf(zzanVar.zza);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i10, zzan zzanVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzanVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        zzanVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(Object obj, zzdp zzdpVar, byte[] bArr, int i10, int i11, int i12, zzan zzanVar) throws IOException {
        int zzc = ((zzdi) zzdpVar).zzc(obj, bArr, i10, i11, i12, zzanVar);
        zzanVar.zzc = obj;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(Object obj, zzdp zzdpVar, byte[] bArr, int i10, int i11, zzan zzanVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzanVar);
            i13 = zzanVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            zzdpVar.zzh(obj, bArr, i14, i15, zzanVar);
            zzanVar.zzc = obj;
            return i15;
        }
        throw zzci.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzp(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
