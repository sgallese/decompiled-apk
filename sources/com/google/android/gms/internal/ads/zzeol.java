package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeol implements zzesj {
    private final zzfyo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeol(zzfyo zzfyoVar) {
        this.zza = zzfyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeom(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zza()).longValue());
            }
        });
    }
}
