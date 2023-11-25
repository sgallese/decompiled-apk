package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaow extends zzgrq implements zzgtb {
    private static final zzaow zzb;
    private int zzd;
    private zzgqi zze;
    private zzgqi zzf;
    private zzgqi zzg;
    private zzgqi zzh;

    static {
        zzaow zzaowVar = new zzaow();
        zzb = zzaowVar;
        zzgrq.zzaU(zzaow.class, zzaowVar);
    }

    private zzaow() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zze = zzgqiVar;
        this.zzf = zzgqiVar;
        this.zzg = zzgqiVar;
        this.zzh = zzgqiVar;
    }

    public static zzaov zza() {
        return (zzaov) zzb.zzaA();
    }

    public static zzaow zzd(byte[] bArr, zzgrc zzgrcVar) throws zzgsc {
        return (zzaow) zzgrq.zzaI(zzb, bArr, zzgrcVar);
    }

    public static /* synthetic */ void zzi(zzaow zzaowVar, zzgqi zzgqiVar) {
        zzaowVar.zzd |= 1;
        zzaowVar.zze = zzgqiVar;
    }

    public static /* synthetic */ void zzj(zzaow zzaowVar, zzgqi zzgqiVar) {
        zzaowVar.zzd |= 2;
        zzaowVar.zzf = zzgqiVar;
    }

    public static /* synthetic */ void zzk(zzaow zzaowVar, zzgqi zzgqiVar) {
        zzaowVar.zzd |= 4;
        zzaowVar.zzg = zzgqiVar;
    }

    public static /* synthetic */ void zzl(zzaow zzaowVar, zzgqi zzgqiVar) {
        zzaowVar.zzd |= 8;
        zzaowVar.zzh = zzgqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzanu zzanuVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaov(zzanuVar);
                }
                return new zzaow();
            }
            return zzgrq.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgqi zze() {
        return this.zze;
    }

    public final zzgqi zzf() {
        return this.zzf;
    }

    public final zzgqi zzg() {
        return this.zzh;
    }

    public final zzgqi zzh() {
        return this.zzg;
    }
}
