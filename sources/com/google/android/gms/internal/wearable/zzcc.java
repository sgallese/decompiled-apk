package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzcc implements zzdl {
    private static final zzcc zza = new zzcc();

    private zzcc() {
    }

    public static zzcc zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.wearable.zzdl
    public final zzdk zzb(Class cls) {
        if (zzcg.class.isAssignableFrom(cls)) {
            try {
                return (zzdk) zzcg.zzO(cls.asSubclass(zzcg.class)).zzG(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.wearable.zzdl
    public final boolean zzc(Class cls) {
        return zzcg.class.isAssignableFrom(cls);
    }
}
