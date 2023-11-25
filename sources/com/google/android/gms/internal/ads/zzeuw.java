package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeuw implements zzesj {
    final zzfyo zza;
    final String zzb;
    final zzbyx zzc;

    public zzeuw(zzbyx zzbyxVar, zzfyo zzfyoVar, String str) {
        this.zzc = zzbyxVar;
        this.zza = zzfyoVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        final com.google.common.util.concurrent.a zzh = zzfye.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfH)).booleanValue()) {
            zzh = zzfye.zzh(null);
        }
        final com.google.common.util.concurrent.a zzh2 = zzfye.zzh(null);
        return zzfye.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeux((String) com.google.common.util.concurrent.a.this.get(), (String) zzh2.get());
            }
        }, zzcan.zza);
    }
}
