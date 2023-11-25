package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfre implements Serializable {
    public static zzfre zzc() {
        return zzfqm.zza;
    }

    public static zzfre zzd(Object obj) {
        if (obj == null) {
            return zzfqm.zza;
        }
        return new zzfrn(obj);
    }

    public abstract zzfre zza(zzfqw zzfqwVar);

    public abstract Object zzb(Object obj);
}
