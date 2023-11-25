package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
final class zzbw implements zzdd {
    private static final zzbw zza = new zzbw();

    private zzbw() {
    }

    public static zzbw zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final zzdc zzb(Class cls) {
        if (zzcb.class.isAssignableFrom(cls)) {
            try {
                return (zzdc) zzcb.zzh(cls.asSubclass(zzcb.class)).zzu(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final boolean zzc(Class cls) {
        return zzcb.class.isAssignableFrom(cls);
    }
}
