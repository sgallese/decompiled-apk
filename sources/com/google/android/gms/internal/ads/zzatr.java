package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzatr extends zzgrq implements zzgtb {
    private static final zzatr zzb;
    private int zzd;
    private zzatu zze;
    private zzgqi zzf;
    private zzgqi zzg;

    static {
        zzatr zzatrVar = new zzatr();
        zzb = zzatrVar;
        zzgrq.zzaU(zzatr.class, zzatrVar);
    }

    private zzatr() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zzf = zzgqiVar;
        this.zzg = zzgqiVar;
    }

    public static zzatr zzc(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzatr) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzatp zzatpVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzatq(zzatpVar);
                }
                return new zzatr();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzatu zzd() {
        zzatu zzatuVar = this.zze;
        if (zzatuVar == null) {
            return zzatu.zzg();
        }
        return zzatuVar;
    }

    public final zzgqi zze() {
        return this.zzg;
    }

    public final zzgqi zzf() {
        return this.zzf;
    }
}
