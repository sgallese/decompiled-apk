package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzffo {
    public static final zzffv zza(Callable callable, Object obj, zzffw zzffwVar) {
        zzfyo zzfyoVar;
        zzfyoVar = zzffwVar.zzb;
        return zzb(callable, zzfyoVar, obj, zzffwVar);
    }

    public static final zzffv zzb(Callable callable, zzfyo zzfyoVar, Object obj, zzffw zzffwVar) {
        com.google.common.util.concurrent.a aVar;
        aVar = zzffw.zza;
        return new zzffv(zzffwVar, obj, aVar, Collections.emptyList(), zzfyoVar.zzb(callable));
    }

    public static final zzffv zzc(com.google.common.util.concurrent.a aVar, Object obj, zzffw zzffwVar) {
        com.google.common.util.concurrent.a aVar2;
        aVar2 = zzffw.zza;
        return new zzffv(zzffwVar, obj, aVar2, Collections.emptyList(), aVar);
    }

    public static final zzffv zzd(final zzffi zzffiVar, zzfyo zzfyoVar, Object obj, zzffw zzffwVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzffn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzffi.this.zza();
                return null;
            }
        }, zzfyoVar, obj, zzffwVar);
    }
}
