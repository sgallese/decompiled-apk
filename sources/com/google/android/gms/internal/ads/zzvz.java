package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzvz extends zzwb {
    private final zzxt zzd;
    private final zzfud zze;
    private final zzdz zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzvz(zzcy zzcyVar, int[] iArr, int i10, zzxt zzxtVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzdz zzdzVar) {
        super(zzcyVar, iArr, 0);
        this.zzd = zzxtVar;
        this.zze = zzfud.zzj(list);
        this.zzf = zzdzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfud zzf(zzxe[] zzxeVarArr) {
        int i10;
        int i11;
        zzfud zzi;
        double d10;
        long j10;
        ArrayList arrayList = new ArrayList();
        char c10 = 0;
        int i12 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i12 >= 2) {
                break;
            }
            zzxe zzxeVar = zzxeVarArr[i12];
            if (zzxeVar != null && zzxeVar.zzb.length > 1) {
                zzfua zzfuaVar = new zzfua();
                zzfuaVar.zzf(new zzvx(0L, 0L));
                arrayList.add(zzfuaVar);
            } else {
                arrayList.add(null);
            }
            i12++;
        }
        long[][] jArr = new long[2];
        for (int i13 = 0; i13 < 2; i13++) {
            zzxe zzxeVar2 = zzxeVarArr[i13];
            if (zzxeVar2 == null) {
                jArr[i13] = new long[0];
            } else {
                jArr[i13] = new long[zzxeVar2.zzb.length];
                int i14 = 0;
                while (true) {
                    int[] iArr = zzxeVar2.zzb;
                    if (i14 >= iArr.length) {
                        break;
                    }
                    long j11 = zzxeVar2.zza.zzb(iArr[i14]).zzi;
                    long[] jArr2 = jArr[i13];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i14] = j11;
                    i14++;
                }
                Arrays.sort(jArr[i13]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i15 = 0; i15 < 2; i15++) {
            long[] jArr4 = jArr[i15];
            if (jArr4.length == 0) {
                j10 = 0;
            } else {
                j10 = jArr4[0];
            }
            jArr3[i15] = j10;
        }
        zzg(arrayList, jArr3);
        zzfuo zza = zzfvh.zzc(zzfvm.zzc()).zzb(2).zza();
        int i16 = 0;
        while (i16 < i10) {
            int length = jArr[i16].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i17 = 0;
                while (true) {
                    long[] jArr5 = jArr[i16];
                    double d11 = 0.0d;
                    if (i17 >= jArr5.length) {
                        break;
                    }
                    long j12 = jArr5[i17];
                    if (j12 != -1) {
                        d11 = Math.log(j12);
                    }
                    dArr[i17] = d11;
                    i17++;
                }
                int i18 = length - 1;
                double d12 = dArr[i18] - dArr[c10];
                int i19 = 0;
                while (i19 < i18) {
                    double d13 = dArr[i19];
                    i19++;
                    double d14 = d13 + dArr[i19];
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = ((d14 * 0.5d) - dArr[c10]) / d12;
                    }
                    zza.zzq(Double.valueOf(d10), Integer.valueOf(i16));
                    c10 = 0;
                }
            }
            i16++;
            c10 = 0;
            i10 = 2;
            i11 = 1;
        }
        zzfud zzj = zzfud.zzj(zza.zzr());
        for (int i20 = 0; i20 < zzj.size(); i20++) {
            int intValue = ((Integer) zzj.get(i20)).intValue();
            int i21 = iArr2[intValue] + 1;
            iArr2[intValue] = i21;
            jArr3[intValue] = jArr[intValue][i21];
            zzg(arrayList, jArr3);
        }
        for (int i22 = 0; i22 < 2; i22++) {
            if (arrayList.get(i22) != null) {
                long j13 = jArr3[i22];
                jArr3[i22] = j13 + j13;
            }
        }
        zzg(arrayList, jArr3);
        zzfua zzfuaVar2 = new zzfua();
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            zzfua zzfuaVar3 = (zzfua) arrayList.get(i23);
            if (zzfuaVar3 == null) {
                zzi = zzfud.zzl();
            } else {
                zzi = zzfuaVar3.zzi();
            }
            zzfuaVar2.zzf(zzi);
        }
        return zzfuaVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfua zzfuaVar = (zzfua) list.get(i11);
            if (zzfuaVar != null) {
                zzfuaVar.zzf(new zzvx(j10, jArr[i11]));
            }
        }
    }
}
