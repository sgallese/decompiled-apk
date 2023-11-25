package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgwj extends zzgrq implements zzgtb {
    private static final zzgwj zzb;
    private int zzd;
    private zzgqi zze;
    private zzgqi zzf;
    private zzgqi zzg;

    static {
        zzgwj zzgwjVar = new zzgwj();
        zzb = zzgwjVar;
        zzgrq.zzaU(zzgwj.class, zzgwjVar);
    }

    private zzgwj() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zze = zzgqiVar;
        this.zzf = zzgqiVar;
        this.zzg = zzgqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgvk zzgvkVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgwi(zzgvkVar);
                }
                return new zzgwj();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
