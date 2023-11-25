package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbeb {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbdz zza() {
        return (zzbdz) zzb.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbea zzb() {
        return (zzbea) zzc.get();
    }

    public static void zzc(zzbdz zzbdzVar) {
        zzb.set(zzbdzVar);
    }
}
