package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzemh implements zzesj {
    private final zzfyo zza;
    private final zzfca zzb;
    private final zzfcn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemh(zzfyo zzfyoVar, zzfca zzfcaVar, zzfcn zzfcnVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfcaVar;
        this.zzc = zzfcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemh.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzemi zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhb)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd))) {
            str = zzfcn.zza();
        }
        return new zzemi(str);
    }
}
