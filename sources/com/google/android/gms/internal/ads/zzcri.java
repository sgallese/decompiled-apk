package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzcri implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcri(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcrk.zzi(this.zza);
    }
}
