package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzav {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzau zzauVar) throws zzcq {
        int zzh = zzh(bArr, i10, zzauVar);
        int i11 = zzauVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzh) {
                if (i11 == 0) {
                    zzauVar.zzc = zzbh.zzb;
                    return zzh;
                }
                zzauVar.zzc = zzbh.zzm(bArr, zzh, i11);
                return zzh + i11;
            }
            throw zzcq.zzg();
        }
        throw zzcq.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzdy zzdyVar, byte[] bArr, int i10, int i11, int i12, zzau zzauVar) throws IOException {
        Object zze = zzdyVar.zze();
        int zzl = zzl(zze, zzdyVar, bArr, i10, i11, i12, zzauVar);
        zzdyVar.zzf(zze);
        zzauVar.zzc = zze;
        return zzl;
    }

    static int zzd(zzdy zzdyVar, byte[] bArr, int i10, int i11, zzau zzauVar) throws IOException {
        Object zze = zzdyVar.zze();
        int zzm = zzm(zze, zzdyVar, bArr, i10, i11, zzauVar);
        zzdyVar.zzf(zze);
        zzauVar.zzc = zze;
        return zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzdy zzdyVar, int i10, byte[] bArr, int i11, int i12, zzcn zzcnVar, zzau zzauVar) throws IOException {
        int zzd = zzd(zzdyVar, bArr, i11, i12, zzauVar);
        zzcnVar.add(zzauVar.zzc);
        while (zzd < i12) {
            int zzh = zzh(bArr, zzd, zzauVar);
            if (i10 != zzauVar.zza) {
                break;
            }
            zzd = zzd(zzdyVar, bArr, zzh, i12, zzauVar);
            zzcnVar.add(zzauVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzcn zzcnVar, zzau zzauVar) throws IOException {
        zzch zzchVar = (zzch) zzcnVar;
        int zzh = zzh(bArr, i10, zzauVar);
        int i11 = zzauVar.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzauVar);
            zzchVar.zzf(zzauVar.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw zzcq.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzeq zzeqVar, zzau zzauVar) throws zzcq {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zzeqVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw zzcq.zzb();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zzeq zzf = zzeq.zzf();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzh = zzh(bArr, i11, zzauVar);
                            int i16 = zzauVar.zza;
                            i15 = i16;
                            if (i16 != i14) {
                                int zzg = zzg(i15, bArr, zzh, i12, zzf, zzauVar);
                                i15 = i16;
                                i11 = zzg;
                            } else {
                                i11 = zzh;
                                break;
                            }
                        }
                        if (i11 <= i12 && i15 == i14) {
                            zzeqVar.zzj(i10, zzf);
                            return i11;
                        }
                        throw zzcq.zze();
                    }
                    int zzh2 = zzh(bArr, i11, zzauVar);
                    int i17 = zzauVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzh2) {
                            if (i17 == 0) {
                                zzeqVar.zzj(i10, zzbh.zzb);
                            } else {
                                zzeqVar.zzj(i10, zzbh.zzm(bArr, zzh2, i17));
                            }
                            return zzh2 + i17;
                        }
                        throw zzcq.zzg();
                    }
                    throw zzcq.zzd();
                }
                zzeqVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            }
            int zzk = zzk(bArr, i11, zzauVar);
            zzeqVar.zzj(i10, Long.valueOf(zzauVar.zzb));
            return zzk;
        }
        throw zzcq.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzau zzauVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzauVar.zza = b10;
            return i11;
        }
        return zzi(b10, bArr, i11, zzauVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, zzau zzauVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzauVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzauVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzauVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzauVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzauVar.zza = i20;
                return i21;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzcn zzcnVar, zzau zzauVar) {
        zzch zzchVar = (zzch) zzcnVar;
        int zzh = zzh(bArr, i11, zzauVar);
        zzchVar.zzf(zzauVar.zza);
        while (zzh < i12) {
            int zzh2 = zzh(bArr, zzh, zzauVar);
            if (i10 != zzauVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzauVar);
            zzchVar.zzf(zzauVar.zza);
        }
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(byte[] bArr, int i10, zzau zzauVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzauVar.zzb = j10;
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
        zzauVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(Object obj, zzdy zzdyVar, byte[] bArr, int i10, int i11, int i12, zzau zzauVar) throws IOException {
        int zzc = ((zzdq) zzdyVar).zzc(obj, bArr, i10, i11, i12, zzauVar);
        zzauVar.zzc = obj;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(Object obj, zzdy zzdyVar, byte[] bArr, int i10, int i11, zzau zzauVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzi(i13, bArr, i12, zzauVar);
            i13 = zzauVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            zzdyVar.zzh(obj, bArr, i14, i15, zzauVar);
            zzauVar.zzc = obj;
            return i15;
        }
        throw zzcq.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
