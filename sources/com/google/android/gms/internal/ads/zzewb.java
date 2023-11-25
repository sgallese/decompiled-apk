package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzewb implements zzesj {
    private final zzfyo zza;

    public zzewb(zzfyo zzfyoVar) {
        this.zza = zzfyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzL);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzM)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, com.google.android.gms.ads.internal.util.zzcl.zza(str2));
                        }
                    }
                }
                return new zzewc(hashMap);
            }
        });
    }
}
