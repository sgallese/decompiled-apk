package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgkk extends zzgrq implements zzgtb {
    private static final zzgkk zzb;
    private int zzd;

    static {
        zzgkk zzgkkVar = new zzgkk();
        zzb = zzgkkVar;
        zzgrq.zzaU(zzgkk.class, zzgkkVar);
    }

    private zzgkk() {
    }

    public static zzgkj zzc() {
        return (zzgkj) zzb.zzaA();
    }

    public static zzgkk zze() {
        return zzb;
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
                    zzgki zzgkiVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgkj(zzgkiVar);
                }
                return new zzgkk();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}