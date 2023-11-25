package com.google.protobuf;

import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* loaded from: classes3.dex */
final class f extends c<Boolean> implements z.a, RandomAccess, z0 {

    /* renamed from: q  reason: collision with root package name */
    private static final f f12287q;

    /* renamed from: m  reason: collision with root package name */
    private boolean[] f12288m;

    /* renamed from: p  reason: collision with root package name */
    private int f12289p;

    static {
        f fVar = new f(new boolean[0], 0);
        f12287q = fVar;
        fVar.c();
    }

    f() {
        this(new boolean[10], 0);
    }

    private void g(int i10, boolean z10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f12289p)) {
            boolean[] zArr = this.f12288m;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f12288m, i10, zArr2, i10 + 1, this.f12289p - i10);
                this.f12288m = zArr2;
            }
            this.f12288m[i10] = z10;
            this.f12289p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }

    private void i(int i10) {
        if (i10 >= 0 && i10 < this.f12289p) {
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12289p;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i10 = fVar.f12289p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12289p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f12288m;
            if (i12 > zArr.length) {
                this.f12288m = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(fVar.f12288m, 0, this.f12288m, this.f12289p, fVar.f12289p);
            this.f12289p = i12;
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
    public void add(int i10, Boolean bool) {
        g(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f12289p != fVar.f12289p) {
            return false;
        }
        boolean[] zArr = fVar.f12288m;
        for (int i10 = 0; i10 < this.f12289p; i10++) {
            if (this.f12288m[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        h(bool.booleanValue());
        return true;
    }

    public void h(boolean z10) {
        a();
        int i10 = this.f12289p;
        boolean[] zArr = this.f12288m;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f12288m = zArr2;
        }
        boolean[] zArr3 = this.f12288m;
        int i11 = this.f12289p;
        this.f12289p = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12289p; i11++) {
            i10 = (i10 * 31) + z.c(this.f12288m[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f12288m[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(k(i10));
    }

    public boolean k(int i10) {
        i(i10);
        return this.f12288m[i10];
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public z.a b(int i10) {
        if (i10 >= this.f12289p) {
            return new f(Arrays.copyOf(this.f12288m, i10), this.f12289p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        i(i10);
        boolean[] zArr = this.f12288m;
        boolean z10 = zArr[i10];
        if (i10 < this.f12289p - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f12289p--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(p(i10, bool.booleanValue()));
    }

    public boolean p(int i10, boolean z10) {
        a();
        i(i10);
        boolean[] zArr = this.f12288m;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f12288m;
            System.arraycopy(zArr, i11, zArr, i10, this.f12289p - i11);
            this.f12289p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12289p;
    }

    private f(boolean[] zArr, int i10) {
        this.f12288m = zArr;
        this.f12289p = i10;
    }
}
