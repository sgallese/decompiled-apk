package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbxh {
    private final Clock zza;
    private final zzbxf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxh(Clock clock, zzbxf zzbxfVar) {
        this.zza = clock;
        this.zzb = zzbxfVar;
    }

    public static zzbxh zza(Context context) {
        return zzbyg.zzd(context).zzb();
    }

    public final void zzb(int i10, long j10) {
        this.zzb.zzb(i10, j10);
    }

    public final void zzc() {
        this.zzb.zza();
    }

    public final void zzd(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }

    public final void zze() {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }
}
