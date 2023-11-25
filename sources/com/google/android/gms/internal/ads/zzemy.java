package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzemy {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzemx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzemx zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzemx zzemxVar) {
        this.zzb = zzemxVar;
    }

    public final void zzc(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
