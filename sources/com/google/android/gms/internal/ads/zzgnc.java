package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgnc extends zzgrq implements zzgtb {
    private static final zzgnc zzb;
    private int zzd;
    private zzgmq zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgnc zzgncVar = new zzgnc();
        zzb = zzgncVar;
        zzgrq.zzaU(zzgnc.class, zzgncVar);
    }

    private zzgnc() {
    }

    public static zzgnb zzd() {
        return (zzgnb) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzgnc zzgncVar, zzgmq zzgmqVar) {
        zzgmqVar.getClass();
        zzgncVar.zze = zzgmqVar;
        zzgncVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgmz zzgmzVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnb(zzgmzVar);
                }
                return new zzgnc();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgmq zzc() {
        zzgmq zzgmqVar = this.zze;
        if (zzgmqVar == null) {
            return zzgmq.zze();
        }
        return zzgmqVar;
    }

    public final zzgnw zzf() {
        zzgnw zzb2 = zzgnw.zzb(this.zzh);
        if (zzb2 == null) {
            return zzgnw.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final boolean zzj() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int zzk() {
        int i10 = this.zzf;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 3;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
