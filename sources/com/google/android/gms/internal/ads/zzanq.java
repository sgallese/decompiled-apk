package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzanq extends zzgrq implements zzgtb {
    private static final zzanq zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzanq zzanqVar = new zzanq();
        zzb = zzanqVar;
        zzgrq.zzaU(zzanq.class, zzanqVar);
    }

    private zzanq() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzanm zzanmVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzanp(zzanmVar);
                }
                return new zzanq();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", zzanr.zza});
        }
        return (byte) 1;
    }
}
