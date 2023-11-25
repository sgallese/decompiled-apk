package com.google.protobuf;

import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* loaded from: classes3.dex */
final class l extends c<Double> implements z.b, RandomAccess, z0 {

    /* renamed from: q  reason: collision with root package name */
    private static final l f12372q;

    /* renamed from: m  reason: collision with root package name */
    private double[] f12373m;

    /* renamed from: p  reason: collision with root package name */
    private int f12374p;

    static {
        l lVar = new l(new double[0], 0);
        f12372q = lVar;
        lVar.c();
    }

    l() {
        this(new double[10], 0);
    }

    private void h(int i10, double d10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f12374p)) {
            double[] dArr = this.f12373m;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f12373m, i10, dArr2, i10 + 1, this.f12374p - i10);
                this.f12373m = dArr2;
            }
            this.f12373m[i10] = d10;
            this.f12374p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }

    private void i(int i10) {
        if (i10 >= 0 && i10 < this.f12374p) {
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12374p;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof l)) {
            return super.addAll(collection);
        }
        l lVar = (l) collection;
        int i10 = lVar.f12374p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12374p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f12373m;
            if (i12 > dArr.length) {
                this.f12373m = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(lVar.f12373m, 0, this.f12373m, this.f12374p, lVar.f12374p);
            this.f12374p = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        h(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        if (this.f12374p != lVar.f12374p) {
            return false;
        }
        double[] dArr = lVar.f12373m;
        for (int i10 = 0; i10 < this.f12374p; i10++) {
            if (Double.doubleToLongBits(this.f12373m[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        g(d10.doubleValue());
        return true;
    }

    public void g(double d10) {
        a();
        int i10 = this.f12374p;
        double[] dArr = this.f12373m;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f12373m = dArr2;
        }
        double[] dArr3 = this.f12373m;
        int i11 = this.f12374p;
        this.f12374p = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12374p; i11++) {
            i10 = (i10 * 31) + z.f(Double.doubleToLongBits(this.f12373m[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f12373m[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(k(i10));
    }

    public double k(int i10) {
        i(i10);
        return this.f12373m[i10];
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public z.b b(int i10) {
        if (i10 >= this.f12374p) {
            return new l(Arrays.copyOf(this.f12373m, i10), this.f12374p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        i(i10);
        double[] dArr = this.f12373m;
        double d10 = dArr[i10];
        if (i10 < this.f12374p - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f12374p--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(p(i10, d10.doubleValue()));
    }

    public double p(int i10, double d10) {
        a();
        i(i10);
        double[] dArr = this.f12373m;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f12373m;
            System.arraycopy(dArr, i11, dArr, i10, this.f12374p - i11);
            this.f12374p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12374p;
    }

    private l(double[] dArr, int i10) {
        this.f12373m = dArr;
        this.f12374p = i10;
    }
}
