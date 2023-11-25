package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzahf {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzabc zzabcVar) throws IOException {
        return zzc(zzabcVar, true, false);
    }

    public static boolean zzb(zzabc zzabcVar, boolean z10) throws IOException {
        return zzc(zzabcVar, false, false);
    }

    private static boolean zzc(zzabc zzabcVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        long j10;
        int i10;
        long zzd = zzabcVar.zzd();
        long j11 = 4096;
        long j12 = -1;
        if (zzd != -1 && zzd <= 4096) {
            j11 = zzd;
        }
        zzfb zzfbVar = new zzfb(64);
        int i11 = (int) j11;
        int i12 = 0;
        boolean z13 = false;
        while (i12 < i11) {
            zzfbVar.zzD(8);
            if (!zzabcVar.zzm(zzfbVar.zzI(), 0, 8, true)) {
                break;
            }
            long zzt = zzfbVar.zzt();
            int zzf = zzfbVar.zzf();
            if (zzt == 1) {
                zzabcVar.zzh(zzfbVar.zzI(), 8, 8);
                i10 = 16;
                zzfbVar.zzF(16);
                j10 = zzfbVar.zzs();
            } else {
                if (zzt == 0) {
                    long zzd2 = zzabcVar.zzd();
                    if (zzd2 != j12) {
                        zzt = (zzd2 - zzabcVar.zze()) + 8;
                    }
                }
                j10 = zzt;
                i10 = 8;
            }
            long j13 = i10;
            if (j10 < j13) {
                return false;
            }
            i12 += i10;
            if (zzf == 1836019574) {
                i11 += (int) j10;
                if (zzd != -1 && i11 > zzd) {
                    i11 = (int) zzd;
                }
            } else if (zzf != 1836019558 && zzf != 1836475768) {
                long j14 = zzd;
                if ((i12 + j10) - j13 >= i11) {
                    break;
                }
                int i13 = (int) (j10 - j13);
                i12 += i13;
                if (zzf == 1718909296) {
                    if (i13 < 8) {
                        return false;
                    }
                    zzfbVar.zzD(i13);
                    zzabcVar.zzh(zzfbVar.zzI(), 0, i13);
                    int i14 = i13 >> 2;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (i15 == 1) {
                            zzfbVar.zzH(4);
                        } else {
                            int zzf2 = zzfbVar.zzf();
                            if ((zzf2 >>> 8) != 3368816) {
                                if (zzf2 == 1751476579) {
                                    zzf2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i16 = 0; i16 < 29; i16++) {
                                    if (iArr[i16] != zzf2) {
                                    }
                                }
                            }
                            z13 = true;
                            break;
                        }
                    }
                    if (!z13) {
                        return false;
                    }
                } else if (i13 != 0) {
                    zzabcVar.zzg(i13);
                }
                zzd = j14;
            } else {
                z12 = true;
                break;
            }
            j12 = -1;
        }
        z12 = false;
        if (!z13 || z10 != z12) {
            return false;
        }
        return true;
    }
}
