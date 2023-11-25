package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeps implements zzesj {
    private final zzfyo zza;
    private final zzdue zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeps(zzfyo zzfyoVar, zzdue zzdueVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeps.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzept zzc() throws Exception {
        return new zzept(this.zzb.zzc(), this.zzb.zzq(), com.google.android.gms.ads.internal.zzt.zzs().zzl(), this.zzb.zzo(), this.zzb.zzr());
    }
}
