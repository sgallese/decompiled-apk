package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfkl implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfko.zzc;
        if (handler != null) {
            handler2 = zzfko.zzc;
            runnable = zzfko.zzd;
            handler2.post(runnable);
            handler3 = zzfko.zzc;
            runnable2 = zzfko.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
