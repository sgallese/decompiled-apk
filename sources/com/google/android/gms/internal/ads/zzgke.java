package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgke extends zzgrq implements zzgtb {
    private static final zzgke zzb;
    private int zzd;
    private int zze;
    private zzgqi zzf = zzgqi.zzb;
    private zzgkk zzg;

    static {
        zzgke zzgkeVar = new zzgke();
        zzb = zzgkeVar;
        zzgrq.zzaU(zzgke.class, zzgkeVar);
    }

    private zzgke() {
    }

    public static zzgkd zzc() {
        return (zzgkd) zzb.zzaA();
    }

    public static zzgke zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgke) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgke zzgkeVar, zzgkk zzgkkVar) {
        zzgkkVar.getClass();
        zzgkeVar.zzg = zzgkkVar;
        zzgkeVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgkc zzgkcVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgkd(zzgkcVar);
                }
                return new zzgke();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgkk zzf() {
        zzgkk zzgkkVar = this.zzg;
        if (zzgkkVar == null) {
            return zzgkk.zze();
        }
        return zzgkkVar;
    }

    public final zzgqi zzg() {
        return this.zzf;
    }
}
