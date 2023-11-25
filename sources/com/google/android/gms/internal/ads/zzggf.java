package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzggf {
    private static final zzggf zza = new zzggf();
    private static final zzgge zzb = new zzgge(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzggf zza() {
        return zza;
    }

    public final zzgjv zzb() {
        zzgjv zzgjvVar = (zzgjv) this.zzc.get();
        if (zzgjvVar == null) {
            return zzb;
        }
        return zzgjvVar;
    }
}
