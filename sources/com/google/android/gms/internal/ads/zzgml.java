package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgml extends zzgrq implements zzgtb {
    private static final zzgml zzb;
    private int zzd;
    private int zze;

    static {
        zzgml zzgmlVar = new zzgml();
        zzb = zzgmlVar;
        zzgrq.zzaU(zzgml.class, zzgmlVar);
    }

    private zzgml() {
    }

    public static zzgmk zzc() {
        return (zzgmk) zzb.zzaA();
    }

    public static zzgml zze() {
        return zzb;
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
                    zzgmj zzgmjVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgmk(zzgmjVar);
                }
                return new zzgml();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int i10 = this.zzd;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i11 = 5;
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                i11 = 0;
                            } else {
                                i11 = 7;
                            }
                        } else {
                            i11 = 6;
                        }
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
