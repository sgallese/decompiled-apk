package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehj {
    private zzehc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehj() {
    }

    private zzehj(zzehc zzehcVar) {
        this.zza = zzehcVar;
    }

    public static zzehj zzb(zzehc zzehcVar) {
        return new zzehj(zzehcVar);
    }

    public final zzehc zza(Clock clock, zzehd zzehdVar, zzeds zzedsVar, zzfik zzfikVar) {
        zzehc zzehcVar = this.zza;
        if (zzehcVar != null) {
            return zzehcVar;
        }
        return new zzehc(clock, zzehdVar, zzedsVar, zzfikVar);
    }
}
