package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzbu {
    static final zzbu zza = new zzbu(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzbu() {
        this.zzd = new HashMap();
    }

    public static zzbu zza() {
        return zza;
    }

    public final zzcf zzb(zzdn zzdnVar, int i10) {
        return (zzcf) this.zzd.get(new zzbt(zzdnVar, i10));
    }

    zzbu(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
