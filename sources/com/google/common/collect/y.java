package com.google.common.collect;

/* compiled from: SingletonImmutableSet.java */
/* loaded from: classes3.dex */
final class y<E> extends k<E> {

    /* renamed from: p  reason: collision with root package name */
    final transient E f11243p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(E e10) {
        this.f11243p = (E) e8.h.g(e10);
    }

    @Override // com.google.common.collect.h
    int a(Object[] objArr, int i10) {
        objArr[i10] = this.f11243p;
        return i10 + 1;
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f11243p.equals(obj);
    }

    @Override // com.google.common.collect.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public a0<E> iterator() {
        return l.c(this.f11243p);
    }

    @Override // com.google.common.collect.k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11243p.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f11243p.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
