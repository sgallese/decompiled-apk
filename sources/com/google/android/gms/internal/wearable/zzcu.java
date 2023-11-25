package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzcu extends zzas implements RandomAccess, zzcv {
    @Deprecated
    public static final zzcv zza;
    private static final zzcu zzb;
    private final List zzc;

    static {
        zzcu zzcuVar = new zzcu(false);
        zzb = zzcuVar;
        zza = zzcuVar;
    }

    public zzcu() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbh) {
            return ((zzbh) obj).zzn(zzco.zzb);
        }
        return zzco.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzah();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zzah();
        if (collection instanceof zzcv) {
            collection = ((zzcv) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzah();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzah();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzah();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final /* bridge */ /* synthetic */ zzcn zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzcu(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.wearable.zzcv
    public final zzcv zze() {
        if (zzc()) {
            return new zzeu(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.zzcv
    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg  reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbh) {
            zzbh zzbhVar = (zzbh) obj;
            String zzn = zzbhVar.zzn(zzco.zzb);
            if (zzbhVar.zzj()) {
                this.zzc.set(i10, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzco.zzd(bArr);
        if (zzfe.zzd(bArr)) {
            this.zzc.set(i10, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.wearable.zzcv
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.wearable.zzcv
    public final void zzi(zzbh zzbhVar) {
        zzah();
        this.zzc.add(zzbhVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.zzc = arrayList;
    }

    private zzcu(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzcu(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
