package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcsl {
    public final List zza;

    public zzcsl(List list) {
        this.zza = list;
    }

    public static zzedn zza(zzedn zzednVar) {
        return new zzedo(zzednVar, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzcsk
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return new zzcsl((zzcse) obj);
            }
        });
    }

    public zzcsl(zzcse zzcseVar) {
        this.zza = Collections.singletonList(zzfye.zzh(zzcseVar));
    }
}
