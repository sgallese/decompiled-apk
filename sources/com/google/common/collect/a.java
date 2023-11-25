package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: AbstractIndexedListIterator.java */
/* loaded from: classes3.dex */
abstract class a<E> extends b0<E> {

    /* renamed from: f  reason: collision with root package name */
    private final int f11138f;

    /* renamed from: m  reason: collision with root package name */
    private int f11139m;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i10, int i11) {
        e8.h.h(i11, i10);
        this.f11138f = i10;
        this.f11139m = i11;
    }

    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f11139m < this.f11138f) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f11139m > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f11139m;
            this.f11139m = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11139m;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f11139m - 1;
            this.f11139m = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11139m - 1;
    }
}
