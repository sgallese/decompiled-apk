package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgyl {
    public static zzgyl zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzgyg(cls.getSimpleName());
        }
        return new zzgyi(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
