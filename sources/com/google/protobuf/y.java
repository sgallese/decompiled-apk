package com.google.protobuf;

import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntArrayList.java */
/* loaded from: classes3.dex */
public final class y extends c<Integer> implements z.g, RandomAccess, z0 {

    /* renamed from: q  reason: collision with root package name */
    private static final y f12477q;

    /* renamed from: m  reason: collision with root package name */
    private int[] f12478m;

    /* renamed from: p  reason: collision with root package name */
    private int f12479p;

    static {
        y yVar = new y(new int[0], 0);
        f12477q = yVar;
        yVar.c();
    }

    y() {
        this(new int[10], 0);
    }

    private void g(int i10, int i11) {
        int i12;
        a();
        if (i10 >= 0 && i10 <= (i12 = this.f12479p)) {
            int[] iArr = this.f12478m;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f12478m, i10, iArr2, i10 + 1, this.f12479p - i10);
                this.f12478m = iArr2;
            }
            this.f12478m[i10] = i11;
            this.f12479p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }

    public static y h() {
        return f12477q;
    }

    private void i(int i10) {
        if (i10 >= 0 && i10 < this.f12479p) {
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12479p;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i10 = yVar.f12479p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12479p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f12478m;
            if (i12 > iArr.length) {
                this.f12478m = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(yVar.f12478m, 0, this.f12478m, this.f12479p, yVar.f12479p);
            this.f12479p = i12;
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
    public void add(int i10, Integer num) {
        g(i10, num.intValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f12479p != yVar.f12479p) {
            return false;
        }
        int[] iArr = yVar.f12478m;
        for (int i10 = 0; i10 < this.f12479p; i10++) {
            if (this.f12478m[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        q(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.z.g
    public int getInt(int i10) {
        i(i10);
        return this.f12478m[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12479p; i11++) {
            i10 = (i10 * 31) + this.f12478m[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f12478m[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        i(i10);
        int[] iArr = this.f12478m;
        int i11 = iArr[i10];
        if (i10 < this.f12479p - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f12479p--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(n(i10, num.intValue()));
    }

    public int n(int i10, int i11) {
        a();
        i(i10);
        int[] iArr = this.f12478m;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // com.google.protobuf.z.g
    public void q(int i10) {
        a();
        int i11 = this.f12479p;
        int[] iArr = this.f12478m;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f12478m = iArr2;
        }
        int[] iArr3 = this.f12478m;
        int i12 = this.f12479p;
        this.f12479p = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f12478m;
            System.arraycopy(iArr, i11, iArr, i10, this.f12479p - i11);
            this.f12479p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12479p;
    }

    private y(int[] iArr, int i10) {
        this.f12478m = iArr;
        this.f12479p = i10;
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public z.i<Integer> b2(int i10) {
        if (i10 >= this.f12479p) {
            return new y(Arrays.copyOf(this.f12478m, i10), this.f12479p);
        }
        throw new IllegalArgumentException();
    }
}
