package com.google.protobuf;

import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes3.dex */
final class h0 extends c<Long> implements z.h, RandomAccess, z0 {

    /* renamed from: q  reason: collision with root package name */
    private static final h0 f12305q;

    /* renamed from: m  reason: collision with root package name */
    private long[] f12306m;

    /* renamed from: p  reason: collision with root package name */
    private int f12307p;

    static {
        h0 h0Var = new h0(new long[0], 0);
        f12305q = h0Var;
        h0Var.c();
    }

    h0() {
        this(new long[10], 0);
    }

    private void g(int i10, long j10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f12307p)) {
            long[] jArr = this.f12306m;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f12306m, i10, jArr2, i10 + 1, this.f12307p - i10);
                this.f12306m = jArr2;
            }
            this.f12306m[i10] = j10;
            this.f12307p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }

    private void i(int i10) {
        if (i10 >= 0 && i10 < this.f12307p) {
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12307p;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        z.a(collection);
        if (!(collection instanceof h0)) {
            return super.addAll(collection);
        }
        h0 h0Var = (h0) collection;
        int i10 = h0Var.f12307p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12307p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f12306m;
            if (i12 > jArr.length) {
                this.f12306m = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(h0Var.f12306m, 0, this.f12306m, this.f12307p, h0Var.f12307p);
            this.f12307p = i12;
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
    public void add(int i10, Long l10) {
        g(i10, l10.longValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        if (this.f12307p != h0Var.f12307p) {
            return false;
        }
        long[] jArr = h0Var.f12306m;
        for (int i10 = 0; i10 < this.f12307p; i10++) {
            if (this.f12306m[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        h(l10.longValue());
        return true;
    }

    public void h(long j10) {
        a();
        int i10 = this.f12307p;
        long[] jArr = this.f12306m;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f12306m = jArr2;
        }
        long[] jArr3 = this.f12306m;
        int i11 = this.f12307p;
        this.f12307p = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12307p; i11++) {
            i10 = (i10 * 31) + z.f(this.f12306m[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f12306m[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(k(i10));
    }

    public long k(int i10) {
        i(i10);
        return this.f12306m[i10];
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public z.h b(int i10) {
        if (i10 >= this.f12307p) {
            return new h0(Arrays.copyOf(this.f12306m, i10), this.f12307p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        i(i10);
        long[] jArr = this.f12306m;
        long j10 = jArr[i10];
        if (i10 < this.f12307p - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f12307p--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(p(i10, l10.longValue()));
    }

    public long p(int i10, long j10) {
        a();
        i(i10);
        long[] jArr = this.f12306m;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f12306m;
            System.arraycopy(jArr, i11, jArr, i10, this.f12307p - i11);
            this.f12307p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12307p;
    }

    private h0(long[] jArr, int i10) {
        this.f12306m = jArr;
        this.f12307p = i10;
    }
}
