package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgnu extends zzgrq implements zzgtb {
    private static final zzgnu zzb;
    private int zzd;
    private String zze = "";
    private zzgmv zzf;

    static {
        zzgnu zzgnuVar = new zzgnu();
        zzb = zzgnuVar;
        zzgrq.zzaU(zzgnu.class, zzgnuVar);
    }

    private zzgnu() {
    }

    public static zzgnu zzd() {
        return zzb;
    }

    public static zzgnu zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgnu) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public final zzgmv zza() {
        zzgmv zzgmvVar = this.zzf;
        if (zzgmvVar == null) {
            return zzgmv.zzd();
        }
        return zzgmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgns zzgnsVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnt(zzgnsVar);
                }
                return new zzgnu();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }
}
