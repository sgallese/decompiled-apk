package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgkh extends zzgrq implements zzgtb {
    private static final zzgkh zzb;
    private int zzd;
    private int zze;
    private zzgkk zzf;

    static {
        zzgkh zzgkhVar = new zzgkh();
        zzb = zzgkhVar;
        zzgrq.zzaU(zzgkh.class, zzgkhVar);
    }

    private zzgkh() {
    }

    public static zzgkg zzc() {
        return (zzgkg) zzb.zzaA();
    }

    public static zzgkh zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkh) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public static /* synthetic */ void zzh(zzgkh zzgkhVar, zzgkk zzgkkVar) {
        zzgkkVar.getClass();
        zzgkhVar.zzf = zzgkkVar;
        zzgkhVar.zzd |= 1;
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
                    zzgkf zzgkfVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgkg(zzgkfVar);
                }
                return new zzgkh();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgkk zzf() {
        zzgkk zzgkkVar = this.zzf;
        if (zzgkkVar == null) {
            return zzgkk.zze();
        }
        return zzgkkVar;
    }
}
