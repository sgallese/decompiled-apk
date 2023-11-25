package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgrx extends AbstractList {
    private final List zza;
    private final zzgrw zzb;

    public zzgrx(List list, zzgrw zzgrwVar) {
        this.zza = list;
        this.zzb = zzgrwVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzayc zzb = zzayc.zzb(((Integer) this.zza.get(i10)).intValue());
        if (zzb == null) {
            return zzayc.AD_FORMAT_TYPE_UNSPECIFIED;
        }
        return zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
