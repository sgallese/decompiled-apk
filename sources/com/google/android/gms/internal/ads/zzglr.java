package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzglr extends zzgrq implements zzgtb {
    private static final zzglr zzb;
    private int zzd;
    private zzgqi zze = zzgqi.zzb;

    static {
        zzglr zzglrVar = new zzglr();
        zzb = zzglrVar;
        zzgrq.zzaU(zzglr.class, zzglrVar);
    }

    private zzglr() {
    }

    public static zzglq zzc() {
        return (zzglq) zzb.zzaA();
    }

    public static zzglr zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglr) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public final int zza() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzglp zzglpVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzglq(zzglpVar);
                }
                return new zzglr();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgqi zzf() {
        return this.zze;
    }
}
