package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzemd implements zzesj {
    private final Clock zza;
    private final zzfca zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemd(Clock clock, zzfca zzfcaVar) {
        this.zza = clock;
        this.zzb = zzfcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return zzfye.zzh(new zzeme(this.zzb, this.zza.currentTimeMillis()));
    }
}
