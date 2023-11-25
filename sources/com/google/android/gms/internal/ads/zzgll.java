package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgll extends zzgrq implements zzgtb {
    private static final zzgll zzb;
    private int zzd;
    private zzgqi zze = zzgqi.zzb;

    static {
        zzgll zzgllVar = new zzgll();
        zzb = zzgllVar;
        zzgrq.zzaU(zzgll.class, zzgllVar);
    }

    private zzgll() {
    }

    public static zzglk zzc() {
        return (zzglk) zzb.zzaA();
    }

    public static zzgll zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgll) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
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
                    zzglj zzgljVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzglk(zzgljVar);
                }
                return new zzgll();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgqi zzf() {
        return this.zze;
    }
}
