package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzban extends zzgrq implements zzgtb {
    private static final zzban zzb;
    private int zzd;
    private zzbae zze;
    private int zzf = 1000;
    private zzbal zzg;
    private zzbac zzh;

    static {
        zzban zzbanVar = new zzban();
        zzb = zzbanVar;
        zzgrq.zzaU(zzban.class, zzbanVar);
    }

    private zzban() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzaxl zzaxlVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzbam(zzaxlVar);
                }
                return new zzban();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzayr.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
