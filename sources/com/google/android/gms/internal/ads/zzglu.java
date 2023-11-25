package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzglu extends zzgrq implements zzgtb {
    private static final zzglu zzb;
    private int zzd;
    private int zze;

    static {
        zzglu zzgluVar = new zzglu();
        zzb = zzgluVar;
        zzgrq.zzaU(zzglu.class, zzgluVar);
    }

    private zzglu() {
    }

    public static zzglt zzd() {
        return (zzglt) zzb.zzaA();
    }

    public static zzglu zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglu) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
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
                    zzgls zzglsVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzglt(zzglsVar);
                }
                return new zzglu();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
