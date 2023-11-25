package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgli extends zzgrq implements zzgtb {
    private static final zzgli zzb;
    private int zzd;

    static {
        zzgli zzgliVar = new zzgli();
        zzb = zzgliVar;
        zzgrq.zzaU(zzgli.class, zzgliVar);
    }

    private zzgli() {
    }

    public static zzglh zzc() {
        return (zzglh) zzb.zzaA();
    }

    public static zzgli zze() {
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
                    zzglg zzglgVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzglh(zzglgVar);
                }
                return new zzgli();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
