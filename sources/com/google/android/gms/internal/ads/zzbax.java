package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbax extends zzgrq implements zzgtb {
    private static final zzbax zzb;
    private int zzd;
    private int zze = 1000;
    private zzbal zzf;

    static {
        zzbax zzbaxVar = new zzbax();
        zzb = zzbaxVar;
        zzgrq.zzaU(zzbax.class, zzbaxVar);
    }

    private zzbax() {
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
                    return new zzbaw(zzaxlVar);
                }
                return new zzbax();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzayr.zza, "zzf"});
        }
        return (byte) 1;
    }
}