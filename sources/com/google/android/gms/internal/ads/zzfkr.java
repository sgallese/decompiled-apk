package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfkr {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfkq zzd = null;

    public zzfkr() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfkq zzfkqVar = (zzfkq) this.zzc.poll();
        this.zzd = zzfkqVar;
        if (zzfkqVar != null) {
            zzfkqVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfkq zzfkqVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfkq zzfkqVar) {
        zzfkqVar.zzb(this);
        this.zzc.add(zzfkqVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
