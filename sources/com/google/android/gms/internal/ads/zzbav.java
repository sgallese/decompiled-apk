package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbav extends zzgrq implements zzgtb {
    private static final zzbav zzb;
    private int zzd;
    private int zze = 1000;
    private zzbal zzf;
    private zzbac zzg;

    static {
        zzbav zzbavVar = new zzbav();
        zzb = zzbavVar;
        zzgrq.zzaU(zzbav.class, zzbavVar);
    }

    private zzbav() {
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
                    return new zzbau(zzaxlVar);
                }
                return new zzbav();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzayr.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
