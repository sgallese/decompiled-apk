package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzftj extends AbstractSet {
    final /* synthetic */ zzftm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftj(zzftm zzftmVar) {
        this.zza = zzftmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzftm zzftmVar = this.zza;
        Map zzj = zzftmVar.zzj();
        if (zzj != null) {
            return zzj.keySet().iterator();
        }
        return new zzftd(zzftmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzs;
        Object obj2;
        Map zzj = this.zza.zzj();
        if (zzj == null) {
            zzs = this.zza.zzs(obj);
            obj2 = zzftm.zzd;
            if (zzs == obj2) {
                return false;
            }
            return true;
        }
        return zzj.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
