package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgof extends zzgrq implements zzgtb {
    private static final zzgof zzb;
    private int zzd;

    static {
        zzgof zzgofVar = new zzgof();
        zzb = zzgofVar;
        zzgrq.zzaU(zzgof.class, zzgofVar);
    }

    private zzgof() {
    }

    public static zzgof zzd() {
        return zzb;
    }

    public static zzgof zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgof) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgod zzgodVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgoe(zzgodVar);
                }
                return new zzgof();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
