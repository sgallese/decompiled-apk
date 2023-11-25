package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfjk {
    private final zzfkv zza;
    private final String zzb;
    private final zzfiw zzc;
    private final String zzd = "Ad overlay";

    public zzfjk(View view, zzfiw zzfiwVar, String str) {
        this.zza = new zzfkv(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfiwVar;
    }

    public final zzfiw zza() {
        return this.zzc;
    }

    public final zzfkv zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
