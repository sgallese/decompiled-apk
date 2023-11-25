package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaxw extends zzgrq implements zzgtb {
    private static final zzaxw zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzb = zzaxwVar;
        zzgrq.zzaU(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    public static zzaxv zza() {
        return (zzaxv) zzb.zzaA();
    }

    public static zzaxw zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzaxw zzaxwVar, boolean z10) {
        zzaxwVar.zzd |= 1;
        zzaxwVar.zze = z10;
    }

    public static /* synthetic */ void zzf(zzaxw zzaxwVar, int i10) {
        zzaxwVar.zzd |= 2;
        zzaxwVar.zzf = i10;
    }

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
                    return new zzaxv(zzaxlVar);
                }
                return new zzaxw();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
