package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaxz extends zzgrq implements zzgtb {
    private static final zzaxz zzb;
    private zzgrz zzd = zzgrq.zzaN();

    static {
        zzaxz zzaxzVar = new zzaxz();
        zzb = zzaxzVar;
        zzgrq.zzaU(zzaxz.class, zzaxzVar);
    }

    private zzaxz() {
    }

    public static zzaxt zza() {
        return (zzaxt) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzaxz zzaxzVar, zzaxs zzaxsVar) {
        zzaxsVar.getClass();
        zzgrz zzgrzVar = zzaxzVar.zzd;
        if (!zzgrzVar.zzc()) {
            zzaxzVar.zzd = zzgrq.zzaO(zzgrzVar);
        }
        zzaxzVar.zzd.add(zzaxsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzaxl zzaxlVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaxt(zzaxlVar);
                }
                return new zzaxz();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzaxs.class});
        }
        return (byte) 1;
    }
}
