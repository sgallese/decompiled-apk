package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeua implements zzesj {
    private final Context zza;
    private final String zzb;
    private final zzfyo zzc;

    public zzeua(zzbup zzbupVar, Context context, String str, zzfyo zzfyoVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeub(new JSONObject());
            }
        });
    }
}
