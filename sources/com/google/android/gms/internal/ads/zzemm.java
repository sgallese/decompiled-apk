package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzemm implements zzesj {
    private final com.google.common.util.concurrent.a zza;
    private final Executor zzb;

    public zzemm(com.google.common.util.concurrent.a aVar, Executor executor) {
        this.zza = aVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return zzfye.zzn(this.zza, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeml
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                final String str = (String) obj;
                return zzfye.zzh(new zzesi() { // from class: com.google.android.gms.internal.ads.zzemk
                    @Override // com.google.android.gms.internal.ads.zzesi
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
