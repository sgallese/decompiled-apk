package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeup implements zzesj {
    final zzfyo zza;
    final Context zzb;
    final zzawt zzc;

    public zzeup(zzawt zzawtVar, zzfyo zzfyoVar, Context context) {
        this.zzc = zzawtVar;
        this.zza = zzfyoVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeuq(new JSONObject());
            }
        });
    }
}
