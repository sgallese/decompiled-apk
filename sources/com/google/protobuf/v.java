package com.google.protobuf;

import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* loaded from: classes3.dex */
final class v extends c<Float> implements z.f, RandomAccess, z0 {

    /* renamed from: q  reason: collision with root package name */
    private static final v f12460q;

    /* renamed from: m  reason: collision with root package name */
    private float[] f12461m;

    /* renamed from: p  reason: collision with root package name */
    private int f12462p;

    static {
        v vVar = new v(new float[0], 0);
        f12460q = vVar;
        vVar.c();
    }

    v() {
        this(new float[10], 0);
    }

    private void h(int i10, float f10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f12462p)) {
            float[] fArr = this.f12461m;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f12461m, i10, fArr2, i10 + 1, this.f12462p - i10);
                this.f12461m = fArr2;
            }
            this.f12461m[i10] = f10;
            this.f12462p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }

    private void i(int i10) {
        if (i10 >= 0 && i10 < this.f12462p) {
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12462p;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i10 = vVar.f12462p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12462p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f12461m;
            if (i12 > fArr.length) {
                this.f12461m = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(vVar.f12461m, 0, this.f12461m, this.f12462p, vVar.f12462p);
            this.f12462p = i12;
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
    public void add(int i10, Float f10) {
        h(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f12462p != vVar.f12462p) {
            return false;
        }
        float[] fArr = vVar.f12461m;
        for (int i10 = 0; i10 < this.f12462p; i10++) {
            if (Float.floatToIntBits(this.f12461m[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        g(f10.floatValue());
        return true;
    }

    public void g(float f10) {
        a();
        int i10 = this.f12462p;
        float[] fArr = this.f12461m;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f12461m = fArr2;
        }
        float[] fArr3 = this.f12461m;
        int i11 = this.f12462p;
        this.f12462p = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12462p; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f12461m[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f12461m[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(k(i10));
    }

    public float k(int i10) {
        i(i10);
        return this.f12461m[i10];
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public z.f b(int i10) {
        if (i10 >= this.f12462p) {
            return new v(Arrays.copyOf(this.f12461m, i10), this.f12462p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        i(i10);
        float[] fArr = this.f12461m;
        float f10 = fArr[i10];
        if (i10 < this.f12462p - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f12462p--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(p(i10, f10.floatValue()));
    }

    public float p(int i10, float f10) {
        a();
        i(i10);
        float[] fArr = this.f12461m;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f12461m;
            System.arraycopy(fArr, i11, fArr, i10, this.f12462p - i11);
            this.f12462p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12462p;
    }

    private v(float[] fArr, int i10) {
        this.f12461m = fArr;
        this.f12462p = i10;
    }
}
