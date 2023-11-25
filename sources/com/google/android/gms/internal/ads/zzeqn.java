package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeqn implements zzesj {
    private final zzfyo zza;
    private final Context zzb;
    private final Set zzc;

    public zzeqn(zzfyo zzfyoVar, Context context, Set set) {
        this.zza = zzfyoVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqn.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeqo zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                return new zzeqo(com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzb));
            }
        }
        return new zzeqo(null);
    }
}
