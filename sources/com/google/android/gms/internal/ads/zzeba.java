package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeba {
    private final zzeaw zza;
    private final zzfyo zzb;

    public zzeba(zzeaw zzeawVar, zzfyo zzfyoVar) {
        this.zza = zzeawVar;
        this.zzb = zzfyoVar;
    }

    public final void zza(zzffh zzffhVar) {
        zzfyo zzfyoVar = this.zzb;
        final zzeaw zzeawVar = this.zza;
        zzfye.zzr(zzfyoVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeay
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeaw.this.getWritableDatabase();
            }
        }), new zzeaz(this, zzffhVar), this.zzb);
    }
}
