package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzdj {
    private static final zzdi zza;
    private static final zzdi zzb;

    static {
        zzdi zzdiVar;
        try {
            zzdiVar = (zzdi) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzdiVar = null;
        }
        zza = zzdiVar;
        zzb = new zzdi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdi zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdi zzb() {
        return zzb;
    }
}
