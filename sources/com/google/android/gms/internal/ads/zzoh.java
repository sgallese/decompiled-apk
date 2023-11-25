package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzoh {
    public static final zzoh zza;
    private final zzog zzb;

    static {
        zzoh zzohVar;
        if (zzfk.zza < 31) {
            zzohVar = new zzoh();
        } else {
            zzohVar = new zzoh(zzog.zza);
        }
        zza = zzohVar;
    }

    private zzoh(zzog zzogVar) {
        this.zzb = zzogVar;
    }

    public final LogSessionId zza() {
        zzog zzogVar = this.zzb;
        zzogVar.getClass();
        return zzogVar.zzb;
    }

    public zzoh() {
        this.zzb = null;
        zzdy.zzf(zzfk.zza < 31);
    }

    public zzoh(LogSessionId logSessionId) {
        this.zzb = new zzog(logSessionId);
    }
}
