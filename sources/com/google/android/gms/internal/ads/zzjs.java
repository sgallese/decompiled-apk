package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzjs {
    public static zzoh zza(Context context, zzkb zzkbVar, boolean z10) {
        LogSessionId logSessionId;
        zzod zzb = zzod.zzb(context);
        if (zzb == null) {
            zzes.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zzoh(logSessionId);
        }
        if (z10) {
            zzkbVar.zzz(zzb);
        }
        return new zzoh(zzb.zza());
    }
}
