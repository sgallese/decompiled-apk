package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgxo extends zzgrq implements zzgtb {
    private static final zzgxo zzb;
    private int zzd;
    private String zze = "";
    private zzgqi zzf = zzgqi.zzb;

    static {
        zzgxo zzgxoVar = new zzgxo();
        zzb = zzgxoVar;
        zzgrq.zzaU(zzgxo.class, zzgxoVar);
    }

    private zzgxo() {
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
                    return new zzgxn(zzgvkVar);
                }
                return new zzgxo();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}