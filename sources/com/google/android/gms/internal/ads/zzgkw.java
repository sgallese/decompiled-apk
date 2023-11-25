package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgkw extends zzgrq implements zzgtb {
    private static final zzgkw zzb;
    private int zzd;
    private zzgkz zze;
    private int zzf;

    static {
        zzgkw zzgkwVar = new zzgkw();
        zzb = zzgkwVar;
        zzgrq.zzaU(zzgkw.class, zzgkwVar);
    }

    private zzgkw() {
    }

    public static zzgkv zzc() {
        return (zzgkv) zzb.zzaA();
    }

    public static zzgkw zze() {
        return zzb;
    }

    public static zzgkw zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkw) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public static /* synthetic */ void zzh(zzgkw zzgkwVar, zzgkz zzgkzVar) {
        zzgkzVar.getClass();
        zzgkwVar.zze = zzgkzVar;
        zzgkwVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgku zzgkuVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgkv(zzgkuVar);
                }
                return new zzgkw();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgkz zzg() {
        zzgkz zzgkzVar = this.zze;
        if (zzgkzVar == null) {
            return zzgkz.zze();
        }
        return zzgkzVar;
    }
}
