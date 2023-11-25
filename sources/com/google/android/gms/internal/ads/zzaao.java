package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaao {
    public static void zza(long j10, zzfb zzfbVar, zzace[] zzaceVarArr) {
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (zzfbVar.zza() > 1) {
                int zzc = zzc(zzfbVar);
                int zzc2 = zzc(zzfbVar);
                int zzc3 = zzfbVar.zzc() + zzc2;
                if (zzc2 != -1 && zzc2 <= zzfbVar.zza()) {
                    if (zzc == 4 && zzc2 >= 8) {
                        int zzl = zzfbVar.zzl();
                        int zzp = zzfbVar.zzp();
                        if (zzp == 49) {
                            i10 = zzfbVar.zzf();
                            zzp = 49;
                        } else {
                            i10 = 0;
                        }
                        int zzl2 = zzfbVar.zzl();
                        if (zzp == 47) {
                            zzfbVar.zzH(1);
                            zzp = 47;
                        }
                        if (zzl == 181 && ((zzp == 49 || zzp == 47) && zzl2 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (zzp == 49) {
                            if (i10 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            zzb(j10, zzfbVar, zzaceVarArr);
                        }
                    }
                } else {
                    zzes.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzc3 = zzfbVar.zzd();
                }
                zzfbVar.zzG(zzc3);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j10, zzfb zzfbVar, zzace[] zzaceVarArr) {
        int zzl = zzfbVar.zzl();
        if ((zzl & 64) != 0) {
            int i10 = zzl & 31;
            zzfbVar.zzH(1);
            int zzc = zzfbVar.zzc();
            for (zzace zzaceVar : zzaceVarArr) {
                int i11 = i10 * 3;
                zzfbVar.zzG(zzc);
                zzaceVar.zzq(zzfbVar, i11);
                if (j10 != -9223372036854775807L) {
                    zzaceVar.zzs(j10, 1, i11, 0, null);
                }
            }
        }
    }

    private static int zzc(zzfb zzfbVar) {
        int i10 = 0;
        while (zzfbVar.zza() != 0) {
            int zzl = zzfbVar.zzl();
            i10 += zzl;
            if (zzl != 255) {
                return i10;
            }
        }
        return -1;
    }
}
