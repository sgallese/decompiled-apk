package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaxs extends zzgrq implements zzgtb {
    private static final zzaxs zzb;
    private int zzd;
    private int zze;
    private zzaxw zzf;
    private zzaxy zzg;

    static {
        zzaxs zzaxsVar = new zzaxs();
        zzb = zzaxsVar;
        zzgrq.zzaU(zzaxs.class, zzaxsVar);
    }

    private zzaxs() {
    }

    public static zzaxr zza() {
        return (zzaxr) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzaxs zzaxsVar, zzaxw zzaxwVar) {
        zzaxwVar.getClass();
        zzaxsVar.zzf = zzaxwVar;
        zzaxsVar.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzaxs zzaxsVar, zzaxy zzaxyVar) {
        zzaxyVar.getClass();
        zzaxsVar.zzg = zzaxyVar;
        zzaxsVar.zzd |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzaxs zzaxsVar, int i10) {
        zzaxsVar.zze = 1;
        zzaxsVar.zzd = 1 | zzaxsVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i10, Object obj, Object obj2) {
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
                    return new zzaxr(zzaxlVar);
                }
                return new zzaxs();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzaxu.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
