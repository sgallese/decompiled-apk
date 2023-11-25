package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfic extends zzgrq implements zzgtb {
    private static final zzfic zzb;
    private zzgrz zzd = zzgrq.zzaN();

    static {
        zzfic zzficVar = new zzfic();
        zzb = zzficVar;
        zzgrq.zzaU(zzfic.class, zzficVar);
    }

    private zzfic() {
    }

    public static zzfhz zzc() {
        return (zzfhz) zzb.zzaA();
    }

    public static /* synthetic */ zzfic zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzfic zzficVar) {
        zzficVar.zzd = zzgrq.zzaN();
    }

    public static /* synthetic */ void zzf(zzfic zzficVar, zzfib zzfibVar) {
        zzfibVar.getClass();
        zzgrz zzgrzVar = zzficVar.zzd;
        if (!zzgrzVar.zzc()) {
            zzficVar.zzd = zzgrq.zzaO(zzgrzVar);
        }
        zzficVar.zzd.add(zzfibVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzfhy zzfhyVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzfhz(zzfhyVar);
                }
                return new zzfic();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfib.class});
        }
        return (byte) 1;
    }
}
