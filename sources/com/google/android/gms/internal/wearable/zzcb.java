package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzcb extends zzas implements RandomAccess, zzcl, zzdu {
    private static final zzcb zza = new zzcb(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    zzcb() {
        this(new float[10], 0, true);
    }

    public static zzcb zze() {
        return zza;
    }

    private final String zzh(int i10) {
        return "Index:" + i10 + ", Size:" + this.zzc;
    }

    private final void zzi(int i10) {
        if (i10 >= 0 && i10 < this.zzc) {
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i10));
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        zzah();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            float[] fArr = this.zzb;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.zzb, i10, fArr2, i10 + 1, this.zzc - i10);
                this.zzb = fArr2;
            }
            this.zzb[i10] = floatValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i10));
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzah();
        byte[] bArr = zzco.zzd;
        collection.getClass();
        if (!(collection instanceof zzcb)) {
            return super.addAll(collection);
        }
        zzcb zzcbVar = (zzcb) collection;
        int i10 = zzcbVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.zzb;
            if (i12 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(zzcbVar.zzb, 0, this.zzb, this.zzc, zzcbVar.zzc);
            this.zzc = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcb)) {
            return super.equals(obj);
        }
        zzcb zzcbVar = (zzcb) obj;
        if (this.zzc != zzcbVar.zzc) {
            return false;
        }
        float[] fArr = zzcbVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Float.floatToIntBits(this.zzb[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Float.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.zzb[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzah();
        zzi(i10);
        float[] fArr = this.zzb;
        float f10 = fArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzah();
        if (i11 >= i10) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i11, fArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzah();
        zzi(i10);
        float[] fArr = this.zzb;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    /* renamed from: zzf  reason: merged with bridge method [inline-methods] */
    public final zzcl zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzcb(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(float f10) {
        zzah();
        int i10 = this.zzc;
        float[] fArr = this.zzb;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        fArr3[i11] = f10;
    }

    private zzcb(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zzb = fArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.wearable.zzas, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Float) obj).floatValue());
        return true;
    }
}
