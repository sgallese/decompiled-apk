package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzglc extends zzgrq implements zzgtb {
    private static final zzglc zzb;
    private int zzd;
    private int zze;
    private zzgli zzf;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzglc zzglcVar = new zzglc();
        zzb = zzglcVar;
        zzgrq.zzaU(zzglc.class, zzglcVar);
    }

    private zzglc() {
    }

    public static zzglb zzc() {
        return (zzglb) zzb.zzaA();
    }

    public static zzglc zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglc) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzglc zzglcVar, zzgli zzgliVar) {
        zzgliVar.getClass();
        zzglcVar.zzf = zzgliVar;
        zzglcVar.zzd |= 1;
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
                    zzgla zzglaVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzglb(zzglaVar);
                }
                return new zzglc();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgli zzf() {
        zzgli zzgliVar = this.zzf;
        if (zzgliVar == null) {
            return zzgli.zze();
        }
        return zzgliVar;
    }

    public final zzgqi zzg() {
        return this.zzg;
    }
}
