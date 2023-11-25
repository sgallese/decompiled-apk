package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbap extends zzgrq implements zzgtb {
    private static final zzbap zzb;
    private int zzd;
    private int zze = 1000;
    private zzbal zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzbap zzbapVar = new zzbap();
        zzb = zzbapVar;
        zzgrq.zzaU(zzbap.class, zzbapVar);
    }

    private zzbap() {
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
                    return new zzbao(zzaxlVar);
                }
                return new zzbap();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", zzayr.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
