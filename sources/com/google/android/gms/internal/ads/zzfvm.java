package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfvm implements Comparator {
    public static zzfvm zzb(Comparator comparator) {
        if (comparator instanceof zzfvm) {
            return (zzfvm) comparator;
        }
        return new zzfto(comparator);
    }

    public static zzfvm zzc() {
        return zzfvk.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfvm zza() {
        return new zzfvv(this);
    }
}
