package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfgl {
    private final Executor zza;
    private final zzcaf zzb;

    public zzfgl(Executor executor, zzcaf zzcafVar) {
        this.zza = executor;
        this.zzb = zzcafVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgk
            @Override // java.lang.Runnable
            public final void run() {
                zzfgl.this.zza(str);
            }
        });
    }
}
