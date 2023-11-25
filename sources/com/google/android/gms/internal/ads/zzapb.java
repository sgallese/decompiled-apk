package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzapb extends zzgrq implements zzgtb {
    private static final zzapb zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzapb zzapbVar = new zzapb();
        zzb = zzapbVar;
        zzgrq.zzaU(zzapb.class, zzapbVar);
    }

    private zzapb() {
    }

    public static zzapb zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzanu zzanuVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzapa(zzanuVar);
                }
                return new zzapb();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }
}
