package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzxq {
    private final Handler zza;
    private final zzxs zzb;
    private boolean zzc;

    public zzxq(Handler handler, zzxs zzxsVar) {
        this.zza = handler;
        this.zzb = zzxsVar;
    }

    public final void zzc() {
        this.zzc = true;
    }
}
