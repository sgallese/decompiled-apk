package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfcx {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfyo zzc;

    public zzfcx(Callable callable, zzfyo zzfyoVar) {
        this.zzb = callable;
        this.zzc = zzfyoVar;
    }

    public final synchronized com.google.common.util.concurrent.a zza() {
        zzc(1);
        return (com.google.common.util.concurrent.a) this.zza.poll();
    }

    public final synchronized void zzb(com.google.common.util.concurrent.a aVar) {
        this.zza.addFirst(aVar);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
