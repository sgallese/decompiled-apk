package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzglo extends zzgrq implements zzgtb {
    private static final zzglo zzb;
    private int zzd;
    private int zze;

    static {
        zzglo zzgloVar = new zzglo();
        zzb = zzgloVar;
        zzgrq.zzaU(zzglo.class, zzgloVar);
    }

    private zzglo() {
    }

    public static zzgln zzd() {
        return (zzgln) zzb.zzaA();
    }

    public static zzglo zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglo) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
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
                    zzglm zzglmVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgln(zzglmVar);
                }
                return new zzglo();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
