package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfdd implements zzgyt {
    private final zzfdc zza;

    public zzfdd(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgzb.zzb(defaultClock);
        return defaultClock;
    }
}
