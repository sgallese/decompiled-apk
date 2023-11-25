package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgmq extends zzgrq implements zzgtb {
    private static final zzgmq zzb;
    private String zzd = "";
    private zzgqi zze = zzgqi.zzb;
    private int zzf;

    static {
        zzgmq zzgmqVar = new zzgmq();
        zzb = zzgmqVar;
        zzgrq.zzaU(zzgmq.class, zzgmqVar);
    }

    private zzgmq() {
    }

    public static zzgmn zza() {
        return (zzgmn) zzb.zzaA();
    }

    public static zzgmq zze() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgmm zzgmmVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgmn(zzgmmVar);
                }
                return new zzgmq();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgmp zzc() {
        zzgmp zzgmpVar;
        int i10 = this.zzf;
        zzgmp zzgmpVar2 = zzgmp.UNKNOWN_KEYMATERIAL;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            zzgmpVar = null;
                        } else {
                            zzgmpVar = zzgmp.REMOTE;
                        }
                    } else {
                        zzgmpVar = zzgmp.ASYMMETRIC_PUBLIC;
                    }
                } else {
                    zzgmpVar = zzgmp.ASYMMETRIC_PRIVATE;
                }
            } else {
                zzgmpVar = zzgmp.SYMMETRIC;
            }
        } else {
            zzgmpVar = zzgmp.UNKNOWN_KEYMATERIAL;
        }
        if (zzgmpVar == null) {
            return zzgmp.UNRECOGNIZED;
        }
        return zzgmpVar;
    }

    public final zzgqi zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
