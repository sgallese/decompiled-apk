package com.google.common.collect;

import j$.util.Objects;

/* compiled from: RegularImmutableList.java */
/* loaded from: classes3.dex */
class u<E> extends i<E> {

    /* renamed from: r  reason: collision with root package name */
    static final i<Object> f11219r = new u(new Object[0], 0);

    /* renamed from: p  reason: collision with root package name */
    final transient Object[] f11220p;

    /* renamed from: q  reason: collision with root package name */
    private final transient int f11221q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Object[] objArr, int i10) {
        this.f11220p = objArr;
        this.f11221q = i10;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.h
    int a(Object[] objArr, int i10) {
        System.arraycopy(this.f11220p, 0, objArr, i10, this.f11221q);
        return i10 + this.f11221q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    public Object[] e() {
        return this.f11220p;
    }

    @Override // com.google.common.collect.h
    int f() {
        return this.f11221q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    public int g() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i10) {
        e8.h.e(i10, this.f11221q);
        E e10 = (E) this.f11220p[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11221q;
    }
}
