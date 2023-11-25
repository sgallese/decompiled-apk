package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeva implements zzesj {
    final zzfyo zza;
    final List zzb;
    final zzbbc zzc;

    public zzeva(zzbbc zzbbcVar, zzfyo zzfyoVar, List list) {
        this.zzc = zzbbcVar;
        this.zza = zzfyoVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevb(zzeva.this.zzb);
            }
        });
    }
}
