package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeoj implements zzesj {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzesj zzc;
    private final long zzd;

    public zzeoj(zzesj zzesjVar, long j10, Clock clock) {
        this.zzb = clock;
        this.zzc = zzesjVar;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        zzeoi zzeoiVar = (zzeoi) this.zza.get();
        if (zzeoiVar == null || zzeoiVar.zza()) {
            zzeoiVar = new zzeoi(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzeoiVar);
        }
        return zzeoiVar.zza;
    }
}
