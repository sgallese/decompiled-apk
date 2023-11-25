package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzdt {
    private static final zzds zza;
    private static final zzds zzb;

    static {
        zzds zzdsVar;
        try {
            zzdsVar = (zzds) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzdsVar = null;
        }
        zza = zzdsVar;
        zzb = new zzds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzds zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzds zzb() {
        return zzb;
    }
}
