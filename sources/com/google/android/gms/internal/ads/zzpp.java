package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzpp {
    public static void zza(AudioTrack audioTrack, zzoh zzohVar) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId zza = zzohVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
