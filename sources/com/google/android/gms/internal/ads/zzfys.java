package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfws;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfys extends zzfws.zzi implements Runnable {
    private final Runnable zza;

    public zzfys(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e10) {
            zzd(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfws
    public final String zza() {
        return "task=[" + this.zza.toString() + "]";
    }
}
