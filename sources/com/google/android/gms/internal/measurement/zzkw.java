package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.1 */
/* loaded from: classes3.dex */
final class zzkw implements zzmg {
    private static final zzkw zza = new zzkw();

    private zzkw() {
    }

    public static zzkw zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final zzmf zzb(Class cls) {
        if (zzlb.class.isAssignableFrom(cls)) {
            try {
                return (zzmf) zzlb.zzbC(cls.asSubclass(zzlb.class)).zzl(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final boolean zzc(Class cls) {
        return zzlb.class.isAssignableFrom(cls);
    }
}
