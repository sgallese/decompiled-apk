package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgqz extends zzgps implements RandomAccess, zzgth {
    private static final zzgqz zza = new zzgqz(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    zzgqz() {
        this(new double[10], 0, true);
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

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        zzbM();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            double[] dArr = this.zzb;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.zzb, i10, dArr2, i10 + 1, this.zzc - i10);
                this.zzb = dArr2;
            }
            this.zzb[i10] = doubleValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbM();
        byte[] bArr = zzgsa.zzd;
        collection.getClass();
        if (!(collection instanceof zzgqz)) {
            return super.addAll(collection);
        }
        zzgqz zzgqzVar = (zzgqz) collection;
        int i10 = zzgqzVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.zzb;
            if (i12 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(zzgqzVar.zzb, 0, this.zzb, this.zzc, zzgqzVar.zzc);
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

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgqz)) {
            return super.equals(obj);
        }
        zzgqz zzgqzVar = (zzgqz) obj;
        if (this.zzc != zzgqzVar.zzc) {
            return false;
        }
        double[] dArr = zzgqzVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Double.doubleToLongBits(this.zzb[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Double.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i11]);
            byte[] bArr = zzgsa.zzd;
            i10 = (i10 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbM();
        zzg(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzbM();
        if (i11 >= i10) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i11, dArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbM();
        zzg(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final /* bridge */ /* synthetic */ zzgrz zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzgqz(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d10) {
        zzbM();
        int i10 = this.zzc;
        double[] dArr = this.zzb;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        dArr3[i11] = d10;
    }

    private zzgqz(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.zzb = dArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
