package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgni extends zzgrq implements zzgtb {
    private static final zzgni zzb;
    private int zzd;
    private zzgrz zze = zzgrq.zzaN();

    static {
        zzgni zzgniVar = new zzgni();
        zzb = zzgniVar;
        zzgrq.zzaU(zzgni.class, zzgniVar);
    }

    private zzgni() {
    }

    public static zzgnf zza() {
        return (zzgnf) zzb.zzaA();
    }

    public static /* synthetic */ void zze(zzgni zzgniVar, zzgnh zzgnhVar) {
        zzgnhVar.getClass();
        zzgrz zzgrzVar = zzgniVar.zze;
        if (!zzgrzVar.zzc()) {
            zzgniVar.zze = zzgrq.zzaO(zzgrzVar);
        }
        zzgniVar.zze.add(zzgnhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgne zzgneVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnf(zzgneVar);
                }
                return new zzgni();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgnh.class});
        }
        return (byte) 1;
    }
}
