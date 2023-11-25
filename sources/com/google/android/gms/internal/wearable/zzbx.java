package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzbx {
    private static final zzbv zza = new zzbw();
    private static final zzbv zzb;

    static {
        zzbv zzbvVar;
        try {
            zzbvVar = (zzbv) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzbvVar = null;
        }
        zzb = zzbvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbv zza() {
        zzbv zzbvVar = zzb;
        if (zzbvVar != null) {
            return zzbvVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbv zzb() {
        return zza;
    }
}
