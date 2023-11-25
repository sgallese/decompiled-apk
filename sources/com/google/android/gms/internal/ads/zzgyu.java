package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgyu implements zzgyt, zzgyn {
    private static final zzgyu zza = new zzgyu(null);
    private final Object zzb;

    private zzgyu(Object obj) {
        this.zzb = obj;
    }

    public static zzgyt zza(Object obj) {
        zzgzb.zza(obj, "instance cannot be null");
        return new zzgyu(obj);
    }

    public static zzgyt zzc(Object obj) {
        if (obj == null) {
            return zza;
        }
        return new zzgyu(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zzb;
    }
}
