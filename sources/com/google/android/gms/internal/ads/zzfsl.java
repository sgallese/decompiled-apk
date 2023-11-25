package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfsl implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfsm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsl(zzfsm zzfsmVar, Iterator it) {
        this.zzc = zzfsmVar;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        int i10;
        if (this.zza != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfri.zzj(z10, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfsw zzfswVar = this.zzc.zza;
        i10 = zzfswVar.zzb;
        zzfswVar.zzb = i10 - collection.size();
        collection.clear();
        this.zza = null;
    }
}
