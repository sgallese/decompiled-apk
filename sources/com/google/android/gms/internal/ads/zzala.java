package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzala implements Runnable {
    final /* synthetic */ zzalp zza;
    final /* synthetic */ zzalb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzala(zzalb zzalbVar, zzalp zzalpVar) {
        this.zzb = zzalbVar;
        this.zza = zzalpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
