package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgkq extends zzgrq implements zzgtb {
    private static final zzgkq zzb;
    private int zzd;
    private zzgkw zze;
    private zzgmi zzf;

    static {
        zzgkq zzgkqVar = new zzgkq();
        zzb = zzgkqVar;
        zzgrq.zzaU(zzgkq.class, zzgkqVar);
    }

    private zzgkq() {
    }

    public static zzgkp zza() {
        return (zzgkp) zzb.zzaA();
    }

    public static zzgkq zzd(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkq) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public static /* synthetic */ void zzg(zzgkq zzgkqVar, zzgkw zzgkwVar) {
        zzgkwVar.getClass();
        zzgkqVar.zze = zzgkwVar;
        zzgkqVar.zzd |= 1;
    }

    public static /* synthetic */ void zzh(zzgkq zzgkqVar, zzgmi zzgmiVar) {
        zzgmiVar.getClass();
        zzgkqVar.zzf = zzgmiVar;
        zzgkqVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgko zzgkoVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgkp(zzgkoVar);
                }
                return new zzgkq();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgkw zze() {
        zzgkw zzgkwVar = this.zze;
        if (zzgkwVar == null) {
            return zzgkw.zze();
        }
        return zzgkwVar;
    }

    public final zzgmi zzf() {
        zzgmi zzgmiVar = this.zzf;
        if (zzgmiVar == null) {
            return zzgmi.zzf();
        }
        return zzgmiVar;
    }
}
