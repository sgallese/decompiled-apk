package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgxc extends zzgrq implements zzgtb {
    private static final zzgxc zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgqi zzg;
    private zzgqi zzh;

    static {
        zzgxc zzgxcVar = new zzgxc();
        zzb = zzgxcVar;
        zzgrq.zzaU(zzgxc.class, zzgxcVar);
    }

    private zzgxc() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zzg = zzgqiVar;
        this.zzh = zzgqiVar;
    }

    public static zzgxa zza() {
        return (zzgxa) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgxc zzgxcVar, String str) {
        zzgxcVar.zzd |= 2;
        zzgxcVar.zzf = "image/png";
    }

    public static /* synthetic */ void zze(zzgxc zzgxcVar, zzgqi zzgqiVar) {
        zzgqiVar.getClass();
        zzgxcVar.zzd |= 4;
        zzgxcVar.zzg = zzgqiVar;
    }

    public static /* synthetic */ void zzf(zzgxc zzgxcVar, int i10) {
        zzgxcVar.zze = 1;
        zzgxcVar.zzd = 1 | zzgxcVar.zzd;
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
                    return new zzgxa(zzgvkVar);
                }
                return new zzgxc();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgxb.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
