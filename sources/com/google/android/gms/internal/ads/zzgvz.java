package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgvz extends zzgrq implements zzgtb {
    private static final zzgvz zzb;
    private int zzd;
    private zzgqi zze = zzgqi.zzb;

    static {
        zzgvz zzgvzVar = new zzgvz();
        zzb = zzgvzVar;
        zzgrq.zzaU(zzgvz.class, zzgvzVar);
    }

    private zzgvz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgvk zzgvkVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgvy(zzgvkVar);
                }
                return new zzgvz();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
