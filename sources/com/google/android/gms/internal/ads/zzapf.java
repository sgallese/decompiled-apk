package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzapf extends zzgrq implements zzgtb {
    private static final zzapf zzb;
    private int zzd;
    private zzgrz zze = zzgrq.zzaN();
    private zzgqi zzf = zzgqi.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzapf zzapfVar = new zzapf();
        zzb = zzapfVar;
        zzgrq.zzaU(zzapf.class, zzapfVar);
    }

    private zzapf() {
    }

    public static zzape zza() {
        return (zzape) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzapf zzapfVar, zzgqi zzgqiVar) {
        zzgrz zzgrzVar = zzapfVar.zze;
        if (!zzgrzVar.zzc()) {
            zzapfVar.zze = zzgrq.zzaO(zzgrzVar);
        }
        zzapfVar.zze.add(zzgqiVar);
    }

    public static /* synthetic */ void zze(zzapf zzapfVar, zzgqi zzgqiVar) {
        zzapfVar.zzd |= 1;
        zzapfVar.zzf = zzgqiVar;
    }

    public static /* synthetic */ void zzf(zzapf zzapfVar, int i10) {
        zzapfVar.zzh = 4;
        zzapfVar.zzd = 4 | zzapfVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzanu zzanuVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzape(zzanuVar);
                }
                return new zzapf();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzaoz.zza, "zzh", zzaox.zza});
        }
        return (byte) 1;
    }
}
