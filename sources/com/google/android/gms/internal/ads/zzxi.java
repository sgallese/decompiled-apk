package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzxi extends zzxl {
    private zzxh zza;

    protected abstract Pair zzb(zzxh zzxhVar, int[][][] iArr, int[] iArr2, zzts zztsVar, zzcw zzcwVar) throws zzil;

    @Override // com.google.android.gms.internal.ads.zzxl
    public final zzxm zzo(zzlp[] zzlpVarArr, zzvs zzvsVar, zzts zztsVar, zzcw zzcwVar) throws zzil {
        boolean z10;
        boolean z11;
        zzfud zzl;
        int[] iArr;
        boolean z12;
        int[] iArr2 = new int[3];
        zzcy[][] zzcyVarArr = new zzcy[3];
        int[][][] iArr3 = new int[3][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzvsVar.zzc;
            zzcyVarArr[i10] = new zzcy[i11];
            iArr3[i10] = new int[i11];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzlpVarArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzvsVar.zzc) {
            zzcy zzb = zzvsVar.zzb(i14);
            int i15 = zzb.zzd;
            int i16 = 0;
            int i17 = 2;
            int i18 = 0;
            boolean z13 = true;
            while (i16 < i12) {
                zzlp zzlpVar = zzlpVarArr[i16];
                int i19 = 0;
                for (int i20 = 0; i20 <= 0; i20++) {
                    i19 = Math.max(i19, zzlpVar.zzU(zzb.zzb(i20)) & 7);
                }
                if (iArr2[i16] == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i19 <= i18) {
                    if (i19 == i18 && i15 == 5 && !z13 && z12) {
                        i17 = i16;
                        i18 = i19;
                        z13 = true;
                    }
                } else {
                    z13 = z12;
                    i17 = i16;
                    i18 = i19;
                }
                i16++;
                i12 = 2;
            }
            if (i17 == i12) {
                iArr = new int[1];
            } else {
                zzlp zzlpVar2 = zzlpVarArr[i17];
                int[] iArr5 = new int[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr5[i21] = zzlpVar2.zzU(zzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i17];
            zzcyVarArr[i17][i22] = zzb;
            iArr3[i17][i22] = iArr;
            iArr2[i17] = i22 + 1;
            i14++;
            i12 = 2;
        }
        zzvs[] zzvsVarArr = new zzvs[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            int i24 = iArr2[i23];
            zzvsVarArr[i23] = new zzvs((zzcy[]) zzfk.zzH(zzcyVarArr[i23], i24));
            iArr3[i23] = (int[][]) zzfk.zzH(iArr3[i23], i24);
            strArr[i23] = zzlpVarArr[i23].zzQ();
            iArr6[i23] = zzlpVarArr[i23].zzb();
            i23++;
            i12 = 2;
        }
        zzxh zzxhVar = new zzxh(strArr, iArr6, zzvsVarArr, iArr4, iArr3, new zzvs((zzcy[]) zzfk.zzH(zzcyVarArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzxhVar, iArr3, iArr4, zztsVar, zzcwVar);
        zzxj[] zzxjVarArr = (zzxj[]) zzb2.second;
        List[] listArr = new List[zzxjVarArr.length];
        for (int i25 = 0; i25 < zzxjVarArr.length; i25++) {
            zzxj zzxjVar = zzxjVarArr[i25];
            if (zzxjVar != null) {
                zzl = zzfud.zzm(zzxjVar);
            } else {
                zzl = zzfud.zzl();
            }
            listArr[i25] = zzl;
        }
        zzfua zzfuaVar = new zzfua();
        for (int i26 = 0; i26 < 2; i26++) {
            zzvs zzd = zzxhVar.zzd(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < zzd.zzc; i27++) {
                zzcy zzb3 = zzd.zzb(i27);
                if (zzxhVar.zza(i26, i27, false) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i28 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i29 = 0; i29 <= 0; i29++) {
                    iArr7[i29] = zzxhVar.zzb(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 < list.size()) {
                            zzxj zzxjVar2 = (zzxj) list.get(i30);
                            if (zzxjVar2.zze().equals(zzb3) && zzxjVar2.zzb(i29) != -1) {
                                z11 = true;
                                break;
                            }
                            i30++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    zArr[i29] = z11;
                }
                zzfuaVar.zzf(new zzdg(zzb3, z10, iArr7, zArr));
            }
        }
        zzvs zze = zzxhVar.zze();
        for (int i31 = 0; i31 < zze.zzc; i31++) {
            zzcy zzb4 = zze.zzb(i31);
            int i32 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfuaVar.zzf(new zzdg(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzxm((zzlq[]) zzb2.first, (zzxf[]) zzb2.second, new zzdh(zzfuaVar.zzi()), zzxhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzp(Object obj) {
        this.zza = (zzxh) obj;
    }
}
