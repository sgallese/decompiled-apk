package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbaa extends zzgrq implements zzgtb {
    private static final zzbaa zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzbac zzg;

    static {
        zzbaa zzbaaVar = new zzbaa();
        zzb = zzbaaVar;
        zzgrq.zzaU(zzbaa.class, zzbaaVar);
    }

    private zzbaa() {
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
                    return new zzazz(zzaxlVar);
                }
                return new zzbaa();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzayr.zza, "zzg"});
        }
        return (byte) 1;
    }
}
