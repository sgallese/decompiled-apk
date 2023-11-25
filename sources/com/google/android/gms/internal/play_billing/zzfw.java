package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzfw extends zzcb implements zzdg {
    private static final zzfw zzb;
    private int zzd;
    private int zze;

    static {
        zzfw zzfwVar = new zzfw();
        zzb = zzfwVar;
        zzcb.zzp(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfu zzv() {
        return (zzfu) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zzfw zzfwVar, int i10) {
        zzfwVar.zze = i10 - 1;
        zzfwVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcb
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzft zzftVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzfu(zzftVar);
                }
                return new zzfw();
            }
            return zzcb.zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzfv.zza});
        }
        return (byte) 1;
    }
}
