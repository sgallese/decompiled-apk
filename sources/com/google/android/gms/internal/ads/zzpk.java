package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzpk {
    public static zzom zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return zzom.zza;
        }
        zzok zzokVar = new zzok();
        zzokVar.zza(true);
        zzokVar.zzc(z10);
        return zzokVar.zzd();
    }
}
