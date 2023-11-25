package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgxi extends zzgrq implements zzgtb {
    private static final zzgxi zzb;
    private int zzd;
    private int zze;
    private zzgwk zzg;
    private zzgwo zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzgrv zzj = zzgrq.zzaJ();
    private String zzk = "";
    private zzgrz zzm = zzgrq.zzaN();

    static {
        zzgxi zzgxiVar = new zzgxi();
        zzb = zzgxiVar;
        zzgrq.zzaU(zzgxi.class, zzgxiVar);
    }

    private zzgxi() {
    }

    public static zzgxh zzc() {
        return (zzgxh) zzb.zzaA();
    }

    public static /* synthetic */ void zzf(zzgxi zzgxiVar, int i10) {
        zzgxiVar.zzd |= 1;
        zzgxiVar.zze = i10;
    }

    public static /* synthetic */ void zzg(zzgxi zzgxiVar, String str) {
        str.getClass();
        zzgxiVar.zzd |= 2;
        zzgxiVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzgxi zzgxiVar, zzgwk zzgwkVar) {
        zzgwkVar.getClass();
        zzgxiVar.zzg = zzgwkVar;
        zzgxiVar.zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzgxi zzgxiVar, String str) {
        str.getClass();
        zzgrz zzgrzVar = zzgxiVar.zzm;
        if (!zzgrzVar.zzc()) {
            zzgxiVar.zzm = zzgrq.zzaO(zzgrzVar);
        }
        zzgxiVar.zzm.add(str);
    }

    public static /* synthetic */ void zzj(zzgxi zzgxiVar, int i10) {
        zzgxiVar.zzl = i10 - 1;
        zzgxiVar.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgvk zzgvkVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (obj == null) {
                                b10 = 0;
                            }
                            this.zzn = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgxh(zzgvkVar);
                }
                return new zzgxi();
            }
            return zzgrq.zzaR(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgxf.zza, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    public final String zze() {
        return this.zzf;
    }
}
