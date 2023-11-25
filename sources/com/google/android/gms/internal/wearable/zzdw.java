package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzdw extends zzas implements RandomAccess {
    private static final zzdw zza = new zzdw(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    zzdw() {
        this(new Object[10], 0, true);
    }

    public static zzdw zze() {
        return zza;
    }

    private final String zzf(int i10) {
        return "Index:" + i10 + ", Size:" + this.zzc;
    }

    private final void zzg(int i10) {
        if (i10 >= 0 && i10 < this.zzc) {
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i10));
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zzah();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            Object[] objArr = this.zzb;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.zzb, i10, objArr2, i10 + 1, this.zzc - i10);
                this.zzb = objArr2;
            }
            this.zzb[i10] = obj;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzg(i10);
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        zzah();
        zzg(i10);
        Object[] objArr = this.zzb;
        Object obj = objArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        zzah();
        zzg(i10);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final /* bridge */ /* synthetic */ zzcn zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzdw(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzdw(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzah();
        int i10 = this.zzc;
        Object[] objArr = this.zzb;
        if (i10 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
