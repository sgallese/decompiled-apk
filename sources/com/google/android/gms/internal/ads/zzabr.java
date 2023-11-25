package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzabr {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public final String zzg;

    private zzabr(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = f10;
        this.zzg = str;
    }

    public static zzabr zza(zzfb zzfbVar) throws zzcd {
        List singletonList;
        int i10;
        int i11;
        try {
            zzfbVar.zzH(21);
            int zzl = zzfbVar.zzl() & 3;
            int zzl2 = zzfbVar.zzl();
            int zzc = zzfbVar.zzc();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < zzl2; i14++) {
                zzfbVar.zzH(1);
                int zzp = zzfbVar.zzp();
                for (int i15 = 0; i15 < zzp; i15++) {
                    int zzp2 = zzfbVar.zzp();
                    i13 += zzp2 + 4;
                    zzfbVar.zzH(zzp2);
                }
            }
            zzfbVar.zzG(zzc);
            byte[] bArr = new byte[i13];
            String str = null;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            float f10 = 1.0f;
            while (i16 < zzl2) {
                int zzl3 = zzfbVar.zzl() & 63;
                int zzp3 = zzfbVar.zzp();
                int i23 = 0;
                while (i23 < zzp3) {
                    int zzp4 = zzfbVar.zzp();
                    int i24 = zzl2;
                    System.arraycopy(zzfy.zza, i12, bArr, i17, 4);
                    int i25 = i17 + 4;
                    System.arraycopy(zzfbVar.zzI(), zzfbVar.zzc(), bArr, i25, zzp4);
                    if (zzl3 == 33 && i23 == 0) {
                        zzfv zzc2 = zzfy.zzc(bArr, i25 + 2, i25 + zzp4);
                        i18 = zzc2.zzg;
                        i19 = zzc2.zzh;
                        i20 = zzc2.zzj;
                        int i26 = zzc2.zzk;
                        int i27 = zzc2.zzl;
                        float f11 = zzc2.zzi;
                        i10 = zzl3;
                        i11 = zzp3;
                        str = zzea.zzb(zzc2.zza, zzc2.zzb, zzc2.zzc, zzc2.zzd, zzc2.zze, zzc2.zzf);
                        i23 = 0;
                        f10 = f11;
                        i21 = i26;
                        i22 = i27;
                    } else {
                        i10 = zzl3;
                        i11 = zzp3;
                    }
                    i17 = i25 + zzp4;
                    zzfbVar.zzH(zzp4);
                    i23++;
                    zzl2 = i24;
                    zzl3 = i10;
                    zzp3 = i11;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            if (i13 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new zzabr(singletonList, zzl + 1, i18, i19, i20, i21, i22, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzcd.zza("Error parsing HEVC config", e10);
        }
    }
}
