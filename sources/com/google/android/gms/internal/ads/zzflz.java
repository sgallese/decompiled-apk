package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzflz extends zzgrq implements zzgtb {
    private static final zzgrw zzb = new zzflw();
    private static final zzflz zzd;
    private int zze;
    private zzgrv zzf = zzgrq.zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzflz zzflzVar = new zzflz();
        zzd = zzflzVar;
        zzgrq.zzaU(zzflz.class, zzflzVar);
    }

    private zzflz() {
    }

    public static zzfly zza() {
        return (zzfly) zzd.zzaA();
    }

    public static /* synthetic */ void zzd(zzflz zzflzVar, String str) {
        str.getClass();
        zzflzVar.zze |= 1;
        zzflzVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzflz zzflzVar, int i10) {
        zzgrv zzgrvVar = zzflzVar.zzf;
        if (!zzgrvVar.zzc()) {
            zzflzVar.zzf = zzgrq.zzaK(zzgrvVar);
        }
        zzflzVar.zzf.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzflw zzflwVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new zzfly(zzflwVar);
                }
                return new zzflz();
            }
            return zzgrq.zzaR(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzflx.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
