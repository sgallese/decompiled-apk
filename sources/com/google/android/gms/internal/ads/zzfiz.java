package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfiz {
    private final String zza;
    private final String zzb;

    private zzfiz(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfiz zza(String str, String str2) {
        zzfke.zza(str, "Name is null or empty");
        zzfke.zza(str2, "Version is null or empty");
        return new zzfiz(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
