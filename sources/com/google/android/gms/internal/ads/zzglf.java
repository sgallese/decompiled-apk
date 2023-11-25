package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzglf extends zzgrq implements zzgtb {
    private static final zzglf zzb;
    private int zzd;
    private zzgli zze;
    private int zzf;

    static {
        zzglf zzglfVar = new zzglf();
        zzb = zzglfVar;
        zzgrq.zzaU(zzglf.class, zzglfVar);
    }

    private zzglf() {
    }

    public static zzgle zzc() {
        return (zzgle) zzb.zzaA();
    }

    public static zzglf zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglf) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public static /* synthetic */ void zzg(zzglf zzglfVar, zzgli zzgliVar) {
        zzgliVar.getClass();
        zzglfVar.zze = zzgliVar;
        zzglfVar.zzd |= 1;
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
                    zzgld zzgldVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgle(zzgldVar);
                }
                return new zzglf();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgli zzf() {
        zzgli zzgliVar = this.zze;
        if (zzgliVar == null) {
            return zzgli.zze();
        }
        return zzgliVar;
    }
}
