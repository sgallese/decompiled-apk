package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzrb {
    public static final boolean zza;

    static {
        boolean z10 = false;
        if ("Amazon".equals(zzfk.zzc)) {
            String str = zzfk.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            }
        }
        zza = z10;
    }
}
