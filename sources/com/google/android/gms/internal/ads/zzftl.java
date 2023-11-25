package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzftl extends AbstractCollection {
    final /* synthetic */ zzftm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftl(zzftm zzftmVar) {
        this.zza = zzftmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzftm zzftmVar = this.zza;
        Map zzj = zzftmVar.zzj();
        if (zzj != null) {
            return zzj.values().iterator();
        }
        return new zzftf(zzftmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
