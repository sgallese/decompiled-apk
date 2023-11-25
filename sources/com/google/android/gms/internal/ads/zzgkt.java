package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgkt extends zzgrq implements zzgtb {
    private static final zzgkt zzb;
    private int zzd;
    private int zze;
    private zzgkz zzf;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzgkt zzgktVar = new zzgkt();
        zzb = zzgktVar;
        zzgrq.zzaU(zzgkt.class, zzgktVar);
    }

    private zzgkt() {
    }

    public static zzgks zzc() {
        return (zzgks) zzb.zzaA();
    }

    public static zzgkt zze() {
        return zzb;
    }

    public static zzgkt zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkt) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgkt zzgktVar, zzgkz zzgkzVar) {
        zzgkzVar.getClass();
        zzgktVar.zzf = zzgkzVar;
        zzgktVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgkr zzgkrVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgks(zzgkrVar);
                }
                return new zzgkt();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgkz zzg() {
        zzgkz zzgkzVar = this.zzf;
        if (zzgkzVar == null) {
            return zzgkz.zze();
        }
        return zzgkzVar;
    }

    public final zzgqi zzh() {
        return this.zzg;
    }
}
