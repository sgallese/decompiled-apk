package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzoi {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int zza(int i10, int i11) {
        boolean isDirectPlaybackSupported;
        for (int i12 = 10; i12 > 0; i12--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(zzfk.zzg(i12)).build(), zza);
            if (isDirectPlaybackSupported) {
                return i12;
            }
        }
        return 0;
    }

    public static zzfud<Integer> zzb() {
        zzfug zzfugVar;
        boolean isDirectPlaybackSupported;
        zzfua zzfuaVar = new zzfua();
        zzfugVar = zzoj.zzc;
        zzfwd it = zzfugVar.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zzfk.zza >= zzfk.zzf(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zza);
                if (isDirectPlaybackSupported) {
                    zzfuaVar.zzf(Integer.valueOf(intValue));
                }
            }
        }
        zzfuaVar.zzf((Object) 2);
        return zzfuaVar.zzi();
    }
}
