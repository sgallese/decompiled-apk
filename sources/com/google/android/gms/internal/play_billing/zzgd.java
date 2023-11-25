package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzgd extends zzcb implements zzdg {
    private static final zzgd zzb;
    private int zzd;
    private int zze;

    static {
        zzgd zzgdVar = new zzgd();
        zzb = zzgdVar;
        zzcb.zzp(zzgd.class, zzgdVar);
    }

    private zzgd() {
    }

    public static zzgd zzw() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcb
    protected final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzga zzgaVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgb(zzgaVar);
                }
                return new zzgd();
            }
            return zzcb.zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzgc.zza});
        }
        return (byte) 1;
    }
}
