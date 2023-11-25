package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzagr {
    private static final byte[] zza;

    static {
        int i10 = zzfk.zza;
        zza = "OpusHead".getBytes(zzfqu.zzc);
    }

    public static zzbz zza(zzagh zzaghVar) {
        zzfo zzfoVar;
        zzagi zzb = zzaghVar.zzb(1751411826);
        zzagi zzb2 = zzaghVar.zzb(1801812339);
        zzagi zzb3 = zzaghVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzh(zzb.zza) != 1835299937) {
            return null;
        }
        zzfb zzfbVar = zzb2.zza;
        zzfbVar.zzG(12);
        int zzf = zzfbVar.zzf();
        String[] strArr = new String[zzf];
        for (int i10 = 0; i10 < zzf; i10++) {
            int zzf2 = zzfbVar.zzf();
            zzfbVar.zzH(4);
            strArr[i10] = zzfbVar.zzy(zzf2 - 8, zzfqu.zzc);
        }
        zzfb zzfbVar2 = zzb3.zza;
        zzfbVar2.zzG(8);
        ArrayList arrayList = new ArrayList();
        while (zzfbVar2.zza() > 8) {
            int zzc = zzfbVar2.zzc();
            int zzf3 = zzfbVar2.zzf();
            int zzf4 = zzfbVar2.zzf() - 1;
            if (zzf4 >= 0 && zzf4 < zzf) {
                String str = strArr[zzf4];
                int i11 = zzc + zzf3;
                int i12 = zzagy.zzb;
                while (true) {
                    int zzc2 = zzfbVar2.zzc();
                    if (zzc2 < i11) {
                        int zzf5 = zzfbVar2.zzf();
                        if (zzfbVar2.zzf() == 1684108385) {
                            int zzf6 = zzfbVar2.zzf();
                            int zzf7 = zzfbVar2.zzf();
                            int i13 = zzf5 - 16;
                            byte[] bArr = new byte[i13];
                            zzfbVar2.zzC(bArr, 0, i13);
                            zzfoVar = new zzfo(str, bArr, zzf7, zzf6);
                            break;
                        }
                        zzfbVar2.zzG(zzc2 + zzf5);
                    } else {
                        zzfoVar = null;
                        break;
                    }
                }
                if (zzfoVar != null) {
                    arrayList.add(zzfoVar);
                }
            } else {
                zzes.zzf("AtomParsers", "Skipped metadata with unknown key index: " + zzf4);
            }
            zzfbVar2.zzG(zzc + zzf3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbz(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        if (r7 != 13) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbz zzb(com.google.android.gms.internal.ads.zzagi r14) {
        /*
            com.google.android.gms.internal.ads.zzfb r14 = r14.zza
            r0 = 8
            r14.zzG(r0)
            com.google.android.gms.internal.ads.zzbz r1 = new com.google.android.gms.internal.ads.zzbz
            r2 = 0
            com.google.android.gms.internal.ads.zzby[] r3 = new com.google.android.gms.internal.ads.zzby[r2]
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r3)
        L14:
            int r3 = r14.zza()
            if (r3 < r0) goto Lf6
            int r3 = r14.zzc()
            int r6 = r14.zzf()
            int r7 = r14.zzf()
            r8 = 1835365473(0x6d657461, float:4.4382975E27)
            r9 = 0
            if (r7 != r8) goto L82
            r14.zzG(r3)
            int r7 = r3 + r6
            r14.zzH(r0)
            zze(r14)
        L37:
            int r8 = r14.zzc()
            if (r8 >= r7) goto L7c
            int r8 = r14.zzc()
            int r10 = r14.zzf()
            int r11 = r14.zzf()
            r12 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r11 != r12) goto L77
            r14.zzG(r8)
            int r8 = r8 + r10
            r14.zzH(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L5a:
            int r10 = r14.zzc()
            if (r10 >= r8) goto L6a
            com.google.android.gms.internal.ads.zzby r10 = com.google.android.gms.internal.ads.zzagy.zza(r14)
            if (r10 == 0) goto L5a
            r7.add(r10)
            goto L5a
        L6a:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L71
            goto L7c
        L71:
            com.google.android.gms.internal.ads.zzbz r9 = new com.google.android.gms.internal.ads.zzbz
            r9.<init>(r7)
            goto L7c
        L77:
            int r8 = r8 + r10
            r14.zzG(r8)
            goto L37
        L7c:
            com.google.android.gms.internal.ads.zzbz r1 = r1.zzd(r9)
            goto Lf0
        L82:
            r8 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r7 != r8) goto Le3
            r14.zzG(r3)
            int r7 = r3 + r6
            r8 = 12
            r14.zzH(r8)
        L91:
            int r10 = r14.zzc()
            if (r10 >= r7) goto Lde
            int r10 = r14.zzc()
            int r11 = r14.zzf()
            int r12 = r14.zzf()
            r13 = 1935766900(0x73617574, float:1.7862687E31)
            if (r12 != r13) goto Ld9
            r7 = 14
            if (r11 >= r7) goto Lad
            goto Lde
        Lad:
            r7 = 5
            r14.zzH(r7)
            int r7 = r14.zzl()
            r10 = 1123024896(0x42f00000, float:120.0)
            if (r7 == r8) goto Lbe
            r8 = 13
            if (r7 == r8) goto Lc2
            goto Lde
        Lbe:
            if (r7 != r8) goto Lc2
            r10 = 1131413504(0x43700000, float:240.0)
        Lc2:
            r7 = 1
            r14.zzH(r7)
            int r8 = r14.zzl()
            com.google.android.gms.internal.ads.zzbz r9 = new com.google.android.gms.internal.ads.zzbz
            com.google.android.gms.internal.ads.zzby[] r7 = new com.google.android.gms.internal.ads.zzby[r7]
            com.google.android.gms.internal.ads.zzafi r11 = new com.google.android.gms.internal.ads.zzafi
            r11.<init>(r10, r8)
            r7[r2] = r11
            r9.<init>(r4, r7)
            goto Lde
        Ld9:
            int r10 = r10 + r11
            r14.zzG(r10)
            goto L91
        Lde:
            com.google.android.gms.internal.ads.zzbz r1 = r1.zzd(r9)
            goto Lf0
        Le3:
            r8 = -1451722374(0xffffffffa978797a, float:-5.5172426E-14)
            if (r7 != r8) goto Lf0
            com.google.android.gms.internal.ads.zzbz r7 = zzl(r14)
            com.google.android.gms.internal.ads.zzbz r1 = r1.zzd(r7)
        Lf0:
            int r3 = r3 + r6
            r14.zzG(r3)
            goto L14
        Lf6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.zzb(com.google.android.gms.internal.ads.zzagi):com.google.android.gms.internal.ads.zzbz");
    }

    public static zzfu zzc(zzfb zzfbVar) {
        long zzs;
        long zzs2;
        zzfbVar.zzG(8);
        if (zzagj.zze(zzfbVar.zzf()) == 0) {
            zzs = zzfbVar.zzt();
            zzs2 = zzfbVar.zzt();
        } else {
            zzs = zzfbVar.zzs();
            zzs2 = zzfbVar.zzs();
        }
        return new zzfu(zzs, zzs2, zzfbVar.zzt());
    }

    /* JADX WARN: Removed duplicated region for block: B:371:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0b3d A[ADDED_TO_REGION, LOOP:13: B:488:0x0b3d->B:492:0x0b47, LOOP_START, PHI: r21
      0x0b3d: PHI (r21v12 int) = (r21v11 int), (r21v13 int) binds: [B:487:0x0b3b, B:492:0x0b47] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0c16  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0ea6  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0eb3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0b32 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzagh r59, com.google.android.gms.internal.ads.zzabq r60, long r61, com.google.android.gms.internal.ads.zzad r63, boolean r64, boolean r65, com.google.android.gms.internal.ads.zzfqw r66) throws com.google.android.gms.internal.ads.zzcd {
        /*
            Method dump skipped, instructions count: 3773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.zzd(com.google.android.gms.internal.ads.zzagh, com.google.android.gms.internal.ads.zzabq, long, com.google.android.gms.internal.ads.zzad, boolean, boolean, com.google.android.gms.internal.ads.zzfqw):java.util.List");
    }

    public static void zze(zzfb zzfbVar) {
        int zzc = zzfbVar.zzc();
        zzfbVar.zzH(4);
        if (zzfbVar.zzf() != 1751411826) {
            zzc += 4;
        }
        zzfbVar.zzG(zzc);
    }

    private static int zzf(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 != 1952807028 && i10 != 1935832172 && i10 != 1937072756 && i10 != 1668047728) {
            if (i10 == 1835365473) {
                return 5;
            }
            return -1;
        }
        return 3;
    }

    private static int zzg(zzfb zzfbVar) {
        int zzl = zzfbVar.zzl();
        int i10 = zzl & 127;
        while ((zzl & 128) == 128) {
            zzl = zzfbVar.zzl();
            i10 = (i10 << 7) | (zzl & 127);
        }
        return i10;
    }

    private static int zzh(zzfb zzfbVar) {
        zzfbVar.zzG(16);
        return zzfbVar.zzf();
    }

    private static Pair zzi(zzagh zzaghVar) {
        long zzt;
        long zzf;
        zzagi zzb = zzaghVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzfb zzfbVar = zzb.zza;
        zzfbVar.zzG(8);
        int zze = zzagj.zze(zzfbVar.zzf());
        int zzo = zzfbVar.zzo();
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        for (int i10 = 0; i10 < zzo; i10++) {
            if (zze == 1) {
                zzt = zzfbVar.zzu();
            } else {
                zzt = zzfbVar.zzt();
            }
            jArr[i10] = zzt;
            if (zze == 1) {
                zzf = zzfbVar.zzs();
            } else {
                zzf = zzfbVar.zzf();
            }
            jArr2[i10] = zzf;
            if (zzfbVar.zzz() == 1) {
                zzfbVar.zzH(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzj(zzfb zzfbVar) {
        int i10;
        int i11 = 8;
        zzfbVar.zzG(8);
        int zze = zzagj.zze(zzfbVar.zzf());
        if (zze == 0) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        zzfbVar.zzH(i10);
        long zzt = zzfbVar.zzt();
        if (zze == 0) {
            i11 = 4;
        }
        zzfbVar.zzH(i11);
        int zzp = zzfbVar.zzp();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) (((zzp >> 10) & 31) + 96));
        sb2.append((char) (((zzp >> 5) & 31) + 96));
        sb2.append((char) ((zzp & 31) + 96));
        return Pair.create(Long.valueOf(zzt), sb2.toString());
    }

    private static Pair zzk(zzfb zzfbVar, int i10, int i11) throws zzcd {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        zzahh zzahhVar;
        Pair create;
        int i12;
        int i13;
        boolean z13;
        byte[] bArr;
        int zzc = zzfbVar.zzc();
        while (zzc - i10 < i11) {
            zzfbVar.zzG(zzc);
            int zzf = zzfbVar.zzf();
            boolean z14 = true;
            if (zzf > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzabf.zzb(z10, "childAtomSize must be positive");
            if (zzfbVar.zzf() == 1936289382) {
                int i14 = zzc + 8;
                int i15 = -1;
                int i16 = 0;
                String str = null;
                Integer num2 = null;
                while (i14 - zzc < zzf) {
                    zzfbVar.zzG(i14);
                    int zzf2 = zzfbVar.zzf();
                    int zzf3 = zzfbVar.zzf();
                    if (zzf3 == 1718775137) {
                        num2 = Integer.valueOf(zzfbVar.zzf());
                    } else if (zzf3 == 1935894637) {
                        zzfbVar.zzH(4);
                        str = zzfbVar.zzy(4, zzfqu.zzc);
                    } else if (zzf3 == 1935894633) {
                        i15 = i14;
                        i16 = zzf2;
                    }
                    i14 += zzf2;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zzabf.zzb(z11, "frma atom is mandatory");
                    if (i15 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zzabf.zzb(z12, "schi atom is mandatory");
                    int i17 = i15 + 8;
                    while (true) {
                        if (i17 - i15 < i16) {
                            zzfbVar.zzG(i17);
                            int zzf4 = zzfbVar.zzf();
                            if (zzfbVar.zzf() == 1952804451) {
                                int zze = zzagj.zze(zzfbVar.zzf());
                                zzfbVar.zzH(1);
                                if (zze == 0) {
                                    zzfbVar.zzH(1);
                                    i12 = 0;
                                    i13 = 0;
                                } else {
                                    int zzl = zzfbVar.zzl();
                                    int i18 = zzl & 240;
                                    i12 = zzl & 15;
                                    i13 = i18 >> 4;
                                }
                                if (zzfbVar.zzl() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int zzl2 = zzfbVar.zzl();
                                byte[] bArr2 = new byte[16];
                                zzfbVar.zzC(bArr2, 0, 16);
                                if (z13 && zzl2 == 0) {
                                    int zzl3 = zzfbVar.zzl();
                                    byte[] bArr3 = new byte[zzl3];
                                    zzfbVar.zzC(bArr3, 0, zzl3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                zzahhVar = new zzahh(z13, str, zzl2, bArr2, i13, i12, bArr);
                            } else {
                                i17 += zzf4;
                            }
                        } else {
                            num = num2;
                            zzahhVar = null;
                            break;
                        }
                    }
                    if (zzahhVar == null) {
                        z14 = false;
                    }
                    zzabf.zzb(z14, "tenc atom is mandatory");
                    int i19 = zzfk.zza;
                    create = Pair.create(num, zzahhVar);
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zzf;
        }
        return null;
    }

    private static zzbz zzl(zzfb zzfbVar) {
        short zzz = zzfbVar.zzz();
        zzfbVar.zzH(2);
        String zzy = zzfbVar.zzy(zzz, zzfqu.zzc);
        int max = Math.max(zzy.lastIndexOf(43), zzy.lastIndexOf(45));
        try {
            return new zzbz(-9223372036854775807L, new zzfr(Float.parseFloat(zzy.substring(0, max)), Float.parseFloat(zzy.substring(max, zzy.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzagl zzm(zzfb zzfbVar, int i10) {
        long j10;
        long j11;
        zzfbVar.zzG(i10 + 12);
        zzfbVar.zzH(1);
        zzg(zzfbVar);
        zzfbVar.zzH(2);
        int zzl = zzfbVar.zzl();
        if ((zzl & 128) != 0) {
            zzfbVar.zzH(2);
        }
        if ((zzl & 64) != 0) {
            zzfbVar.zzH(zzfbVar.zzl());
        }
        if ((zzl & 32) != 0) {
            zzfbVar.zzH(2);
        }
        zzfbVar.zzH(1);
        zzg(zzfbVar);
        String zzd = zzcc.zzd(zzfbVar.zzl());
        if (!"audio/mpeg".equals(zzd) && !"audio/vnd.dts".equals(zzd) && !"audio/vnd.dts.hd".equals(zzd)) {
            zzfbVar.zzH(4);
            long zzt = zzfbVar.zzt();
            long zzt2 = zzfbVar.zzt();
            zzfbVar.zzH(1);
            int zzg = zzg(zzfbVar);
            byte[] bArr = new byte[zzg];
            zzfbVar.zzC(bArr, 0, zzg);
            if (zzt2 <= 0) {
                j10 = -1;
            } else {
                j10 = zzt2;
            }
            if (zzt > 0) {
                j11 = zzt;
            } else {
                j11 = -1;
            }
            return new zzagl(zzd, bArr, j10, j11);
        }
        return new zzagl(zzd, null, -1L, -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzo(com.google.android.gms.internal.ads.zzfb r25, int r26, int r27, int r28, int r29, java.lang.String r30, boolean r31, com.google.android.gms.internal.ads.zzad r32, com.google.android.gms.internal.ads.zzagn r33, int r34) throws com.google.android.gms.internal.ads.zzcd {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.zzo(com.google.android.gms.internal.ads.zzfb, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzad, com.google.android.gms.internal.ads.zzagn, int):void");
    }

    private static void zzp(zzfb zzfbVar, int i10, int i11, int i12, zzagn zzagnVar) {
        zzfbVar.zzG(i11 + 16);
        zzfbVar.zzw((char) 0);
        String zzw = zzfbVar.zzw((char) 0);
        if (zzw != null) {
            zzak zzakVar = new zzak();
            zzakVar.zzG(i12);
            zzakVar.zzS(zzw);
            zzagnVar.zzb = zzakVar.zzY();
        }
    }

    private static boolean zzq(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length;
        int i10 = length - 1;
        int max = Math.max(0, Math.min(4, i10));
        int max2 = Math.max(0, Math.min(length - 4, i10));
        if (jArr[0] > j11 || j11 >= jArr[max] || jArr[max2] >= j12 || j12 > j10) {
            return false;
        }
        return true;
    }

    private static boolean zzr(int i10) {
        if (i10 != 1) {
            return true;
        }
        return false;
    }

    private static byte[] zzs(zzfb zzfbVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            zzfbVar.zzG(i12);
            int zzf = zzfbVar.zzf();
            if (zzfbVar.zzf() == 1886547818) {
                return Arrays.copyOfRange(zzfbVar.zzI(), i12, zzf + i12);
            }
            i12 += zzf;
        }
        return null;
    }
}
