package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaer {
    public static final zzaep zza = new zzaep() { // from class: com.google.android.gms.internal.ads.zzaeo
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzbz zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzaep r13, com.google.android.gms.internal.ads.zzads r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaer.zza(byte[], int, com.google.android.gms.internal.ads.zzaep, com.google.android.gms.internal.ads.zzads):com.google.android.gms.internal.ads.zzbz");
    }

    private static int zzb(int i10) {
        if (i10 != 0 && i10 != 3) {
            return 2;
        }
        return 1;
    }

    private static int zzc(byte[] bArr, int i10, int i11) {
        int zzd = zzd(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd < length - 1) {
                if ((zzd - i10) % 2 == 0 && bArr[zzd + 1] == 0) {
                    return zzd;
                }
                zzd = zzd(bArr, zzd + 1);
            } else {
                return length;
            }
        }
    }

    private static int zzd(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 < length) {
                if (bArr[i10] == 0) {
                    return i10;
                }
                i10++;
            } else {
                return length;
            }
        }
    }

    private static int zze(zzfb zzfbVar, int i10) {
        byte[] zzI = zzfbVar.zzI();
        int zzc = zzfbVar.zzc();
        int i11 = zzc;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < zzc + i10) {
                if ((zzI[i11] & 255) == 255 && zzI[i12] == 0) {
                    System.arraycopy(zzI, i11 + 2, zzI, i12, (i10 - (i11 - zzc)) - 2);
                    i10--;
                }
                i11 = i12;
            } else {
                return i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0273, code lost:
    
        if (r9 == 67) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04fa A[Catch: all -> 0x051f, TRY_LEAVE, TryCatch #2 {all -> 0x051f, blocks: (B:226:0x04fa, B:125:0x0219, B:143:0x0275, B:145:0x0287, B:152:0x02c8, B:149:0x02a9, B:151:0x02c2, B:164:0x030a, B:173:0x0351, B:176:0x0386, B:179:0x0397, B:180:0x039f, B:182:0x03a5, B:184:0x03ac, B:185:0x03b0, B:192:0x03d2, B:196:0x03ff, B:198:0x0409, B:199:0x043c, B:200:0x0448, B:202:0x044e, B:204:0x0455, B:205:0x0459, B:209:0x046e, B:218:0x0499, B:220:0x04c3, B:221:0x04d2, B:224:0x04e9), top: B:238:0x00f4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzaes zzf(int r35, com.google.android.gms.internal.ads.zzfb r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzaep r39) {
        /*
            Method dump skipped, instructions count: 1341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaer.zzf(int, com.google.android.gms.internal.ads.zzfb, boolean, int, com.google.android.gms.internal.ads.zzaep):com.google.android.gms.internal.ads.zzaes");
    }

    private static zzfud zzg(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return zzfud.zzm("");
        }
        zzfua zzfuaVar = new zzfua();
        int zzc = zzc(bArr, i11, i10);
        while (i11 < zzc) {
            zzfuaVar.zzf(new String(bArr, i11, zzc - i11, zzj(i10)));
            i11 = zzb(i10) + zzc;
            zzc = zzc(bArr, i11, i10);
        }
        zzfud zzi = zzfuaVar.zzi();
        if (zzi.isEmpty()) {
            return zzfud.zzm("");
        }
        return zzi;
    }

    private static String zzh(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    private static String zzi(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static Charset zzj(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return zzfqu.zzb;
                }
                return zzfqu.zzc;
            }
            return zzfqu.zzd;
        }
        return zzfqu.zzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zzk(com.google.android.gms.internal.ads.zzfb r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzc()
        L8:
            int r3 = r21.zza()     // Catch: java.lang.Throwable -> Lb0
            r4 = 1
            r5 = r23
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r21.zzf()     // Catch: java.lang.Throwable -> Lb0
            long r8 = r21.zzt()     // Catch: java.lang.Throwable -> Lb0
            int r10 = r21.zzp()     // Catch: java.lang.Throwable -> Lb0
            goto L2c
        L22:
            int r7 = r21.zzn()     // Catch: java.lang.Throwable -> Lb0
            int r8 = r21.zzn()     // Catch: java.lang.Throwable -> Lb0
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 == 0) goto L37
            goto L3b
        L37:
            r1.zzG(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r24 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.zzG(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L73
            goto L74
        L73:
            r4 = 0
        L74:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L8b
            goto L8c
        L8a:
            r3 = 0
        L8b:
            r4 = 0
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L99
            r1.zzG(r2)
            return r6
        L99:
            int r3 = r21.zza()     // Catch: java.lang.Throwable -> Lb0
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La6
            r1.zzG(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.zzH(r3)     // Catch: java.lang.Throwable -> Lb0
            goto L8
        Lac:
            r1.zzG(r2)
            return r4
        Lb0:
            r0 = move-exception
            r1.zzG(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaer.zzk(com.google.android.gms.internal.ads.zzfb, int, int, boolean):boolean");
    }

    private static byte[] zzl(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return zzfk.zzf;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }
}
