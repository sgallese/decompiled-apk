package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeni implements zzesj {
    private final Executor zza;
    private final zzbzj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeni(Executor executor, zzbzj zzbzjVar) {
        this.zza = executor;
        this.zzb = zzbzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcx)).booleanValue()) {
            return zzfye.zzh(null);
        }
        return zzfye.zzm(this.zzb.zzj(), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeng
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzesi() { // from class: com.google.android.gms.internal.ads.zzenh
                    @Override // com.google.android.gms.internal.ads.zzesi
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
