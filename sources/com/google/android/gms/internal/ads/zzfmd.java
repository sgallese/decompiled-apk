package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfmd extends zzgrq implements zzgtb {
    private static final zzfmd zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzflz zzh;

    static {
        zzfmd zzfmdVar = new zzfmd();
        zzb = zzfmdVar;
        zzgrq.zzaU(zzfmd.class, zzfmdVar);
    }

    private zzfmd() {
    }

    public static zzfmb zza() {
        return (zzfmb) zzb.zzaA();
    }

    public static /* synthetic */ zzfmd zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzfmd zzfmdVar, String str) {
        str.getClass();
        zzfmdVar.zzd |= 2;
        zzfmdVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzfmd zzfmdVar, zzflz zzflzVar) {
        zzflzVar.getClass();
        zzfmdVar.zzh = zzflzVar;
        zzfmdVar.zzd |= 8;
    }

    public static /* synthetic */ void zzf(zzfmd zzfmdVar, int i10) {
        zzfmdVar.zze = 1;
        zzfmdVar.zzd = 1 | zzfmdVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzfma zzfmaVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzfmb(zzfmaVar);
                }
                return new zzfmd();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfmc.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
