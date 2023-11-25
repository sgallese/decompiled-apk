package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzglx extends zzgrq implements zzgtb {
    private static final zzglx zzb;
    private int zzd;
    private zzgqi zze = zzgqi.zzb;

    static {
        zzglx zzglxVar = new zzglx();
        zzb = zzglxVar;
        zzgrq.zzaU(zzglx.class, zzglxVar);
    }

    private zzglx() {
    }

    public static zzglw zzc() {
        return (zzglw) zzb.zzaA();
    }

    public static zzglx zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglx) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public final int zza() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzglv zzglvVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzglw(zzglvVar);
                }
                return new zzglx();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgqi zzf() {
        return this.zze;
    }
}
