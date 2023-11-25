package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgmf extends zzgrq implements zzgtb {
    private static final zzgmf zzb;
    private int zzd;
    private int zze;
    private zzgml zzf;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzgmf zzgmfVar = new zzgmf();
        zzb = zzgmfVar;
        zzgrq.zzaU(zzgmf.class, zzgmfVar);
    }

    private zzgmf() {
    }

    public static zzgme zzc() {
        return (zzgme) zzb.zzaA();
    }

    public static zzgmf zze() {
        return zzb;
    }

    public static zzgmf zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgmf) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgmf zzgmfVar, zzgml zzgmlVar) {
        zzgmlVar.getClass();
        zzgmfVar.zzf = zzgmlVar;
        zzgmfVar.zzd |= 1;
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
                    zzgmd zzgmdVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgme(zzgmdVar);
                }
                return new zzgmf();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgml zzg() {
        zzgml zzgmlVar = this.zzf;
        if (zzgmlVar == null) {
            return zzgml.zze();
        }
        return zzgmlVar;
    }

    public final zzgqi zzh() {
        return this.zzg;
    }
}
