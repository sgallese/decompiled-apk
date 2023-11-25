package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzgnz extends zzgrq implements zzgtb {
    private static final zzgnz zzb;
    private String zzd = "";
    private zzgrz zze = zzgrq.zzaN();

    static {
        zzgnz zzgnzVar = new zzgnz();
        zzb = zzgnzVar;
        zzgrq.zzaU(zzgnz.class, zzgnzVar);
    }

    private zzgnz() {
    }

    public static zzgnz zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgnx zzgnxVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgny(zzgnxVar);
                }
                return new zzgnz();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgmy.class});
        }
        return (byte) 1;
    }
}
