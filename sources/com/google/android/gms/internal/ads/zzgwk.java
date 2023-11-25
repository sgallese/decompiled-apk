package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgwk extends zzgrq implements zzgtb {
    private static final zzgwk zzb;
    private int zzd;
    private zzgwj zze;
    private zzgqi zzg;
    private zzgqi zzh;
    private int zzi;
    private byte zzj = 2;
    private zzgrz zzf = zzgrq.zzaN();

    static {
        zzgwk zzgwkVar = new zzgwk();
        zzb = zzgwkVar;
        zzgrq.zzaU(zzgwk.class, zzgwkVar);
    }

    private zzgwk() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zzg = zzgqiVar;
        this.zzh = zzgqiVar;
    }

    public static zzgwh zza() {
        return (zzgwh) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgwk zzgwkVar, zzgwg zzgwgVar) {
        zzgwgVar.getClass();
        zzgrz zzgrzVar = zzgwkVar.zzf;
        if (!zzgrzVar.zzc()) {
            zzgwkVar.zzf = zzgrq.zzaO(zzgrzVar);
        }
        zzgwkVar.zzf.add(zzgwgVar);
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
                            this.zzj = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgwh(zzgvkVar);
                }
                return new zzgwk();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgwg.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
