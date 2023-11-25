package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzpt {
    public final zzam zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdo zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;

    public zzpt(zzam zzamVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, zzdo zzdoVar, boolean z10, boolean z11) {
        this.zza = zzamVar;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzdoVar;
    }

    public final long zza(long j10) {
        return (j10 * 1000000) / this.zze;
    }

    public final AudioTrack zzb(boolean z10, zzk zzkVar, int i10) throws zzpa {
        AudioTrack audioTrack;
        AudioTrack.Builder audioAttributes;
        AudioTrack.Builder audioFormat;
        AudioTrack.Builder transferMode;
        AudioTrack.Builder bufferSizeInBytes;
        AudioTrack.Builder sessionId;
        boolean z11;
        AudioTrack.Builder offloadedPlayback;
        try {
            int i11 = zzfk.zza;
            if (i11 >= 29) {
                AudioFormat zzt = zzfk.zzt(this.zze, this.zzf, this.zzg);
                AudioAttributes audioAttributes2 = zzkVar.zza().zza;
                t2.a();
                audioAttributes = s2.a().setAudioAttributes(audioAttributes2);
                audioFormat = audioAttributes.setAudioFormat(zzt);
                transferMode = audioFormat.setTransferMode(1);
                bufferSizeInBytes = transferMode.setBufferSizeInBytes(this.zzh);
                sessionId = bufferSizeInBytes.setSessionId(i10);
                if (this.zzc == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z11);
                audioTrack = offloadedPlayback.build();
            } else if (i11 < 21) {
                int i12 = zzkVar.zzc;
                if (i10 == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i10);
                }
            } else {
                audioTrack = new AudioTrack(zzkVar.zza().zza, zzfk.zzt(this.zze, this.zzf, this.zzg), this.zzh, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpa(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new zzpa(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e10);
        }
    }

    public final boolean zzc() {
        if (this.zzc == 1) {
            return true;
        }
        return false;
    }
}
