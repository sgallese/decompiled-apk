package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzpl {
    public static zzom zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzom.zza;
        }
        zzok zzokVar = new zzok();
        boolean z11 = false;
        if (zzfk.zza > 32 && playbackOffloadSupport == 2) {
            z11 = true;
        }
        zzokVar.zza(true);
        zzokVar.zzb(z11);
        zzokVar.zzc(z10);
        return zzokVar.zzd();
    }
}
