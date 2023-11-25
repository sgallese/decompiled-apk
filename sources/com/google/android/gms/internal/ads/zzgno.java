package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgno extends zzgrq implements zzgtb {
    private static final zzgno zzb;
    private String zzd = "";

    static {
        zzgno zzgnoVar = new zzgno();
        zzb = zzgnoVar;
        zzgrq.zzaU(zzgno.class, zzgnoVar);
    }

    private zzgno() {
    }

    public static zzgno zzc() {
        return zzb;
    }

    public static zzgno zzd(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgno) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgnm zzgnmVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnn(zzgnmVar);
                }
                return new zzgno();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final String zze() {
        return this.zzd;
    }
}
