package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzabk {
    public static int zza(zzfb zzfbVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzfbVar.zzl() + 1;
            case 7:
                return zzfbVar.zzp() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzabc zzabcVar, zzabo zzaboVar) throws IOException {
        boolean z10;
        int i10;
        zzabcVar.zzj();
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzaarVar.zzm(bArr, 0, 1, false);
        int i11 = bArr[0] & 1;
        if (1 != i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzaarVar.zzl(2, false);
        if (1 != i11) {
            i10 = 6;
        } else {
            i10 = 7;
        }
        zzfb zzfbVar = new zzfb(i10);
        zzfbVar.zzF(zzabf.zza(zzabcVar, zzfbVar.zzI(), 0, i10));
        zzabcVar.zzj();
        zzabj zzabjVar = new zzabj();
        if (zzd(zzfbVar, zzaboVar, z10, zzabjVar)) {
            return zzabjVar.zza;
        }
        throw zzcd.zza(null, null);
    }

    public static boolean zzc(zzfb zzfbVar, zzabo zzaboVar, int i10, zzabj zzabjVar) {
        boolean z10;
        int zza;
        int zzc = zzfbVar.zzc();
        long zzt = zzfbVar.zzt();
        long j10 = zzt >>> 16;
        if (j10 != i10) {
            return false;
        }
        if ((j10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = zzt >> 12;
        long j12 = zzt >> 8;
        long j13 = zzt >> 4;
        long j14 = zzt >> 1;
        long j15 = zzt & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            if (i11 != zzaboVar.zzg - 1) {
                return false;
            }
        } else if (i11 > 10 || zzaboVar.zzg != 2) {
            return false;
        }
        int i12 = (int) (j14 & 7);
        if ((i12 == 0 || i12 == zzaboVar.zzi) && j15 != 1 && zzd(zzfbVar, zzaboVar, z10, zzabjVar) && (zza = zza(zzfbVar, (int) (j11 & 15))) != -1 && zza <= zzaboVar.zzb) {
            int i13 = zzaboVar.zze;
            int i14 = (int) (j12 & 15);
            if (i14 != 0) {
                if (i14 <= 11) {
                    if (i14 != zzaboVar.zzf) {
                        return false;
                    }
                } else if (i14 == 12) {
                    if (zzfbVar.zzl() * 1000 != i13) {
                        return false;
                    }
                } else if (i14 <= 14) {
                    int zzp = zzfbVar.zzp();
                    if (i14 == 14) {
                        zzp *= 10;
                    }
                    if (zzp != i13) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (zzfbVar.zzl() == zzfk.zze(zzfbVar.zzI(), zzc, zzfbVar.zzc() - 1, 0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean zzd(zzfb zzfbVar, zzabo zzaboVar, boolean z10, zzabj zzabjVar) {
        try {
            long zzv = zzfbVar.zzv();
            if (!z10) {
                zzv *= zzaboVar.zzb;
            }
            zzabjVar.zza = zzv;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
