package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzrf implements zzrs {
    private final zzfry zzb;
    private final zzfry zzc;

    public zzrf(int i10, boolean z10) {
        zzrd zzrdVar = new zzrd(i10);
        zzre zzreVar = new zzre(i10);
        this.zzb = zzrdVar;
        this.zzc = zzreVar;
    }

    public static /* synthetic */ HandlerThread zza(int i10) {
        String zzs;
        zzs = zzrh.zzs(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    public static /* synthetic */ HandlerThread zzb(int i10) {
        String zzs;
        zzs = zzrh.zzs(i10, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzrh zzc(zzrr zzrrVar) throws IOException {
        MediaCodec mediaCodec;
        zzrh zzrhVar;
        String str = zzrrVar.zza.zza;
        zzrh zzrhVar2 = null;
        try {
            int i10 = zzfk.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzrhVar = new zzrh(mediaCodec, zza(((zzrd) this.zzb).zza), zzb(((zzre) this.zzc).zza), false, null);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            zzrh.zzh(zzrhVar, zzrrVar.zzb, zzrrVar.zzd, null, 0);
            return zzrhVar;
        } catch (Exception e12) {
            e = e12;
            zzrhVar2 = zzrhVar;
            if (zzrhVar2 == null) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } else {
                zzrhVar2.zzl();
            }
            throw e;
        }
    }
}
