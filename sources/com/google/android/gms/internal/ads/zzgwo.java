package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgwo extends zzgrq implements zzgtb {
    private static final zzgwo zzb;
    private int zzd;
    private zzgwn zze;
    private zzgqi zzg;
    private zzgqi zzh;
    private int zzi;
    private zzgqi zzj;
    private byte zzk = 2;
    private zzgrz zzf = zzgrq.zzaN();

    static {
        zzgwo zzgwoVar = new zzgwo();
        zzb = zzgwoVar;
        zzgrq.zzaU(zzgwo.class, zzgwoVar);
    }

    private zzgwo() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zzg = zzgqiVar;
        this.zzh = zzgqiVar;
        this.zzj = zzgqiVar;
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
                            this.zzk = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgwl(zzgvkVar);
                }
                return new zzgwo();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgwg.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
