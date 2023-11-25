package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfib extends zzgrq implements zzgtb {
    private static final zzfib zzb;
    private int zzd;
    private zzfhx zze;

    static {
        zzfib zzfibVar = new zzfib();
        zzb = zzfibVar;
        zzgrq.zzaU(zzfib.class, zzfibVar);
    }

    private zzfib() {
    }

    public static zzfia zza() {
        return (zzfia) zzb.zzaA();
    }

    public static /* synthetic */ zzfib zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzfib zzfibVar, zzfhx zzfhxVar) {
        zzfhxVar.getClass();
        zzfibVar.zze = zzfhxVar;
        zzfibVar.zzd |= 1;
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
                    return new zzfia(zzfhyVar);
                }
                return new zzfib();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
