package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbzb {
    final /* synthetic */ zzbzc zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbzb(zzbzc zzbzcVar) {
        this.zza = zzbzcVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        Clock clock;
        clock = this.zza.zza;
        this.zzc = clock.elapsedRealtime();
    }

    public final void zzd() {
        Clock clock;
        clock = this.zza.zza;
        this.zzb = clock.elapsedRealtime();
    }
}