package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
/* loaded from: classes3.dex */
public abstract class i<E> extends h<E> implements List<E>, RandomAccess {

    /* renamed from: m  reason: collision with root package name */
    private static final b0<Object> f11144m = new a(u.f11219r, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* loaded from: classes3.dex */
    public static class a<E> extends com.google.common.collect.a<E> {

        /* renamed from: p  reason: collision with root package name */
        private final i<E> f11145p;

        a(i<E> iVar, int i10) {
            super(iVar.size(), i10);
            this.f11145p = iVar;
        }

        @Override // com.google.common.collect.a
        protected E a(int i10) {
            return this.f11145p.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* loaded from: classes3.dex */
    public class b extends i<E> {

        /* renamed from: p  reason: collision with root package name */
        final transient int f11146p;

        /* renamed from: q  reason: collision with root package name */
        final transient int f11147q;

        b(int i10, int i11) {
            this.f11146p = i10;
            this.f11147q = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.h
        public Object[] e() {
            return i.this.e();
        }

        @Override // com.google.common.collect.h
        int f() {
            return i.this.g() + this.f11146p + this.f11147q;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.h
        public int g() {
            return i.this.g() + this.f11146p;
        }

        @Override // java.util.List
        public E get(int i10) {
            e8.h.e(i10, this.f11147q);
            return i.this.get(i10 + this.f11146p);
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.i, java.util.List
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public i<E> subList(int i10, int i11) {
            e8.h.j(i10, i11, this.f11147q);
            i iVar = i.this;
            int i12 = this.f11146p;
            return iVar.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11147q;
        }

        @Override // com.google.common.collect.i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> i<E> i(Object[] objArr) {
        return j(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> i<E> j(Object[] objArr, int i10) {
        if (i10 == 0) {
            return m();
        }
        return new u(objArr, i10);
    }

    public static <E> i<E> m() {
        return (i<E>) u.f11219r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    public int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return m.a(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public a0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return m.b(this, obj);
    }

    @Override // java.util.List
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public b0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public b0<E> listIterator(int i10) {
        e8.h.h(i10, size());
        if (isEmpty()) {
            return (b0<E>) f11144m;
        }
        return new a(this, i10);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return m.d(this, obj);
    }

    @Override // java.util.List
    /* renamed from: n */
    public i<E> subList(int i10, int i11) {
        e8.h.j(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return m();
        }
        return o(i10, i11);
    }

    i<E> o(int i10, int i11) {
        return new b(i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }
}
