package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeop implements zzesj {
    private final zzfyo zza;
    private final zzdph zzb;
    private final String zzc;
    private final zzfca zzd;

    public zzeop(zzfyo zzfyoVar, zzdph zzdphVar, zzfca zzfcaVar, String str) {
        this.zza = zzfyoVar;
        this.zzb = zzdphVar;
        this.zzd = zzfcaVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeop.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeoq zzc() throws Exception {
        return new zzeoq(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
