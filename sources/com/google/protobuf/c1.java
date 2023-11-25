package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufArrayList.java */
/* loaded from: classes3.dex */
public final class c1<E> extends c<E> implements RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    private static final c1<Object> f12261q;

    /* renamed from: m  reason: collision with root package name */
    private E[] f12262m;

    /* renamed from: p  reason: collision with root package name */
    private int f12263p;

    static {
        c1<Object> c1Var = new c1<>(new Object[0], 0);
        f12261q = c1Var;
        c1Var.c();
    }

    private c1(E[] eArr, int i10) {
        this.f12262m = eArr;
        this.f12263p = i10;
    }

    private static <E> E[] e(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> c1<E> f() {
        return (c1<E>) f12261q;
    }

    private void g(int i10) {
        if (i10 >= 0 && i10 < this.f12263p) {
            return;
        }
        throw new IndexOutOfBoundsException(h(i10));
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12263p;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        a();
        int i10 = this.f12263p;
        E[] eArr = this.f12262m;
        if (i10 == eArr.length) {
            this.f12262m = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f12262m;
        int i11 = this.f12263p;
        this.f12263p = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        g(i10);
        return this.f12262m[i10];
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public c1<E> b(int i10) {
        if (i10 >= this.f12263p) {
            return new c1<>(Arrays.copyOf(this.f12262m, i10), this.f12263p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        a();
        g(i10);
        E[] eArr = this.f12262m;
        E e10 = eArr[i10];
        if (i10 < this.f12263p - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f12263p--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        a();
        g(i10);
        E[] eArr = this.f12262m;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12263p;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f12263p)) {
            E[] eArr = this.f12262m;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) e(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f12262m, 0, eArr2, 0, i10);
                System.arraycopy(this.f12262m, i10, eArr2, i10 + 1, this.f12263p - i10);
                this.f12262m = eArr2;
            }
            this.f12262m[i10] = e10;
            this.f12263p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i10));
    }
}
