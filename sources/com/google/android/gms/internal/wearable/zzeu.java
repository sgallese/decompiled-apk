package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzeu extends AbstractList implements RandomAccess, zzcv {
    private final zzcv zza;

    public zzeu(zzcv zzcvVar) {
        this.zza = zzcvVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzcu) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzet(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzes(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.wearable.zzcv
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.wearable.zzcv
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.wearable.zzcv
    public final void zzi(zzbh zzbhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.wearable.zzcv
    public final zzcv zze() {
        return this;
    }
}
