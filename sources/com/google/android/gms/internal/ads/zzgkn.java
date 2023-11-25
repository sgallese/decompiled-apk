package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgkn extends zzgrq implements zzgtb {
    private static final zzgkn zzb;
    private int zzd;
    private int zze;
    private zzgkt zzf;
    private zzgmf zzg;

    static {
        zzgkn zzgknVar = new zzgkn();
        zzb = zzgknVar;
        zzgrq.zzaU(zzgkn.class, zzgknVar);
    }

    private zzgkn() {
    }

    public static zzgkm zzc() {
        return (zzgkm) zzb.zzaA();
    }

    public static zzgkn zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkn) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public static /* synthetic */ void zzi(zzgkn zzgknVar, zzgkt zzgktVar) {
        zzgktVar.getClass();
        zzgknVar.zzf = zzgktVar;
        zzgknVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzgkn zzgknVar, zzgmf zzgmfVar) {
        zzgmfVar.getClass();
        zzgknVar.zzg = zzgmfVar;
        zzgknVar.zzd |= 2;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgkl zzgklVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgkm(zzgklVar);
                }
                return new zzgkn();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgkt zzf() {
        zzgkt zzgktVar = this.zzf;
        if (zzgktVar == null) {
            return zzgkt.zze();
        }
        return zzgktVar;
    }

    public final zzgmf zzg() {
        zzgmf zzgmfVar = this.zzg;
        if (zzgmfVar == null) {
            return zzgmf.zze();
        }
        return zzgmfVar;
    }
}
