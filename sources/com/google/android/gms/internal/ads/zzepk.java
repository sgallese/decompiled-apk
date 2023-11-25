package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzepk implements zzesj {
    private final zzfyo zza;
    private final zzfca zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepk(zzfyo zzfyoVar, zzfca zzfcaVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepk.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzepl zzc() throws Exception {
        return new zzepl("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd)));
    }
}
