package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgma extends zzgrq implements zzgtb {
    private static final zzgma zzb;

    static {
        zzgma zzgmaVar = new zzgma();
        zzb = zzgmaVar;
        zzgrq.zzaU(zzgma.class, zzgmaVar);
    }

    private zzgma() {
    }

    public static zzgma zzc() {
        return zzb;
    }

    public static zzgma zzd(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgma) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            zzgly zzglyVar = null;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzglz(zzglyVar);
                }
                return new zzgma();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
