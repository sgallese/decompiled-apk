package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
class zzfss implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfst zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfss(zzfst zzfstVar, Iterator it) {
        this.zzc = zzfstVar;
        this.zzb = zzfstVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        this.zza.remove();
        zzfsw zzfswVar = this.zzc.zze;
        i10 = zzfswVar.zzb;
        zzfswVar.zzb = i10 - 1;
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfss(zzfst zzfstVar) {
        Iterator it;
        this.zzc = zzfstVar;
        Collection collection = zzfstVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }
}
