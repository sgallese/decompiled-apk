package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgmv extends zzgrq implements zzgtb {
    private static final zzgmv zzb;
    private String zzd = "";
    private zzgqi zze = zzgqi.zzb;
    private int zzf;

    static {
        zzgmv zzgmvVar = new zzgmv();
        zzb = zzgmvVar;
        zzgrq.zzaU(zzgmv.class, zzgmvVar);
    }

    private zzgmv() {
    }

    public static zzgmu zza() {
        return (zzgmu) zzb.zzaA();
    }

    public static zzgmv zzd() {
        return zzb;
    }

    public static zzgmv zze(byte[] bArr, zzgrc zzgrcVar) throws zzgsc {
        return (zzgmv) zzgrq.zzaI(zzb, bArr, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgmt zzgmtVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgmu(zzgmtVar);
                }
                return new zzgmv();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgnw zzf() {
        zzgnw zzb2 = zzgnw.zzb(this.zzf);
        if (zzb2 == null) {
            return zzgnw.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final zzgqi zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzd;
    }
}
