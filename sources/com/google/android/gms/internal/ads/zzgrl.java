package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgrl implements zzgsy {
    private static final zzgrl zza = new zzgrl();

    private zzgrl() {
    }

    public static zzgrl zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final zzgsx zzb(Class cls) {
        if (zzgrq.class.isAssignableFrom(cls)) {
            try {
                return (zzgsx) zzgrq.zzaC(cls.asSubclass(zzgrq.class)).zzb(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final boolean zzc(Class cls) {
        return zzgrq.class.isAssignableFrom(cls);
    }
}
