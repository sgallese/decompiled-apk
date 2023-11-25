package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzazi extends zzgrq implements zzgtb {
    private static final zzazi zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazi zzaziVar = new zzazi();
        zzb = zzaziVar;
        zzgrq.zzaU(zzazi.class, zzaziVar);
    }

    private zzazi() {
    }

    public static zzazb zza() {
        return (zzazb) zzb.zzaA();
    }

    public static zzazi zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzi(zzazi zzaziVar, int i10) {
        zzaziVar.zze = i10 - 1;
        zzaziVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzazi zzaziVar, int i10) {
        zzaziVar.zzf = i10 - 1;
        zzaziVar.zzd |= 2;
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
                    return new zzazb(zzaxlVar);
                }
                return new zzazi();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzazg.zza, "zzf", zzazd.zza});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzf() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int zzg() {
        int zza = zzaze.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzazh.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
