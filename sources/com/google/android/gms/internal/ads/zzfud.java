package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfud<E> extends zzfty<E> implements List<E>, RandomAccess {
    private static final zzfwe zza = new zzfub(zzfvn.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfud zzi(Object[] objArr, int i10) {
        if (i10 == 0) {
            return zzfvn.zza;
        }
        return new zzfvn(objArr, i10);
    }

    public static zzfud zzj(Collection collection) {
        if (collection instanceof zzfty) {
            zzfud zzd2 = ((zzfty) collection).zzd();
            if (zzd2.zzf()) {
                Object[] array = zzd2.toArray();
                return zzi(array, array.length);
            }
            return zzd2;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfvl.zzb(array2, length);
        return zzi(array2, length);
    }

    public static zzfud zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfvn.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfvl.zzb(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zzfud zzl() {
        return zzfvn.zza;
    }

    public static zzfud zzm(Object obj) {
        Object[] objArr = {obj};
        zzfvl.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzfud zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfvl.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzfud zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfvl.zzb(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzfud zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfvl.zzb(objArr, 5);
        return zzi(objArr, 5);
    }

    public static zzfud zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfvl.zzb(objArr, 6);
        return zzi(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfty, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (zzfrd.zza(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfrd.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfty, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    /* renamed from: zze */
    public final zzfwd iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh  reason: merged with bridge method [inline-methods] */
    public zzfud subList(int i10, int i11) {
        zzfri.zzh(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return zzfvn.zza;
        }
        return new zzfuc(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: zzr  reason: merged with bridge method [inline-methods] */
    public final zzfwe listIterator(int i10) {
        zzfri.zzb(i10, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzfub(this, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    @Deprecated
    public final zzfud zzd() {
        return this;
    }
}
