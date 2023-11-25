package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzffm {
    final /* synthetic */ zzffw zza;
    private final Object zzb;
    private final List zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzffm(zzffw zzffwVar, Object obj, List list, zzffl zzfflVar) {
        this.zza = zzffwVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzffv zza(Callable callable) {
        zzfyo zzfyoVar;
        zzfyd zzb = zzfye.zzb(this.zzc);
        com.google.common.util.concurrent.a zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzffk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcan.zzf);
        zzffw zzffwVar = this.zza;
        List list = this.zzc;
        zzfyoVar = zzffwVar.zzb;
        return new zzffv(zzffwVar, this.zzb, zza, list, zzb.zza(callable, zzfyoVar));
    }
}
