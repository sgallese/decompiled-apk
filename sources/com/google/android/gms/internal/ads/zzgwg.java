package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgwg extends zzgrq implements zzgtb {
    private static final zzgwg zzb;
    private int zzd;
    private zzgqi zze;
    private zzgqi zzf;
    private byte zzg = 2;

    static {
        zzgwg zzgwgVar = new zzgwg();
        zzb = zzgwgVar;
        zzgrq.zzaU(zzgwg.class, zzgwgVar);
    }

    private zzgwg() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zze = zzgqiVar;
        this.zzf = zzgqiVar;
    }

    public static zzgwf zza() {
        return (zzgwf) zzb.zzaA();
    }

    public static /* synthetic */ zzgwg zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzgwg zzgwgVar, zzgqi zzgqiVar) {
        zzgwgVar.zzd |= 1;
        zzgwgVar.zze = zzgqiVar;
    }

    public static /* synthetic */ void zze(zzgwg zzgwgVar, zzgqi zzgqiVar) {
        zzgwgVar.zzd |= 2;
        zzgwgVar.zzf = zzgqiVar;
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
                            this.zzg = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgwf(zzgvkVar);
                }
                return new zzgwg();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
