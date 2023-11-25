package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbct {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzfhr zze;
    private final zzbcv zzf;

    public zzbct(Context context, ScheduledExecutorService scheduledExecutorService, zzbcv zzbcvVar, zzfhr zzfhrVar) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbcvVar;
        this.zze = zzfhrVar;
    }

    public final com.google.common.util.concurrent.a zza() {
        return (zzfxv) zzfye.zzo(zzfxv.zzu(zzfye.zzh(null)), ((Long) zzbdj.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.zzb.getEventTime()) {
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}
