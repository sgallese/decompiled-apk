package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgmi extends zzgrq implements zzgtb {
    private static final zzgmi zzb;
    private int zzd;
    private zzgml zze;
    private int zzf;
    private int zzg;

    static {
        zzgmi zzgmiVar = new zzgmi();
        zzb = zzgmiVar;
        zzgrq.zzaU(zzgmi.class, zzgmiVar);
    }

    private zzgmi() {
    }

    public static zzgmh zzd() {
        return (zzgmh) zzb.zzaA();
    }

    public static zzgmi zzf() {
        return zzb;
    }

    public static zzgmi zzg(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgmi) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public static /* synthetic */ void zzi(zzgmi zzgmiVar, zzgml zzgmlVar) {
        zzgmlVar.getClass();
        zzgmiVar.zze = zzgmlVar;
        zzgmiVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgmg zzgmgVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgmh(zzgmgVar);
                }
                return new zzgmi();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zzg;
    }

    public final zzgml zzh() {
        zzgml zzgmlVar = this.zze;
        if (zzgmlVar == null) {
            return zzgml.zze();
        }
        return zzgmlVar;
    }
}
