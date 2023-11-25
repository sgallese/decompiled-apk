package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzend implements zzesj {
    private final zzfyo zza;
    private final zzfca zzb;
    private final zzcag zzc;
    private final zzbzn zzd;

    public zzend(zzfyo zzfyoVar, zzfca zzfcaVar, zzcag zzcagVar, zzbzn zzbznVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfcaVar;
        this.zzc = zzcagVar;
        this.zzd = zzbznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzend.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzene zzc() throws Exception {
        return new zzene(this.zzb.zzj, this.zzc, this.zzd.zzm());
    }
}
