package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzpo {
    public static void zza(AudioTrack audioTrack, zzpq zzpqVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (zzpqVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = zzpqVar.zza;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
