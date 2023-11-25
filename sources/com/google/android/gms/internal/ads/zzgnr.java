package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgnr extends zzgrq implements zzgtb {
    private static final zzgnr zzb;
    private int zzd;
    private int zze;
    private zzgnu zzf;

    static {
        zzgnr zzgnrVar = new zzgnr();
        zzb = zzgnrVar;
        zzgrq.zzaU(zzgnr.class, zzgnrVar);
    }

    private zzgnr() {
    }

    public static zzgnq zzc() {
        return (zzgnq) zzb.zzaA();
    }

    public static zzgnr zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgnr) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgnr zzgnrVar, zzgnu zzgnuVar) {
        zzgnuVar.getClass();
        zzgnrVar.zzf = zzgnuVar;
        zzgnrVar.zzd |= 1;
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
                    zzgnp zzgnpVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnq(zzgnpVar);
                }
                return new zzgnr();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgnu zzf() {
        zzgnu zzgnuVar = this.zzf;
        if (zzgnuVar == null) {
            return zzgnu.zzd();
        }
        return zzgnuVar;
    }
}
