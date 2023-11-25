package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgvj extends zzgrq implements zzgtb {
    private static final zzgvj zzb;
    private zzgrz zzd = zzgrq.zzaN();

    static {
        zzgvj zzgvjVar = new zzgvj();
        zzb = zzgvjVar;
        zzgrq.zzaU(zzgvj.class, zzgvjVar);
    }

    private zzgvj() {
    }

    public static zzgvi zza() {
        return (zzgvi) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgvj zzgvjVar, zzgvh zzgvhVar) {
        zzgvhVar.getClass();
        zzgrz zzgrzVar = zzgvjVar.zzd;
        if (!zzgrzVar.zzc()) {
            zzgvjVar.zzd = zzgrq.zzaO(zzgrzVar);
        }
        zzgvjVar.zzd.add(zzgvhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgvf zzgvfVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgvi(zzgvfVar);
                }
                return new zzgvj();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgvh.class});
        }
        return (byte) 1;
    }
}
