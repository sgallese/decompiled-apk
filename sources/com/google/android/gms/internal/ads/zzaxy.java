package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaxy extends zzgrq implements zzgtb {
    private static final zzaxy zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzaxy zzaxyVar = new zzaxy();
        zzb = zzaxyVar;
        zzgrq.zzaU(zzaxy.class, zzaxyVar);
    }

    private zzaxy() {
    }

    public static zzaxx zza() {
        return (zzaxx) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaxy zzaxyVar, boolean z10) {
        zzaxyVar.zzd |= 1;
        zzaxyVar.zze = z10;
    }

    public static /* synthetic */ void zze(zzaxy zzaxyVar, boolean z10) {
        zzaxyVar.zzd |= 2;
        zzaxyVar.zzf = z10;
    }

    public static /* synthetic */ void zzf(zzaxy zzaxyVar, int i10) {
        zzaxyVar.zzd |= 4;
        zzaxyVar.zzg = i10;
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
                    return new zzaxx(zzaxlVar);
                }
                return new zzaxy();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
