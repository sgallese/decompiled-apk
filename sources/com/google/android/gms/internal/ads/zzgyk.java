package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgyk extends AbstractList {
    private static final zzgyl zzc = zzgyl.zzb(zzgyk.class);
    final List zza;
    final Iterator zzb;

    public zzgyk(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (this.zza.size() > i10) {
            return this.zza.get(i10);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgyj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzgyl zzgylVar = zzc;
        zzgylVar.zza("potentially expensive size() call");
        zzgylVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
