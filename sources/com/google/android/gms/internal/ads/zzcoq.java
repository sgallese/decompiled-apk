package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcoq implements zzbir {
    final /* synthetic */ zzcot zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcoq(zzcot zzcotVar) {
        this.zza = zzcotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcot.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcop
                @Override // java.lang.Runnable
                public final void run() {
                    zzcoy zzcoyVar;
                    zzcoyVar = zzcoq.this.zza.zzd;
                    zzcoyVar.zzg();
                }
            });
        }
    }
}
